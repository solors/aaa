package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.PsDurationReader */
/* loaded from: classes4.dex */
final class PsDurationReader {

    /* renamed from: c */
    private boolean f33580c;

    /* renamed from: d */
    private boolean f33581d;

    /* renamed from: e */
    private boolean f33582e;

    /* renamed from: a */
    private final TimestampAdjuster f33578a = new TimestampAdjuster(0);

    /* renamed from: f */
    private long f33583f = -9223372036854775807L;

    /* renamed from: g */
    private long f33584g = -9223372036854775807L;

    /* renamed from: h */
    private long f33585h = -9223372036854775807L;

    /* renamed from: b */
    private final ParsableByteArray f33579b = new ParsableByteArray();

    /* renamed from: a */
    private static boolean m74321a(byte[] bArr) {
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m74320b(ExtractorInput extractorInput) {
        this.f33579b.reset(Util.EMPTY_BYTE_ARRAY);
        this.f33580c = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    /* renamed from: c */
    private int m74319c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: d */
    private int m74318d(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int min = (int) Math.min(20000L, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.f33579b.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f33579b.getData(), 0, min);
        this.f33583f = m74317e(this.f33579b);
        this.f33581d = true;
        return 0;
    }

    /* renamed from: e */
    private long m74317e(ParsableByteArray parsableByteArray) {
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit - 3; position++) {
            if (m74319c(parsableByteArray.getData(), position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != -9223372036854775807L) {
                    return readScrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private int m74316f(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.f33579b.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f33579b.getData(), 0, min);
        this.f33584g = m74315g(this.f33579b);
        this.f33582e = true;
        return 0;
    }

    /* renamed from: g */
    private long m74315g(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int limit = parsableByteArray.limit() - 4; limit >= position; limit--) {
            if (m74319c(parsableByteArray.getData(), limit) == 442) {
                parsableByteArray.setPosition(limit + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != -9223372036854775807L) {
                    return readScrValueFromPack;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    private static long m74314h(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[2];
        return (((b & 56) >> 3) << 30) | ((b & 3) << 28) | ((bArr[1] & 255) << 20) | (((b2 & 248) >> 3) << 15) | ((b2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        if (!m74321a(bArr)) {
            return -9223372036854775807L;
        }
        return m74314h(bArr);
    }

    public long getDurationUs() {
        return this.f33585h;
    }

    public TimestampAdjuster getScrTimestampAdjuster() {
        return this.f33578a;
    }

    public boolean isDurationReadFinished() {
        return this.f33580c;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        if (!this.f33582e) {
            return m74316f(extractorInput, positionHolder);
        }
        if (this.f33584g == -9223372036854775807L) {
            return m74320b(extractorInput);
        }
        if (!this.f33581d) {
            return m74318d(extractorInput, positionHolder);
        }
        long j = this.f33583f;
        if (j == -9223372036854775807L) {
            return m74320b(extractorInput);
        }
        long adjustTsTimestamp = this.f33578a.adjustTsTimestamp(this.f33584g) - this.f33578a.adjustTsTimestamp(j);
        this.f33585h = adjustTsTimestamp;
        if (adjustTsTimestamp < 0) {
            Log.m72602w("PsDurationReader", "Invalid duration: " + this.f33585h + ". Using TIME_UNSET instead.");
            this.f33585h = -9223372036854775807L;
        }
        return m74320b(extractorInput);
    }
}

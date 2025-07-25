package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsDurationReader */
/* loaded from: classes4.dex */
final class TsDurationReader {

    /* renamed from: a */
    private final int f33617a;

    /* renamed from: d */
    private boolean f33620d;

    /* renamed from: e */
    private boolean f33621e;

    /* renamed from: f */
    private boolean f33622f;

    /* renamed from: b */
    private final TimestampAdjuster f33618b = new TimestampAdjuster(0);

    /* renamed from: g */
    private long f33623g = -9223372036854775807L;

    /* renamed from: h */
    private long f33624h = -9223372036854775807L;

    /* renamed from: i */
    private long f33625i = -9223372036854775807L;

    /* renamed from: c */
    private final ParsableByteArray f33619c = new ParsableByteArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    public TsDurationReader(int i) {
        this.f33617a = i;
    }

    /* renamed from: a */
    private int m74307a(ExtractorInput extractorInput) {
        this.f33619c.reset(Util.EMPTY_BYTE_ARRAY);
        this.f33620d = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    /* renamed from: b */
    private int m74306b(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
        int min = (int) Math.min(this.f33617a, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.f33619c.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f33619c.getData(), 0, min);
        this.f33623g = m74305c(this.f33619c, i);
        this.f33621e = true;
        return 0;
    }

    /* renamed from: c */
    private long m74305c(ParsableByteArray parsableByteArray, int i) {
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, position, i);
                if (readPcrFromPacket != -9223372036854775807L) {
                    return readPcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    private int m74304d(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
        long length = extractorInput.getLength();
        int min = (int) Math.min(this.f33617a, length);
        long j = length - min;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.f33619c.reset(min);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.f33619c.getData(), 0, min);
        this.f33624h = m74303e(this.f33619c, i);
        this.f33622f = true;
        return 0;
    }

    /* renamed from: e */
    private long m74303e(ParsableByteArray parsableByteArray, int i) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        for (int i2 = limit - 188; i2 >= position; i2--) {
            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, limit, i2)) {
                long readPcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i2, i);
                if (readPcrFromPacket != -9223372036854775807L) {
                    return readPcrFromPacket;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long getDurationUs() {
        return this.f33625i;
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
        return this.f33618b;
    }

    public boolean isDurationReadFinished() {
        return this.f33620d;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
        if (i <= 0) {
            return m74307a(extractorInput);
        }
        if (!this.f33622f) {
            return m74304d(extractorInput, positionHolder, i);
        }
        if (this.f33624h == -9223372036854775807L) {
            return m74307a(extractorInput);
        }
        if (!this.f33621e) {
            return m74306b(extractorInput, positionHolder, i);
        }
        long j = this.f33623g;
        if (j == -9223372036854775807L) {
            return m74307a(extractorInput);
        }
        long adjustTsTimestamp = this.f33618b.adjustTsTimestamp(this.f33624h) - this.f33618b.adjustTsTimestamp(j);
        this.f33625i = adjustTsTimestamp;
        if (adjustTsTimestamp < 0) {
            Log.m72602w("TsDurationReader", "Invalid duration: " + this.f33625i + ". Using TIME_UNSET instead.");
            this.f33625i = -9223372036854775807L;
        }
        return m74307a(extractorInput);
    }
}

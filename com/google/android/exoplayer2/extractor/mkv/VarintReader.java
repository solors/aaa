package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes4.dex */
final class VarintReader {

    /* renamed from: d */
    private static final long[] f33127d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f33128a = new byte[8];

    /* renamed from: b */
    private int f33129b;

    /* renamed from: c */
    private int f33130c;

    public static long assembleVarint(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f33127d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int parseUnsignedVarintLength(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f33127d;
            if (i2 < jArr.length) {
                if ((jArr[i2] & i) != 0) {
                    return i2 + 1;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public int getLastLength() {
        return this.f33130c;
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z, boolean z2, int i) throws IOException {
        if (this.f33129b == 0) {
            if (!extractorInput.readFully(this.f33128a, 0, 1, z)) {
                return -1L;
            }
            int parseUnsignedVarintLength = parseUnsignedVarintLength(this.f33128a[0] & 255);
            this.f33130c = parseUnsignedVarintLength;
            if (parseUnsignedVarintLength != -1) {
                this.f33129b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f33130c;
        if (i2 > i) {
            this.f33129b = 0;
            return -2L;
        }
        if (i2 != 1) {
            extractorInput.readFully(this.f33128a, 1, i2 - 1);
        }
        this.f33129b = 0;
        return assembleVarint(this.f33128a, this.f33130c, z2);
    }

    public void reset() {
        this.f33129b = 0;
        this.f33130c = 0;
    }
}

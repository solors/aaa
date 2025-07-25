package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.CX */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11619CX {
    public static C11618CW A00(int i, long[] jArr, int[] iArr, long j) {
        int chunkSamplesRemaining = 8192 / i;
        int i2 = 0;
        for (int i3 : iArr) {
            i2 += AbstractC11953IK.A04(i3, chunkSamplesRemaining);
        }
        long[] jArr2 = new long[i2];
        int[] iArr2 = new int[i2];
        int originalSampleIndex = 0;
        long[] timestamps = new long[i2];
        int[] flags = new int[i2];
        int i4 = 0;
        int bufferSampleCount = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int rechunkedSampleCount = iArr[i5];
            long j2 = jArr[i5];
            while (rechunkedSampleCount > 0) {
                int min = Math.min(chunkSamplesRemaining, rechunkedSampleCount);
                jArr2[bufferSampleCount] = j2;
                iArr2[bufferSampleCount] = i * min;
                originalSampleIndex = Math.max(originalSampleIndex, iArr2[bufferSampleCount]);
                timestamps[bufferSampleCount] = i4 * j;
                flags[bufferSampleCount] = 1;
                j2 += iArr2[bufferSampleCount];
                i4 += min;
                rechunkedSampleCount -= min;
                bufferSampleCount++;
            }
        }
        return new C11618CW(jArr2, iArr2, originalSampleIndex, timestamps, flags, j * i4);
    }
}

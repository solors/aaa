package com.google.zxing.qrcode.decoder;

/* loaded from: classes5.dex */
final class FormatInformation {

    /* renamed from: c */
    private static final int[][] f44698c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final ErrorCorrectionLevel f44699a;

    /* renamed from: b */
    private final byte f44700b;

    private FormatInformation(int i) {
        this.f44699a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f44700b = (byte) (i & 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static FormatInformation m65550a(int i, int i2) {
        FormatInformation m65549b = m65549b(i, i2);
        if (m65549b != null) {
            return m65549b;
        }
        return m65549b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static FormatInformation m65549b(int i, int i2) {
        int[][] iArr;
        int m65546e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : f44698c) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int m65546e2 = m65546e(i, i5);
                if (m65546e2 < i3) {
                    i4 = iArr2[1];
                    i3 = m65546e2;
                }
                if (i != i2 && (m65546e = m65546e(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = m65546e;
                }
            } else {
                return new FormatInformation(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new FormatInformation(i4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m65546e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m65548c() {
        return this.f44700b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ErrorCorrectionLevel m65547d() {
        return this.f44699a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FormatInformation)) {
            return false;
        }
        FormatInformation formatInformation = (FormatInformation) obj;
        if (this.f44699a != formatInformation.f44699a || this.f44700b != formatInformation.f44700b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f44699a.ordinal() << 3) | this.f44700b;
    }
}

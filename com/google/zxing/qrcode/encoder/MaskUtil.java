package com.google.zxing.qrcode.encoder;

/* loaded from: classes5.dex */
final class MaskUtil {
    private MaskUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m65485a(ByteMatrix byteMatrix) {
        return m65484b(byteMatrix, true) + m65484b(byteMatrix, false);
    }

    /* renamed from: b */
    private static int m65484b(ByteMatrix byteMatrix, boolean z) {
        int width;
        int height;
        byte b;
        if (z) {
            width = byteMatrix.getHeight();
        } else {
            width = byteMatrix.getWidth();
        }
        if (z) {
            height = byteMatrix.getWidth();
        } else {
            height = byteMatrix.getHeight();
        }
        byte[][] array = byteMatrix.getArray();
        int i = 0;
        for (int i2 = 0; i2 < width; i2++) {
            byte b2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                if (z) {
                    b = array[i2][i4];
                } else {
                    b = array[i4][i2];
                }
                if (b == b2) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    i3 = 1;
                    b2 = b;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m65483c(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height - 1; i2++) {
            byte[] bArr = array[i2];
            int i3 = 0;
            while (i3 < width - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = array[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m65482d(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                byte[] bArr = array[i2];
                int i4 = i3 + 6;
                if (i4 < width && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m65479g(bArr, i3 - 4, i3) || m65479g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < height && array[i2][i3] == 1 && array[i2 + 1][i3] == 0 && array[i2 + 2][i3] == 1 && array[i2 + 3][i3] == 1 && array[i2 + 4][i3] == 1 && array[i2 + 5][i3] == 0 && array[i5][i3] == 1 && (m65478h(array, i3, i2 - 4, i2) || m65478h(array, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m65481e(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            byte[] bArr = array[i2];
            for (int i3 = 0; i3 < width; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        return ((Math.abs((i << 1) - height2) * 10) / height2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public static boolean m65480f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m65479g(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m65478h(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}

package com.facebook.ads.redexgen.p370X;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.C7 */
/* loaded from: assets/audience_network.dex */
public final class C11593C7 {
    public static byte[] A02;
    public static String[] A03 = {"L7C8Ga0k7tlVElvjgxBYHiSOPIH52u00", ExifInterface.LONGITUDE_EAST, "wOuQWovYJ7l8fayT1FsN6ONBeiko07KJ", "hTP63QBdWB9GH1NbWaWzredEXTghXzRZ", "M9", "4qUlfR9eL8Wvw2EVoaZBQCPcIiUI1e32", "NTaremhH7pfVjZMHsJgugPUye2yAgFMG", "5weDUyigXnOOP"};
    public static final C11593C7 A04;
    public final long A00;
    public final long A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{59, 55, 103, 120, 100, 126, 99, 126, 120, 121, 42, 66, 109, 112, 116, 124, 76, 106, 36, 0};
    }

    static {
        A01();
        A04 = new C11593C7(0L, 0L);
    }

    public C11593C7(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11593C7 c11593c7 = (C11593C7) obj;
        if (this.A01 == c11593c7.A01) {
            int i = (this.A00 > c11593c7.A00 ? 1 : (this.A00 == c11593c7.A00 ? 0 : -1));
            String[] strArr = A03;
            if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[2] = "3vPfkmkrA1hfyjdWVmobnDMGeBIicVYm";
            strArr2[6] = "ou5H6BmOyErFNkIoNYVTqPhUeuo6kjPn";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 21) + this.A01 + A00(0, 11, 27) + this.A00 + A00(19, 1, 81);
    }
}

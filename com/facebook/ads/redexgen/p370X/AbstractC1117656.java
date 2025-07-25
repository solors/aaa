package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1117656 {
    public static byte[] A0I;
    public static String[] A0J = {"elFBINX9KCZeeh3GuBtXNkrnzvQO2EpS", "90eRnITlqXrODLYCktUoA3f94MaN8E2n", "frZa4xykTTwKCwTkBfcIIin", "72h0olRZUROZW521vLa1lYqHWLi1sRbG", "kk2D46k9ZSS3Lo8lOZQg", "QRz6bzRDBRAzmbOrrZDxPPvKGEinNos5", "9IkI3xtzDHMbybABrSkeOgSSTxMSP2eR", "o2K5Iq3zbWnsvhRLVQUneLMfyrath7l2"};
    public static final List<Object> A0K;
    public C11774FL A08;
    public WeakReference<C11774FL> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AbstractC1117656 A06 = null;
    public AbstractC1117656 A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C111664w A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    public int A02 = -1;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            String[] strArr = A0J;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "UeRrU6VIZhMUvjXaMrLT2TysGAtdmGOb";
            strArr2[1] = "zACgjBXCZF9ewGg4NUIKbeNCvKdUEEL0";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0I = new byte[]{3, 74, 71, 30, 126, 55, 57, 48, 49, 44, 59, 58, 86, 31, 24, 0, 23, 26, 31, 18, 25, 87, 86, 25, 73, 88, 75, 92, 87, 77, 60, 114, 115, 104, 60, 110, 121, Byte.MAX_VALUE, 101, Byte.MAX_VALUE, 112, 125, 126, 112, 121, 52, 24, 72, 87, 75, 81, 76, 81, 87, 86, 5, 33, 115, 100, 108, 110, 119, 100, 101, 85, 6, 22, 7, 20, 5, 85, 18, 70, 95, 66, 118, 87, 70, 83, 81, 90, 87, 86, 122, 47, 52, 56, 53, 47, 52, 62, 26, 79, 84, 94, 95, 92, 83, 84, 95, 94, 26, 91, 94, 91, 74, 78, 95, 72, 26, 74, 85, 73, 83, 78, 83, 85, 84, 2, 87, 82, 70, 67, 86, 71, 50, 32, 44, 99, 96, 104, 92, 99, Byte.MAX_VALUE, 49, 27, 23, 71, 123, 71, 88, 68, 13, 34, 29, 17, 3, 38, 25, 21, 7, 56, 31, 28, 20, 21, 2, 11, 61, 7, 18, 18, 7, 5, 14, 3, 2, 53, 5, 20, 7, 22, 59, 58, 2, 9, 0, 15, 6, 4, 50, 2, 19, 0, 17, 60, 46, 52, 21, 34, 36, 62, 36, 43, 38, 37, 43, 34, 103, 35, 34, 36, 53, 34, 42, 34, 41, 51, 34, 35, 103, 37, 34, 43, 40, 48, 103, 119, 125, 103, 50, 41, 42, 38, 51, 36, 47, 34, 35, 103, 55, 38, 46, 53, 103, 40, 33, 103, 52, 34, 51, 14, 52, 21, 34, 36, 62, 38, 37, 43, 34, 111, 110, 103, 36, 38, 43, 43, 52, 103, 33, 40, 53, 103, 29, 0, 17, 25, 34, 29, 17, 3, 84, 25, 21, 13, 84, 26, 27, 0, 84, 22, 17, 84, 26, 1, 24, 24, 123};
    }

    static {
        A04();
        A0K = Collections.EMPTY_LIST;
    }

    public AbstractC1117656(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(264, 24, 66));
    }

    private void A03() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C11774FL c11774fl) {
        this.A0E = AbstractC110773T.A00(this.A0H);
        c11774fl.A1x(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(C11774FL c11774fl) {
        c11774fl.A1x(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A09() {
        return (this.A0C & 16) == 0 && AbstractC110773T.A0G(this.A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0A() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0B() {
        if ((this.A0C & 512) == 0) {
            boolean A0Z = A0Z();
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[4] = "dSQQEa0elVuDjjqhtuiH";
            if (!A0Z) {
                return false;
            }
        }
        return true;
    }

    public final int A0G() {
        if (this.A08 == null) {
            return -1;
        }
        int A1C = this.A08.A1C(this);
        String[] strArr = A0J;
        if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
            throw new RuntimeException();
        }
        A0J[2] = "FYB2N4b61bNhg9cwpN00hgm";
        return A1C;
    }

    public final int A0H() {
        return this.A00;
    }

    public final int A0I() {
        return this.A04 == -1 ? this.A03 : this.A04;
    }

    public final int A0J() {
        return this.A01;
    }

    public final long A0K() {
        return this.A05;
    }

    public final List<Object> A0L() {
        if ((this.A0C & 1024) == 0) {
            if (this.A0A == null || this.A0A.size() == 0) {
                List<Object> list = A0K;
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[2] = "hQ1JLXyYGxOkcwlW4dXhMkD";
                return list;
            }
            List<Object> list2 = this.A0B;
            String[] strArr2 = A0J;
            if (strArr2[0].charAt(4) != strArr2[1].charAt(4)) {
                String[] strArr3 = A0J;
                strArr3[7] = "12FReyGhr0Gy9SAr2o7QhiY2oo1Ever4";
                strArr3[3] = "Q2P3QGMLTw8PDNq5VpeXaAuVADEzryB4";
                return list2;
            }
            return list2;
        }
        return A0K;
    }

    public final void A0M() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0N() {
        if (this.A0A != null) {
            this.A0A.clear();
        }
        this.A0C &= -1025;
        String[] strArr = A0J;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "zfgIUpP6NOwkKkp2713xr48Icx9i2htm";
        strArr2[1] = "7toV51THczyutnu9dsZIYiPQpALa8FIp";
    }

    public final void A0O() {
        this.A0C &= -33;
    }

    public final void A0P() {
        this.A0C &= -257;
    }

    public final void A0Q() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0N();
        this.A0E = 0;
        this.A02 = -1;
        C11774FL.A0s(this);
    }

    public final void A0R() {
        if (this.A01 == -1) {
            int i = this.A03;
            if (A0J[4].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "ZtNXNLZ2mB5tglrdrkplF8NneRyyOdxT";
            strArr[5] = "cQ2wGPgO9l4ITB75rCj9hGEnqQmfMy7J";
            this.A01 = i;
        }
    }

    public final void A0S() {
        this.A0F.A0Y(this);
    }

    public final void A0T(int i) {
        this.A0C |= i;
    }

    public final void A0U(int i, int i2) {
        this.A0C = (this.A0C & (i2 ^ (-1))) | (i & i2);
    }

    public final void A0V(C111664w c111664w, boolean z) {
        this.A0F = c111664w;
        this.A0G = z;
    }

    public final void A0W(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A03();
            this.A0A.add(obj);
            return;
        }
        A0T(1024);
    }

    public final void A0X(boolean z) {
        int i;
        int i2 = this.A0D;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.A0D = i;
        int i3 = this.A0D;
        if (A0J[2].length() != 23) {
            throw new RuntimeException();
        }
        A0J[2] = "rX8ZXsodik0buiwUD3KFOeS";
        if (i3 < 0) {
            this.A0D = 0;
            Log.e(A02(143, 4, 66), A02(186, 78, 113) + this);
        } else if (!z && this.A0D == 1) {
            this.A0C |= 16;
        } else if (!z || this.A0D != 0) {
        } else {
            this.A0C &= -17;
        }
    }

    public final boolean A0Y() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0Z() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0a() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0b() {
        return this.A0F != null;
    }

    public final boolean A0c() {
        return (this.A0C & 256) != 0;
    }

    public final boolean A0d() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0e() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0h() {
        if ((this.A0C & 16) == 0) {
            View view = this.A0H;
            String[] strArr = A0J;
            if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[6] = "oGhVpGrwcoPRlkZsrOks4DxLuVnWzLrQ";
            strArr2[5] = "RzFlIrJ9otd57SLzr7ci506FuBBONCMw";
            if (!AbstractC110773T.A0G(view)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0i(int i) {
        return (this.A0C & i) != 0;
    }

    public final String toString() {
        String A02;
        StringBuilder sb2 = new StringBuilder(A02(147, 11, 70) + Integer.toHexString(hashCode()) + A02(46, 10, 14) + this.A03 + A02(0, 4, 21) + this.A05 + A02(126, 9, 58) + this.A01 + A02(135, 8, 1) + this.A04);
        if (A0b()) {
            StringBuilder append = sb2.append(A02(64, 7, 67));
            boolean z = this.A0G;
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[2] = "PPawOVKlLlIRUbnpb4vzMoP";
            if (z) {
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[4] = "lFbF3LZCiVqyeVLEGjED";
                A02 = A02(173, 13, 87);
            } else {
                A02 = A02(158, 15, 80);
            }
            append.append(A02);
        }
        if (A0Z()) {
            sb2.append(A02(12, 8, 64));
        }
        if (!A0Y()) {
            sb2.append(A02(83, 8, 108));
        }
        if (A0e()) {
            sb2.append(A02(118, 7, 20));
        }
        if (A0a()) {
            sb2.append(A02(56, 8, 55));
        }
        if (A0f()) {
            sb2.append(A02(4, 8, 104));
        }
        if (A0c()) {
            sb2.append(A02(71, 12, 4));
        }
        if (!A0h()) {
            StringBuilder sb3 = new StringBuilder().append(A02(30, 16, 42)).append(this.A0D).append(A02(125, 1, 45));
            sb2.append(sb3.toString());
        }
        if (A0B()) {
            sb2.append(A02(91, 27, 12));
        }
        if (this.A0H.getParent() == null) {
            sb2.append(A02(20, 10, 15));
        }
        sb2.append(A02(288, 1, 48));
        return sb2.toString();
    }
}

package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lv */
/* loaded from: assets/audience_network.dex */
public final class C12169Lv {
    public static byte[] A0I;
    public static String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, 12, 115, Byte.MAX_VALUE, 60, 51, 54, 60, 52, 56, 42, 62, 45, 59, 11, 54, 50, 58, 101, Byte.MAX_VALUE, 75, 78, 122, 69, 89, 67, 94, 67, 69, 68, 114, 94, 91, 111, 80, 76, 86, 75, 86, 80, 81, 102, 105, 102, 99, 105, 97, 78, 111, 102, 107, 115, 94, 99, 103, 111, 119, 120, 125, 119, Byte.MAX_VALUE, 76, 47, 32, 37, 47, 39, 21, 95, 80, 85, 95, 87, 89, 88, 106, 85, 89, 75, 104, 93, 91, 1, 10, 0, 48, 13, 9, 1, 115, 120, 114, 78, 46, 37, 47, 18, 20, 29, 0, 17, 23, 108, 97, 109, 99, 108, 112, 56, 34, 18, 61, 56, 50, 58, 22, 36, 48, 35, 53, 20, 63, 48, 51, 61, 52, 53, 107, 113, 84, 71, 66, 79, 83, 85, 126, 118, 101, 96, 109, 113, 119, 93, 14, 25, 31, 19, 14, 24, 21, 18, 27, 92, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, 70, 92, 99, 100, 113, 98, 100, 68, 121, 125, 117, 115, 116, 97, 114, 116, 88, 36, 35, 54, 37, 35, 14, 15, 17, 28, 12, 16};
    }

    static {
        A02();
        A0K = C12169Lv.class.getSimpleName();
    }

    private EnumC12142LU A00() {
        if (this.A0G == null || this.A0F == null) {
            return EnumC12142LU.A0J;
        }
        View view = this.A0G;
        String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                EnumC12142LU enumC12142LU = EnumC12142LU.A0H;
                String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return enumC12142LU;
            } else if (Build.VERSION.SDK_INT < 4) {
                return EnumC12142LU.A0G;
            } else {
                Object tag = this.A0G.getTag(EnumC12142LU.A02);
                if (tag == null) {
                    EnumC12142LU enumC12142LU2 = EnumC12142LU.A0I;
                    if (A0J[2].charAt(2) == 'm') {
                        A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                        return enumC12142LU2;
                    }
                } else if (!(tag instanceof EnumC12142LU)) {
                    return EnumC12142LU.A0K;
                } else {
                    return (EnumC12142LU) tag;
                }
            }
        }
        throw new RuntimeException();
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        long j;
        if (!this.A0H) {
            return null;
        }
        String valueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        if (this.A0C > 0 && this.A0D > this.A0C) {
            j = this.A0D - this.A0C;
        } else {
            j = -1;
        }
        HashMap hashMap = new HashMap();
        String valueOf2 = String.valueOf(this.A04);
        String radius = A01(20, 11, 76);
        hashMap.put(radius, valueOf2);
        String valueOf3 = String.valueOf(this.A05);
        String radius2 = A01(31, 11, 89);
        hashMap.put(radius2, valueOf3);
        String valueOf4 = String.valueOf(this.A06);
        String radius3 = A01(186, 5, 30);
        hashMap.put(radius3, valueOf4);
        String valueOf5 = String.valueOf(this.A03);
        String radius4 = A01(102, 6, 98);
        hashMap.put(radius4, valueOf5);
        String A01 = A01(42, 14, 108);
        String radius5 = String.valueOf(j);
        hashMap.put(A01, radius5);
        String valueOf6 = String.valueOf(this.A0E);
        String radius6 = A01(165, 9, 118);
        hashMap.put(radius6, valueOf6);
        String valueOf7 = String.valueOf(this.A0D);
        String radius7 = A01(82, 7, 2);
        hashMap.put(radius7, valueOf7);
        String valueOf8 = String.valueOf(this.A0A);
        String radius8 = A01(174, 6, 102);
        hashMap.put(radius8, valueOf8);
        String valueOf9 = String.valueOf(this.A0B);
        String radius9 = A01(180, 6, 49);
        hashMap.put(radius9, valueOf9);
        String valueOf10 = String.valueOf(this.A07);
        String radius10 = A01(56, 6, 114);
        hashMap.put(radius10, valueOf10);
        String valueOf11 = String.valueOf(this.A08);
        String radius11 = A01(62, 6, 42);
        hashMap.put(radius11, valueOf11);
        String valueOf12 = String.valueOf(this.A07);
        String radius12 = A01(89, 4, 112);
        hashMap.put(radius12, valueOf12);
        String valueOf13 = String.valueOf(this.A08);
        String radius13 = A01(93, 4, 45);
        hashMap.put(radius13, valueOf13);
        String valueOf14 = String.valueOf(this.A00);
        String radius14 = A01(97, 5, 20);
        hashMap.put(radius14, valueOf14);
        String radius15 = A01(129, 7, 64);
        hashMap.put(radius15, valueOf);
        String radius16 = A01(136, 7, 98);
        hashMap.put(radius16, valueOf);
        String valueOf15 = String.valueOf(A00().A06());
        String radius17 = A01(68, 14, 90);
        hashMap.put(radius17, valueOf15);
        return hashMap;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 26) + this.A0C;
        }
    }

    public final void A06(C13029Zs c13029Zs, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c13029Zs.A0E().AHN();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                String[] strArr = A0J;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    String[] strArr2 = A0J;
                    strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                    strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                    if (motionRange != null && motionRange2 != null) {
                        this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / AbstractC12137LP.A02);
                this.A05 = (int) (iArr[1] / AbstractC12137LP.A02);
                this.A06 = (int) (view.getWidth() / AbstractC12137LP.A02);
                this.A03 = (int) (view.getHeight() / AbstractC12137LP.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC12137LP.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / AbstractC12137LP.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC12137LP.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / AbstractC12137LP.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09(android.content.Context r9) {
        /*
            r8 = this;
            int r7 = com.facebook.ads.redexgen.p370X.C11979Im.A07(r9)
            long r2 = r8.A03()
            if (r7 < 0) goto L52
            long r4 = (long) r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L52
            r6 = 1
        L10:
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4 = 108(0x6c, float:1.51E-43)
            r1 = 21
            r0 = 55
            java.lang.String r0 = A01(r4, r1, r0)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r5 = r0.append(r6)
            r4 = 2
            r1 = 18
            r0 = 57
            java.lang.String r0 = A01(r4, r1, r0)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r5 = r0.append(r7)
            r4 = 0
            r1 = 2
            r0 = 74
            java.lang.String r0 = A01(r4, r1, r0)
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.toString()
        L51:
            return r6
        L52:
            r6 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12169Lv.A09(android.content.Context):boolean");
    }
}

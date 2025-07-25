package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.4g */
/* loaded from: assets/audience_network.dex */
public final class C111504g extends AbstractC11673DP {
    public static byte[] A05;
    public static String[] A06 = {"voi9qGMtYtobAgRqg", "i8JJ1VX9T6FbzCMQLBGPbtFPfD02EzPW", "v6oC9E02J21Vr04ahrJngYZMnVV2OVNY", "kicp0KggiDo3q7jvaFg8HsU4Xp8AQowh", "gvZaMgnlealTntma7jKFbyLF1vqDiERO", "AwReB6CJfKDfzaUmGsZwkLBxgWQy6imw", "anDXtkkAhMqJOECaQChOPQ3FzDPKJsLN", "7FMpk05V5nJPRxkKy5zgZ4SKnXISiLM1"};
    public static final Pattern A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-115, -82, -59, -64, -82, -30, -22, -79, -81, -64, -81, -59, -82, -30, -22, -79, -81, -64, -82, -30, -22, -79, -81, -82, -59, -64, -64, 2, -30, -76, -81, -82, -30, -22, -79, -81, -35, -18, 19, 11, 22, 25, 17, 31, 15, -28, -54, -88, -47, -44, -49, -61, -42, -100, -126, -11, 13, 11, 18, 18, 11, 16, 9, -62, 6, 11, 3, 14, 17, 9, 23, 7, -62, 14, 11, 16, 7, -62, 4, 7, 8, 17, 20, 7, -62, 5, 17, 15, 18, 14, 7, 22, 7, -62, 8, 17, 20, 15, 3, 22, -36, -62, -24, 0, -2, 5, 5, -2, 3, -4, -75, -7, -2, -10, 1, 4, -4, 10, -6, -75, 1, -2, 3, -6, -75, 12, -2, 9, -3, -75, -5, -6, 12, -6, 7, -75, -8, 4, 1, 10, 2, 3, 8, -75, 9, -3, -10, 3, -75, -5, 4, 7, 2, -10, 9, -49, -75, -70, -46, -48, -41, -41, -48, -43, -50, -121, -48, -43, -35, -56, -45, -48, -53, -121, -37, -48, -44, -48, -43, -50, -95, -121, 17, 49, 31, 2, 35, 33, 45, 34, 35, 48, 12, -10, 39, 22, 31, 37, 36, 14, -31, -31, -45, -73, -73, -55, 21, 52, -25, -29, -8, 21, 54, -84, -75, -85, -47, -46, -65, -48, -46, 51, 36, 55, 51};
    }

    static {
        A03();
        A07 = Pattern.compile(A02(1, 35, 66));
    }

    public C111504g() {
        this(null);
    }

    public C111504g(List<byte[]> list) {
        super(A02(182, 10, 122));
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0Q = AbstractC11953IK.A0Q(list.get(0));
            String formatLine = A02(47, 8, 30);
            AbstractC11914Hf.A03(A0Q.startsWith(formatLine));
            A06(A0Q);
            A04(new C11939I4(list.get(1)));
            return;
        }
        this.A04 = false;
    }

    public static long A00(String str) {
        Matcher matcher = A07.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC11673DP
    /* renamed from: A01 */
    public final C12874XK A0b(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C11929Hu c11929Hu = new C11929Hu();
        C11939I4 c11939i4 = new C11939I4(bArr, i);
        if (!this.A04) {
            A04(c11939i4);
        }
        A05(c11939i4, arrayList, c11929Hu);
        C11805Fs[] c11805FsArr = new C11805Fs[arrayList.size()];
        arrayList.toArray(c11805FsArr);
        return new C12874XK(c11805FsArr, c11929Hu.A05());
    }

    private void A04(C11939I4 c11939i4) {
        String A0P;
        do {
            A0P = c11939i4.A0P();
            if (A0P == null) {
                return;
            }
        } while (!A0P.startsWith(A02(192, 8, 109)));
    }

    private void A05(C11939I4 c11939i4, List<C11805Fs> list, C11929Hu c11929Hu) {
        while (true) {
            String A0P = c11939i4.A0P();
            if (A0P != null) {
                if (!this.A04 && A0P.startsWith(A02(47, 8, 30))) {
                    A06(A0P);
                } else if (A0P.startsWith(A02(37, 10, 102))) {
                    A07(A0P, list, c11929Hu);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r7.equals(A02(216, 5, 26)) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(java.lang.String r9) {
        /*
            r8 = this;
            r2 = 47
            r1 = 8
            r0 = 30
            java.lang.String r0 = A02(r2, r1, r0)
            int r0 = r0.length()
            java.lang.String r3 = r9.substring(r0)
            r2 = 36
            r1 = 1
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            java.lang.String[] r6 = android.text.TextUtils.split(r3, r0)
            int r0 = r6.length
            r8.A01 = r0
            r5 = -1
            r8.A02 = r5
            r8.A00 = r5
            r8.A03 = r5
            r3 = 0
        L2a:
            int r0 = r8.A01
            r4 = 0
            if (r3 >= r0) goto L81
            r0 = r6[r3]
            java.lang.String r0 = r0.trim()
            java.lang.String r7 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A0M(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 100571: goto L71;
                case 3556653: goto L60;
                case 109757538: goto L50;
                default: goto L40;
            }
        L40:
            r4 = -1
        L41:
            switch(r4) {
                case 0: goto L4d;
                case 1: goto L4a;
                case 2: goto L47;
                default: goto L44;
            }
        L44:
            int r3 = r3 + 1
            goto L2a
        L47:
            r8.A03 = r3
            goto L44
        L4a:
            r8.A00 = r3
            goto L44
        L4d:
            r8.A02 = r3
            goto L44
        L50:
            r2 = 216(0xd8, float:3.03E-43)
            r1 = 5
            r0 = 26
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L40
            goto L41
        L60:
            r2 = 221(0xdd, float:3.1E-43)
            r1 = 4
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L40
            r4 = 2
            goto L41
        L71:
            r2 = 213(0xd5, float:2.98E-43)
            r1 = 3
            r0 = 3
            java.lang.String r0 = A02(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L40
            r4 = 1
            goto L41
        L81:
            int r0 = r8.A02
            if (r0 == r5) goto La8
            int r3 = r8.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C111504g.A06
            r0 = 4
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lab
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C111504g.A06
            java.lang.String r1 = "VBU3TrESEVpVzSlZYum2Chs6nvZkrBrf"
            r0 = 3
            r2[r0] = r1
            if (r3 == r5) goto La8
            int r0 = r8.A03
            if (r0 != r5) goto Laa
        La8:
            r8.A01 = r4
        Laa:
            return
        Lab:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C111504g.A06(java.lang.String):void");
    }

    private void A07(String str, List<C11805Fs> list, C11929Hu c11929Hu) {
        int i = this.A01;
        String A02 = A02(182, 10, 122);
        if (i == 0) {
            Log.w(A02, A02(55, 47, 94) + str);
            return;
        }
        String[] split = str.substring(A02(37, 10, 102).length()).split(A02(36, 1, 109), this.A01);
        if (split.length != this.A01) {
            Log.w(A02, A02(102, 55, 81) + str);
            return;
        }
        long startTimeUs = A00(split[this.A02]);
        String A022 = A02(157, 25, 35);
        if (startTimeUs == -9223372036854775807L) {
            Log.w(A02, A022 + str);
            return;
        }
        long j = -9223372036854775807L;
        int i2 = this.A00;
        String[] strArr = A06;
        if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "8Z0lGBjOUyAgCpNAkEkptI9cCMl1oL4V";
        strArr2[5] = "T8saQGTCuSxjdg3XY2BQpttDIhhC0C66";
        String str2 = split[i2];
        if (!str2.trim().isEmpty()) {
            j = A00(str2);
            if (j == -9223372036854775807L) {
                Log.w(A02, A022 + str);
                return;
            }
        }
        String endTimeString = split[this.A03].replaceAll(A02(206, 7, 117), A02(0, 0, 39));
        String A023 = A02(200, 3, 65);
        String A024 = A02(0, 1, 63);
        list.add(new C11805Fs(endTimeString.replaceAll(A023, A024).replaceAll(A02(203, 3, 23), A024)));
        c11929Hu.A04(startTimeUs);
        if (j != -9223372036854775807L) {
            list.add(null);
            c11929Hu.A04(j);
        }
    }
}

package com.facebook.ads.redexgen.p370X;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.DW */
/* loaded from: assets/audience_network.dex */
public final class C11680DW {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"KyUIazmDYRjHGIYmM", "vQ7MPDC9OxlEQa1IJnKsCbnMY25pV9Py", "oIY4tBYD3sYPgYHy5PuZ8JwrQPquqjMA", "vRxUo5t7WeracVAtrgWMVLiyWCaBJb7M", "RvXFZZsiaZmjdaxyxnCHLoHhYQiV7o", "vBhnj9ZoedWgTZMIFLvOvTo0B13knnsy", "vqETaYR", "Sf"};
    public static final SparseIntArray A03;
    public static final SparseIntArray A04;
    public static final C11669DL A05;
    public static final HashMap<C11677DT, List<C11669DL>> A06;
    public static final Map<String, Integer> A07;
    public static final Pattern A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00() throws C11678DU {
        if (A00 == -1) {
            int i = 0;
            C11669DL A062 = A06(A07(1006, 9, 115), false);
            if (A062 != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A062.A0J()) {
                    i = Math.max(A01(codecProfileLevel.level), i);
                }
                i = Math.max(i, AbstractC11953IK.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i;
        }
        return A00;
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
            if (A02[7].length() != 2) {
                throw new RuntimeException();
            }
            A02[4] = "BD020y3FFzLQ4T6FngoIJN6dqP5f0s";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x006f, code lost:
        if (r17.A01 == false) goto L45;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b6 A[Catch: Exception -> 0x0132, TRY_ENTER, TryCatch #5 {Exception -> 0x0132, blocks: (B:83:0x0022, B:85:0x002a, B:88:0x0036, B:111:0x00a6, B:114:0x00b6, B:116:0x00bc, B:122:0x00f6, B:123:0x0131, B:117:0x00e7, B:118:0x00eb), top: B:140:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.p370X.C11669DL> A08(com.facebook.ads.redexgen.p370X.C11677DT r17, com.facebook.ads.redexgen.p370X.InterfaceC11679DV r18, java.lang.String r19) throws com.facebook.ads.redexgen.p370X.C11678DU {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11680DW.A08(com.facebook.ads.redexgen.X.DT, com.facebook.ads.redexgen.X.DV, java.lang.String):java.util.ArrayList");
    }

    public static void A0A() {
        byte[] bArr = {78, 70, 1, 9, 71, SignedBytes.MAX_POWER_OF_TWO, 72, 77, 68, 69, 1, 85, 78, 1, 80, 84, 68, 83, 88, 1, 66, SignedBytes.MAX_POWER_OF_TWO, 81, SignedBytes.MAX_POWER_OF_TWO, 67, 72, 77, 72, 85, 72, 68, 82, 8, 115, 126, 112, 17, 35, 35, 37, 61, 57, 62, 55, 106, 112, 125, 32, 54, 48, 38, 33, 54, 112, 53, 37, 33, 37, 66, 82, 46, 46, 44, 43, 10, 12, 0, 11, 10, 29, 56, 74, 78, 75, 79, 120, 10, 14, 11, 14, 30, 108, 107, 109, 105, 103, 21, 18, 20, 17, 108, 25, 25, 31, 29, 24, 109, 109, 107, 104, 50, 71, 71, 65, 71, 68, 49, 49, 54, 49, 106, 96, 121, 104, 104, 106, 109, 76, 74, 70, 77, 76, 91, 1, 11, 18, 3, 15, 16, 12, 0, 6, 39, 33, 45, 38, 39, 48, 110, 100, 125, 96, 125, 30, 105, 72, 78, 66, 73, 72, 95, 110, 100, 125, 123, 66, 95, 79, 68, 94, 105, 72, 78, 66, 73, 72, 95, 101, 66, 74, 79, 70, 71, 3, 87, 76, 3, 82, 86, 70, 81, 90, 3, SignedBytes.MAX_POWER_OF_TWO, 76, 71, 70, SignedBytes.MAX_POWER_OF_TWO, 3, 10, 115, 112, 114, 2, 123, 120, 121, 65, 56, 60, 57, 31, 102, 98, 100, 1, 120, 124, Byte.MAX_VALUE, 39, 94, 87, 95, 58, 67, 74, 65, 41, 80, 89, 87, 87, 44, 47, 16, 110, 104, 60, 66, 71, 18, 99, 106, 68, 53, 63, 13, 8, 40, 6, 15, 14, 19, 8, 15, 6, 65, 12, 0, 13, 7, 14, 19, 12, 4, 5, 65, 32, 55, 34, 65, 2, 14, 5, 4, 2, 65, 18, 21, 19, 8, 15, 6, 91, 65, 74, 100, 109, 108, 113, 106, 109, 100, 35, 110, 98, 111, 101, 108, 113, 110, 102, 103, 35, 75, 70, 85, SignedBytes.MAX_POWER_OF_TWO, 35, 96, 108, 103, 102, 96, 35, 112, 119, 113, 106, 109, 100, 57, 35, 32, 93, 94, 92, 74, 55, 52, 53, 106, 23, 19, 22, 79, 50, 54, 48, 111, 18, 22, 21, 99, 30, 23, 31, 20, 105, 96, 107, 102, 27, 18, 28, 86, 41, 42, 49, 78, 75, 21, 121, 3, 5, 100, 30, 27, 53, SignedBytes.MAX_POWER_OF_TWO, 73, 55, 66, 72, 15, 18, 113, 6, 39, 33, 45, 38, 39, 48, 90, 114, 115, 126, 118, 84, 120, 115, 114, 116, 91, 126, 100, 99, 55, 86, 71, 94, 55, 115, 126, 115, 121, 48, 99, 55, 123, 126, 100, 99, 55, 100, 114, 116, 98, 101, 114, 55, 115, 114, 116, 120, 115, 114, 101, 55, 113, 120, 101, 45, 55, 39, 15, 14, 3, 11, 41, 5, 14, 15, 9, 63, 30, 3, 6, 38, 13, 16, 29, 27, 72, 89, 88, 120, 115, 101, 120, 126, 115, 26, 111, 98, 4, 114, 112, 101, 19, 120, 69, 68, 83, 82, 78, 19, 124, 124, 126, 19, 121, 88, 94, 82, 89, 88, 79, 68, 70, 83, 37, 78, 115, 114, 101, 100, 120, 37, 74, 93, 72, 37, 79, 110, 104, 100, 111, 110, 121, 13, 15, 26, 108, 7, 58, 59, 44, 45, 49, 108, 3, 20, 1, 108, 6, 39, 33, 45, 38, 39, 48, 108, 49, 39, 33, 55, 48, 39, 7, 5, 16, 102, 5, 28, 3, 102, 9, 29, 12, 1, 7, 102, 12, 13, 11, 7, 12, 13, 26, 102, 9, 9, 11, 62, 60, 41, 95, 60, 37, 58, 95, 48, 36, 53, 56, 62, 95, 53, 52, 50, 62, 53, 52, 35, 95, 53, 34, 33, 48, 50, 66, 110, 108, 121, 15, 108, 117, 106, 15, 96, 116, 101, 104, 110, 15, 101, 100, 98, 110, 101, 100, 115, 15, 115, 96, 118, 114, 112, 101, 19, 110, 120, 126, 19, 112, 109, 14, 19, 121, 88, 94, 82, 89, 88, 79, 30, 28, 9, Byte.MAX_VALUE, 2, 20, 18, Byte.MAX_VALUE, 48, 48, 50, Byte.MAX_VALUE, 53, 52, 50, 54, 52, 33, 87, 42, 60, 58, 87, 15, 9, 65, 87, 29, 28, 26, 25, 27, 14, 120, 49, 57, 57, 49, 58, 51, 120, 36, 55, 33, 120, 50, 51, 53, 57, 50, 51, 36, 109, 111, 122, 12, 83, 65, 77, 79, 12, 67, 87, 70, 75, 77, 12, 70, 71, 65, 77, 70, 71, 80, 12, 67, 67, 65, 1, 3, 22, 96, 63, 45, 33, 35, 96, 47, 59, 42, 39, 33, 96, 42, 43, 45, 33, 42, 43, 60, 96, 35, 62, 125, 55, 53, 32, 86, 9, 27, 23, 21, 86, 14, 17, 28, 29, 23, 86, 28, 29, 27, 23, 28, 29, 10, 86, 14, 8, SignedBytes.MAX_POWER_OF_TWO, 73, 89, 55, 42, 46, 93, 88, 72, 38, 59, 62, 76, 119, 103, 114, 23, 21, 20, 8, 106, 119, 117, 2, 9, 49, 51, 42, 42, 51, 52, 61, 122, 57, 53, 62, 63, 57, 122, 94, 101, 96, 101, 100, 124, 101, 43, 74, 93, 72, 43, 103, 110, 125, 110, 103, 49, 43, 81, 106, 111, 106, 107, 115, 106, 36, 69, 82, 71, 36, 116, 118, 107, 98, 109, 104, 97, 62, 36, 5, 62, 59, 62, 63, 39, 62, 112, 24, 21, 6, 19, 112, 60, 53, 38, 53, 60, 112, 35, 36, 34, 57, 62, 55, 106, 112, 4, 63, 58, 63, 62, 38, 63, 113, 25, 20, 7, 18, 113, 33, 35, 62, 55, 56, 61, 52, 113, 34, 37, 35, 56, 63, 54, 107, 113, 76, 125, 117, 123, 121, 125, 89, 43, 56, 58, 34, 89, 78, 58, 2, 77, 79, 66, 19, 69, 66, 114, 102, 119, 122, 124, 60, 118, 114, 112, 32, 9, 29, 12, 1, 7, 71, 13, 9, 11, 91, 69, 2, 7, 11, 24, 15, 26, 72, 61, 42, 63, 110, 43, 125, 42, 34, 54, 59, 11, 9, 9, 97, 108, Byte.MAX_VALUE, 56, 67, 93, 72, 26, 59, 55, 61, 37, 52, 85, 89, 74, 81, 86, 93, 84, 76, 93, 89, 76, 76, 92, 94, 67, 88, 67, 89, 120, 106, 102, 120, 126, 101, 108, 76, 94, 81, 75, 80, 76, 44, 58, 45, 
        45, 62, 49, 48, 108, 40, 24, 7, 10, 11, 1, 65, 15, 24, 13, 116, 107, 110, 110, 103, 20, 11, 14, 14, 7, 1, 80, 98, 125, 120, 120, 113, 100, 120, 97, 103, 62, 33, 42, 40, 48, 33, 91, 68, 83, 78, 71, 77, 85, 68, 94, 65, 86, 75, 72, 80, 65};
        if (A02[5].charAt(16) == 'm') {
            throw new RuntimeException();
        }
        A02[3] = "v3s1R4n4E2CplWuCnbp9IXiCJ0VpMC0h";
        A01 = bArr;
    }

    static {
        A0A();
        A05 = C11669DL.A01(A07(657, 22, 75));
        A08 = Pattern.compile(A07(899, 10, 123));
        A06 = new HashMap<>();
        A00 = -1;
        A04 = new SparseIntArray();
        A04.put(66, 1);
        A04.put(77, 2);
        A04.put(88, 4);
        A04.put(100, 8);
        A03 = new SparseIntArray();
        A03.put(10, 1);
        A03.put(11, 4);
        A03.put(12, 8);
        A03.put(13, 16);
        A03.put(20, 32);
        A03.put(21, 64);
        A03.put(22, 128);
        A03.put(30, 256);
        A03.put(31, 512);
        A03.put(32, 1024);
        A03.put(40, 2048);
        A03.put(41, 4096);
        A03.put(42, 8192);
        A03.put(50, 16384);
        A03.put(51, 32768);
        A03.put(52, 65536);
        A07 = new HashMap();
        A07.put(A07(345, 3, 7), 1);
        A07.put(A07(352, 3, 40), 4);
        A07.put(A07(355, 3, 53), 16);
        A07.put(A07(358, 3, 100), 64);
        A07.put(A07(361, 3, 102), 256);
        A07.put(A07(313, 4, 113), 1024);
        A07.put(A07(317, 4, 27), 4096);
        A07.put(A07(321, 4, 59), 16384);
        A07.put(A07(325, 4, 30), 65536);
        A07.put(A07(329, 4, 62), 262144);
        A07.put(A07(333, 4, 50), 1048576);
        A07.put(A07(337, 4, 69), 4194304);
        A07.put(A07(FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 4, 55), 16777216);
        A07.put(A07(221, 3, 2), 2);
        A07.put(A07(224, 3, 69), 8);
        A07.put(A07(227, 3, 105), 32);
        A07.put(A07(230, 3, 71), 128);
        A07.put(A07(233, 3, 17), 512);
        A07.put(A07(189, 4, 95), 2048);
        A07.put(A07(193, 4, 87), 8192);
        A07.put(A07(197, 4, 20), 32768);
        A07.put(A07(201, 4, 74), 131072);
        A07.put(A07(205, 4, 84), 524288);
        A07.put(A07(209, 4, 114), 2097152);
        A07.put(A07(213, 4, 111), 8388608);
        A07.put(A07(217, 4, 124), 33554432);
    }

    public static int A01(int i) {
        switch (i) {
            case 1:
                return 25344;
            case 2:
                return 25344;
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
                return 414720;
            case 256:
                return 414720;
            case 512:
                if (A02[2].charAt(23) != 'K') {
                    String[] strArr = A02;
                    strArr[6] = "NlyGzCz";
                    strArr[0] = "RF3BFBC4AW17GvE58";
                    return 921600;
                }
                throw new RuntimeException();
            case 1024:
                return 1310720;
            case 2048:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003e, code lost:
        if (r4.equals(A07(953, 4, 20)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A02(java.lang.String r7) {
        /*
            r6 = 0
            if (r7 != 0) goto L4
            return r6
        L4:
            r2 = 897(0x381, float:1.257E-42)
            r1 = 2
            r0 = 24
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r3 = r7.split(r0)
            r5 = 0
            r4 = r3[r5]
            int r0 = r4.hashCode()
            switch(r0) {
                case 3006243: goto L71;
                case 3006244: goto L41;
                case 3199032: goto L31;
                case 3214780: goto L20;
                default: goto L1b;
            }
        L1b:
            r5 = -1
        L1c:
            switch(r5) {
                case 0: goto L87;
                case 1: goto L87;
                case 2: goto L82;
                case 3: goto L82;
                default: goto L1f;
            }
        L1f:
            return r6
        L20:
            r2 = 957(0x3bd, float:1.341E-42)
            r1 = 4
            r0 = 54
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 1
            goto L1c
        L31:
            r2 = 953(0x3b9, float:1.335E-42)
            r1 = 4
            r0 = 20
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            goto L1c
        L41:
            r2 = 940(0x3ac, float:1.317E-42)
            r1 = 4
            r0 = 65
            java.lang.String r5 = A07(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11680DW.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L5d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11680DW.A02
            java.lang.String r1 = "6nM1zSh"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "83kXhSrbScQaBsiK5"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L1b
            r5 = 3
            goto L1c
        L71:
            r2 = 936(0x3a8, float:1.312E-42)
            r1 = 4
            r0 = 100
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1b
            r5 = 2
            goto L1c
        L82:
            android.util.Pair r0 = A03(r7, r3)
            return r0
        L87:
            android.util.Pair r0 = A04(r7, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11680DW.A02(java.lang.String):android.util.Pair");
    }

    public static Pair<Integer, Integer> A03(String str, String[] strArr) {
        Integer valueOf;
        Integer valueOf2;
        int length = strArr.length;
        String A072 = A07(238, 37, 124);
        String A073 = A07(425, 14, 119);
        if (length < 2) {
            Log.w(A073, A072 + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                Log.w(A073, A072 + str);
                return null;
            }
            int i = A04.get(valueOf.intValue(), -1);
            if (i == -1) {
                Log.w(A073, A07(814, 21, 25) + valueOf);
                return null;
            }
            int i2 = A03.get(valueOf2.intValue(), -1);
            if (i2 == -1) {
                Log.w(A073, A07(795, 19, 22) + valueOf2);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (NumberFormatException unused) {
            Log.w(A073, A072 + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A04(String str, String[] strArr) {
        int i;
        int length = strArr.length;
        String A072 = A07(275, 38, 30);
        String A073 = A07(425, 14, 119);
        if (length < 4) {
            Log.w(A073, A072 + str);
            return null;
        }
        Matcher matcher = A08.matcher(strArr[1]);
        if (A02[4].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "yFIGXMH";
        strArr2[0] = "KAF3RCWkxumAXr2AT";
        if (!matcher.matches()) {
            Log.w(A073, A072 + str);
            return null;
        }
        String group = matcher.group(1);
        if (A07(53, 1, 92).equals(group)) {
            i = 1;
        } else if (A07(54, 1, 26).equals(group)) {
            i = 2;
        } else {
            Log.w(A073, A07(862, 29, 76) + group);
            return null;
        }
        Integer num = A07.get(strArr[3]);
        if (num == null) {
            Log.w(A073, A07(835, 27, 77) + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), num);
    }

    public static C11669DL A05() {
        return A05;
    }

    public static C11669DL A06(String str, boolean z) throws C11678DU {
        List<C11669DL> A09 = A09(str, z);
        if (A09.isEmpty()) {
            return null;
        }
        return A09.get(0);
    }

    public static synchronized List<C11669DL> A09(String str, boolean z) throws C11678DU {
        synchronized (C11680DW.class) {
            C11677DT c11677dt = new C11677DT(str, z);
            List<C11669DL> list = A06.get(c11677dt);
            if (list != null) {
                return list;
            }
            InterfaceC11679DV c12900Xn = AbstractC11953IK.A02 >= 21 ? new C12900Xn(z) : new C12901Xo();
            ArrayList<C11669DL> A082 = A08(c11677dt, c12900Xn, str);
            if (z && A082.isEmpty() && 21 <= AbstractC11953IK.A02 && AbstractC11953IK.A02 <= 23) {
                c12900Xn = new C12901Xo();
                A082 = A08(c11677dt, c12900Xn, str);
                if (!A082.isEmpty()) {
                    Log.w(A07(425, 14, 119), A07(374, 51, 10) + str + A07(34, 12, 77) + A082.get(0).A02);
                }
            }
            if (A07(922, 14, 117).equals(str)) {
                C11677DT key = new C11677DT(A07(912, 10, 14), c11677dt.A01);
                A082.addAll(A08(key, c12900Xn, str));
            }
            A0B(A082);
            List<C11669DL> unmodifiableList = Collections.unmodifiableList(A082);
            A06.put(c11677dt, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static void A0B(List<C11669DL> list) {
        if (AbstractC11953IK.A02 < 26 && list.size() > 1) {
            if (A07(583, 25, 60).equals(list.get(0).A02)) {
                for (int i = 1; i < list.size(); i++) {
                    C11669DL c11669dl = list.get(i);
                    if (A07(657, 22, 75).equals(c11669dl.A02)) {
                        list.remove(i);
                        list.add(0, c11669dl);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x00f8, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(236, 2, 88)) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01f8, code lost:
        if (A07(774, 6, 90).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0211, code lost:
        if (r4 == 16) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0221, code lost:
        if (A07(679, 26, 63).equals(r9) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0232, code lost:
        if (A07(70, 5, 102).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0234, code lost:
        r3 = A07(75, 5, 38).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0250, code lost:
        if (com.facebook.ads.redexgen.p370X.C11680DW.A02[2].charAt(23) == 'K') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0252, code lost:
        r2 = com.facebook.ads.redexgen.p370X.C11680DW.A02;
        r2[6] = "3Mp5Uuh";
        r2[0] = "BKjPN78J93LmhHbAv";
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x025e, code lost:
        if (r3 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x026f, code lost:
        if (A07(80, 5, 64).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0280, code lost:
        if (A07(85, 5, 57).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0282, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0283, code lost:
        if (r3 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x028d, code lost:
        if (r4 == 16) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0290, code lost:
        r4 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A02;
        r5 = A07(984, 7, 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x029d, code lost:
        if (r4 >= 24) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02ad, code lost:
        if (A07(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_IS_LOAD_FAILED_ALREADY_CALLED, 15, 76).equals(r9) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x02bd, code lost:
        if (A07(457, 22, 32).equals(r9) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02bf, code lost:
        r3 = r5.equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02d0, code lost:
        if (com.facebook.ads.redexgen.p370X.C11680DW.A02[4].length() == 30) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02d2, code lost:
        if (r3 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02e4, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 8, 60)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02f5, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(1050, 7, 57)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0306, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 6, 89)) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0317, code lost:
        if (A07(763, 6, 22).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0329, code lost:
        if (A07(966, 12, 37).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x032b, code lost:
        r3 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x033b, code lost:
        if (com.facebook.ads.redexgen.p370X.C11680DW.A02[3].charAt(0) == 'v') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0348, code lost:
        if (A07(55, 5, 12).equals(r3) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0358, code lost:
        if (A07(757, 6, 7).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0369, code lost:
        if (A07(769, 5, 57).equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x036b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x036c, code lost:
        com.facebook.ads.redexgen.p370X.C11680DW.A02[7] = "8B";
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x037e, code lost:
        if (A07(55, 5, 12).equals(r3) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0381, code lost:
        com.facebook.ads.redexgen.p370X.C11680DW.A02[3] = "vM2VV5cNViG9iheEl1QedVwh11kRb2VM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0388, code lost:
        if (r3 == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x038c, code lost:
        r6 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A02;
        r4 = A07(961, 5, 76);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0399, code lost:
        if (r6 > 19) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x039b, code lost:
        r2 = com.facebook.ads.redexgen.p370X.C11680DW.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03af, code lost:
        if (r2[6].length() == r2[0].length()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x03b1, code lost:
        r2 = com.facebook.ads.redexgen.p370X.C11680DW.A02;
        r2[6] = "H8RZpiF";
        r2[0] = "Qt7Gz5GbdPMmxFN0p";
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03c7, code lost:
        if (A07(642, 15, 100).equals(r9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03cf, code lost:
        if (r5.equals(com.facebook.ads.redexgen.p370X.AbstractC11953IK.A05) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03e0, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(944, 2, 82)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03f1, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(997, 7, 66)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f3, code lost:
        r5 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03;
        r2 = com.facebook.ads.redexgen.p370X.C11680DW.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0405, code lost:
        if (r2[6].length() == r2[0].length()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0407, code lost:
        com.facebook.ads.redexgen.p370X.C11680DW.A02[7] = "DL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0412, code lost:
        if (r5.startsWith(r4) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0423, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(991, 6, 34)) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0433, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(A07(1004, 2, 5)) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0435, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0436, code lost:
        com.facebook.ads.redexgen.p370X.C11680DW.A02[2] = "9VtxEaZDUnNZ6VyPkQGTvbLzZEhrKpnq";
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0447, code lost:
        if (A07(642, 15, 25).equals(r9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x044c, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A02 > 19) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0454, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11953IK.A03.startsWith(r4) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0464, code lost:
        if (A07(731, 26, 101).equals(r9) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0466, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0475, code lost:
        if (A07(922, 14, 117).equals(r11) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0485, code lost:
        if (A07(555, 28, 108).equals(r9) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0487, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0488, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(android.media.MediaCodecInfo r8, java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11680DW.A0C(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static boolean A0D(String str) {
        if (AbstractC11953IK.A02 <= 22) {
            if ((A07(447, 10, 42).equals(AbstractC11953IK.A06) || A07(439, 8, 117).equals(AbstractC11953IK.A06)) && (A07(479, 22, 22).equals(str) || A07(501, 29, 95).equals(str))) {
                return true;
            }
        }
        return false;
    }
}

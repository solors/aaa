package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import com.ironsource.C20517nb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.T4 */
/* loaded from: assets/audience_network.dex */
public final class C12611T4 {
    public static byte[] A03;
    public static String[] A04 = {"nvoCYT5lXV50ozFrdUrQJCA6z0GvB", "", "jdLKha1Na7nbzs0Nk4YLOHAcdwecuvvy", "x", "dSWVRlyTiHf7svvh2WPzEDVR9b7sv5FM", "fWYFOffN0cZPNc3vcPN7ReiBLy1A48b", "e5JjNsryHusTZGAVeTKu2QwvoQvLupoE", "SBHDzKPIpiPnF71bMjezo2z0"};
    public BlockingDeque<C12612T5> A00;
    public final int A01;
    @Nullable
    public final String A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A05(List<Long> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Long l : list) {
            A09(sb2, A00(l.longValue()));
        }
        return A03(sb2.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A07(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{56, 59, 58, 61, 60, 63, 62, 49, 48, 51, 50, 53, 52, 55, 54, 41, 40, 43, 42, 45, 44, 47, 46, 33, 32, 35, 24, 27, 26, 29, 28, 31, 30, 17, 16, 19, 18, 21, 20, 23, 22, 9, 8, 11, 10, 13, 12, 15, 14, 1, 0, 3, 73, 72, 75, 74, 77, 76, 79, 78, 65, SignedBytes.MAX_POWER_OF_TWO, 82, 86, 33, 34, 48, 38, 7, 38, 47, 55, 34, 112, 38, 107, 76, 120, 105, 100, 98, 84, 100, 91, 87, 69, 83, 80, 94, 87, 7, 2, 69, 77, 6, 28, 60, 0, 26, 1, 11, 32, 1, 17, 11, 46, 17, 29, 15, 25, 26, 20, 29, 77, 72, 124, 111, 120, 121, 99, 101, 100, 48, 105, 46, 57, 57, 105, 113, 105, 24, 2, 17, 14, 20, 14, 19, 8, 14, 14, 15, 20, 6, 10, 19, 20, 8, 10, 27, 105, 54};
    }

    static {
        A08();
    }

    public C12611T4(@Nullable String str) {
        this(str, 2000);
    }

    public C12611T4(@Nullable String str, int i) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static long A01(List<C12612T5> list, int i, int i2) {
        HashMap hashMap = new HashMap();
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            long A032 = list.get(i3).A03();
            long A01 = list.get(i3).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(A01))) {
                hashMap.put(Long.valueOf(A01), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A01))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A01), 1);
            }
        }
        long j = 3333;
        int baseCountMax = 0;
        String[] strArr = A04;
        if (strArr[2].charAt(28) != strArr[6].charAt(28)) {
            throw new RuntimeException();
        }
        A04[1] = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i + 1; baseCountMax2 < i + i2; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - j);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - j);
        }
        return j;
    }

    public static String A03(String str) {
        String A02 = A02(0, 64, 47);
        StringBuilder sb2 = new StringBuilder(str);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder p = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p.append(C20517nb.f52173T);
                String[] strArr = A04;
                String str2 = strArr[7];
                String base64chars = strArr[3];
                if (str2.length() == base64chars.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[7] = "XxQGiDHDCrtvnrkU3l3PFftc";
                strArr2[3] = "L";
                sb2.append((char) 0);
                length++;
            }
        }
        for (int n3 = 0; n3 < sb2.length(); n3 += 3) {
            int charAt = (sb2.charAt(n3) << 16) + (sb2.charAt(n3 + 1) << '\b') + sb2.charAt(n3 + 2);
            int n4 = (charAt >> 12) & 63;
            int n2 = (charAt >> 6) & 63;
            StringBuilder sb4 = sb3.append(A02.charAt((charAt >> 18) & 63));
            sb4.append(A02.charAt(n4)).append(A02.charAt(n2)).append(A02.charAt(charAt & 63));
        }
        StringBuilder r = new StringBuilder();
        String base64chars2 = sb3.substring(0, sb3.length() - p.length());
        return r.append(base64chars2).append((Object) p).toString();
    }

    @Nullable
    public static String A04(@Nullable List<C12612T5> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (A04[4].charAt(10) != 'f') {
            throw new RuntimeException();
        }
        A04[5] = "agnihNLFoXZD0MCg0BlXig325JHBk82";
        return A06(list, 0, size, false);
    }

    @Nullable
    public static String A06(@Nullable List<C12612T5> list, int i, int i2, boolean z) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i2 <= 0 || i + i2 > list.size()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 64), list.get(i).A05());
        hashMap.put(A02(115, 7, 92), 1);
        boolean z2 = false;
        boolean z3 = false;
        if (i2 > 1) {
            A0A(list, i, i2);
            hashMap.put(A02(64, 9, 21), Long.valueOf(A01(list, i, i2)));
            ArrayList arrayList = new ArrayList();
            List<Long> viewable50FrameTimestampList = new ArrayList<>();
            List<Long> audioFrameTimestampList = new ArrayList<>();
            for (int i3 = i + 1; i3 < i + i2; i3++) {
                arrayList.add(Long.valueOf(list.get(i3).A03()));
                arrayList.add(Long.valueOf(list.get(i3).A01()));
                arrayList.add(Long.valueOf(list.get(i3).A02()));
                viewable50FrameTimestampList.add(Long.valueOf(list.get(i3).A00()));
                if (list.get(i3).A00() != 0) {
                    z2 = true;
                }
                if (z) {
                    audioFrameTimestampList.add(Long.valueOf(list.get(i3).A04()));
                    if (list.get(i3).A04() != 0) {
                        z3 = true;
                    }
                }
            }
            hashMap.put(A02(92, 2, 117), A05(arrayList));
            hashMap.put(A02(75, 6, 91), A05(viewable50FrameTimestampList));
            hashMap.put(A02(94, 9, 57), Boolean.valueOf(z2));
            if (z) {
                hashMap.put(A02(81, 11, 100), A05(audioFrameTimestampList));
                hashMap.put(A02(103, 12, 46), Boolean.valueOf(z3));
            }
        }
        String encodedFrameData = A07(hashMap);
        if (encodedFrameData.length() > 900000) {
            return A02(122, 29, 29);
        }
        return encodedFrameData;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(java.lang.StringBuilder r5, long r6) {
        /*
            r4 = 128(0x80, float:1.794E-43)
        L2:
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L15
            int r0 = r4 + (-1)
            long r2 = (long) r0
            long r2 = r2 & r6
            long r0 = (long) r4
            long r2 = r2 | r0
            int r0 = (int) r2
            char r1 = (char) r0
            r0 = 7
            long r6 = r6 >> r0
            r5.append(r1)
            goto L2
        L15:
            int r0 = (int) r6
            char r0 = (char) r0
            r5.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12611T4.A09(java.lang.StringBuilder, long):void");
    }

    public static void A0A(List<C12612T5> list, int i, int i2) {
        long A00;
        for (int i3 = (i + i2) - 1; i3 > i; i3--) {
            int i4 = i3 - 1;
            list.get(i3).A09(list.get(i3).A03() - list.get(i4).A03());
            int i5 = i3 - 1;
            list.get(i3).A07(list.get(i3).A01() - list.get(i5).A01());
            int i6 = i3 - 1;
            list.get(i3).A08(list.get(i3).A02() - list.get(i6).A02());
            C12612T5 c12612t5 = list.get(i3);
            int i7 = i3 - 1;
            long j = 0;
            if (list.get(i7).A00() == -1) {
                A00 = 0;
            } else {
                int i8 = i3 - 1;
                A00 = list.get(i3).A00() - list.get(i8).A00();
            }
            c12612t5.A06(A00);
            C12612T5 c12612t52 = list.get(i3);
            int i9 = i3 - 1;
            if (list.get(i9).A04() != -1) {
                int i10 = i3 - 1;
                j = list.get(i3).A04() - list.get(i10).A04();
            }
            c12612t52.A0A(j);
            list.get(i3).A08(list.get(i3).A02() - list.get(i3).A01());
        }
    }

    public final List<C12612T5> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(C12612T5 c12612t5) {
        C12612T5 peekLast = this.A00.peekLast();
        if (peekLast != null) {
            int i = (peekLast.A03() > c12612t5.A03() ? 1 : (peekLast.A03() == c12612t5.A03() ? 0 : -1));
            if (A04[4].charAt(10) == 'f') {
                A04[1] = "";
                if (i == 0 && peekLast.A01() == c12612t5.A01()) {
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.add(c12612t5);
        if (A04[4].charAt(10) == 'f') {
            A04[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
            return;
        }
        throw new RuntimeException();
    }
}

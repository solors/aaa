package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.redexgen.X.8l */
/* loaded from: assets/audience_network.dex */
public final class C113888l {
    public static String A00;
    public static EnumC12134LM A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
            i4++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized EnumC12134LM A00(C113257j c113257j) {
        EnumC12134LM enumC12134LM;
        synchronized (C113888l.class) {
            if (A01 == null) {
                A01 = C12135LN.A00(c113257j);
            }
            enumC12134LM = A01;
        }
        return enumC12134LM;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C113257j c113257j, String str, Map<String, String> params) {
        String str2;
        if (A0A(c113257j)) {
            str2 = C12097Kj.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(final C113257j c113257j, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c113257j);
        try {
            final SharedPreferences A002 = AbstractC12071KJ.A00(c113257j);
            final C113668O c113668o = new C113668O(c113257j);
            final String str = Build.FINGERPRINT + A02(0, 1, 19) + c113668o.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8k
                public static byte[] A04;
                public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};

                public static String A01(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, 63, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    if (r1.equals(r0) != false) goto L19;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        Method dump skipped, instructions count: 246
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.CallableC113878k.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(C113257j c113257j, boolean z, String str) {
        if (A0A(c113257j)) {
            A09(c113257j, z, str);
        } else {
            A07(c113257j, z);
        }
    }

    public static void A09(C113257j c113257j, boolean z, final String str) {
        if (str == null) {
            str = c113257j.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c113257j);
        final C12097Kj c12097Kj = new C12097Kj(c113257j, str);
        try {
            c12097Kj.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                public final Boolean call() throws Exception {
                    Map map;
                    Map map2;
                    c12097Kj.A05();
                    map = C113888l.A04;
                    synchronized (map) {
                        map2 = C113888l.A04;
                        map2.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(C113257j c113257j) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean A2g = C11979Im.A2g(c113257j);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!A2g) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}

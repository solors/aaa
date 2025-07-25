package com.facebook.ads.redexgen.p370X;

import android.os.Looper;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.facebook.ads.redexgen.X.5I */
/* loaded from: assets/audience_network.dex */
public final class C111885I {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{17, 32, 47, 51, 65, 5, 4, 21, 4, 2, 21, 4, 5, 91, 117, 121, 123, 56, 112, 119, 117, 115, 116, 121, 121, 125, 56, 119, 114, 101};
    }

    private String A00() {
        StackTraceElement[] stackTrace;
        Thread mainThread = Looper.getMainLooper().getThread();
        for (StackTraceElement element : mainThread.getStackTrace()) {
            if (element.getClassName().startsWith(A01(14, 16, 17))) {
                return element.toString();
            }
        }
        return null;
    }

    private Map<Thread, StackTraceElement[]> A02() {
        final Thread thread = Looper.getMainLooper().getThread();
        Map<Thread, StackTraceElement[]> stackTraces = new TreeMap<>(new Comparator<Thread>() { // from class: com.facebook.ads.redexgen.X.5H
            public static String[] A02 = {"I2VmByDixuV", "bEgjeHiCKL8bN0Y2xmhvt", "Ep8bZoaW9qgdmenOEM", "U1x4f2Mle4YpVecP", "6pFKFCdnQFQQrPpkBrBSvGNPTjtJIqqH", "uR6rFONyTXbT3WTsrhnl74", "HWYTd9Yr1UQKCKQrjsxmT8cIIu2", "gbeo1KbNmS02dvrZyrXpgnCOAkkwIw0y"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(Thread thread2, Thread thread3) {
                if (thread2 != thread3) {
                    if (thread2 == thread) {
                        return -1;
                    }
                    if (thread3 == thread) {
                        return 1;
                    }
                    return thread3.getName().compareTo(thread2.getName());
                }
                String[] strArr = A02;
                if (strArr[2].length() != strArr[0].length()) {
                    A02[6] = "KlossopSTK0WgZ36dTrk3tViYspVBMBU";
                    return 0;
                }
                throw new RuntimeException();
            }
        });
        stackTraces.putAll(Thread.getAllStackTraces());
        return stackTraces;
    }

    public final String A04() {
        StackTraceElement[] value;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A01(1, 13, 102));
        sb2.append(A00());
        String A01 = A01(0, 1, 28);
        sb2.append(A01);
        for (Map.Entry<Thread, StackTraceElement[]> entry : A02().entrySet()) {
            sb2.append(entry.getKey().getName());
            sb2.append(A01);
            for (StackTraceElement stackTraceElement : entry.getValue()) {
                sb2.append('\t');
                sb2.append(stackTraceElement.toString());
                sb2.append(A01);
            }
        }
        return sb2.toString();
    }

    public final boolean A05() {
        return A00() != null;
    }
}

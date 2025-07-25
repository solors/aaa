package com.facebook.ads.redexgen.p370X;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.84 */
/* loaded from: assets/audience_network.dex */
public final class C1134684 implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C13028Zr A00;
    public final InterfaceC113538B A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public C1134684(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C13028Zr c13028Zr, InterfaceC1134583 interfaceC1134583) {
        this(uncaughtExceptionHandler, c13028Zr, interfaceC1134583, AbstractC113548C.A00());
    }

    public C1134684(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C13028Zr c13028Zr, InterfaceC1134583 interfaceC1134583, InterfaceC113538B interfaceC113538B) {
        this.A02 = uncaughtExceptionHandler;
        if (c13028Zr != null) {
            this.A00 = c13028Zr;
            this.A03 = interfaceC1134583.A8N(c13028Zr);
            this.A01 = interfaceC113538B;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = AbstractC12159Ll.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 7);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C1134482(A03, this.A03).A02();
                    String A00 = A00(38, 7, 100);
                    String stackTraceString2 = A00(33, 5, 111);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC12073KL.A00();
                    String A003 = A00(45, 12, 73);
                    if (A002 == th) {
                        String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 81);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AHi(new C113608I(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (C11979Im.A20(this.A00)) {
                        C11979Im.A0c(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}

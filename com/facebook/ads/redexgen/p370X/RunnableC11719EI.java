package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EI */
/* loaded from: assets/audience_network.dex */
public final class RunnableC11719EI implements Runnable {
    public static byte[] A08;
    public static String[] A09 = {"SBHD4zyCYYuTUtdzO3ruR5mHrnxwLuRg", "0EP9Msc9I8tfBL5U", "frMW", "PP35trxuF6uAvu7ZSNEnPeX", "VFIryW0SGhW14tSFNmX0iOPyizAkcqk5", "WaXRugEVfO2gUoq5HkQlmshQZztZ0bV7", "8EMSMi8y13usURdU6tUq33FsQcblZb5N", "G58b"};
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C11721EL A05;
    public volatile int A06;
    public volatile InterfaceC11722EP A07;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A08 = new byte[]{17, 58, 34, 59, 57, 58, 52, 49, 117, 48, 39, 39, 58, 39, 123, 117, 7, 48, 33, 39, 44, 117, 30, 41, 63, 41, 56, 108, 41, 62, 62, 35, 62, 108, 47, 35, 57, 34, 56, 98, 108, 40, 35, 59, 34, 32, 35, 45, 40, 41, 40, 14, 53, 56, 41, 63, 108, 113, 108, 17, 54, 45, 50, 50, 43, 44, 37, 51, 6, 20, 12, 71, 14, 20, 71, 20, 19, 6, 21, 19, 2, 3};
    }

    static {
        A0C();
    }

    public RunnableC11719EI(int i, C11721EL c11721el, DownloadAction downloadAction, int i2) {
        this.A02 = i;
        this.A05 = c11721el;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i2;
    }

    public /* synthetic */ RunnableC11719EI(int i, C11721EL c11721el, DownloadAction downloadAction, int i2, RunnableC11712EA runnableC11712EA) {
        this(i, c11721el, downloadAction, i2);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A7C();
        }
        return -1.0f;
    }

    private int A01() {
        switch (this.A06) {
            case 5:
                return 0;
            case 6:
            case 7:
                return 1;
            default:
                return this.A06;
        }
    }

    private int A02(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A7D();
        }
        return 0L;
    }

    public void A08() {
        Handler handler;
        if (!A0H(0, 5)) {
            if (!A0H(1, 6)) {
                return;
            }
            A09();
            return;
        }
        handler = this.A05.A07;
        handler.post(new RunnableC11717EF(this));
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        Thread thread = this.A00;
        String[] strArr = A09;
        if (strArr[5].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        A09[0] = "31KUupLpNWlzA2pg81mOKO8sRWUw8DLv";
        thread.interrupt();
    }

    public void A0A() {
        if (A0H(0, 1)) {
            this.A00 = new Thread(this);
            this.A00.start();
        }
    }

    public void A0B() {
        if (A0H(1, 7)) {
            if (A09[0].charAt(16) == '7') {
                throw new RuntimeException();
            }
            A09[1] = "XoPzbYQ3";
            C11721EL.A0K(A07(59, 8, 104), this);
            this.A00.interrupt();
        }
    }

    public boolean A0G() {
        return this.A06 == 0;
    }

    public boolean A0H(int i, int i2) {
        return A0I(i, i2, null);
    }

    public boolean A0I(int i, int i2, Throwable th) {
        if (this.A06 != i) {
            return false;
        }
        this.A06 = i2;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0F(this);
        }
        return true;
    }

    public final C11720EK A0M() {
        return new C11720EK(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0N() {
        if (this.A06 == 5 || this.A06 == 1 || this.A06 == 7) {
            return true;
        }
        int i = this.A06;
        if (A09[4].charAt(18) != '0') {
            String[] strArr = A09;
            strArr[5] = "60RqioC1jfEvrRIwJ1QlUWR9MPqv8biv";
            strArr[6] = "zPUM17gHICdR7z9f43U91xptyEezmbbR";
            return i == 6;
        }
        throw new RuntimeException();
    }

    public final boolean A0O() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        C11723EQ c11723eq;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            C11721EL.A0K(A07(67, 15, 77), this);
            Throwable finalError = null;
            try {
                DownloadAction downloadAction = this.A04;
                c11723eq = this.A05.A0A;
                this.A07 = downloadAction.A07(c11723eq);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A5Z();
                            break;
                        } catch (IOException e) {
                            long A7D = this.A07.A7D();
                            if (A7D != j) {
                                C11721EL.A0K(A07(22, 37, 102) + A7D, this);
                                j = A7D;
                                i = 0;
                            }
                            if (this.A06 != 1 || (i = i + 1) > this.A03) {
                                throw e;
                            }
                            C11721EL.A0K(A07(0, 22, 127) + i, this);
                            Thread.sleep(A02(i));
                        }
                    }
                }
            } catch (Throwable th) {
                finalError = th;
            }
            handler = this.A05.A07;
            handler.post(new RunnableC11718EG(this, finalError));
        } catch (Throwable th2) {
            AbstractC12078KQ.A00(th2, this);
            if (A09[1].length() == 11) {
                throw new RuntimeException();
            }
            A09[3] = "IZEYUhzwAcWwMrWBxMbEfz8";
        }
    }

    public final String toString() {
        return super.toString();
    }
}

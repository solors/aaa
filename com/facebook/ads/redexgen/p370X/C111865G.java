package com.facebook.ads.redexgen.p370X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5G */
/* loaded from: assets/audience_network.dex */
public final class C111865G extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C111885I A02;
    public final C13029Zs A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C111865G.class.getName();
    }

    public C111865G(C13029Zs c13029Zs, C111885I c111885i) {
        this(c13029Zs, c111885i, C11979Im.A08(c13029Zs));
    }

    public C111865G(C13029Zs c13029Zs, C111885I c111885i, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.5F
            {
                C111865G.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (AbstractC12078KQ.A02(this)) {
                    return;
                }
                try {
                    C111865G.this.A05 = 0L;
                    C111865G.this.A06 = false;
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c13029Zs;
        this.A02 = c111885i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A07().AA0(A01(15, 7, 8), AbstractC113568E.A1D, new C113578F(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}

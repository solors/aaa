package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.IQ */
/* loaded from: assets/audience_network.dex */
public class HandlerThreadC11958IQ extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"fjb62vMryiJBq6nlv0XecN4Miby9R", "URoeDihEfhk6EaAX", "MuB6m1Bx59DgjR9J", "2MJ6dS3EV8t7lzjHOstp9BZeWuWbqqlU", "ewPhRFK9mfGcTpXOBIuRZRib", "zGQ6fmAkazLgXk", "ErVdPKTj7", "wcOr5xxV0KUOSKDMt9ZYsxWBIWNUj"};
    public Handler A00;
    public RunnableC11924Hp A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 38);
            if (A06[4].length() != 24) {
                throw new RuntimeException();
            }
            A06[3] = "h25Y0rjbMuR2ypWA7lRpstXE2gsMGFZh";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-55, -6, -14, -14, -2, -40, -6, -9, -21, -26, -24, -22, -111, -84, -76, -73, -80, -81, 107, -65, -70, 107, -76, -71, -76, -65, -76, -84, -73, -76, -59, -80, 107, -81, -64, -72, -72, -60, 107, -66, -64, -67, -79, -84, -82, -80, -93, -66, -58, -55, -62, -63, 125, -47, -52, 125, -49, -62, -55, -62, -66, -48, -62, 125, -63, -46, -54, -54, -42, 125, -48, -46, -49, -61, -66, -64, -62, -88, -71, -79, -79, -67, -105, -71, -74, -86, -91, -89, -87};
    }

    static {
        A02();
    }

    public HandlerThreadC11958IQ() {
        super(A00(77, 12, 30));
    }

    private void A01() {
        AbstractC11914Hf.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        AbstractC11914Hf.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new RunnableC11924Hp(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC11914Hf.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC11914Hf.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        Log.e(A00(0, 12, 95), A00(12, 34, 37), e);
                        this.A03 = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        Log.e(A00(0, 12, 95), A00(12, 34, 37), e2);
                        this.A04 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}

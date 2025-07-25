package com.facebook.ads.redexgen.p370X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2A */
/* loaded from: assets/audience_network.dex */
public final class HandlerC109972A extends Handler {
    public static byte[] A08;
    public static String[] A09 = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public Messenger A00;
    public InterfaceC12147LZ A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final C13028Zr A06;
    public final AbstractRunnableC12086KY A07;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A08 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, UnsignedBytes.MAX_POWER_OF_TWO, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, 12, -3, -18, -16, -8, -18, -12, -14, 12, -10, -5, 0, 1, -18, -7, -7, -14, -15, 12, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public HandlerC109972A(C13028Zr c13028Zr) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.29
            {
                HandlerC109972A.this = this;
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Handler handler;
                AbstractRunnableC12086KY abstractRunnableC12086KY;
                C13028Zr c13028Zr2;
                Messenger messenger;
                handler = HandlerC109972A.this.A04;
                abstractRunnableC12086KY = HandlerC109972A.this.A07;
                handler.removeCallbacks(abstractRunnableC12086KY);
                HandlerC109972A.this.A00 = new Messenger(iBinder);
                c13028Zr2 = HandlerC109972A.this.A06;
                if (AbstractC11982Ip.A07(c13028Zr2)) {
                    HandlerC109972A handlerC109972A = HandlerC109972A.this;
                    messenger = HandlerC109972A.this.A00;
                    handlerC109972A.A07(messenger);
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                HandlerC109972A.this.A09();
            }
        };
        this.A06 = c13028Zr;
        this.A05 = new Messenger(this);
        this.A07 = new C13123bR(this);
    }

    public void A07(Messenger messenger) {
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.A05;
        obtain.setData(AbstractC110062J.A00(this.A06));
        try {
            messenger.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A06.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(String str, InterfaceC12147LZ interfaceC12147LZ, int i) {
        if (this.A02) {
            this.A01 = interfaceC12147LZ;
            Message obtain = Message.obtain((Handler) null, i);
            obtain.replyTo = this.A05;
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putString(A05(88, 15, 88), str);
                obtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(obtain);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public final void A0B(boolean z) {
        this.A02 = C1099528.A04(this.A06, z, this.A03);
        if (this.A02) {
            Handler handler = this.A04;
            AbstractRunnableC12086KY abstractRunnableC12086KY = this.A07;
            if (A09[6].charAt(31) != 'q') {
                throw new RuntimeException();
            }
            A09[2] = "62SHD49IwhaYJMd1y";
            handler.postDelayed(abstractRunnableC12086KY, AbstractC11982Ip.A01(this.A06));
            return;
        }
        AbstractC113828f.A04(this.A06);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                C1099528.A02(this.A06, message);
            } else if (message.what == 20 || message.what == 40 || message.what == 30) {
                if (message.what == 20) {
                    AbstractC11982Ip.A06(this.A06);
                }
                String str = A05(0, 33, 15) + message.what;
                AbstractC113828f.A04(this.A06);
            } else if (message.what == 4) {
                Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z = data.getBoolean(A05(33, 30, 0), false);
                    String A05 = A05(88, 15, 88);
                    if (z) {
                        this.A01.ACu(data.getString(A05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.ACv(data.getString(A05));
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}

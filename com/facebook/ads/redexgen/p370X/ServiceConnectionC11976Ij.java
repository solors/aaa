package com.facebook.ads.redexgen.p370X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ij */
/* loaded from: assets/audience_network.dex */
public class ServiceConnectionC11976Ij implements ServiceConnection {
    public static byte[] A01;
    public static String[] A02 = {"Vw4807oGxAdaHl5Al", "61OeIm55zagm9eF8TwwypJ2x", "EMmzBhTNP4w9g", "EYH0yzb9nIvkx5HKrwnVnQphst8", "oJpEUQYv6dauwAdzygMcXKep8asdjHHS", "ZEL", "ZTCWoVSxq9DuX", "VaiI"};
    public final /* synthetic */ C11977Ik A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 13);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "dt08HEEvYnWJr";
            strArr[2] = "T3OITLjrwLx4m";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 116, -127, -123, 120, 114, 116, 47, 114, 126, 125, 125, 116, 114, -125, 116, 115, -66, -48, -35, -31, -44, -50, -48, -117, -49, -44, -34, -50, -38, -39, -39, -48, -50, -33, -48, -49};
    }

    static {
        A01();
    }

    public ServiceConnectionC11976Ij(C11977Ik c11977Ik) {
        this.A00 = c11977Ik;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle A00;
        C13029Zs c13029Zs;
        Messenger messenger;
        this.A00.A08(AbstractC113568E.A1r, new C113578F(A00(0, 17, 2)));
        this.A00.A01 = true;
        this.A00.A00 = new Messenger(iBinder);
        Message obtain = Message.obtain((Handler) null, 1);
        A00 = this.A00.A00();
        obtain.setData(A00);
        try {
            messenger = this.A00.A00;
            messenger.send(obtain);
        } catch (RemoteException e) {
            this.A00.A07(AbstractC113568E.A1q, new C113578F(e));
        }
        c13029Zs = this.A00.A03;
        c13029Zs.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C13029Zs c13029Zs;
        this.A00.A08(AbstractC113568E.A1s, new C113578F(A00(17, 20, 94)));
        try {
            c13029Zs = this.A00.A03;
            c13029Zs.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}

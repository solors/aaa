package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.content.Context;
import com.p552ot.pubsub.p553a.C26485b;

/* renamed from: com.facebook.ads.redexgen.X.5b */
/* loaded from: assets/audience_network.dex */
public final class C112075b {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static InterfaceC108920S A00(Context context, InterfaceC113277l interfaceC113277l) {
        return A01(context, interfaceC113277l, null);
    }

    public static InterfaceC108920S A01(Context context, InterfaceC113277l interfaceC113277l, String str) {
        C13028Zr sdkContext = A09(context);
        InterfaceC108960W A7V = interfaceC113277l.A7V(sdkContext);
        if (A7V != null) {
            return str != null ? A7V.AAj(str) : A7V.AAi();
        }
        return new C13208co();
    }

    public static C13029Zs A02(Activity activity) {
        return new C13029Zs(activity, (InterfaceC113277l) A0A(), A00(activity, A0A()));
    }

    public static C13029Zs A03(Context context) {
        return new C13029Zs(context, A0A(), new C13208co());
    }

    public static C13029Zs A04(Context context) {
        if (C11979Im.A0t(context)) {
            return new C13029Zs(context, A0A(), A00(context, A0A()));
        }
        C13029Zs A03 = A03(context);
        if (A00[2].length() != 11) {
            String[] strArr = A00;
            strArr[3] = C26485b.f69244a;
            strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
            return A03;
        }
        throw new RuntimeException();
    }

    public static C13029Zs A05(Context context, String str) {
        return new C13029Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static C13029Zs A06(Context context, String str) {
        return new C13029Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static C13029Zs A07(Context context, String str) {
        return new C13029Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static C11735Ei A08(Context context) {
        return new C11735Ei(context, A0A(), A0A().A7V(A09(context)));
    }

    public static C13028Zr A09(Context context) {
        return new C13028Zr(context, A0A());
    }

    public static synchronized C13001ZQ A0A() {
        C13001ZQ A02;
        synchronized (C112075b.class) {
            A02 = C13001ZQ.A02();
        }
        return A02;
    }
}

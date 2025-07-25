package com.facebook.ads.redexgen.p370X;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.If */
/* loaded from: assets/audience_network.dex */
public class RunnableC11972If implements Runnable {
    public static String[] A02 = {"13oaU3ARqDr4RH9jpYNK93c", "TYF7Qt", "xUTRJm4Rg673ApQEKqlQsSs", "hRIg6SPEQXGq6T", "3QHfr38dRkY9JxUpCoLwEkFMMlSloeG2", "i8J6r6uMy266kC8rTF8mGIBzqV5dBCmb", "x98fVhayFhYlIbQQOJ9BjMfXcd34KCSx", "Z1GLpHy0HwkqSwW9khwr1bkH6PCRqbO5"};
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C11974Ih A01;

    public RunnableC11972If(C11974Ih c11974Ih, Surface surface) {
        this.A01 = c11974Ih;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11975Ii interfaceC11975Ii;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC11975Ii = this.A01.A01;
            interfaceC11975Ii.ADM(this.A00);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A02[1].length() == 19) {
                throw new RuntimeException();
            }
            A02[6] = "65yeGhez1WQhZvxg8qVLZrzPC2Ou4KSa";
        }
    }
}

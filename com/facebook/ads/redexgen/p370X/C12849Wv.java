package com.facebook.ads.redexgen.p370X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Wv */
/* loaded from: assets/audience_network.dex */
public final class C12849Wv {
    public static String[] A03 = {"ZyytKuNh7ntg7sY8uFdOkQQn3Zd8e", "OPYUEYxxfuFToCoqAJ7LijcBVLMkd", "hMaagKVbo326jUCFjE6xrMqdrUFYGLiL", "YWHqi729yDjGR8jfxkm0wnxT", "fBJq4naDVNOawpqdOhpwTAHQcatL3neF", "IBZtQd8oLy5hBWitakJgcXsasC5LRKBV", "BBZxvQdMJfTK4iSntx4hV9BXJvxyJ8bf", "qOO0IEqnjZtOEmSRMHkcuAad"};
    public HandlerC11885HC<? extends InterfaceC11886HD> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final <T extends InterfaceC11886HD> long A04(T t, InterfaceC11884HB<T> interfaceC11884HB, int i) {
        Looper myLooper = Looper.myLooper();
        AbstractC11914Hf.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC11885HC(this, myLooper, t, interfaceC11884HB, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C12849Wv(String str) {
        this.A02 = AbstractC11953IK.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC11885HC<? extends InterfaceC11886HD> handlerC11885HC = this.A00;
                if (i == Integer.MIN_VALUE) {
                    i = this.A00.A03;
                }
                handlerC11885HC.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A07(InterfaceC11887HE interfaceC11887HE) {
        if (this.A00 != null) {
            HandlerC11885HC<? extends InterfaceC11886HD> handlerC11885HC = this.A00;
            if (A03[1].length() != 29) {
                throw new RuntimeException();
            }
            A03[0] = "olNXxetGG";
            handlerC11885HC.A07(true);
        }
        if (interfaceC11887HE != null) {
            this.A02.execute(new RunnableC11888HF(interfaceC11887HE));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}

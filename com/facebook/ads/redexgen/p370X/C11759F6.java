package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.F6 */
/* loaded from: assets/audience_network.dex */
public final class C11759F6 {
    public final int A00;
    public final C11746Et A01;
    public final long A02;
    public final CopyOnWriteArrayList<C11758F5> A03;

    public C11759F6() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C11759F6(CopyOnWriteArrayList<C11758F5> copyOnWriteArrayList, int i, C11746Et c11746Et, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c11746Et;
        this.A02 = j;
    }

    private long A00(long j) {
        long A01 = AbstractC114409b.A01(j);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final C11759F6 A02(int i, C11746Et c11746Et, long j) {
        return new C11759F6(this.A03, i, c11746Et, j);
    }

    public final void A03() {
        AbstractC11914Hf.A04(this.A01 != null);
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11749Ew(this, listener));
        }
    }

    public final void A04() {
        AbstractC11914Hf.A04(this.A01 != null);
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11750Ex(this, listener));
        }
    }

    public final void A05() {
        AbstractC11914Hf.A04(this.A01 != null);
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11755F2(this, listener));
        }
    }

    public final void A06(int i, Format format, int i2, Object obj, long j) {
        A0C(new C11761F8(1, i, format, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC11762F9 interfaceC11762F9) {
        AbstractC11914Hf.A03((handler == null || interfaceC11762F9 == null) ? false : true);
        this.A03.add(new C11758F5(handler, interfaceC11762F9));
    }

    public final void A08(C11760F7 c11760f7, C11761F8 c11761f8) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11753F0(this, listener, c11760f7, c11761f8));
        }
    }

    public final void A09(C11760F7 c11760f7, C11761F8 c11761f8) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11752Ez(this, listener, c11760f7, c11761f8));
        }
    }

    public final void A0A(C11760F7 c11760f7, C11761F8 c11761f8) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11751Ey(this, listener, c11760f7, c11761f8));
        }
    }

    public final void A0B(C11760F7 c11760f7, C11761F8 c11761f8, IOException iOException, boolean z) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            A01(next.A00, new RunnableC11754F1(this, next.A01, c11760f7, c11761f8, iOException, z));
        }
    }

    public final void A0C(C11761F8 c11761f8) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 next = it.next();
            InterfaceC11762F9 listener = next.A01;
            A01(next.A00, new RunnableC11757F4(this, listener, c11761f8));
        }
    }

    public final void A0D(InterfaceC11762F9 interfaceC11762F9) {
        Iterator<C11758F5> it = this.A03.iterator();
        while (it.hasNext()) {
            C11758F5 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == interfaceC11762F9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C11876H3 c11876h3, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
        A0A(new C11760F7(c11876h3, j3, 0L, 0L), new C11761F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(C11876H3 c11876h3, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new C11760F7(c11876h3, j3, j4, j5), new C11761F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(C11876H3 c11876h3, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new C11760F7(c11876h3, j3, j4, j5), new C11761F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(C11876H3 c11876h3, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        A0B(new C11760F7(c11876h3, j3, j4, j5), new C11761F8(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}

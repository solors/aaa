package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.HandlerC26605a1;

/* renamed from: com.pgl.ssdk.w0 */
/* loaded from: classes7.dex */
public class C26673w0 {

    /* renamed from: a */
    private final C26683z0<HandlerC26678x0> f69983a;

    /* renamed from: b */
    private HandlerC26605a1 f69984b;

    /* renamed from: com.pgl.ssdk.w0$b */
    /* loaded from: classes7.dex */
    private static class C26675b {

        /* renamed from: a */
        private static final C26673w0 f69985a = new C26673w0();
    }

    /* renamed from: a */
    public static C26673w0 m40719a() {
        return C26675b.f69985a;
    }

    /* renamed from: b */
    public HandlerC26605a1 m40716b() {
        if (this.f69984b == null) {
            synchronized (C26673w0.class) {
                if (this.f69984b == null) {
                    this.f69984b = m40717a("ssdk_net_handler");
                }
            }
        }
        return this.f69984b;
    }

    /* renamed from: c */
    public HandlerC26605a1 m40714c() {
        if (this.f69984b == null) {
            synchronized (C26673w0.class) {
                if (this.f69984b == null) {
                    this.f69984b = m40717a("ssdk_handler");
                }
            }
        }
        return this.f69984b;
    }

    private C26673w0() {
        this.f69983a = C26683z0.m40681a(2);
    }

    /* renamed from: a */
    public HandlerC26605a1 m40717a(String str) {
        return m40715b(null, str);
    }

    /* renamed from: a */
    private HandlerC26678x0 m40718a(HandlerC26605a1.InterfaceC26606a interfaceC26606a, String str) {
        if (C26650n0.m40807b().m40808a()) {
            return null;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new HandlerC26678x0(handlerThread, interfaceC26606a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public HandlerC26605a1 m40715b(HandlerC26605a1.InterfaceC26606a interfaceC26606a, String str) {
        HandlerC26678x0 m40682a = this.f69983a.m40682a();
        if (m40682a != null) {
            m40682a.m40705a(interfaceC26606a);
            m40682a.m40704a(str);
            return m40682a;
        }
        return m40718a(interfaceC26606a, str);
    }
}

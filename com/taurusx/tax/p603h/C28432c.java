package com.taurusx.tax.p603h;

import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p581e.C28231g;
import com.taurusx.tax.p578b.p581e.InterfaceC28235h;

/* renamed from: com.taurusx.tax.h.c */
/* loaded from: classes7.dex */
public class C28432c {

    /* renamed from: a */
    public static C28432c f73851a;

    /* renamed from: com.taurusx.tax.h.c$a */
    /* loaded from: classes7.dex */
    public class C28433a implements InterfaceC28235h {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC28434b f73852a;

        public C28433a(C28432c c28432c, InterfaceC28434b interfaceC28434b) {
            this.f73852a = interfaceC28434b;
        }
    }

    /* renamed from: com.taurusx.tax.h.c$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC28434b {
        /* renamed from: a */
        void mo38093a(int i, String str);

        /* renamed from: a */
        void mo38092a(String str);
    }

    /* renamed from: a */
    public static synchronized C28432c m38095a() {
        C28432c c28432c;
        synchronized (C28432c.class) {
            if (f73851a == null) {
                synchronized (C28432c.class) {
                    if (f73851a == null) {
                        f73851a = new C28432c();
                    }
                }
            }
            c28432c = f73851a;
        }
        return c28432c;
    }

    /* renamed from: a */
    public synchronized void m38094a(String str, String str2, InterfaceC28434b interfaceC28434b) {
        if (str != null) {
            if (str.length() > 0) {
                LogUtil.m37900v("taurusx", "TaxTrackManager tracking send url:" + str);
                C28231g.m38379a(TaurusXAds.getContext(), str, str2, new C28433a(this, interfaceC28434b));
                return;
            }
        }
        interfaceC28434b.mo38093a(2, "url is null");
    }
}

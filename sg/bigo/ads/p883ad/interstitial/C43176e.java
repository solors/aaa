package sg.bigo.ads.p883ad.interstitial;

import androidx.annotation.CallSuper;
import sg.bigo.ads.common.utils.AbstractC43831n;

/* renamed from: sg.bigo.ads.ad.interstitial.e */
/* loaded from: classes10.dex */
public class C43176e {

    /* renamed from: a */
    boolean f112992a = false;

    /* renamed from: b */
    InterfaceC43178a f112993b;

    /* renamed from: c */
    private AbstractC43831n f112994c;

    /* renamed from: sg.bigo.ads.ad.interstitial.e$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43178a {
        /* renamed from: a */
        boolean mo5609a(Runnable runnable);
    }

    /* renamed from: a */
    public final void m5996a() {
        this.f112992a = true;
        AbstractC43831n abstractC43831n = this.f112994c;
        if (abstractC43831n != null) {
            abstractC43831n.m4862b();
        }
    }

    @CallSuper
    /* renamed from: b */
    public void mo5994b() {
        AbstractC43831n abstractC43831n;
        if (!this.f112992a && (abstractC43831n = this.f112994c) != null && !abstractC43831n.f114670i) {
            abstractC43831n.m4861c();
        }
    }

    @CallSuper
    /* renamed from: c */
    public void mo5993c() {
        AbstractC43831n abstractC43831n;
        if (!this.f112992a && (abstractC43831n = this.f112994c) != null && !abstractC43831n.f114670i) {
            abstractC43831n.m4860d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m5995a(int i, final Runnable runnable) {
        AbstractC43831n abstractC43831n = this.f112994c;
        if (abstractC43831n != null) {
            abstractC43831n.m4862b();
        }
        this.f112992a = false;
        AbstractC43831n abstractC43831n2 = new AbstractC43831n(i * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4864a() {
                Runnable runnable2;
                C43176e c43176e = C43176e.this;
                if (c43176e.f112992a || (runnable2 = runnable) == null) {
                    return;
                }
                InterfaceC43178a interfaceC43178a = c43176e.f112993b;
                if (interfaceC43178a != null) {
                    interfaceC43178a.mo5609a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4863a(long j) {
            }
        };
        this.f112994c = abstractC43831n2;
        abstractC43831n2.m4861c();
    }
}

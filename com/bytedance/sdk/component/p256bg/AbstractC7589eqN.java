package com.bytedance.sdk.component.p256bg;

/* renamed from: com.bytedance.sdk.component.bg.eqN */
/* loaded from: classes3.dex */
public abstract class AbstractC7589eqN<P, R> extends AbstractC7573IL<P, R> {

    /* renamed from: IL */
    private InterfaceC7591bg f16542IL;

    /* renamed from: bX */
    private C7596ldr f16543bX;

    /* renamed from: bg */
    private boolean f16544bg = true;

    /* renamed from: com.bytedance.sdk.component.bg.eqN$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC7590IL {
        /* renamed from: bg */
        AbstractC7589eqN mo87414bg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.component.bg.eqN$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7591bg {
        /* renamed from: bg */
        void mo88437bg(Object obj);

        /* renamed from: bg */
        void mo88436bg(Throwable th);
    }

    private boolean ldr() {
        if (!this.f16544bg) {
            C7584WR.m88476bg(new IllegalStateException("Jsb async call already finished: " + mo88421bg() + ", hashcode: " + hashCode()));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bX */
    public final void m88455bX() {
        m88452bg((Throwable) null);
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7573IL
    /* renamed from: bg */
    public /* bridge */ /* synthetic */ String mo88421bg() {
        return super.mo88421bg();
    }

    /* renamed from: bg */
    protected abstract void mo87416bg(P p, C7596ldr c7596ldr) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public void eqN() {
        this.f16544bg = false;
        this.f16543bX = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zx */
    public void m88451zx() {
        eqN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public final void m88454bg(R r) {
        if (ldr()) {
            this.f16542IL.mo88437bg(r);
            eqN();
        }
    }

    /* renamed from: bg */
    protected final void m88452bg(Throwable th) {
        if (ldr()) {
            this.f16542IL.mo88436bg(th);
            eqN();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m88453bg(P p, C7596ldr c7596ldr, InterfaceC7591bg interfaceC7591bg) throws Exception {
        this.f16543bX = c7596ldr;
        this.f16542IL = interfaceC7591bg;
        mo87416bg(p, c7596ldr);
    }
}

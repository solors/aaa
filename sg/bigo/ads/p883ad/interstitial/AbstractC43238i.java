package sg.bigo.ads.p883ad.interstitial;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.AbstractC43831n;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43839s;
import sg.bigo.ads.controller.p949e.AbstractC44026b;
import sg.bigo.ads.p883ad.interstitial.AbstractC43241k;
import sg.bigo.ads.p883ad.interstitial.AdCountDownButton;

/* renamed from: sg.bigo.ads.ad.interstitial.i */
/* loaded from: classes10.dex */
public abstract class AbstractC43238i<T extends AbstractC43241k<?>> extends AbstractC44026b<T> implements AbstractC43241k.InterfaceC43243b {

    /* renamed from: A */
    protected ViewGroup f113197A;

    /* renamed from: B */
    public AdCountDownButton f113198B;

    /* renamed from: C */
    final AtomicBoolean f113199C;

    /* renamed from: a */
    private final AtomicBoolean f113200a;

    /* renamed from: z */
    public T f113201z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC43238i(@NonNull Activity activity) {
        super(activity);
        this.f113200a = new AtomicBoolean(false);
        this.f113199C = new AtomicBoolean(true);
    }

    /* renamed from: b */
    private void m5892b() {
        AdCountDownButton adCountDownButton = (AdCountDownButton) m5423l(C42750R.C42753id.inter_btn_close);
        this.f113198B = adCountDownButton;
        if (adCountDownButton != null) {
            adCountDownButton.setOnCloseListener(new AdCountDownButton.InterfaceC42938a() { // from class: sg.bigo.ads.ad.interstitial.i.1
                @Override // sg.bigo.ads.p883ad.interstitial.AdCountDownButton.InterfaceC42938a
                /* renamed from: a */
                public final void mo5499a() {
                    AbstractC43238i.this.mo5891d(true);
                }
            });
        }
    }

    /* renamed from: B */
    protected int mo5897B() {
        return 1;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: D */
    public void mo3628D() {
        AbstractC43831n abstractC43831n;
        AdCountDownButton adCountDownButton = this.f113198B;
        if (adCountDownButton != null && (abstractC43831n = adCountDownButton.f112417b) != null) {
            abstractC43831n.m4862b();
        }
        if (this.f113201z != null && this.f113200a.compareAndSet(false, true)) {
            this.f113201z.mo5745a(mo5897B(), 2);
        }
        T t = this.f113201z;
        if (t != null) {
            t.destroy();
        }
    }

    @Override // sg.bigo.ads.controller.p949e.AbstractC44026b, sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: N */
    public void mo3627N() {
        super.mo3627N();
        try {
            T t = (T) this.f115474K;
            this.f113201z = t;
            if (t == null) {
                mo3609am();
                return;
            }
            m5894Q();
            if (mo5896O()) {
                int i = C42750R.C42754layout.bigo_ad_activity_popup;
                int i2 = this.f114066I.getResources().getDisplayMetrics().widthPixels;
                int m4903c = C43822e.m4903c(this.f114066I);
                this.f114066I.setContentView(C43810a.m4954a(this.f114066I, i, null, false), new ViewGroup.LayoutParams(i2, m4903c));
            } else {
                mo5426a_(C42750R.C42754layout.bigo_ad_activity_interstitial);
            }
            if (mo5874f()) {
                return;
            }
            m5895P();
        } catch (Exception unused) {
            m5893a("Illegal InterstitialAd.");
        }
    }

    /* renamed from: O */
    protected boolean mo5896O() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public final void m5895P() {
        boolean z;
        mo5618m();
        this.f113197A = (ViewGroup) m5423l(C42750R.C42753id.inter_main);
        int mo5677R = mo5677R();
        Activity activity = this.f114066I;
        ViewGroup viewGroup = this.f113197A;
        if (viewGroup != null) {
            z = true;
        } else {
            z = false;
        }
        C43810a.m4954a(activity, mo5677R, viewGroup, z);
        m5892b();
        mo5632g(mo5677R);
        this.f113201z.m5884a(this);
        this.f113201z.m5881z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public final void m5894Q() {
        Window window;
        if (!mo5896O() && (window = this.f114066I.getWindow()) != null) {
            C43839s.m4814a(window);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @LayoutRes
    /* renamed from: R */
    public abstract int mo5677R();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public abstract boolean mo5676S();

    @Override // sg.bigo.ads.controller.p949e.AbstractC44026b, sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: T */
    public final void mo3626T() {
        if (mo5890g() && this.f113199C.compareAndSet(true, false)) {
            mo5630h();
        }
    }

    @Override // sg.bigo.ads.controller.p949e.AbstractC44026b, sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: U */
    public final void mo3625U() {
        if (mo5887i() && this.f113199C.compareAndSet(false, true)) {
            mo5626j();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m5893a(String str) {
        T t = this.f113201z;
        if (t != null) {
            t.m5883e(str);
        }
        mo3609am();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo5891d(boolean z) {
        mo3609am();
    }

    /* renamed from: f */
    protected abstract boolean mo5874f();

    /* renamed from: g */
    protected abstract void mo5632g(@LayoutRes int i);

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: g */
    public final void mo3592g(boolean z) {
        if (z) {
            m5894Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: h */
    public void mo5630h() {
        m5888h(false);
        AdCountDownButton adCountDownButton = this.f113198B;
        if (adCountDownButton == null || adCountDownButton.f112418c) {
            return;
        }
        adCountDownButton.m6311c();
    }

    /* renamed from: i */
    protected boolean mo5887i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: j */
    public void mo5626j() {
        m5888h(true);
        AdCountDownButton adCountDownButton = this.f113198B;
        if (adCountDownButton != null && !adCountDownButton.f112418c) {
            adCountDownButton.m6314b();
        }
    }

    /* renamed from: m */
    protected abstract void mo5618m();

    /* renamed from: b */
    public void mo5642b(String str) {
    }

    /* renamed from: g */
    protected boolean mo5890g() {
        return true;
    }

    /* renamed from: h */
    public final void m5889h(@DrawableRes int i) {
        AdCountDownButton adCountDownButton = this.f113198B;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m5888h(boolean z) {
        this.f113199C.set(z);
    }

    /* renamed from: C */
    public void mo5679C() {
    }

    @Override // sg.bigo.ads.controller.p949e.AbstractC44026b, sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: V */
    public void mo3624V() {
    }

    @Override // sg.bigo.ads.controller.p949e.AbstractC44026b, sg.bigo.ads.api.core.BaseAdActivityImpl
    /* renamed from: W */
    public void mo3623W() {
    }
}

package sg.bigo.ads.p883ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.core.InterfaceC43573o;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.api.p904b.AbstractC43534a;
import sg.bigo.ads.api.p904b.InterfaceC43538d;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p912f.C43620c;
import sg.bigo.ads.common.utils.C43823f;
import sg.bigo.ads.controller.landing.C44076d;
import sg.bigo.ads.controller.p949e.AbstractC44026b;
import sg.bigo.ads.core.p958c.C44136b;
import sg.bigo.ads.p883ad.AbstractC42898d;

/* renamed from: sg.bigo.ads.ad.interstitial.k */
/* loaded from: classes10.dex */
public abstract class AbstractC43241k<U extends InterfaceC43550c> extends AbstractC42898d<InterstitialAd, U> implements InterstitialAd {
    @Nullable

    /* renamed from: t */
    protected InterfaceC43243b f113205t;

    /* renamed from: u */
    private long f113206u;

    /* renamed from: sg.bigo.ads.ad.interstitial.k$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43242a<T extends AbstractC43241k> {
        T getAdInstance(@NonNull C43562g c43562g);
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.k$b */
    /* loaded from: classes10.dex */
    interface InterfaceC43243b {
        /* renamed from: C */
        void mo5679C();

        /* renamed from: b */
        void mo5642b(String str);
    }

    public AbstractC43241k(@NonNull C43562g c43562g) {
        super(c43562g);
    }

    /* renamed from: A */
    protected abstract Class<? extends AbstractC44026b<?>> mo5749A();

    @CallSuper
    /* renamed from: a */
    public void mo5745a(int i, int i2) {
        mo6390k();
        C44136b.m3873a(this.f112245b.f114090a, i, this.f113206u > 0 ? SystemClock.elapsedRealtime() - this.f113206u : 0L, i2, this);
    }

    /* renamed from: b */
    protected abstract void mo5735b(@NonNull InterfaceC43538d.InterfaceC43539a<InterstitialAd> interfaceC43539a);

    @Override // sg.bigo.ads.p883ad.AbstractC42898d, sg.bigo.ads.p883ad.AbstractC42869c, sg.bigo.ads.api.InterfaceC43501Ad
    public void destroy() {
        super.destroy();
        this.f113205t = null;
    }

    @CallSuper
    /* renamed from: e */
    public final void m5883e(String str) {
        m6463a(2003, str);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show() {
        m5886a((Activity) null, true);
    }

    /* renamed from: x */
    public int mo5882x() {
        if (mo5728y()) {
            return this.f112245b.f114091b.mo4436c();
        }
        return 0;
    }

    /* renamed from: y */
    protected abstract boolean mo5728y();

    @CallSuper
    /* renamed from: z */
    public final void m5881z() {
        m6442t();
        m6447j();
        this.f113206u = SystemClock.elapsedRealtime();
        C44136b.m3857a(this.f112245b.f114090a, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.app.Activity] */
    /* renamed from: a */
    private void m5886a(@Nullable Activity activity, boolean z) {
        InterfaceC43524h interfaceC43524h;
        boolean z2 = false;
        mo5446a(activity == 0, z);
        if (activity != 0) {
            mo5737b(activity);
        }
        C44136b.m3881a(mo5439f());
        if (isExpired()) {
            m6463a(2000, "The ad is expired.");
        } else if (this.f112251h) {
            m6463a(2000, "The ad is destroyed.");
        } else if (mo5730n()) {
            m6463a(2003, "This ad cannot be shown repeatedly");
        } else {
            try {
                U mo5439f = mo5439f();
                if (mo5439f instanceof InterfaceC43573o) {
                    InterfaceC43573o interfaceC43573o = (InterfaceC43573o) mo5439f;
                    if (interfaceC43573o.mo4265aT()) {
                        File file = new File(interfaceC43573o.mo4266aS());
                        if (file.exists() || new File(file.getParentFile(), C43823f.m4891c(file.getName())).exists()) {
                            z2 = true;
                        }
                        if (!z2) {
                            C44136b.m3858a((InterfaceC43550c) mo5439f, new AdError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "resource clear."), true);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (activity != 0) {
                mo5450a(1);
            }
            if (activity == 0 && (interfaceC43524h = C43525i.f114036a) != null && interfaceC43524h.mo4461m().mo5375a(16)) {
                activity = C43620c.m5298b();
                mo5450a(2);
            }
            if (activity == 0) {
                activity = C43617a.f114190a;
            }
            int m4790a = this.f114061N.m4790a();
            this.f114062O = m4790a;
            AbstractC43534a abstractC43534a = this.f114063P;
            if (abstractC43534a != null) {
                abstractC43534a.mo5441c(m4790a);
            }
            mo5885a(activity);
        }
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show(@Nullable Activity activity) {
        m5886a(activity, false);
    }

    /* renamed from: a */
    protected void mo5885a(Context context) {
        if (C44076d.m4023a(context, mo5749A(), this, mo5439f() != null && mo5439f().mo4353ar())) {
            return;
        }
        m6463a(2004, "This ad cannot be open");
    }

    /* renamed from: a */
    public final void m5884a(InterfaceC43243b interfaceC43243b) {
        this.f113205t = interfaceC43243b;
    }

    @Override // sg.bigo.ads.p883ad.AbstractC42869c, sg.bigo.ads.api.p904b.InterfaceC43538d
    /* renamed from: a */
    public final void mo5431a(@NonNull InterfaceC43538d.InterfaceC43539a<InterstitialAd> interfaceC43539a) {
        super.mo5431a(interfaceC43539a);
        mo5735b(interfaceC43539a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5737b(@NonNull Activity activity) {
    }
}

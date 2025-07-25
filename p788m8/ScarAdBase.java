package p788m8;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import p715i8.IScarLoadListener;
import p715i8.ScarAdMetadata;
import p774l8.AdRequestFactory;

/* renamed from: m8.a */
/* loaded from: classes7.dex */
public abstract class ScarAdBase<T> {

    /* renamed from: a */
    protected T f101050a;

    /* renamed from: b */
    protected Context f101051b;

    /* renamed from: c */
    protected ScarAdMetadata f101052c;

    /* renamed from: d */
    protected AdRequestFactory f101053d;

    /* renamed from: e */
    protected ScarAdListener f101054e;

    /* renamed from: f */
    protected IAdsErrorHandler f101055f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, AdRequestFactory adRequestFactory, IAdsErrorHandler iAdsErrorHandler) {
        this.f101051b = context;
        this.f101052c = scarAdMetadata;
        this.f101053d = adRequestFactory;
        this.f101055f = iAdsErrorHandler;
    }

    /* renamed from: a */
    public void m15366a(IScarLoadListener iScarLoadListener) {
        AdRequest m15653b = this.f101053d.m15653b(this.f101052c.m23101a());
        if (iScarLoadListener != null) {
            this.f101054e.m15364a(iScarLoadListener);
        }
        mo15355b(m15653b, iScarLoadListener);
    }

    /* renamed from: b */
    protected abstract void mo15355b(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    /* renamed from: c */
    public void m15365c(T t) {
        this.f101050a = t;
    }
}

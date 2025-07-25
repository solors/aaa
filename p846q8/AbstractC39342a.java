package p846q8;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import p715i8.IScarLoadListener;
import p715i8.ScarAdMetadata;
import p832p8.C39283a;

/* compiled from: ScarAdBase.java */
/* renamed from: q8.a */
/* loaded from: classes7.dex */
public abstract class AbstractC39342a<T> {

    /* renamed from: a */
    protected T f103471a;

    /* renamed from: b */
    protected Context f103472b;

    /* renamed from: c */
    protected ScarAdMetadata f103473c;

    /* renamed from: d */
    protected C39283a f103474d;

    /* renamed from: e */
    protected C39343b f103475e;

    /* renamed from: f */
    protected IAdsErrorHandler f103476f;

    public AbstractC39342a(Context context, ScarAdMetadata scarAdMetadata, C39283a c39283a, IAdsErrorHandler iAdsErrorHandler) {
        this.f103472b = context;
        this.f103473c = scarAdMetadata;
        this.f103474d = c39283a;
        this.f103476f = iAdsErrorHandler;
    }

    /* renamed from: a */
    public void m12885a(IScarLoadListener iScarLoadListener) {
        AdRequest m13268b = this.f103474d.m13268b(this.f103473c.m23101a());
        if (iScarLoadListener != null) {
            this.f103475e.m12883a(iScarLoadListener);
        }
        mo12874b(m13268b, iScarLoadListener);
    }

    /* renamed from: b */
    protected abstract void mo12874b(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    /* renamed from: c */
    public void m12884c(T t) {
        this.f103471a = t;
    }
}

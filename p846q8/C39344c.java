package p846q8;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;
import p715i8.IScarLoadListener;
import p715i8.ScarAdMetadata;
import p832p8.C39283a;

/* compiled from: ScarBannerAd.java */
/* renamed from: q8.c */
/* loaded from: classes7.dex */
public class C39344c extends AbstractC39342a<AdView> {

    /* renamed from: g */
    private RelativeLayout f103478g;

    /* renamed from: h */
    private int f103479h;

    /* renamed from: i */
    private int f103480i;

    /* renamed from: j */
    private AdView f103481j;

    public C39344c(Context context, RelativeLayout relativeLayout, C39283a c39283a, ScarAdMetadata scarAdMetadata, int i, int i2, IAdsErrorHandler iAdsErrorHandler, IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper) {
        super(context, scarAdMetadata, c39283a, iAdsErrorHandler);
        this.f103478g = relativeLayout;
        this.f103479h = i;
        this.f103480i = i2;
        this.f103481j = new AdView(this.f103472b);
        this.f103475e = new C39345d(iScarBannerAdListenerWrapper, this);
    }

    @Override // p846q8.AbstractC39342a
    /* renamed from: b */
    protected void mo12874b(AdRequest adRequest, IScarLoadListener iScarLoadListener) {
        AdView adView;
        RelativeLayout relativeLayout = this.f103478g;
        if (relativeLayout != null && (adView = this.f103481j) != null) {
            relativeLayout.addView(adView);
            this.f103481j.setAdSize(new AdSize(this.f103479h, this.f103480i));
            this.f103481j.setAdUnitId(this.f103473c.m23100b());
            this.f103481j.setAdListener(((C39345d) this.f103475e).m12879d());
            this.f103481j.loadAd(adRequest);
        }
    }

    /* renamed from: d */
    public void m12882d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f103478g;
        if (relativeLayout != null && (adView = this.f103481j) != null) {
            relativeLayout.removeView(adView);
        }
    }
}

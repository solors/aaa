package p788m8;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;
import p715i8.IScarLoadListener;
import p715i8.ScarAdMetadata;
import p774l8.AdRequestFactory;

/* renamed from: m8.c */
/* loaded from: classes7.dex */
public class ScarBannerAd extends ScarAdBase<AdView> {

    /* renamed from: g */
    private RelativeLayout f101057g;

    /* renamed from: h */
    private int f101058h;

    /* renamed from: i */
    private int f101059i;

    /* renamed from: j */
    private AdView f101060j;

    public ScarBannerAd(Context context, RelativeLayout relativeLayout, AdRequestFactory adRequestFactory, ScarAdMetadata scarAdMetadata, int i, int i2, IAdsErrorHandler iAdsErrorHandler, IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper) {
        super(context, scarAdMetadata, adRequestFactory, iAdsErrorHandler);
        this.f101057g = relativeLayout;
        this.f101058h = i;
        this.f101059i = i2;
        this.f101060j = new AdView(this.f101051b);
        this.f101054e = new ScarBannerAdListener(iScarBannerAdListenerWrapper, this);
    }

    @Override // p788m8.ScarAdBase
    /* renamed from: b */
    protected void mo15355b(AdRequest adRequest, IScarLoadListener iScarLoadListener) {
        AdView adView;
        RelativeLayout relativeLayout = this.f101057g;
        if (relativeLayout != null && (adView = this.f101060j) != null) {
            relativeLayout.addView(adView);
            this.f101060j.setAdSize(new AdSize(this.f101058h, this.f101059i));
            this.f101060j.setAdUnitId(this.f101052c.m23100b());
            this.f101060j.setAdListener(((ScarBannerAdListener) this.f101054e).m15360d());
            this.f101060j.loadAd(adRequest);
        }
    }

    /* renamed from: d */
    public void m15363d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f101057g;
        if (relativeLayout != null && (adView = this.f101060j) != null) {
            relativeLayout.removeView(adView);
        }
    }
}

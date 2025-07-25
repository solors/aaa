package p788m8;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;

/* renamed from: m8.d */
/* loaded from: classes7.dex */
public class ScarBannerAdListener extends ScarAdListener {

    /* renamed from: b */
    private final IScarBannerAdListenerWrapper f101061b;

    /* renamed from: c */
    private final ScarBannerAd f101062c;

    /* renamed from: d */
    private final AdListener f101063d = new C38205a();

    /* compiled from: ScarBannerAdListener.java */
    /* renamed from: m8.d$a */
    /* loaded from: classes7.dex */
    class C38205a extends AdListener {
        C38205a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            ScarBannerAdListener.this.f101061b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            ScarBannerAdListener.this.f101061b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            ScarBannerAdListener.this.f101062c.m15363d();
            ScarBannerAdListener.this.f101061b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            ScarBannerAdListener.this.f101061b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            ScarBannerAdListener.this.f101061b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            ScarBannerAdListener.this.f101061b.onAdOpened();
        }
    }

    public ScarBannerAdListener(IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper, ScarBannerAd scarBannerAd) {
        this.f101061b = iScarBannerAdListenerWrapper;
        this.f101062c = scarBannerAd;
    }

    /* renamed from: d */
    public AdListener m15360d() {
        return this.f101063d;
    }
}

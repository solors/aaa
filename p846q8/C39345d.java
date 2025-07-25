package p846q8;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper;

/* compiled from: ScarBannerAdListener.java */
/* renamed from: q8.d */
/* loaded from: classes7.dex */
public class C39345d extends C39343b {

    /* renamed from: b */
    private final IScarBannerAdListenerWrapper f103482b;

    /* renamed from: c */
    private final C39344c f103483c;

    /* renamed from: d */
    private final AdListener f103484d = new C39346a();

    /* compiled from: ScarBannerAdListener.java */
    /* renamed from: q8.d$a */
    /* loaded from: classes7.dex */
    class C39346a extends AdListener {
        C39346a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            C39345d.this.f103482b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            C39345d.this.f103482b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            C39345d.this.f103483c.m12882d();
            C39345d.this.f103482b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            C39345d.this.f103482b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            C39345d.this.f103482b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            C39345d.this.f103482b.onAdOpened();
        }
    }

    public C39345d(IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper, C39344c c39344c) {
        this.f103482b = iScarBannerAdListenerWrapper;
        this.f103483c = c39344c;
    }

    /* renamed from: d */
    public AdListener m12879d() {
        return this.f103484d;
    }
}

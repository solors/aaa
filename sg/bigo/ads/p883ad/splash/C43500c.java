package sg.bigo.ads.p883ad.splash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* renamed from: sg.bigo.ads.ad.splash.c */
/* loaded from: classes10.dex */
public class C43500c implements SplashAdInteractionListener {

    /* renamed from: a */
    private boolean f113997a;
    @Nullable

    /* renamed from: b */
    SplashAdInteractionListener f113998b;
    @Nullable

    /* renamed from: c */
    SplashAdInteractionListener f113999c;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClicked();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClosed();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(@NonNull AdError adError) {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdError(adError);
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdFinished() {
        if (!this.f113997a) {
            SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
            if (splashAdInteractionListener != null) {
                splashAdInteractionListener.onAdFinished();
            }
            SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
            if (splashAdInteractionListener2 != null) {
                splashAdInteractionListener2.onAdFinished();
            }
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdImpression();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdImpression();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdOpened();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdOpened();
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdSkipped() {
        SplashAdInteractionListener splashAdInteractionListener = this.f113998b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdSkipped();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f113999c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdSkipped();
        }
        this.f113997a = true;
    }
}

package com.smaato.sdk.interstitial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public abstract class SmaatoSplashActivity extends Activity {
    EventListener splashActivityEventListener = new C27366a();

    /* renamed from: com.smaato.sdk.interstitial.SmaatoSplashActivity$a */
    /* loaded from: classes7.dex */
    class C27366a implements EventListener {
        C27366a() {
            SmaatoSplashActivity.this = r1;
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdClicked(@NonNull final InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.a
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClicked(interstitialAd);
                }
            });
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdClosed(@NonNull final InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.c
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdClosed(interstitialAd);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdError(@NonNull final InterstitialAd interstitialAd, @NonNull final InterstitialError interstitialError) {
            SmaatoSplashActivity.this.findViewById(C27359R.C27362id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.g
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdError(interstitialAd, interstitialError);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdFailedToLoad(@NonNull final InterstitialRequestError interstitialRequestError) {
            SmaatoSplashActivity.this.findViewById(C27359R.C27362id.smaato_sdk_interstitial_loading).setVisibility(8);
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.d
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdFailedToLoad(interstitialRequestError);
                }
            });
            SmaatoSplashActivity.this.gotoNextActivity();
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdImpression(@NonNull final InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.f
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdImpression(interstitialAd);
                }
            });
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            SmaatoSplashActivity.this.findViewById(C27359R.C27362id.smaato_sdk_interstitial_loading).setVisibility(8);
            interstitialAd.showAdInternal(SmaatoSplashActivity.this);
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdOpened(@NonNull final InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.e
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdOpened(interstitialAd);
                }
            });
        }

        @Override // com.smaato.sdk.interstitial.EventListener
        public void onAdTTLExpired(@NonNull final InterstitialAd interstitialAd) {
            Objects.onNotNull(SmaatoSplashActivity.this.getEventListener(), new Consumer() { // from class: com.smaato.sdk.interstitial.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((EventListener) obj).onAdTTLExpired(interstitialAd);
                }
            });
        }
    }

    public void gotoNextActivity() {
        startActivity(new Intent(this, getNextActivity()));
        finish();
    }

    @NonNull
    protected abstract String getAdSpaceId();

    protected EventListener getEventListener() {
        return null;
    }

    @NonNull
    protected abstract Class<? extends Activity> getNextActivity();

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C27359R.C27363layout.smaato_sdk_interstitial_splash_activity);
        findViewById(C27359R.C27362id.smaato_sdk_interstitial_loading).setVisibility(0);
        Interstitial.loadAd(getAdSpaceId(), this.splashActivityEventListener, null, true);
    }
}

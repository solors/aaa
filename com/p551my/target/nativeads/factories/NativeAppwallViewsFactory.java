package com.p551my.target.nativeads.factories;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p551my.target.nativeads.NativeAppwallAd;
import com.p551my.target.nativeads.banners.NativeAppwallBanner;
import com.p551my.target.nativeads.views.AppwallAdTeaserView;
import com.p551my.target.nativeads.views.AppwallAdView;

/* renamed from: com.my.target.nativeads.factories.NativeAppwallViewsFactory */
/* loaded from: classes7.dex */
public class NativeAppwallViewsFactory {
    private NativeAppwallViewsFactory() {
    }

    @NonNull
    public static AppwallAdTeaserView getAppwallAppView(@NonNull Context context) {
        return new AppwallAdTeaserView(context);
    }

    @NonNull
    public static AppwallAdView getAppwallView(@NonNull Context context) {
        return new AppwallAdView(context);
    }

    @NonNull
    public static AppwallAdTeaserView getAppwallAppView(@NonNull NativeAppwallBanner nativeAppwallBanner, @NonNull Context context) {
        AppwallAdTeaserView appwallAppView = getAppwallAppView(context);
        appwallAppView.setNativeAppwallBanner(nativeAppwallBanner);
        return appwallAppView;
    }

    @NonNull
    public static AppwallAdView getAppwallView(@NonNull NativeAppwallAd nativeAppwallAd, @NonNull Context context) {
        AppwallAdView appwallView = getAppwallView(context);
        appwallView.setupView(nativeAppwallAd);
        return appwallView;
    }
}

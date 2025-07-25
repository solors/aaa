package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC5969ze;
import com.applovin.impl.sdk.C5434n;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.C20410l;
import com.vungle.ads.internal.Constants;
import net.pubnative.lite.sdk.analytics.Reporting;

/* loaded from: classes2.dex */
public class MaxAdFormat {

    /* renamed from: a */
    private final String f12629a;

    /* renamed from: b */
    private final String f12630b;
    public static final MaxAdFormat BANNER = new MaxAdFormat(C20410l.f51629a, "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    private MaxAdFormat(String str, String str2) {
        this.f12629a = str;
        this.f12630b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase("interstitial") && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase(Constants.PLACEMENT_TYPE_APP_OPEN) && !str.equalsIgnoreCase(FirebaseAnalytics.Event.APP_OPEN)) {
                    if (!str.equalsIgnoreCase("rewarded") && !str.equalsIgnoreCase(Reporting.EventType.REWARD)) {
                        if (!str.equalsIgnoreCase("rewarded_inter") && !str.equalsIgnoreCase("rewarded_interstitial")) {
                            C5434n.m94898h("AppLovinSdk", "Unknown ad format: " + str);
                            return null;
                        }
                        return REWARDED_INTERSTITIAL;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f12630b;
    }

    public String getLabel() {
        return this.f12629a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(300, 250);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        if (this != BANNER && this != MREC && this != LEADER) {
            return false;
        }
        return true;
    }

    public boolean isBannerOrLeaderAd() {
        if (this != BANNER && this != LEADER) {
            return false;
        }
        return true;
    }

    public boolean isFullscreenAd() {
        if (this != INTERSTITIAL && this != APP_OPEN && this != REWARDED && this != REWARDED_INTERSTITIAL) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f12629a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i, Context context) {
        if (this != BANNER && this != LEADER) {
            return getSize();
        }
        return AbstractC5969ze.m92416a(i, this, context);
    }
}

package com.applovin.impl.mediation.debugger.p133ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.AbstractActivityC5263re;
import com.applovin.impl.AbstractC5927yp;
import com.applovin.impl.C4648je;
import com.applovin.impl.C5039o0;
import com.applovin.impl.C5097p0;
import com.applovin.impl.mediation.debugger.p133ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C6200R;
import com.mobilefuse.sdk.telemetry.TelemetrySdkTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4895a extends AbstractActivityC5263re implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.InterfaceC4893a, MaxAdRevenueListener, C5039o0.InterfaceC5040a {

    /* renamed from: A */
    private Map f8209A;

    /* renamed from: a */
    private C4648je f8210a;

    /* renamed from: b */
    private C5416j f8211b;

    /* renamed from: c */
    private MaxAdView f8212c;

    /* renamed from: d */
    private MaxAdView f8213d;

    /* renamed from: f */
    private MaxInterstitialAd f8214f;

    /* renamed from: g */
    private MaxAppOpenAd f8215g;

    /* renamed from: h */
    private MaxRewardedInterstitialAd f8216h;

    /* renamed from: i */
    private MaxRewardedAd f8217i;

    /* renamed from: j */
    private MaxAd f8218j;

    /* renamed from: k */
    private MaxNativeAdLoader f8219k;

    /* renamed from: l */
    private List f8220l;

    /* renamed from: m */
    private String f8221m;

    /* renamed from: n */
    private AdControlButton f8222n;

    /* renamed from: o */
    private AdControlButton f8223o;

    /* renamed from: p */
    private AdControlButton f8224p;

    /* renamed from: q */
    private AdControlButton f8225q;

    /* renamed from: r */
    private AdControlButton f8226r;

    /* renamed from: s */
    private AdControlButton f8227s;

    /* renamed from: t */
    private AdControlButton f8228t;

    /* renamed from: u */
    private Button f8229u;

    /* renamed from: v */
    private Button f8230v;

    /* renamed from: w */
    private FrameLayout f8231w;

    /* renamed from: x */
    private FrameLayout f8232x;

    /* renamed from: y */
    private Switch f8233y;

    /* renamed from: z */
    private Switch f8234z;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a */
    /* loaded from: classes2.dex */
    public class C4896a extends MaxNativeAdListener {
        C4896a() {
            AbstractActivityC4895a.this = r1;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC4895a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC4895a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC4895a.this.f8218j != null) {
                AbstractActivityC4895a.this.f8219k.destroy(AbstractActivityC4895a.this.f8218j);
            }
            AbstractActivityC4895a.this.f8218j = maxAd;
            AbstractActivityC4895a.this.f8232x.removeAllViews();
            AbstractActivityC4895a.this.f8232x.addView(maxNativeAdView);
            AbstractActivityC4895a.this.onAdLoaded(maxAd);
        }
    }

    /* renamed from: e */
    private void m97265e() {
        List m98199r = this.f8210a.m98199r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (m98199r.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.f8210a.m98204m();
            this.f8221m = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f8211b.m95058q0(), this);
            this.f8217i = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f8217i.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C6200R.C6205id.rewarded_control_button);
            this.f8227s = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8227s.setFormat(maxAdFormat);
            return;
        }
        findViewById(C6200R.C6205id.rewarded_control_view).setVisibility(8);
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f8211b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f8210a.m98193x() != null && this.f8210a.m98193x().containsKey(maxAdFormat)) {
            return (String) this.f8210a.m98193x().get(maxAdFormat);
        }
        return this.f8210a.m98204m();
    }

    public void initialize(C4648je c4648je) {
        this.f8210a = c4648je;
        this.f8211b = c4648je.m98202o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a(TelemetrySdkTypes.AD_COLLAPSED, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        m97278a(maxAd.getAdUnitId()).setControlState(AdControlButton.EnumC4894b.LOAD);
        AbstractC5927yp.m92679a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a(TelemetrySdkTypes.AD_EXPANDED, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton m97278a = m97278a(str);
        m97278a.setControlState(AdControlButton.EnumC4894b.LOAD);
        AbstractC5927yp.m92695a(maxError, m97278a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton m97278a = m97278a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            m97278a.setControlState(AdControlButton.EnumC4894b.SHOW);
        } else {
            m97278a.setControlState(AdControlButton.EnumC4894b.LOAD);
        }
    }

    @Override // com.applovin.impl.C5039o0.InterfaceC5040a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f8213d.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f8214f.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f8215g.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f8216h.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f8217i.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f8219k.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
            }
        } else {
            this.f8212c.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        }
        m97279a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p133ui.testmode.AdControlButton.InterfaceC4893a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.EnumC4894b enumC4894b = AdControlButton.EnumC4894b.LOAD;
        if (enumC4894b == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.EnumC4894b.LOADING);
            Map map = this.f8209A;
            if (map != null && map.get(format) != null) {
                ((C5039o0) this.f8209A.get(format)).m96902a();
            } else {
                m97279a(format);
            }
        } else if (AdControlButton.EnumC4894b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(enumC4894b);
            m97273b(format);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f8210a == null) {
            C5434n.m94898h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C6200R.C6206layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f8210a.m98210g() + " Test Ads");
        this.f8220l = this.f8211b.m95076k0().m93410b();
        m97284a();
        m97272c();
        m97277b();
        m97265e();
        m97268d();
        findViewById(C6200R.C6205id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(C6200R.C6205id.app_open_ad_control_view).setVisibility(8);
        this.f8229u = (Button) findViewById(C6200R.C6205id.show_mrec_button);
        this.f8230v = (Button) findViewById(C6200R.C6205id.show_native_button);
        if (this.f8210a.m98223H() && this.f8210a.m98199r().contains(MaxAdFormat.MREC)) {
            this.f8232x.setVisibility(8);
            this.f8229u.setBackgroundColor(-1);
            this.f8230v.setBackgroundColor(-3355444);
            this.f8229u.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                {
                    AbstractActivityC4895a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC4895a.this.m97283a(view);
                }
            });
            this.f8230v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                {
                    AbstractActivityC4895a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC4895a.this.m97276b(view);
                }
            });
        } else {
            this.f8229u.setVisibility(8);
            this.f8230v.setVisibility(8);
        }
        this.f8233y = (Switch) findViewById(C6200R.C6205id.native_banner_switch);
        this.f8234z = (Switch) findViewById(C6200R.C6205id.native_mrec_switch);
        if (this.f8210a.m98222I()) {
            this.f8233y.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                {
                    AbstractActivityC4895a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC4895a.this.m97271c(view);
                }
            });
            this.f8234z.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                {
                    AbstractActivityC4895a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC4895a.this.m97267d(view);
                }
            });
        } else {
            this.f8233y.setVisibility(8);
            this.f8234z.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f8210a.m98212e()) && this.f8210a.m98213d() != null && this.f8210a.m98213d().size() > 0) {
            AdRegistration.getInstance(this.f8210a.m98212e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f8210a.m98213d().size());
            for (MaxAdFormat maxAdFormat : this.f8210a.m98213d().keySet()) {
                hashMap.put(maxAdFormat, new C5039o0((C5097p0) this.f8210a.m98213d().get(maxAdFormat), maxAdFormat, this));
            }
            this.f8209A = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C5434n.m94904c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8211b.m95076k0().m93412a(this.f8220l);
        MaxAdView maxAdView = this.f8212c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f8213d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f8214f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8217i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8219k;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f8218j;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f8219k.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        AbstractC5927yp.m92682a("onUserRewarded", maxAd, this);
    }

    /* renamed from: d */
    public /* synthetic */ void m97267d(View view) {
        this.f8213d.removeAllViews();
        this.f8223o.setControlState(AdControlButton.EnumC4894b.LOAD);
    }

    /* renamed from: b */
    public /* synthetic */ void m97276b(View view) {
        this.f8232x.setVisibility(0);
        this.f8231w.setVisibility(8);
        this.f8230v.setBackgroundColor(-1);
        this.f8229u.setBackgroundColor(-3355444);
    }

    /* renamed from: c */
    public /* synthetic */ void m97271c(View view) {
        this.f8212c.removeAllViews();
        this.f8222n.setControlState(AdControlButton.EnumC4894b.LOAD);
    }

    /* renamed from: a */
    public /* synthetic */ void m97283a(View view) {
        this.f8231w.setVisibility(0);
        this.f8232x.setVisibility(8);
        this.f8229u.setBackgroundColor(-1);
        this.f8230v.setBackgroundColor(-3355444);
    }

    /* renamed from: d */
    private void m97268d() {
        this.f8232x = (FrameLayout) findViewById(C6200R.C6205id.native_ad_view_container);
        if (this.f8210a.m98223H()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f8211b.m95058q0(), this);
            this.f8219k = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f8219k.setNativeAdListener(new C4896a());
            this.f8219k.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C6200R.C6205id.native_control_button);
            this.f8228t = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8228t.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(C6200R.C6205id.native_control_view).setVisibility(8);
        this.f8232x.setVisibility(8);
    }

    @Override // com.applovin.impl.C5039o0.InterfaceC5040a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f8213d.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f8214f.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f8215g.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f8216h.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f8217i.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f8219k.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            }
        } else {
            this.f8212c.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        }
        m97279a(maxAdFormat);
    }

    /* renamed from: c */
    private void m97272c() {
        this.f8231w = (FrameLayout) findViewById(C6200R.C6205id.mrec_ad_view_container);
        List m98199r = this.f8210a.m98199r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (m98199r.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f8211b.m95058q0(), this);
            this.f8213d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f8213d.setExtraParameter("disable_precache", "true");
            this.f8213d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8213d.stopAutoRefresh();
            this.f8213d.setListener(this);
            this.f8231w.addView(this.f8213d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(C6200R.C6205id.mrec_control_button);
            this.f8223o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8223o.setFormat(maxAdFormat);
            return;
        }
        findViewById(C6200R.C6205id.mrec_control_view).setVisibility(8);
        this.f8231w.setVisibility(8);
    }

    /* renamed from: b */
    private void m97277b() {
        List m98199r = this.f8210a.m98199r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (m98199r.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f8211b.m95058q0(), this);
            this.f8214f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f8214f.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C6200R.C6205id.interstitial_control_button);
            this.f8224p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8224p.setFormat(maxAdFormat);
            return;
        }
        findViewById(C6200R.C6205id.interstitial_control_view).setVisibility(8);
    }

    /* renamed from: a */
    private void m97284a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C6200R.C6205id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C6200R.C6205id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f8210a.m98199r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f8211b.m95058q0(), this);
            this.f8212c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f8212c.setExtraParameter("disable_auto_retries", "true");
            this.f8212c.setExtraParameter("disable_precache", "true");
            this.f8212c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8212c.stopAutoRefresh();
            this.f8212c.setListener(this);
            frameLayout.addView(this.f8212c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(C6200R.C6205id.banner_control_button);
            this.f8222n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8222n.setFormat(maxAdFormat);
            return;
        }
        findViewById(C6200R.C6205id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    /* renamed from: b */
    private void m97273b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8214f.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8215g.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f8216h.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8217i.showAd();
        }
    }

    /* renamed from: a */
    private void m97279a(MaxAdFormat maxAdFormat) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = true;
        boolean z2 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f8233y.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 != maxAdFormat || !this.f8234z.isChecked()) {
            z = false;
        }
        if (!z2 && !z) {
            this.f8211b.m95076k0().m93413a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f8211b.m95076k0().m93413a(this.f8210a.m98194w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f8212c.loadAd();
        } else if (maxAdFormat3 == maxAdFormat) {
            this.f8213d.loadAd();
            this.f8229u.callOnClick();
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8214f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8215g.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f8216h.loadAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8217i.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8219k.loadAd();
            this.f8230v.callOnClick();
        }
    }

    /* renamed from: a */
    private AdControlButton m97278a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f8223o;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f8224p;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f8225q;
            }
            if (str.equals("test_mode_rewarded_interstitial")) {
                return this.f8226r;
            }
            if (str.equals(this.f8221m)) {
                return this.f8227s;
            }
            if (str.equals("test_mode_native")) {
                return this.f8228t;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f8222n;
    }
}

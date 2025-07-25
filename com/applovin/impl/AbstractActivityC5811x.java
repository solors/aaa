package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C5039o0;
import com.applovin.impl.C5879y;
import com.applovin.impl.mediation.debugger.p133ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C5416j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* renamed from: com.applovin.impl.x */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5811x extends AbstractActivityC5263re implements AdControlButton.InterfaceC4893a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C5039o0.InterfaceC5040a {

    /* renamed from: a */
    private C5416j f11828a;

    /* renamed from: b */
    private C5939z f11829b;

    /* renamed from: c */
    private C4610ir f11830c;

    /* renamed from: d */
    private C5879y f11831d;

    /* renamed from: f */
    private MaxAdView f11832f;

    /* renamed from: g */
    private MaxInterstitialAd f11833g;

    /* renamed from: h */
    private MaxAppOpenAd f11834h;

    /* renamed from: i */
    private MaxRewardedInterstitialAd f11835i;

    /* renamed from: j */
    private MaxRewardedAd f11836j;

    /* renamed from: k */
    private MaxNativeAdView f11837k;

    /* renamed from: l */
    private MaxNativeAdLoader f11838l;

    /* renamed from: m */
    private MaxAd f11839m;

    /* renamed from: n */
    private DialogC4221d0 f11840n;

    /* renamed from: o */
    private List f11841o;

    /* renamed from: p */
    private ListView f11842p;

    /* renamed from: q */
    private View f11843q;

    /* renamed from: r */
    private AdControlButton f11844r;

    /* renamed from: s */
    private TextView f11845s;

    /* renamed from: t */
    private C5039o0 f11846t;

    /* renamed from: com.applovin.impl.x$a */
    /* loaded from: classes2.dex */
    public class C5812a extends MaxNativeAdListener {
        C5812a() {
            AbstractActivityC5811x.this = r1;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC5811x.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC5811x.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC5811x.this.f11839m != null) {
                AbstractActivityC5811x.this.f11838l.destroy(AbstractActivityC5811x.this.f11839m);
            }
            AbstractActivityC5811x.this.f11839m = maxAd;
            if (maxNativeAdView != null) {
                AbstractActivityC5811x.this.f11837k = maxNativeAdView;
            } else {
                AbstractActivityC5811x abstractActivityC5811x = AbstractActivityC5811x.this;
                C5416j unused = AbstractActivityC5811x.this.f11828a;
                abstractActivityC5811x.f11837k = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, C5416j.m95072m());
                AbstractActivityC5811x.this.f11838l.render(AbstractActivityC5811x.this.f11837k, maxAd);
            }
            AbstractActivityC5811x.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f11828a;
    }

    public void initialize(final C5939z c5939z, @Nullable final C3980a0 c3980a0, @Nullable C4610ir c4610ir, final C5416j c5416j) {
        List m94471a;
        this.f11828a = c5416j;
        this.f11829b = c5939z;
        this.f11830c = c4610ir;
        this.f11841o = c5416j.m95076k0().m93410b();
        C5879y c5879y = new C5879y(c5939z, c3980a0, c4610ir, this);
        this.f11831d = c5879y;
        c5879y.m99823a(new AbstractView$OnClickListenerC4251dc.InterfaceC4252a() { // from class: com.applovin.impl.b80
            @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
            /* renamed from: a */
            public final void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
                AbstractActivityC5811x.this.m93350a(c5416j, c5939z, c3980a0, c4708kb, c4176cc);
            }
        });
        m93344b();
        if (c5939z.m92603f().m101078f()) {
            if ((c4610ir == null || c4610ir.m98366b().m98445d().m98228C()) && (m94471a = c5416j.m95178M().m94471a(c5939z.m92606c())) != null && !m94471a.isEmpty()) {
                this.f11846t = new C5039o0(m94471a, c5939z.m92609a(), this);
            }
        }
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
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f11844r.setControlState(AdControlButton.EnumC4894b.LOAD);
        this.f11845s.setText("");
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

    @Override // com.applovin.impl.C5039o0.InterfaceC5040a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f11832f.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f11833g.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f11834h.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f11835i.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f11836j.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f11838l.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        }
        m93345a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        TextView textView = this.f11845s;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f11844r.setControlState(AdControlButton.EnumC4894b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m93352a(this.f11832f, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f11829b.m92609a()) {
            m93352a(this.f11837k, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C5039o0.InterfaceC5040a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f11832f.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f11833g.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f11834h.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f11835i.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f11836j.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f11838l.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        }
        m93345a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        AbstractC5927yp.m92682a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p133ui.testmode.AdControlButton.InterfaceC4893a
    public void onClick(AdControlButton adControlButton) {
        if (this.f11828a.m95076k0().m93409c()) {
            AbstractC5927yp.m92679a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
        } else if (this.f11831d.m92904j() != this.f11829b.m92603f()) {
            AbstractC5927yp.m92679a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
        } else {
            MaxAdFormat m92609a = this.f11829b.m92609a();
            AdControlButton.EnumC4894b enumC4894b = AdControlButton.EnumC4894b.LOAD;
            if (enumC4894b == adControlButton.getControlState()) {
                adControlButton.setControlState(AdControlButton.EnumC4894b.LOADING);
                C5039o0 c5039o0 = this.f11846t;
                if (c5039o0 != null) {
                    c5039o0.m96902a();
                } else {
                    m93345a(m92609a);
                }
            } else if (AdControlButton.EnumC4894b.SHOW == adControlButton.getControlState()) {
                if (!m92609a.isAdViewAd() && m92609a != MaxAdFormat.NATIVE) {
                    adControlButton.setControlState(enumC4894b);
                }
                m93341b(m92609a);
            }
        }
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f11831d.m92903k());
        this.f11842p = (ListView) findViewById(C6200R.C6205id.listView);
        this.f11843q = findViewById(C6200R.C6205id.ad_presenter_view);
        this.f11844r = (AdControlButton) findViewById(C6200R.C6205id.ad_control_button);
        this.f11845s = (TextView) findViewById(C6200R.C6205id.status_textview);
        this.f11842p.setAdapter((ListAdapter) this.f11831d);
        this.f11845s.setText(m93354a());
        this.f11845s.setTypeface(Typeface.DEFAULT_BOLD);
        this.f11844r.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f11843q.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f11830c != null) {
            this.f11828a.m95076k0().m93412a(this.f11841o);
        }
        MaxAdView maxAdView = this.f11832f;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f11833g;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f11834h;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f11835i;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f11836j;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f11838l;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f11839m;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f11838l.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        AbstractC5927yp.m92682a("onUserRewarded", maxAd, this);
    }

    /* renamed from: b */
    private void m93344b() {
        String m92606c = this.f11829b.m92606c();
        if (this.f11829b.m92609a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(m92606c, this.f11829b.m92609a(), this.f11828a.m95058q0(), this);
            this.f11832f = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f11832f.setExtraParameter("disable_auto_retries", "true");
            this.f11832f.setExtraParameter("disable_precache", "true");
            this.f11832f.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f11832f.stopAutoRefresh();
            this.f11832f.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f11829b.m92609a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(m92606c, this.f11828a.m95058q0(), this);
            this.f11833g = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f11833g.setListener(this);
        } else if (MaxAdFormat.APP_OPEN == this.f11829b.m92609a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(m92606c, this.f11828a.m95058q0());
            this.f11834h = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f11834h.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f11829b.m92609a()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(m92606c, this.f11828a.m95058q0(), this);
            this.f11835i = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f11835i.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f11829b.m92609a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(m92606c, this.f11828a.m95058q0(), this);
            this.f11836j = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f11836j.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f11829b.m92609a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(m92606c, this.f11828a.m95058q0(), this);
            this.f11838l = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f11838l.setNativeAdListener(new C5812a());
            this.f11838l.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    private String m93354a() {
        return this.f11828a.m95076k0().m93409c() ? "Not supported while Test Mode is enabled" : this.f11831d.m92904j() != this.f11829b.m92603f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* renamed from: a */
    public static /* synthetic */ void m93351a(C4176cc c4176cc, C5939z c5939z, C3980a0 c3980a0, C5416j c5416j, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c5939z, c3980a0, ((C5879y.C5881b) c4176cc).m92898v(), c5416j);
    }

    /* renamed from: a */
    public /* synthetic */ void m93350a(final C5416j c5416j, final C5939z c5939z, final C3980a0 c3980a0, C4708kb c4708kb, final C4176cc c4176cc) {
        if (c4176cc instanceof C5879y.C5881b) {
            AbstractC5223r.m96217a(this, MaxDebuggerAdUnitDetailActivity.class, c5416j.m95100e(), new AbstractC5223r.InterfaceC5225b() { // from class: com.applovin.impl.c80
                @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
                /* renamed from: a */
                public final void mo93279a(Activity activity) {
                    AbstractActivityC5811x.m93351a(C4176cc.this, c5939z, c3980a0, c5416j, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m93353a(DialogInterface dialogInterface) {
        this.f11840n = null;
    }

    /* renamed from: a */
    private void m93345a(MaxAdFormat maxAdFormat) {
        if (this.f11830c != null) {
            this.f11828a.m95076k0().m93412a(this.f11830c.m98366b().m98447b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f11832f.setPlacement("[Mediation Debugger Live Ad]");
            this.f11832f.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f11829b.m92609a()) {
            this.f11833g.loadAd();
        } else if (MaxAdFormat.APP_OPEN == this.f11829b.m92609a()) {
            this.f11834h.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f11829b.m92609a()) {
            this.f11835i.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f11829b.m92609a()) {
            this.f11836j.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f11829b.m92609a()) {
            this.f11838l.setPlacement("[Mediation Debugger Live Ad]");
            this.f11838l.loadAd();
        } else {
            AbstractC5927yp.m92685a("Live ads currently unavailable for ad format", this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f11844r.setControlState(AdControlButton.EnumC4894b.LOAD);
        this.f11845s.setText("");
        if (204 == maxError.getCode()) {
            AbstractC5927yp.m92679a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        AbstractC5927yp.m92679a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    /* renamed from: a */
    private void m93352a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f11840n != null) {
            return;
        }
        DialogC4221d0 dialogC4221d0 = new DialogC4221d0(viewGroup, size, this);
        this.f11840n = dialogC4221d0;
        dialogC4221d0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.a80
            {
                AbstractActivityC5811x.this = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractActivityC5811x.this.m93353a(dialogInterface);
            }
        });
        this.f11840n.show();
    }

    /* renamed from: b */
    private void m93341b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            m93352a(this.f11832f, maxAdFormat.getSize());
        } else if (MaxAdFormat.INTERSTITIAL == this.f11829b.m92609a()) {
            this.f11833g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.APP_OPEN == this.f11829b.m92609a()) {
            this.f11834h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f11829b.m92609a()) {
            this.f11835i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f11829b.m92609a()) {
            this.f11836j.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f11829b.m92609a()) {
            m93352a(this.f11837k, MaxAdFormat.MREC.getSize());
        }
    }
}

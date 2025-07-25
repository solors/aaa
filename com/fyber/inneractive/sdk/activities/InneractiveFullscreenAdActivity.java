package com.fyber.inneractive.sdk.activities;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.C14328V;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC14474A;
import com.fyber.inneractive.sdk.flow.AbstractC14487N;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14579e;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14580f;
import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.fyber.inneractive.sdk.p377ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.renderers.C15378s;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public class InneractiveFullscreenAdActivity extends InneractiveBaseActivity implements InterfaceC14579e {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: b */
    public ViewGroup f26857b;

    /* renamed from: c */
    public InneractiveAdSpot f26858c;

    /* renamed from: d */
    public InterfaceC14580f f26859d;

    /* renamed from: i */
    public CloseButtonFlowManager f26864i;

    /* renamed from: e */
    public int f26860e = 0;

    /* renamed from: f */
    public int f26861f = 0;

    /* renamed from: g */
    public int f26862g = 0;

    /* renamed from: h */
    public boolean f26863h = false;
    protected final Runnable mHideNavigationBarTask = new RunnableC14180c(this);

    /* loaded from: classes4.dex */
    public interface FullScreenRendererProvider {
        InterfaceC14580f getFullscreenRenderer();
    }

    /* loaded from: classes4.dex */
    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    public void cancelHideNavigationBarTask() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        AbstractC15465p.f30612b.removeCallbacks(this.mHideNavigationBarTask);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void destroy() {
        if (!isFinishing() && this.f26857b != null) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f26864i;
        closeButtonFlowManager.f30511c.setVisibility(8);
        closeButtonFlowManager.f30509a.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void dismissAd(boolean z) {
        this.f26863h = z;
        cancelHideNavigationBarTask();
        InterfaceC14580f interfaceC14580f = this.f26859d;
        if (interfaceC14580f != null) {
            interfaceC14580f.mo76603b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public View getCloseButton() {
        return this.f26864i.f30513e;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public ViewGroup getLayout() {
        return this.f26857b;
    }

    public void hideNavigationBar() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new View$OnSystemUiVisibilityChangeListenerC14181d(this));
    }

    public void initWindowFeatures(InterfaceC14580f interfaceC14580f) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (interfaceC14580f != null && (((AbstractC14474A) interfaceC14580f) instanceof C15378s)) {
            setTheme(16973831);
            requestWindowFeature(67108864);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        hideNavigationBar();
        C14328V c14328v = ((C14326T) this.f26858c.getAdContent().f27575d).f27125f;
        if (c14328v != null) {
            Orientation orientation = c14328v.f27131e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public boolean isCloseButtonDisplay() {
        if (this.f26864i.f30512d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        InterfaceC14580f interfaceC14580f = this.f26859d;
        if (interfaceC14580f == null || !interfaceC14580f.mo76592t()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        InterfaceC14580f interfaceC14580f = this.f26859d;
        if (interfaceC14580f != null) {
            int i = configuration.orientation;
            if (i != this.f26860e) {
                this.f26860e = i;
                interfaceC14580f.mo76615a();
                return;
            }
            int i2 = this.f26861f;
            int i3 = configuration.screenHeightDp;
            if (i2 != i3 || this.f26862g != configuration.screenWidthDp) {
                this.f26861f = i3;
                this.f26862g = configuration.screenWidthDp;
                interfaceC14580f.mo76615a();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m76524f("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.m76531a(this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.m76528b("%sSpot id %s cannot be found in spot manager!", IAlog.m76531a(this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.m76529a("%sSpot does not have a content. Cannot start activity", IAlog.m76531a(this));
            }
            if (spot != null && spot.getAdContent() != null) {
                inneractiveAdSpot = spot;
            }
        }
        this.f26858c = inneractiveAdSpot;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && this.f26858c.getAdContent().f27575d != null) {
            InneractiveUnitController selectedUnitController = this.f26858c.getSelectedUnitController();
            if (selectedUnitController != null && (selectedUnitController instanceof FullScreenRendererProvider)) {
                InterfaceC14580f fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f26859d = fullscreenRenderer;
                initWindowFeatures(fullscreenRenderer);
                super.onCreate(bundle);
                IAlog.m76529a("%sInterstitial for spot id %s created", IAlog.m76531a(this), this.f26858c.getLocalUniqueId());
                this.f26860e = getResources().getConfiguration().orientation;
                this.f26861f = getResources().getConfiguration().screenHeightDp;
                this.f26862g = getResources().getConfiguration().screenWidthDp;
                if (this.f26859d != null) {
                    try {
                        setContentView(C14169R.C14173layout.ia_layout_fullscreen_activity);
                        this.f26857b = (ViewGroup) findViewById(C14169R.C14172id.ia_ad_content);
                        this.f26864i = new CloseButtonFlowManager(this);
                        ((AbstractC14487N) this.f26859d).initialize(this.f26858c);
                        try {
                            this.f26859d.mo76610a(this, this);
                            this.f26858c.getAdContent().f27576e = true;
                            return;
                        } catch (Resources.NotFoundException e) {
                            IAlog.m76524f("Interstitial Activity: %s", e.getMessage());
                            finish();
                            return;
                        } catch (InneractiveUnitController.AdDisplayError e2) {
                            IAlog.m76524f("Interstitial Activity: %s", e2.getMessage());
                            finish();
                            return;
                        }
                    } catch (Throwable th) {
                        AbstractC14743z.m77653a(th, this.f26858c.getAdContent().f27572a, this.f26858c.getAdContent().mo77807c());
                        finish();
                        return;
                    }
                }
                IAlog.m76524f("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
                finish();
                return;
            }
            IAlog.m76524f("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.m76531a(this));
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        InneractiveUnitController selectedUnitController;
        ViewGroup viewGroup = this.f26857b;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f26857b = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f26858c;
        if (inneractiveAdSpot == null) {
            selectedUnitController = null;
        } else {
            selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        }
        if (selectedUnitController != null && (selectedUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) selectedUnitController).onActivityDestroyed(this);
        }
        InterfaceC14580f interfaceC14580f = this.f26859d;
        if (interfaceC14580f != null) {
            interfaceC14580f.mo76595k();
            this.f26859d.destroy();
            this.f26859d = null;
        }
        super.onDestroy();
        InneractiveAdSpot inneractiveAdSpot2 = this.f26858c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            InterfaceC14580f interfaceC14580f = this.f26859d;
            if (interfaceC14580f != null) {
                interfaceC14580f.mo76595k();
                this.f26859d.destroy();
                this.f26859d = null;
                return;
            }
            return;
        }
        InterfaceC14580f interfaceC14580f2 = this.f26859d;
        if (interfaceC14580f2 != null) {
            interfaceC14580f2.mo76593r();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC14580f interfaceC14580f = this.f26859d;
        if (interfaceC14580f != null) {
            interfaceC14580f.mo76594m();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideNavigationBar();
            InterfaceC14580f interfaceC14580f = this.f26859d;
            if (interfaceC14580f != null) {
                interfaceC14580f.mo76594m();
                return;
            }
            return;
        }
        InterfaceC14580f interfaceC14580f2 = this.f26859d;
        if (interfaceC14580f2 != null) {
            interfaceC14580f2.mo76593r();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void secondEndCardWasDisplayed() {
        this.f26864i.f30514f = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void showCloseButton(boolean z, int i, int i2) {
        this.f26864i.m76546a(z, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f26864i;
        closeButtonFlowManager.f30510b.setBackgroundResource(C14169R.C14171drawable.ia_round_overlay_bg);
        closeButtonFlowManager.f30509a.setVisibility(0);
        closeButtonFlowManager.f30510b.setVisibility(0);
        closeButtonFlowManager.f30512d.setVisibility(8);
        closeButtonFlowManager.f30511c.setVisibility(8);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.f26864i;
        if (i > 0) {
            closeButtonFlowManager.f30510b.setText(Integer.toString(i));
        } else {
            closeButtonFlowManager.getClass();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14579e
    public boolean wasDismissedByUser() {
        return this.f26863h;
    }
}

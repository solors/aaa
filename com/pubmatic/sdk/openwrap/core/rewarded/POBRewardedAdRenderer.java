package com.pubmatic.sdk.openwrap.core.rewarded;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.p565ui.POBFullScreenActivityListener;
import com.pubmatic.sdk.common.p565ui.POBRewardedAdRendererListener;
import com.pubmatic.sdk.common.p565ui.POBRewardedAdRendering;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.R$id;
import com.pubmatic.sdk.openwrap.core.R$layout;
import com.pubmatic.sdk.openwrap.core.R$style;
import com.pubmatic.sdk.video.player.POBVastPlayer;
import com.pubmatic.sdk.video.renderer.POBVideoRendering;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;
import com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener;
import com.pubmatic.sdk.webrendering.p566ui.POBFullScreenActivity;

/* loaded from: classes7.dex */
public class POBRewardedAdRenderer implements POBRewardedAdRendering, POBAdRendererListener, POBVideoRenderingListener, POBVideoSkipEventListener, POBFullScreenActivityBackPressListener {
    @Nullable

    /* renamed from: a */
    private POBVideoRendering f70727a;
    @Nullable

    /* renamed from: b */
    private POBRewardedAdRendererListener f70728b;
    @Nullable

    /* renamed from: c */
    private POBAdDescriptor f70729c;

    /* renamed from: d */
    private int f70730d;

    /* renamed from: e */
    private final int f70731e;
    @NonNull

    /* renamed from: f */
    private final Context f70732f;
    @Nullable

    /* renamed from: g */
    private POBFullScreenActivityListener f70733g;
    @Nullable

    /* renamed from: h */
    private View f70734h;
    @Nullable

    /* renamed from: i */
    private Activity f70735i;

    /* renamed from: j */
    private boolean f70736j;
    @Nullable

    /* renamed from: k */
    private AlertDialog f70737k;
    @NonNull

    /* renamed from: l */
    private final POBSkipConfirmationInfo f70738l;

    /* renamed from: m */
    private final View.OnClickListener f70739m = new View$OnClickListenerC26804a();

    /* renamed from: com.pubmatic.sdk.openwrap.core.rewarded.POBRewardedAdRenderer$a */
    /* loaded from: classes7.dex */
    class View$OnClickListenerC26804a implements View.OnClickListener {
        View$OnClickListenerC26804a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBRewardedAdRenderer.this.f70737k != null) {
                POBRewardedAdRenderer.this.f70737k.dismiss();
                if (view.getId() == R$id.pob_skip_alert_resume_btn) {
                    POBRewardedAdRenderer.this.m40255a(false);
                } else if (view.getId() == R$id.pob_skip_alert_close_btn) {
                    POBRewardedAdRenderer.this.m40255a(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.openwrap.core.rewarded.POBRewardedAdRenderer$b */
    /* loaded from: classes7.dex */
    public class C26805b implements POBFullScreenActivityListener {

        /* renamed from: a */
        final /* synthetic */ View f70741a;

        C26805b(View view) {
            this.f70741a = view;
        }

        @Override // com.pubmatic.sdk.common.p565ui.POBFullScreenActivityListener
        public void onCreate(@NonNull Activity activity) {
            POBRewardedAdRenderer.this.f70735i = activity;
            View view = this.f70741a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(activity);
            }
        }

        @Override // com.pubmatic.sdk.common.p565ui.POBFullScreenActivityListener
        public void onDestroy() {
            POBRewardedAdRenderer.this.m40254b();
            View view = this.f70741a;
            if (view instanceof POBVastPlayer) {
                ((POBVastPlayer) view).setBaseContext(POBRewardedAdRenderer.this.f70732f.getApplicationContext());
            }
        }
    }

    public POBRewardedAdRenderer(@NonNull Context context, int i, @NonNull POBSkipConfirmationInfo pOBSkipConfirmationInfo) {
        this.f70732f = context;
        this.f70731e = i;
        this.f70738l = pOBSkipConfirmationInfo;
    }

    /* renamed from: d */
    private void m40250d() {
        POBVideoRendering pOBVideoRendering = this.f70727a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.invalidateExpiration();
        }
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBRewardedAdRendering
    public void destroy() {
        POBVideoRendering pOBVideoRendering = this.f70727a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.destroy();
            this.f70727a = null;
        }
        this.f70728b = null;
        AlertDialog alertDialog = this.f70737k;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                this.f70737k.dismiss();
            }
            this.f70737k = null;
        }
        POBInstanceProvider.getAdViewCacheService().popStoredAdView(Integer.valueOf(hashCode()));
        this.f70733g = null;
        Intent intent = new Intent(POBFullScreenActivity.ACTIONS.POB_CLOSE.name());
        intent.putExtra(POBFullScreenActivity.RENDERER_IDENTIFIER, hashCode());
        try {
            POBFullScreenActivity.sendBroadcast(this.f70732f, intent);
        } catch (Exception e) {
            POBLog.warn("POBRewardedAdRenderer", "Unable to send broadcast to full screen activity to close the ad for %s. Error: %s", intent.getAction(), e.getMessage());
        }
        this.f70735i = null;
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
        if (pOBDataType$POBVideoAdEventType == POBDataType$POBVideoAdEventType.COMPLETE) {
            this.f70736j = true;
            POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
            if (pOBRewardedAdRendererListener != null) {
                pOBRewardedAdRendererListener.onReceiveReward(null);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoSkipEventListener
    public void onAdAboutToSkip() {
        m40252c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdExpired();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        m40260a();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        m40254b();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        this.f70734h = view;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRender(pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        this.f70736j = true;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBFullScreenActivityBackPressListener
    public void onBackPressed() {
        m40252c();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdClicked();
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z) {
        POBFullScreenActivity.updateBackButtonState(this.f70732f, hashCode(), z);
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBRewardedAdRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBLog.debug("POBRewardedAdRenderer", "Rendering onStart", new Object[0]);
        this.f70729c = pOBAdDescriptor;
        this.f70727a = POBRenderer.videoRenderer(this.f70732f, pOBAdDescriptor, "interstitial", this.f70731e, true);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            this.f70727a.setAdRendererListener(this);
            this.f70727a.setVideoRenderingListener(this);
            this.f70727a.setVideoSkipEventListener(this);
            this.f70727a.renderAd(pOBAdDescriptor);
            return;
        }
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener != null) {
            pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, "Rendering failed for descriptor: " + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBRewardedAdRendering
    public void setAdRendererListener(@Nullable POBRewardedAdRendererListener pOBRewardedAdRendererListener) {
        this.f70728b = pOBRewardedAdRendererListener;
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBRewardedAdRendering
    public void show() {
        View view;
        POBLog.info("POBRewardedAdRenderer", "Show rewarded ad", new Object[0]);
        POBAdDescriptor pOBAdDescriptor = this.f70729c;
        if (pOBAdDescriptor != null && (view = this.f70734h) != null) {
            m40259a(pOBAdDescriptor, view);
            if (POBInstanceProvider.getAdViewCacheService().getStoredAdView(Integer.valueOf(hashCode())) != null) {
                try {
                    POBFullScreenActivity.startFullScreenActivity(this.f70732f, this.f70729c.isVideo(), hashCode());
                    m40260a();
                    return;
                } catch (Exception e) {
                    POBLog.error("POBRewardedAdRenderer", "Unable to start full screen activity for ad renderer %s. Error: %s", Integer.valueOf(hashCode()), e.getMessage());
                    onAdRenderingFailed(new POBError(1009, "Failed to show interstitial ad with error: " + e.getMessage()));
                    return;
                }
            }
            String str = "Can not show rewarded ad for descriptor: " + this.f70729c;
            POBLog.error("POBRewardedAdRenderer", str, new Object[0]);
            POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
            if (pOBRewardedAdRendererListener != null) {
                pOBRewardedAdRendererListener.onAdRenderingFailed(new POBError(1009, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m40254b() {
        int i = this.f70730d - 1;
        this.f70730d = i;
        POBRewardedAdRendererListener pOBRewardedAdRendererListener = this.f70728b;
        if (pOBRewardedAdRendererListener == null || i != 0) {
            return;
        }
        pOBRewardedAdRendererListener.onAdInteractionStopped();
        destroy();
    }

    /* renamed from: c */
    private void m40252c() {
        if (this.f70736j) {
            Activity activity = this.f70735i;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Activity activity2 = this.f70735i;
        if (activity2 == null || activity2.isFinishing() || this.f70735i.isDestroyed()) {
            return;
        }
        if (this.f70737k == null) {
            View inflate = LayoutInflater.from(this.f70735i).inflate(R$layout.pob_layout_rewardedad_skip_alert, (ViewGroup) null);
            AlertDialog.Builder cancelable = new AlertDialog.Builder(this.f70735i, R$style.SkipAlertDialog).setView(inflate).setCancelable(false);
            ((TextView) inflate.findViewById(R$id.pob_skip_alert_title_txt)).setText(this.f70738l.getTitle());
            ((TextView) inflate.findViewById(R$id.pob_skip_alert_msg_txt)).setText(this.f70738l.getMessage());
            Button button = (Button) inflate.findViewById(R$id.pob_skip_alert_resume_btn);
            button.setText(this.f70738l.getResumeText());
            button.setOnClickListener(this.f70739m);
            Button button2 = (Button) inflate.findViewById(R$id.pob_skip_alert_close_btn);
            button2.setText(this.f70738l.getCloseText());
            button2.setOnClickListener(this.f70739m);
            this.f70737k = cancelable.create();
        }
        this.f70737k.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40255a(boolean z) {
        POBVideoRendering pOBVideoRendering = this.f70727a;
        if (pOBVideoRendering != null) {
            pOBVideoRendering.proceedAdSkip(z);
        }
    }

    /* renamed from: a */
    private void m40259a(@NonNull POBAdDescriptor pOBAdDescriptor, @NonNull View view) {
        this.f70733g = new C26805b(view);
        ViewGroup viewGroup = pOBAdDescriptor.isVideo() ? (ViewGroup) view : null;
        if (viewGroup != null) {
            POBAdViewCacheService.AdViewConfig adViewConfig = new POBAdViewCacheService.AdViewConfig(viewGroup, this.f70733g);
            adViewConfig.setBackPressListener(this);
            POBInstanceProvider.getAdViewCacheService().storeAdView(Integer.valueOf(hashCode()), adViewConfig);
            return;
        }
        POBLog.warn("POBRewardedAdRenderer", "Failed to create renderer container view.", new Object[0]);
    }

    /* renamed from: a */
    private void m40260a() {
        if (this.f70728b != null && this.f70730d == 0) {
            m40250d();
            this.f70728b.onAdInteractionStarted();
        }
        this.f70730d++;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i) {
    }
}

package com.pubmatic.sdk.webrendering.p566ui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.R$id;
import com.pubmatic.sdk.webrendering.p566ui.POBCountdownView;
import java.util.concurrent.TimeUnit;

@MainThread
/* renamed from: com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer */
/* loaded from: classes7.dex */
public class POBMraidViewContainer extends FrameLayout {
    @NonNull

    /* renamed from: a */
    private final ImageView f71290a;

    /* renamed from: b */
    private int f71291b;
    @Nullable

    /* renamed from: c */
    private POBOnSkipOptionUpdateListener f71292c;
    @Nullable

    /* renamed from: d */
    private POBCountdownView f71293d;

    /* renamed from: e */
    private boolean f71294e;
    @Nullable

    /* renamed from: f */
    private POBObstructionUpdateListener f71295f;
    @Nullable

    /* renamed from: g */
    private POBMraidViewContainerListener f71296g;

    /* renamed from: h */
    private boolean f71297h;
    @Nullable

    /* renamed from: i */
    private POBCountdownTimer f71298i;

    /* renamed from: j */
    private boolean f71299j;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer$a */
    /* loaded from: classes7.dex */
    class View$OnClickListenerC26953a implements View.OnClickListener {
        View$OnClickListenerC26953a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == R$id.pob_close_btn) {
                if (POBMraidViewContainer.this.f71296g != null) {
                    POBMraidViewContainer.this.f71296g.onClose();
                }
            } else if (view.getId() == R$id.pob_forward_btn) {
                POBUIUtil.updateSkipButtonToCloseButton((ImageButton) view);
                if (POBMraidViewContainer.this.f71296g != null) {
                    POBMraidViewContainer.this.f71296g.onForward();
                }
                view.bringToFront();
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer$c */
    /* loaded from: classes7.dex */
    class C26955c implements POBCountdownView.OnTimerExhaustedListener {
        C26955c() {
        }

        @Override // com.pubmatic.sdk.webrendering.p566ui.POBCountdownView.OnTimerExhaustedListener
        public void onTimerExhausted() {
            POBMraidViewContainer.this.m39829a();
            POBLog.debug("POBMraidViewContainer", "Countdown view timer exhausted, Skip button is shown", new Object[0]);
        }
    }

    public POBMraidViewContainer(@NonNull Context context, boolean z) {
        super(context);
        this.f71297h = false;
        if (z) {
            this.f71290a = POBUIUtil.createSkipButton(context, R$id.pob_forward_btn, R$drawable.pob_ic_forward_24);
        } else {
            this.f71290a = POBUIUtil.createSkipButton(context, R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        }
    }

    /* renamed from: c */
    private void m39824c() {
        POBCountdownTimer pOBCountdownTimer = this.f71298i;
        if (pOBCountdownTimer != null) {
            this.f71299j = true;
            pOBCountdownTimer.start();
            POBLog.debug("POBMraidViewContainer", "Skip button timer started", new Object[0]);
        }
    }

    public void configureSkippability(int i) {
        this.f71291b = i;
    }

    @NonNull
    public ImageView getSkipBtn() {
        return this.f71290a;
    }

    public void handleShowSkip() {
        this.f71290a.setVisibility(0);
        m39827a(true);
    }

    public void handleSkipTimer(long j) {
        if (this.f71297h) {
            m39826b();
            this.f71298i = new C26954b(TimeUnit.MILLISECONDS.toSeconds(j), 1L, Looper.getMainLooper());
            if (hasWindowFocus()) {
                m39824c();
                return;
            }
            return;
        }
        int seconds = this.f71291b - ((int) TimeUnit.MILLISECONDS.toSeconds(j));
        if (this.f71294e && seconds > 0) {
            POBCountdownView pOBCountdownView = new POBCountdownView(getContext(), seconds);
            this.f71293d = pOBCountdownView;
            pOBCountdownView.setTimerExhaustedListener(new C26955c());
            addView(this.f71293d);
            POBLog.debug("POBMraidViewContainer", "Countdown view timer started", new Object[0]);
            POBObstructionUpdateListener pOBObstructionUpdateListener = this.f71295f;
            if (pOBObstructionUpdateListener != null) {
                pOBObstructionUpdateListener.addFriendlyObstructions(this.f71293d, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.OTHER);
                return;
            }
            return;
        }
        m39829a();
    }

    public void onAdViewClicked() {
        m39829a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        POBLog.debug("POBMraidViewContainer", "Display interstitial skipOffset: " + this.f71291b, new Object[0]);
        POBObstructionUpdateListener pOBObstructionUpdateListener = this.f71295f;
        if (pOBObstructionUpdateListener != null) {
            pOBObstructionUpdateListener.addFriendlyObstructions(this.f71290a, POBObstructionUpdateListener.POBFriendlyObstructionPurpose.CLOSE_AD);
        }
        if (this.f71294e || this.f71297h) {
            this.f71290a.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39826b();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        POBCountdownTimer pOBCountdownTimer = this.f71298i;
        if (pOBCountdownTimer == null) {
            return;
        }
        if (z) {
            if (!this.f71299j) {
                m39824c();
                return;
            } else {
                pOBCountdownTimer.resume();
                return;
            }
        }
        pOBCountdownTimer.pause();
    }

    public void setCustomCloseEnabled(boolean z) {
        this.f71297h = z;
    }

    public void setEnableSkipTimer(boolean z) {
        this.f71294e = z;
    }

    public void setMraidViewContainerListener(@Nullable POBMraidViewContainerListener pOBMraidViewContainerListener) {
        this.f71296g = pOBMraidViewContainerListener;
    }

    public void setObstructionUpdateListener(@Nullable POBObstructionUpdateListener pOBObstructionUpdateListener) {
        this.f71295f = pOBObstructionUpdateListener;
    }

    public void setSkipOptionUpdateListener(@Nullable POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener) {
        this.f71292c = pOBOnSkipOptionUpdateListener;
    }

    public void updateSkipButtonToCloseButton() {
        m39826b();
        POBUIUtil.updateSkipButtonToCloseButton((ImageButton) this.f71290a);
        m39829a();
        this.f71290a.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m39829a() {
        POBCountdownView pOBCountdownView = this.f71293d;
        if (pOBCountdownView != null && pOBCountdownView.getParent() != null) {
            removeView(this.f71293d);
        }
        handleShowSkip();
    }

    /* renamed from: b */
    private void m39826b() {
        POBCountdownTimer pOBCountdownTimer = this.f71298i;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
            this.f71298i = null;
        }
    }

    public POBMraidViewContainer(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z, boolean z2) {
        this(context, viewGroup, z);
        if (z2) {
            POBUIUtil.updateSkipBtnColor(context, this.f71290a, R$color.pob_controls_stroke_color);
        }
    }

    /* renamed from: a */
    private void m39827a(boolean z) {
        POBOnSkipOptionUpdateListener pOBOnSkipOptionUpdateListener = this.f71292c;
        if (pOBOnSkipOptionUpdateListener != null) {
            pOBOnSkipOptionUpdateListener.onSkipOptionUpdate(z);
        }
    }

    public POBMraidViewContainer(@NonNull Context context, @NonNull ViewGroup viewGroup, boolean z) {
        this(context, z);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        addView(viewGroup, layoutParams);
        this.f71290a.setOnClickListener(new View$OnClickListenerC26953a());
        addView(this.f71290a);
    }

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBMraidViewContainer$b */
    /* loaded from: classes7.dex */
    class C26954b extends POBCountdownTimer {
        C26954b(long j, long j2, Looper looper) {
            super(j, j2, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            POBMraidViewContainer.this.handleShowSkip();
            POBLog.debug("POBMraidViewContainer", "Skip button timer exhausted, Skip button is shown", new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onTick(long j) {
        }
    }
}

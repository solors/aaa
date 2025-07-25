package com.pubmatic.sdk.webrendering.p566ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBCountdownTimer;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$dimen;
import com.pubmatic.sdk.webrendering.R$id;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBCountdownView */
/* loaded from: classes7.dex */
public class POBCountdownView extends FrameLayout {
    @Nullable

    /* renamed from: a */
    private POBCountdownTimer f71255a;
    @NonNull

    /* renamed from: b */
    private TextView f71256b;

    /* renamed from: c */
    private boolean f71257c;

    /* renamed from: d */
    private int f71258d;
    @NonNull

    /* renamed from: e */
    private final Resources f71259e;
    @Nullable

    /* renamed from: f */
    private OnTimerExhaustedListener f71260f;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBCountdownView$OnTimerExhaustedListener */
    /* loaded from: classes7.dex */
    public interface OnTimerExhaustedListener {
        void onTimerExhausted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBCountdownView$a */
    /* loaded from: classes7.dex */
    public class C26947a extends POBCountdownTimer {
        C26947a(long j, long j2, Looper looper) {
            super(j, j2, looper);
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onFinish() {
            if (POBCountdownView.this.f71260f != null) {
                POBCountdownView.this.f71260f.onTimerExhausted();
            }
        }

        @Override // com.pubmatic.sdk.common.utility.POBCountdownTimer
        public void onTick(long j) {
            POBCountdownView.this.setTimeToTimerTextView(j);
        }
    }

    private POBCountdownView(@NonNull Context context) {
        super(context);
        this.f71257c = false;
        this.f71259e = context.getResources();
        TextView m39844b = m39844b();
        this.f71256b = m39844b;
        addView(m39844b);
    }

    @NonNull
    /* renamed from: b */
    private TextView m39844b() {
        this.f71256b = POBUIUtil.createSkipDurationTextView(getContext(), R$id.pob_skip_duration_timer);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f71259e.getDimensionPixelOffset(R$dimen.pob_control_width), this.f71259e.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = 17;
        this.f71256b.setLayoutParams(layoutParams);
        return this.f71256b;
    }

    /* renamed from: c */
    private void m39843c() {
        POBCountdownTimer pOBCountdownTimer = this.f71255a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.pause();
        }
    }

    /* renamed from: d */
    private void m39842d() {
        POBCountdownTimer pOBCountdownTimer = this.f71255a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.resume();
        }
    }

    /* renamed from: e */
    private void m39841e() {
        if (this.f71255a == null) {
            C26947a c26947a = new C26947a(this.f71258d, 1L, Looper.getMainLooper());
            this.f71255a = c26947a;
            c26947a.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToTimerTextView(long j) {
        this.f71256b.setText(String.valueOf(j));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f71257c && hasWindowFocus()) {
            m39841e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f71257c) {
            m39847a();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f71257c) {
            if (z) {
                m39841e();
                m39842d();
                return;
            }
            m39843c();
        }
    }

    public void setTimerExhaustedListener(@Nullable OnTimerExhaustedListener onTimerExhaustedListener) {
        this.f71260f = onTimerExhaustedListener;
    }

    /* renamed from: a */
    private void m39847a() {
        POBCountdownTimer pOBCountdownTimer = this.f71255a;
        if (pOBCountdownTimer != null) {
            pOBCountdownTimer.cancel();
        }
    }

    public POBCountdownView(@NonNull Context context, int i) {
        this(context);
        if (i > 0) {
            this.f71258d = i;
            this.f71257c = true;
        }
        setLayoutParams(POBUIUtil.getLayoutParamsForTopRightPosition(context));
        setTimeToTimerTextView(i);
    }
}

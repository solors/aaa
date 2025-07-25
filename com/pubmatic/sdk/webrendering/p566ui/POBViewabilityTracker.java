package com.pubmatic.sdk.webrendering.p566ui;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;

/* renamed from: com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker */
/* loaded from: classes7.dex */
public class POBViewabilityTracker implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnWindowFocusChangeListener, View.OnAttachStateChangeListener {
    @NonNull

    /* renamed from: a */
    private View f71303a;
    @Nullable

    /* renamed from: b */
    private OnViewabilityChangedListener f71304b;

    /* renamed from: c */
    private float f71305c;

    /* renamed from: d */
    private int f71306d;

    /* renamed from: e */
    private boolean f71307e;

    /* renamed from: f */
    private boolean f71308f;

    /* renamed from: com.pubmatic.sdk.webrendering.ui.POBViewabilityTracker$OnViewabilityChangedListener */
    /* loaded from: classes7.dex */
    public interface OnViewabilityChangedListener {
        void onViewabilityChanged(boolean z);
    }

    public POBViewabilityTracker(@NonNull View view) {
        this.f71303a = view;
        this.f71308f = false;
        this.f71307e = false;
        view.addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    private void m39823a() {
        if (this.f71303a.getViewTreeObserver().isAlive()) {
            this.f71303a.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
    }

    /* renamed from: b */
    private void m39822b() {
        if (this.f71303a.getViewTreeObserver().isAlive()) {
            this.f71303a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f71303a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    /* renamed from: c */
    private void m39821c() {
        if (this.f71303a.getViewTreeObserver().isAlive()) {
            this.f71303a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    /* renamed from: d */
    private void m39820d() {
        if (this.f71303a.getViewTreeObserver().isAlive()) {
            this.f71303a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f71303a.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    /* renamed from: e */
    private void m39819e() {
        int i = this.f71306d;
        boolean z = true;
        if (i != 0) {
            if (!POBUtils.isViewVisible(this.f71303a, i) || !this.f71303a.hasWindowFocus()) {
                z = false;
            }
            OnViewabilityChangedListener onViewabilityChangedListener = this.f71304b;
            if (onViewabilityChangedListener != null) {
                onViewabilityChangedListener.onViewabilityChanged(z);
            }
            this.f71308f = z;
            return;
        }
        if (POBUtils.getVisiblePercent(this.f71303a) < this.f71305c || !this.f71303a.hasWindowFocus()) {
            z = false;
        }
        if (this.f71308f != z) {
            OnViewabilityChangedListener onViewabilityChangedListener2 = this.f71304b;
            if (onViewabilityChangedListener2 != null) {
                onViewabilityChangedListener2.onViewabilityChanged(z);
            }
            this.f71308f = z;
        }
    }

    public void destroy() {
        m39820d();
        m39821c();
        this.f71303a.removeOnAttachStateChangeListener(this);
    }

    public boolean isViewable() {
        return this.f71308f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m39819e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        m39819e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        m39823a();
        if (this.f71307e) {
            m39822b();
        }
        m39819e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m39820d();
        m39821c();
        m39819e();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        m39819e();
    }

    public void setAllowViewTreeObserverRegistration(boolean z) {
        this.f71307e = z;
    }

    public void setOnExposureChangeWithThresholdListener(@Nullable OnViewabilityChangedListener onViewabilityChangedListener) {
        this.f71304b = onViewabilityChangedListener;
    }

    public POBViewabilityTracker(@NonNull View view, float f) {
        this(view);
        this.f71305c = f;
    }

    public POBViewabilityTracker(@NonNull View view, int i) {
        this(view);
        this.f71306d = i;
    }
}

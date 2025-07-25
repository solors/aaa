package com.mobilefuse.sdk.p542ad.rendering;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.internal.Callback;

/* renamed from: com.mobilefuse.sdk.ad.rendering.FloatingContainer */
/* loaded from: classes7.dex */
public class FloatingContainer extends RelativeLayout {
    private View.OnTouchListener floatingTouchListener;
    private Callback<Boolean> onTouchInteractionEnabledChanged;
    private boolean touchInteractionEnabled;

    public FloatingContainer(Context context) throws Throwable {
        super(context);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.touchInteractionEnabled) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            View.OnTouchListener onTouchListener = this.floatingTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
                return false;
            }
            return false;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return false;
        }
    }

    public void setFloatingTouchListener(View.OnTouchListener onTouchListener) {
        this.floatingTouchListener = onTouchListener;
    }

    public void setOnTouchInteractionEnabledChanged(Callback<Boolean> callback) {
        this.onTouchInteractionEnabledChanged = callback;
    }

    public void setTouchInteractionEnabled(boolean z) {
        this.touchInteractionEnabled = z;
        Callback<Boolean> callback = this.onTouchInteractionEnabledChanged;
        if (callback != null) {
            try {
                callback.call(Boolean.valueOf(z));
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
            }
        }
    }

    public FloatingContainer(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    public FloatingContainer(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    @RequiresApi(api = 21)
    public FloatingContainer(Context context, AttributeSet attributeSet, int i, int i2) throws Throwable {
        super(context, attributeSet, i, i2);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }
}

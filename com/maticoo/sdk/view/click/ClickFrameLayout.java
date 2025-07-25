package com.maticoo.sdk.view.click;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class ClickFrameLayout extends FrameLayout {
    private ClickDelegate clickDelegate;

    public ClickFrameLayout(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        setWillNotDraw(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ClickDelegate clickDelegate = this.clickDelegate;
        if (clickDelegate != null) {
            clickDelegate.drawTestRect(this, canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.clickDelegate != null && motionEvent.getAction() == 0) {
            z = this.clickDelegate.isTouchInside(this, motionEvent);
        } else {
            z = true;
        }
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        setClickDelegate(null);
        return false;
    }

    public void setClickDelegate(ClickDelegate clickDelegate) {
        this.clickDelegate = clickDelegate;
    }

    public ClickFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ClickFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

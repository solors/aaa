package com.maticoo.sdk.view.click;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class ClickImageView extends ImageView {
    private static final String TAG = "ClickButtonTAG";
    private ClickDelegate clickDelegate;

    public ClickImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
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

    public ClickImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

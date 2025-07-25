package com.maticoo.sdk.view.click;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class ClickTextView extends TextView {
    private static final String TAG = "ClickButtonTAG";
    private ClickDelegate clickDelegate;

    public ClickTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ClickDelegate clickDelegate = this.clickDelegate;
        if (clickDelegate != null) {
            clickDelegate.drawTestRect(this, canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ClickDelegate clickDelegate = this.clickDelegate;
        if (clickDelegate != null) {
            z = clickDelegate.isTouchInside(this, motionEvent);
        } else {
            z = true;
        }
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setClickDelegate(ClickDelegate clickDelegate) {
        this.clickDelegate = clickDelegate;
    }

    public ClickTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

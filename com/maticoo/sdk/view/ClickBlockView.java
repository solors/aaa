package com.maticoo.sdk.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class ClickBlockView extends View {
    private static final String TAG = "ClickBlockViewTAG";
    private RectF clickArea;
    private int range;
    private double rangeRatio;
    private Paint testPaint;

    public ClickBlockView(Context context) {
        super(context);
        this.range = 1;
        this.rangeRatio = 1.0d;
        this.testPaint = new Paint();
        init();
    }

    private void init() {
        this.clickArea = new RectF();
        this.testPaint.setAntiAlias(true);
        this.testPaint.setStyle(Paint.Style.FILL);
        this.testPaint.setColor(SupportMenu.CATEGORY_MASK);
        post(new Runnable() { // from class: com.maticoo.sdk.view.ClickBlockView.1
            @Override // java.lang.Runnable
            public void run() {
                ClickBlockView.this.refreshClickArea();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshClickArea() {
        int height;
        int width = getWidth();
        int height2 = (int) (getHeight() * this.rangeRatio);
        if (this.range == 1) {
            height = (getHeight() - height2) / 2;
        } else {
            height = getHeight() - height2;
        }
        this.clickArea.set(0.0f, height, width, height + height2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.clickArea != null && motionEvent.getAction() == 0) {
            z = this.clickArea.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void updateConfig(int i, double d) {
        DeveloperLog.LogD("updateConfig,range = " + i + "   rangeRatio = " + d);
        this.range = i;
        this.rangeRatio = d;
        refreshClickArea();
        post(new Runnable() { // from class: com.maticoo.sdk.view.ClickBlockView.2
            @Override // java.lang.Runnable
            public void run() {
                ClickBlockView.this.postInvalidate();
            }
        });
    }

    public ClickBlockView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.range = 1;
        this.rangeRatio = 1.0d;
        this.testPaint = new Paint();
        init();
    }

    public ClickBlockView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.range = 1;
        this.rangeRatio = 1.0d;
        this.testPaint = new Paint();
        init();
    }
}

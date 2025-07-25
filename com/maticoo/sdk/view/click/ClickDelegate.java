package com.maticoo.sdk.view.click;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.Random;

/* loaded from: classes6.dex */
public class ClickDelegate {
    private View assistantView;
    private double clickPercent;
    private Paint paint;

    public ClickDelegate(double d) {
        this.clickPercent = d;
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(SupportMenu.CATEGORY_MASK);
    }

    private Rect getAvailableRect(View view) {
        int width = (int) (view.getWidth() * this.clickPercent);
        int height = (int) (view.getHeight() * this.clickPercent);
        int width2 = (view.getWidth() - width) / 2;
        int height2 = (view.getHeight() - height) / 2;
        return new Rect(width2, height2, width + width2, height + height2);
    }

    private void simulateClick(View view) {
        Random random = new Random();
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis() + random.nextInt(100) + 50;
        int width = (int) (view.getWidth() * 0.2f);
        int height = (int) (view.getHeight() * 0.2f);
        float nextInt = random.nextInt(view.getWidth() - (width * 2)) + width;
        float nextInt2 = random.nextInt(view.getHeight() - (height * 2)) + height;
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, nextInt, nextInt2, 0);
        long nextInt3 = random.nextInt(300) + 200;
        MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis + nextInt3, uptimeMillis2 + nextInt3, 1, nextInt, nextInt2, 0);
        obtain.setSource(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        view.dispatchTouchEvent(obtain);
        obtain2.setSource(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        view.dispatchTouchEvent(obtain2);
    }

    public boolean isTouchInside(View view, MotionEvent motionEvent) {
        View view2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect availableRect = getAvailableRect(view);
        boolean contains = availableRect.contains(x, y);
        DeveloperLog.LogD("isTouchInside, x = " + x + "  y = " + y + ", width = " + view.getWidth() + ", height = " + view.getHeight());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isTouchInside, clickRect = ");
        sb2.append(availableRect);
        DeveloperLog.LogD(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isTouchInside, result = ");
        sb3.append(contains);
        DeveloperLog.LogD(sb3.toString());
        if (!contains && (view2 = this.assistantView) != null) {
            simulateClick(view2);
        }
        return contains;
    }

    public void setAssistantView(View view) {
        this.assistantView = view;
    }

    public void drawTestRect(View view, Canvas canvas) {
    }
}

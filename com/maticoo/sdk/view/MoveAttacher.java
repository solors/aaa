package com.maticoo.sdk.view;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class MoveAttacher {
    private OnClickListener clickListener;
    private GestureDetector gestureDetector;
    private int lastX;
    private int lastY;
    private View moveView;
    private int parentHeight;
    private int parentWidth;
    private int slop;

    /* loaded from: classes6.dex */
    public interface OnClickListener {
        void onClick(View view);
    }

    public MoveAttacher(final boolean z, View view, final View view2) {
        this.moveView = view;
        this.slop = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
        this.gestureDetector = new GestureDetector(view2.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.maticoo.sdk.view.MoveAttacher.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (MoveAttacher.this.clickListener != null) {
                    MoveAttacher.this.clickListener.onClick(view2);
                    return false;
                }
                return false;
            }
        });
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.maticoo.sdk.view.MoveAttacher.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view3, MotionEvent motionEvent) {
                if (z) {
                    MoveAttacher.this.onTouchEvent(motionEvent);
                }
                MoveAttacher.this.gestureDetector.onTouchEvent(motionEvent);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchEvent(MotionEvent motionEvent) {
        if (this.moveView == null) {
            return;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 2 && this.parentHeight > 0 && this.parentWidth > 0) {
                int i = rawX - this.lastX;
                int i2 = rawY - this.lastY;
                int sqrt = (int) Math.sqrt((i * i) + (i2 * i2));
                if (sqrt != 0 && sqrt > this.slop) {
                    float x = this.moveView.getX() + i;
                    float y = this.moveView.getY() + i2;
                    if (x < 0.0f) {
                        x = 0.0f;
                    } else if (x > this.parentWidth - this.moveView.getWidth()) {
                        x = this.parentWidth - this.moveView.getWidth();
                    }
                    if (this.moveView.getY() < 0.0f) {
                        y = 0.0f;
                    } else {
                        float y2 = this.moveView.getY() + this.moveView.getHeight();
                        int i3 = this.parentHeight;
                        if (y2 > i3) {
                            y = i3 - this.moveView.getHeight();
                        }
                    }
                    this.moveView.setX(x);
                    this.moveView.setY(y);
                    this.lastX = rawX;
                    this.lastY = rawY;
                    return;
                }
                return;
            }
            return;
        }
        this.lastX = rawX;
        this.lastY = rawY;
        if (this.moveView.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) this.moveView.getParent();
            this.parentHeight = viewGroup.getHeight();
            this.parentWidth = viewGroup.getWidth();
        }
    }

    public void setClickListener(OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }
}

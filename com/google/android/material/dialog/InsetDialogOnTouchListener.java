package com.google.android.material.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {
    @NonNull

    /* renamed from: b */
    private final Dialog f37449b;

    /* renamed from: c */
    private final int f37450c;

    /* renamed from: d */
    private final int f37451d;

    /* renamed from: f */
    private final int f37452f;

    public InsetDialogOnTouchListener(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f37449b = dialog;
        this.f37450c = rect.left;
        this.f37451d = rect.top;
        this.f37452f = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f37450c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f37451d + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f37452f;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f37449b.onTouchEvent(obtain);
    }
}

package com.unity3d.player;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.a */
/* loaded from: classes7.dex */
public class C28775a extends SurfaceView {

    /* renamed from: a */
    private float f74822a;

    /* renamed from: b */
    private UnityPlayer f74823b;

    public C28775a(Context context, UnityPlayer unityPlayer) {
        super(context);
        this.f74823b = unityPlayer;
    }

    /* renamed from: a */
    public void m37641a(float f) {
        this.f74822a = f;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = f <= 0.0f ? -1 : -2;
        layoutParams.width = i;
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (m37642a()) {
            return this.f74823b.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f74822a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > 0 && size2 > 0 && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            float f = size;
            float f2 = size2;
            float f3 = this.f74822a;
            if (f / f2 < f3) {
                size2 = (int) (f / f3);
            } else {
                size = (int) (f2 * f3);
            }
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m37642a()) {
            return this.f74823b.injectEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public boolean m37642a() {
        return this.f74822a > 0.0f;
    }
}

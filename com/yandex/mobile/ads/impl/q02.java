package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.yandex.mobile.ads.impl.qb1;
import com.yandex.mobile.ads.impl.yw1;

/* loaded from: classes8.dex */
final class q02 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, qb1.InterfaceC31191a {

    /* renamed from: c */
    private final InterfaceC31167a f84142c;

    /* renamed from: e */
    private final GestureDetector f84144e;

    /* renamed from: a */
    private final PointF f84140a = new PointF();

    /* renamed from: b */
    private final PointF f84141b = new PointF();

    /* renamed from: d */
    private final float f84143d = 25.0f;

    /* renamed from: f */
    private volatile float f84145f = 3.1415927f;

    /* renamed from: com.yandex.mobile.ads.impl.q02$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31167a {
    }

    public q02(Context context, InterfaceC31167a interfaceC31167a) {
        this.f84142c = interfaceC31167a;
        this.f84144e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.qb1.InterfaceC31191a
    @BinderThread
    /* renamed from: a */
    public final void mo26546a(float[] fArr, float f) {
        this.f84145f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f84140a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f84140a.x) / this.f84143d;
        float y = motionEvent2.getY();
        PointF pointF = this.f84140a;
        float f3 = (y - pointF.y) / this.f84143d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f84145f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f84141b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        ((yw1.C31934a) this.f84142c).m26548a(this.f84141b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((yw1.C31934a) this.f84142c).m26547a(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f84144e.onTouchEvent(motionEvent);
    }
}

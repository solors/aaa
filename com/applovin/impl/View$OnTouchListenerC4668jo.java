package com.applovin.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.C5779wg;

/* renamed from: com.applovin.impl.jo */
/* loaded from: classes2.dex */
final class View$OnTouchListenerC4668jo extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C5779wg.InterfaceC5780a {

    /* renamed from: c */
    private final InterfaceC4669a f7243c;

    /* renamed from: d */
    private final float f7244d;

    /* renamed from: e */
    private final GestureDetector f7245e;

    /* renamed from: a */
    private final PointF f7241a = new PointF();

    /* renamed from: b */
    private final PointF f7242b = new PointF();

    /* renamed from: f */
    private volatile float f7246f = 3.1415927f;

    /* renamed from: com.applovin.impl.jo$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4669a {
        /* renamed from: a */
        void mo95816a(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public View$OnTouchListenerC4668jo(Context context, InterfaceC4669a interfaceC4669a, float f) {
        this.f7243c = interfaceC4669a;
        this.f7244d = f;
        this.f7245e = new GestureDetector(context, this);
    }

    @Override // com.applovin.impl.C5779wg.InterfaceC5780a
    /* renamed from: a */
    public void mo93514a(float[] fArr, float f) {
        this.f7246f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f7241a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f7241a.x) / this.f7244d;
        float y = motionEvent2.getY();
        PointF pointF = this.f7241a;
        float f3 = (y - pointF.y) / this.f7244d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f7246f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f7242b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f7243c.mo95816a(this.f7242b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f7243c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f7245e.onTouchEvent(motionEvent);
    }
}

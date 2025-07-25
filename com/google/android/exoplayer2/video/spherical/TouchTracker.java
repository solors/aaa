package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.google.android.exoplayer2.video.spherical.OrientationListener;

/* loaded from: classes4.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {

    /* renamed from: d */
    private final Listener f36463d;

    /* renamed from: f */
    private final float f36464f;

    /* renamed from: g */
    private final GestureDetector f36465g;

    /* renamed from: b */
    private final PointF f36461b = new PointF();

    /* renamed from: c */
    private final PointF f36462c = new PointF();

    /* renamed from: h */
    private volatile float f36466h = 3.1415927f;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchTracker(Context context, Listener listener, float f) {
        this.f36463d = listener;
        this.f36464f = f;
        this.f36465g = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f36461b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
    @BinderThread
    public void onOrientationChange(float[] fArr, float f) {
        this.f36466h = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f36461b.x) / this.f36464f;
        float y = motionEvent2.getY();
        PointF pointF = this.f36461b;
        float f3 = (y - pointF.y) / this.f36464f;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f36466h;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f36462c;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = pointF2.y + (sin * x) + (cos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f36463d.onScrollChange(this.f36462c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f36463d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f36465g.onTouchEvent(motionEvent);
    }
}

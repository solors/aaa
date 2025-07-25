package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.AbstractC5947z3;
import com.applovin.impl.C5517sj;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes2.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a */
    private final long f4573a;

    /* renamed from: b */
    private final int f4574b;

    /* renamed from: c */
    private final int f4575c;

    /* renamed from: d */
    private final ClickRecognitionState f4576d;

    /* renamed from: e */
    private long f4577e;

    /* renamed from: f */
    private PointF f4578f;

    /* renamed from: g */
    private boolean f4579g;

    /* renamed from: h */
    private final Context f4580h;

    /* renamed from: i */
    private final OnClickListener f4581i;

    /* loaded from: classes2.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes2.dex */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(C5416j c5416j, C5517sj c5517sj, Context context, OnClickListener onClickListener) {
        this.f4573a = ((Long) c5416j.m95144a(C5517sj.f10600h0)).longValue();
        this.f4574b = ((Integer) c5416j.m95144a(C5517sj.f10608i0)).intValue();
        this.f4575c = AppLovinSdkUtils.dpToPx(context, ((Integer) c5416j.m95144a(C5517sj.f10648n0)).intValue());
        this.f4576d = ClickRecognitionState.values()[((Integer) c5416j.m95144a(c5517sj)).intValue()];
        this.f4580h = context;
        this.f4581i = onClickListener;
    }

    /* renamed from: a */
    private void m100987a(View view, MotionEvent motionEvent) {
        this.f4581i.onClick(view, motionEvent);
        this.f4579g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f4579g && this.f4576d == ClickRecognitionState.ACTION_POINTER_UP) {
                    m100987a(view, motionEvent);
                }
            } else if (!this.f4579g && this.f4576d == ClickRecognitionState.ACTION_UP) {
                m100987a(view, motionEvent);
            } else if (this.f4576d == ClickRecognitionState.DISABLED) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4577e;
                float m100989a = m100989a(this.f4578f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f4579g) {
                    long j = this.f4573a;
                    if ((j < 0 || elapsedRealtime < j) && ((i = this.f4574b) < 0 || m100989a < i)) {
                        m100987a(view, motionEvent);
                    }
                }
            }
        } else if (this.f4576d == ClickRecognitionState.ACTION_DOWN) {
            if (m100988a(motionEvent)) {
                m100987a(view, motionEvent);
            }
        } else {
            this.f4577e = SystemClock.elapsedRealtime();
            this.f4578f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f4579g = false;
        }
        return true;
    }

    /* renamed from: a */
    private float m100989a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return m100990a((float) Math.sqrt((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    private float m100990a(float f) {
        return f / this.f4580h.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private boolean m100988a(MotionEvent motionEvent) {
        if (this.f4575c <= 0) {
            return true;
        }
        Point m92541b = AbstractC5947z3.m92541b(this.f4580h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f4575c;
        float f = i;
        return rawX >= f && rawY >= f && rawX <= ((float) (m92541b.x - i)) && rawY <= ((float) (m92541b.y - i));
    }
}

package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.x9 */
/* loaded from: classes3.dex */
public final class C10356x9 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final GestureDetector f23542a;

    /* renamed from: b */
    public boolean f23543b;

    public C10356x9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23542a = new GestureDetector(context, this);
    }

    /* renamed from: a */
    public final boolean m80067a() {
        return this.f23543b;
    }

    /* renamed from: b */
    public final void m80065b() {
        this.f23543b = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f23543b = true;
        return super.onSingleTapUp(e);
    }

    /* renamed from: a */
    public final boolean m80066a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f23542a.onTouchEvent(event);
    }
}

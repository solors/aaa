package com.fyber.inneractive.sdk.player.p376ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.fyber.inneractive.sdk.player.ui.s */
/* loaded from: classes4.dex */
public final class View$OnTouchListenerC15209s implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f30120a;

    public View$OnTouchListenerC15209s(GestureDetector gestureDetector) {
        this.f30120a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f30120a.onTouchEvent(motionEvent);
    }
}

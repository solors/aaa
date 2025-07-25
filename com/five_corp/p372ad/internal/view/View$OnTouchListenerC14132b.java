package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.five_corp.p372ad.internal.logger.C13836a;

/* renamed from: com.five_corp.ad.internal.view.b */
/* loaded from: classes4.dex */
public final class View$OnTouchListenerC14132b implements View.OnTouchListener {

    /* renamed from: a */
    public final int f26780a;

    /* renamed from: b */
    public final InterfaceC14131a f26781b;

    /* renamed from: c */
    public final C13836a f26782c;

    public View$OnTouchListenerC14132b(Context context, InterfaceC14131a interfaceC14131a, C13836a c13836a) {
        this.f26780a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f26781b = interfaceC14131a;
        this.f26782c = c13836a;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        try {
            int max = Math.max(view.getWidth(), 1);
            int max2 = Math.max(view.getHeight(), 1);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getActionMasked() == 1) {
                float f = -this.f26780a;
                if (f <= x && x <= max + i && f <= y && y <= max2 + i) {
                    this.f26781b.mo25795a(x, y);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            this.f26782c.m78269a(th);
            return false;
        }
    }
}

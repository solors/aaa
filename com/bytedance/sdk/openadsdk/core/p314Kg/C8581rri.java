package com.bytedance.sdk.openadsdk.core.p314Kg;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.model.C8959eo;
import com.bytedance.sdk.openadsdk.core.p313IL.C8528ldr;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.Kg.rri */
/* loaded from: classes3.dex */
public class C8581rri extends GestureDetector {

    /* renamed from: IL */
    private final C8528ldr f18916IL;

    /* renamed from: bg */
    private final C8582bg f18917bg;

    /* renamed from: com.bytedance.sdk.openadsdk.core.Kg.rri$bg */
    /* loaded from: classes3.dex */
    static class C8582bg extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: bg */
        boolean f18918bg = false;

        C8582bg() {
        }

        /* renamed from: IL */
        boolean m85641IL() {
            return this.f18918bg;
        }

        /* renamed from: bg */
        void m85640bg() {
            this.f18918bg = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f18918bg = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public C8581rri(Context context) {
        this(context, new C8582bg());
    }

    /* renamed from: IL */
    public boolean m85644IL() {
        return this.f18917bg.m85641IL();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m85643bg() {
        this.f18917bg.m85640bg();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f18916IL.m85855bg(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public C8581rri(Context context, C8582bg c8582bg) {
        super(context, c8582bg);
        this.f18917bg = c8582bg;
        this.f18916IL = new C8528ldr();
        setIsLongpressEnabled(false);
    }

    /* renamed from: bg */
    public C8959eo m85642bg(Context context, View view, View view2) {
        if (this.f18916IL == null) {
            return new C8959eo.C8961bg().m84209bg();
        }
        return new C8959eo.C8961bg().ldr(this.f18916IL.f18771bg).m84197zx(this.f18916IL.f18765IL).eqN(this.f18916IL.f18770bX).m84213bX(this.f18916IL.eqN).m84223IL(this.f18916IL.f18773zx).m84206bg(this.f18916IL.ldr).m84220IL(ZQc.m82526bg(view)).m84201bg(ZQc.m82526bg(view2)).m84210bX(ZQc.m82536bX(view)).eqN(ZQc.m82536bX(view2)).eqN(this.f18916IL.f18772iR).m84196zx(this.f18916IL.f18766Kg).ldr(this.f18916IL.f18769WR).m84205bg(this.f18916IL.f18767PX).m84224IL(C8840WR.m84734IL().m84713bg() ? 1 : 2).m84203bg("vessel").m84208bg(ZQc.m82507zx(context)).m84212bX(ZQc.m82509iR(context)).m84225IL(ZQc.ldr(context)).m84209bg();
    }
}

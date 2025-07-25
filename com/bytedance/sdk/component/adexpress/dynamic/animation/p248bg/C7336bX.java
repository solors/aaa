package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bX */
/* loaded from: classes3.dex */
public class C7336bX {

    /* renamed from: bg */
    private static volatile C7336bX f15856bg;

    private C7336bX() {
    }

    /* renamed from: bg */
    public static C7336bX m89110bg() {
        if (f15856bg == null) {
            synchronized (C7336bX.class) {
                if (f15856bg == null) {
                    f15856bg = new C7336bX();
                }
            }
        }
        return f15856bg;
    }

    /* renamed from: bg */
    public AbstractC7341eqN m89109bg(View view, C7460bg c7460bg) {
        if (c7460bg == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(c7460bg.m88954WR())) {
            return new C7334VB(view, c7460bg);
        }
        if ("translate".equals(c7460bg.m88954WR())) {
            return new C7331Lq(view, c7460bg);
        }
        if ("ripple".equals(c7460bg.m88954WR())) {
            return new C7330Kg(view, c7460bg);
        }
        if ("marquee".equals(c7460bg.m88954WR())) {
            return new C7346iR(view, c7460bg);
        }
        if ("waggle".equals(c7460bg.m88954WR())) {
            return new C7348xxp(view, c7460bg);
        }
        if ("shine".equals(c7460bg.m88954WR())) {
            return new C7332PX(view, c7460bg);
        }
        if ("swing".equals(c7460bg.m88954WR())) {
            return new C7349yDt(view, c7460bg);
        }
        if ("fade".equals(c7460bg.m88954WR())) {
            return new C7337bg(view, c7460bg);
        }
        if ("rubIn".equals(c7460bg.m88954WR())) {
            return new C7338eo(view, c7460bg);
        }
        if ("rotate".equals(c7460bg.m88954WR())) {
            return new C7335WR(view, c7460bg);
        }
        if ("cutIn".equals(c7460bg.m88954WR())) {
            return new C7347ldr(view, c7460bg);
        }
        if ("stretch".equals(c7460bg.m88954WR())) {
            return new C7333Ta(view, c7460bg);
        }
        if ("bounce".equals(c7460bg.m88954WR())) {
            return new C7350zx(view, c7460bg);
        }
        return null;
    }
}

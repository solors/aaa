package com.bytedance.adsdk.ugeno.p227zx;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.zx.bX */
/* loaded from: classes3.dex */
public class C7159bX {

    /* renamed from: Kg */
    int f15412Kg;

    /* renamed from: Lq */
    int f15413Lq;

    /* renamed from: PX */
    int f15414PX;

    /* renamed from: Ta */
    int f15415Ta;

    /* renamed from: VB */
    float f15416VB;
    boolean VzQ;

    /* renamed from: WR */
    int f15417WR;

    /* renamed from: eo */
    float f15420eo;

    /* renamed from: iR */
    int f15421iR;
    int ldr;

    /* renamed from: vb */
    int f15422vb;
    boolean xxp;

    /* renamed from: zx */
    int f15423zx;

    /* renamed from: bg */
    int f15419bg = Integer.MAX_VALUE;

    /* renamed from: IL */
    int f15411IL = Integer.MAX_VALUE;

    /* renamed from: bX */
    int f15418bX = Integer.MIN_VALUE;
    int eqN = Integer.MIN_VALUE;
    List<Integer> yDt = new ArrayList();

    /* renamed from: IL */
    public int m89844IL() {
        return this.f15412Kg - this.f15417WR;
    }

    /* renamed from: bg */
    public int m89843bg() {
        return this.f15421iR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89842bg(View view, int i, int i2, int i3, int i4) {
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) view.getLayoutParams();
        this.f15419bg = Math.min(this.f15419bg, (view.getLeft() - interfaceC7158IL.mo89755Ta()) - i);
        this.f15411IL = Math.min(this.f15411IL, (view.getTop() - interfaceC7158IL.yDt()) - i2);
        this.f15418bX = Math.max(this.f15418bX, view.getRight() + interfaceC7158IL.mo89757Lq() + i3);
        this.eqN = Math.max(this.eqN, view.getBottom() + interfaceC7158IL.mo89744vb() + i4);
    }
}

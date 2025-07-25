package com.bytedance.adsdk.p183IL.p189bg.p190IL;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;

/* renamed from: com.bytedance.adsdk.IL.bg.IL.WR */
/* loaded from: classes3.dex */
public class C6779WR extends C6838bg<PointF> {

    /* renamed from: VB */
    private final C6838bg<PointF> f14487VB;

    /* renamed from: eo */
    private Path f14488eo;

    public C6779WR(C6832iR c6832iR, C6838bg<PointF> c6838bg) {
        super(c6832iR, c6838bg.f14689bg, c6838bg.f14681IL, c6838bg.f14688bX, c6838bg.eqN, c6838bg.f14693zx, c6838bg.ldr, c6838bg.f14691iR);
        this.f14487VB = c6838bg;
        m90848bg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public Path m90849IL() {
        return this.f14488eo;
    }

    /* renamed from: bg */
    public void m90848bg() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f14681IL;
        if (t3 != 0 && (t2 = this.f14689bg) != 0 && ((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = true;
        } else {
            z = false;
        }
        T t4 = this.f14689bg;
        if (t4 != 0 && (t = this.f14681IL) != 0 && !z) {
            C6838bg<PointF> c6838bg = this.f14487VB;
            this.f14488eo = C6863ldr.m90611bg((PointF) t4, (PointF) t, c6838bg.f14682Kg, c6838bg.f14687WR);
        }
    }
}

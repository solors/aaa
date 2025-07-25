package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.bg */
/* loaded from: classes3.dex */
public class C7337bg extends AbstractC7341eqN {
    public C7337bg(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        float VzQ = this.f15862IL.VzQ() / 100.0f;
        float tuV = this.f15862IL.tuV() / 100.0f;
        if ("reverse".equals(this.f15862IL.m88940vb()) && this.f15862IL.yDt() <= 0.0d) {
            tuV = VzQ;
            VzQ = tuV;
        }
        this.f15863bX.setAlpha(VzQ);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "alpha", VzQ, tuV).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

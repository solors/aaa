package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.ldr */
/* loaded from: classes3.dex */
public class C7347ldr extends AbstractC7341eqN {
    public C7347ldr(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        float f = this.f15863bX.getLayoutParams().width;
        this.f15863bX.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationX", f, 0.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f15863bX, "alpha", 0.0f, 1.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        arrayList.add(m89104bg(duration2));
        return arrayList;
    }
}

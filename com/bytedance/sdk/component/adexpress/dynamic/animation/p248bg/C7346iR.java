package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.iR */
/* loaded from: classes3.dex */
public class C7346iR extends AbstractC7341eqN {
    public C7346iR(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        this.f15863bX.setTag(2097610709, Integer.valueOf(this.f15862IL.m88952bX()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.bytedance.sdk.component.adexpress.eqN.C7488IL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.PX */
/* loaded from: classes3.dex */
public class C7332PX extends AbstractC7341eqN {
    public C7332PX(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        int i;
        int i2;
        this.f15863bX.setTag(2097610711, Integer.valueOf(this.f15862IL.eqN()));
        View view = this.f15863bX;
        if (view != null && C7488IL.m88682bg(view.getContext())) {
            i2 = 0;
            i = 1;
        } else {
            i = 0;
            i2 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "shineValue", i, i2).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

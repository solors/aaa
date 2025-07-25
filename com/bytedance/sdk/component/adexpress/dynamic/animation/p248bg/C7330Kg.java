package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Kg */
/* loaded from: classes3.dex */
public class C7330Kg extends AbstractC7341eqN {
    public C7330Kg(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ((ViewGroup) this.f15863bX.getParent()).setClipChildren(false);
        ((ViewGroup) this.f15863bX.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.f15863bX.getParent().getParent().getParent()).setClipChildren(false);
        this.f15863bX.setTag(2097610712, this.f15862IL.m88961Kg());
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

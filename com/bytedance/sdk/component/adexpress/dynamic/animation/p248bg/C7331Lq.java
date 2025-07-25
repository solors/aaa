package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.bytedance.sdk.component.adexpress.eqN.C7488IL;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Lq */
/* loaded from: classes3.dex */
public class C7331Lq extends AbstractC7341eqN {
    public C7331Lq(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        float f;
        float m88675bg = C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.ldr());
        float m88675bg2 = C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.m88942iR());
        float f2 = 0.0f;
        if ("reverse".equals(this.f15862IL.m88940vb())) {
            f = m88675bg2;
            m88675bg2 = 0.0f;
            f2 = m88675bg;
            m88675bg = 0.0f;
        } else {
            f = 0.0f;
        }
        if (C7488IL.m88682bg(this.f15863bX.getContext())) {
            m88675bg = -m88675bg;
            f2 = -f2;
        }
        this.f15863bX.setTranslationX(m88675bg);
        this.f15863bX.setTranslationY(m88675bg2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationX", m88675bg, f2).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f15863bX, "translationY", m88675bg2, f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        arrayList.add(m89104bg(duration2));
        return arrayList;
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.xxp */
/* loaded from: classes3.dex */
public class C7348xxp extends AbstractC7341eqN {
    public C7348xxp(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationX", 0.0f, C7489Kg.m88675bg(C7487eqN.m88683bg(), 20.0f), 0.0f, -C7489Kg.m88675bg(C7487eqN.m88683bg(), 20.0f), 0.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

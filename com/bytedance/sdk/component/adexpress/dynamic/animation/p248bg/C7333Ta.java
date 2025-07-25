package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7411VB;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.Ta */
/* loaded from: classes3.dex */
public class C7333Ta extends AbstractC7341eqN {
    public C7333Ta(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        View view = this.f15863bX;
        if ((view instanceof ImageView) && (view.getParent() instanceof C7411VB)) {
            View view2 = (View) this.f15863bX.getParent();
            this.f15863bX = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.f15863bX.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        return arrayList;
    }
}

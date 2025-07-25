package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.VB */
/* loaded from: classes3.dex */
public class C7334VB extends AbstractC7341eqN {
    public C7334VB(View view, C7460bg c7460bg) {
        super(view, c7460bg);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof AbstractC7449zx)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof AbstractC7449zx)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        float f;
        float m88955VB = (float) this.f15862IL.m88955VB();
        float m88957PX = (float) this.f15862IL.m88957PX();
        String m88940vb = this.f15862IL.m88940vb();
        float f2 = 1.0f;
        if (!"reverse".equals(m88940vb) && !"alternate-reverse".equals(m88940vb)) {
            f = m88957PX;
            m88957PX = 1.0f;
            f2 = m88955VB;
            m88955VB = 1.0f;
        } else {
            f = 1.0f;
        }
        this.f15863bX.setTag(2097610710, this.f15862IL.m88965IL());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "scaleX", m88955VB, f2).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f15863bX, "scaleY", m88957PX, f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        arrayList.add(m89104bg(duration2));
        return arrayList;
    }
}

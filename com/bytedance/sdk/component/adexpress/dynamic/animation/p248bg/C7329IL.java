package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.IL */
/* loaded from: classes3.dex */
public class C7329IL implements ZQc {

    /* renamed from: bg */
    List<AbstractC7341eqN> f15855bg = new ArrayList();

    public C7329IL(View view, List<C7460bg> list) {
        for (C7460bg c7460bg : list) {
            AbstractC7341eqN m89109bg = C7336bX.m89110bg().m89109bg(view, c7460bg);
            if (m89109bg != null) {
                this.f15855bg.add(m89109bg);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    /* renamed from: IL */
    public void mo89017IL() {
        for (AbstractC7341eqN abstractC7341eqN : this.f15855bg) {
            try {
                abstractC7341eqN.mo89017IL();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public void m89111bg() {
        for (AbstractC7341eqN abstractC7341eqN : this.f15855bg) {
            try {
                abstractC7341eqN.m89105bX();
            } catch (Exception unused) {
            }
        }
    }
}

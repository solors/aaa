package com.bytedance.sdk.openadsdk.rri.p354bg;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.rri.p354bg.C9370zx;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.bX */
/* loaded from: classes3.dex */
public class C9363bX extends AbstractC9361IL {
    private int eqN;

    public C9363bX(Integer num, View view, AbstractC8967tuV abstractC8967tuV, C9370zx.C9371bg c9371bg) {
        super(num, view, abstractC8967tuV, 1000, c9371bg);
        this.eqN = -1;
        m82934IL(view);
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: IL */
    protected void mo82935IL(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: bX */
    protected boolean mo82933bX() {
        WeakReference<View> weakReference = this.f20887bg;
        boolean z = false;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.f20887bg.get();
        if (this.eqN == -1) {
            m82934IL(view);
        }
        if (this.eqN == 1) {
            z = true;
        }
        return C9369ldr.m82924bg(view, z, this.f20883IL.JMw());
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    public void eqN() {
        super.eqN();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    public int ldr() {
        return 100;
    }

    /* renamed from: IL */
    private void m82934IL(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.eqN = width * height >= 242500 ? 1 : 0;
        }
    }
}

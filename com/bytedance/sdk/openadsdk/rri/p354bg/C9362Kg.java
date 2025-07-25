package com.bytedance.sdk.openadsdk.rri.p354bg;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.rri.p354bg.C9370zx;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.Kg */
/* loaded from: classes3.dex */
public class C9362Kg extends AbstractC9361IL {
    private int eqN;

    public C9362Kg(Integer num, View view, AbstractC8967tuV abstractC8967tuV, C9370zx.C9371bg c9371bg) {
        super(num, view, abstractC8967tuV, 2000, c9371bg);
        this.eqN = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: IL */
    protected void mo82935IL(int i) {
        if (m82944WR()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.eqN = 0;
            m82947Kg();
        }
        if (i == 3 || i == 2) {
            this.eqN = 2;
            m82947Kg();
        }
        if (this.eqN != 1 && i == 0) {
            this.eqN = 1;
            mo82936bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: PX */
    public boolean mo82937PX() {
        boolean z;
        int i = this.eqN;
        if (i != 2 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f20886bX.set(false);
        }
        if (!z || super.mo82937PX()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: bX */
    protected boolean mo82933bX() {
        if (C9369ldr.m82925bg(this.f20887bg.get(), this.f20883IL.JMw()) && this.eqN == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    /* renamed from: bg */
    public void mo82936bg() {
        if (this.eqN != 1) {
            return;
        }
        super.mo82936bg();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    public void eqN() {
        super.eqN();
    }

    @Override // com.bytedance.sdk.openadsdk.rri.p354bg.AbstractC9361IL
    public int ldr() {
        return 200;
    }
}

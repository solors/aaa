package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import com.bytedance.sdk.openadsdk.xxp.C9585bX;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.bX */
/* loaded from: classes3.dex */
public class C9062bX extends C9105eqN {
    public C9062bX(Context context) {
        super(context);
        m83678bg();
    }

    /* renamed from: bg */
    private void m83678bg() {
        setVisibility(8);
        setId(C9514Ta.f21174Fb);
    }

    /* renamed from: bg */
    public void m83677bg(int i, AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV.HXG() || (abstractC8967tuV.mo84021eK() && abstractC8967tuV.mo84112Kg())) {
            ZQc.m82524bg((View) this, 0);
            C9585bX.m82322bg().m82321bg((int) ZQc.m82529bg(getContext(), i, true), this, abstractC8967tuV);
        }
    }
}

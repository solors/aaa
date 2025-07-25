package com.bytedance.sdk.openadsdk.core.p326VB.p327IL;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.IL.eqN */
/* loaded from: classes3.dex */
public class C8788eqN extends AbstractView$OnTouchListenerC6981bX<FrameLayout> {
    public C8788eqN(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: IL */
    public void mo84928IL() {
        super.mo84928IL();
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: bg */
    public FrameLayout eqN() {
        FrameLayout frameLayout = new FrameLayout(this.f14906bX);
        frameLayout.addView(new PAGLogoView(this.f14906bX));
        return frameLayout;
    }
}

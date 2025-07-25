package com.bytedance.sdk.openadsdk.core.ldr.p338bg;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.C7392bg;
import com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7284VB;
import com.bytedance.sdk.openadsdk.core.model.C8986yDt;
import com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.ldr.bg.bg */
/* loaded from: classes3.dex */
public class C8941bg extends AbstractView$OnClickListenerC8522bX implements InterfaceC7468bg {

    /* renamed from: IL */
    protected WeakReference<View> f19768IL;

    /* renamed from: bX */
    private InterfaceC7284VB f19769bX;

    /* renamed from: bg */
    protected WeakReference<View> f19770bg;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg
    /* renamed from: IL */
    public void mo84349IL(View view) {
        this.f19768IL = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg
    /* renamed from: bg */
    public void mo84346bg(InterfaceC7284VB interfaceC7284VB) {
        this.f19769bX = interfaceC7284VB;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ldr.InterfaceC7468bg
    /* renamed from: bg */
    public void mo84348bg(View view) {
        this.f19770bg = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX
    /* renamed from: bg */
    public void mo83557bg(View view, float f, float f2, float f3, float f4, SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray, boolean z) {
        m84347bg(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    /* renamed from: bg */
    private void m84347bg(View view, int i, float f, float f2, float f3, float f4, SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray) {
        if (this.f19769bX != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f19768IL;
            if (weakReference != null) {
                int[] m82526bg = ZQc.m82526bg(weakReference.get());
                if (m82526bg != null) {
                    iArr = m82526bg;
                }
                int[] m82536bX = ZQc.m82536bX(this.f19768IL.get());
                if (m82536bX != null) {
                    iArr2 = m82536bX;
                }
            }
            String str = "";
            try {
                int i2 = C7392bg.f15990LZ;
                if (view.getTag(i2) != null) {
                    str = String.valueOf(view.getTag(i2));
                }
            } catch (Exception unused) {
            }
            this.f19769bX.mo88545bg(view, i, new C8986yDt.C8988bg().eqN(f).m83897bX(f2).m83909IL(f3).m83893bg(f4).m83907IL(this.JAA).m83891bg(this.f18744Ja).m83896bX(iArr[0]).eqN(iArr[1]).m83882zx(iArr2[0]).ldr(iArr2[1]).m83890bg(sparseArray).m83886bg(this.f18749VW).m83888bg(str).m83894bg());
        }
    }
}

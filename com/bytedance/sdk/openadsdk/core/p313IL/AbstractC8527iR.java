package com.bytedance.sdk.openadsdk.core.p313IL;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX;
import com.bytedance.sdk.openadsdk.core.p316PX.C8643bg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;

/* renamed from: com.bytedance.sdk.openadsdk.core.IL.iR */
/* loaded from: classes3.dex */
public abstract class AbstractC8527iR extends AbstractView$OnClickListenerC8522bX {

    /* renamed from: IL */
    private final C8643bg f18758IL;

    /* renamed from: bX */
    private AbstractView$OnClickListenerC8522bX f18759bX;

    /* renamed from: bg */
    private final String f18760bg;

    public AbstractC8527iR(String str, C8643bg c8643bg) {
        this(str, c8643bg, null);
    }

    /* renamed from: bg */
    public void m85856bg(AbstractView$OnClickListenerC8522bX abstractView$OnClickListenerC8522bX) {
        this.f18759bX = abstractView$OnClickListenerC8522bX;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public AbstractC8527iR(String str, C8643bg c8643bg, AbstractView$OnClickListenerC8522bX abstractView$OnClickListenerC8522bX) {
        this.f18760bg = str;
        this.f18758IL = c8643bg;
        this.f18759bX = abstractView$OnClickListenerC8522bX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX
    /* renamed from: bg */
    public void mo83557bg(View view, float f, float f2, float f3, float f4, SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray, boolean z) {
        C8643bg c8643bg = this.f18758IL;
        if (c8643bg != null) {
            c8643bg.m85449zx(this.f18760bg);
        }
        if (view != null) {
            if (view.getId() == C9514Ta.f21205bX) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == C9514Ta.f21214iR) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.f18760bg);
            }
        }
        AbstractView$OnClickListenerC8522bX abstractView$OnClickListenerC8522bX = this.f18759bX;
        if (abstractView$OnClickListenerC8522bX != null) {
            abstractView$OnClickListenerC8522bX.JAA = this.JAA;
            abstractView$OnClickListenerC8522bX.f18744Ja = this.f18744Ja;
            abstractView$OnClickListenerC8522bX.f18747Uw = this.f18747Uw;
            int i = this.f18747Uw;
            abstractView$OnClickListenerC8522bX.DDQ = i;
            abstractView$OnClickListenerC8522bX.f18746Uq = i;
            abstractView$OnClickListenerC8522bX.mo83557bg(view, f, f2, f3, f4, sparseArray, z);
        }
    }
}

package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.bytedance.sdk.openadsdk.common.yDt */
/* loaded from: classes3.dex */
public class C8235yDt extends View {

    /* renamed from: IL */
    private View f18025IL;

    /* renamed from: bg */
    private final InterfaceC8236bg f18026bg;

    /* renamed from: com.bytedance.sdk.openadsdk.common.yDt$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8236bg {
        /* renamed from: bg */
        View mo86731bg(Context context);
    }

    public C8235yDt(Context context, InterfaceC8236bg interfaceC8236bg) {
        super(context);
        this.f18026bg = interfaceC8236bg;
        m86733bg();
    }

    /* renamed from: IL */
    private View m86734IL() {
        InterfaceC8236bg interfaceC8236bg;
        if (this.f18025IL == null && (interfaceC8236bg = this.f18026bg) != null) {
            this.f18025IL = interfaceC8236bg.mo86731bg(getContext());
            m86732bg(this.f18025IL, (ViewGroup) getParent());
        }
        return this.f18025IL;
    }

    /* renamed from: bg */
    private void m86733bg() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.f18025IL;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m86734IL();
        }
    }

    /* renamed from: bg */
    private void m86732bg(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }
}

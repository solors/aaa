package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.p183IL.C6839ldr;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7461eo;
import com.bytedance.sdk.component.utils.C7739LZ;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Uw */
/* loaded from: classes3.dex */
public class C7517Uw extends LinearLayout {

    /* renamed from: IL */
    private C7739LZ f16348IL;

    /* renamed from: bX */
    private TextView f16349bX;

    /* renamed from: bg */
    private TextView f16350bg;
    private InterfaceC7520bg eqN;

    /* renamed from: iR */
    private C7461eo f16351iR;
    private C6839ldr ldr;

    /* renamed from: zx */
    private LinearLayout f16352zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.Uw$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7520bg {
    }

    public C7517Uw(@NonNull Context context, View view, C7461eo c7461eo) {
        super(context);
        this.f16351iR = c7461eo;
        m88624bg(context, view);
    }

    public TextView getTopTextView() {
        return this.f16350bg;
    }

    public LinearLayout getWriggleLayout() {
        return this.f16352zx;
    }

    public View getWriggleProgressIv() {
        return this.ldr;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f16348IL == null) {
                this.f16348IL = new C7739LZ(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ldr.Uw.2
            };
            C7461eo c7461eo = this.f16351iR;
            if (c7461eo != null) {
                c7461eo.m88931bX();
                this.f16351iR.m88924zx();
                this.f16351iR.ldr();
                this.f16351iR.m88932Kg();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            C6839ldr c6839ldr = this.ldr;
            if (c6839ldr != null) {
                c6839ldr.m90660zx();
            }
        } catch (Exception unused) {
        }
    }

    public void setOnShakeViewListener(InterfaceC7520bg interfaceC7520bg) {
        this.eqN = interfaceC7520bg;
    }

    public void setShakeText(String str) {
        this.f16349bX.setText(str);
    }

    /* renamed from: bg */
    private void m88624bg(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.f16352zx = (LinearLayout) findViewById(2097610722);
        this.f16350bg = (TextView) findViewById(2097610719);
        this.f16349bX = (TextView) findViewById(2097610718);
        C6839ldr c6839ldr = (C6839ldr) findViewById(2097610706);
        this.ldr = c6839ldr;
        c6839ldr.setAnimation("lottie_json/twist_multi_angle.json");
        this.ldr.setImageAssetsFolder("images/");
        this.ldr.m90669bg(true);
    }

    /* renamed from: bg */
    public void m88625bg() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Uw.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C7517Uw.this.ldr.m90687bg();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}

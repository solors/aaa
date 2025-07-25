package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.core.widget.C9057VzQ;
import com.bytedance.sdk.openadsdk.core.widget.C9058WR;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.common.VB */
/* loaded from: classes3.dex */
public class C8200VB {

    /* renamed from: IL */
    protected Context f17943IL;

    /* renamed from: bX */
    private C9058WR f17944bX;

    /* renamed from: bg */
    protected View f17945bg = m86818zx();
    private C9057VzQ eqN;

    /* renamed from: zx */
    private C9101Kg f17946zx;

    public C8200VB(Context context) {
        this.f17943IL = context;
    }

    /* renamed from: zx */
    private View m86818zx() {
        C9109zx c9109zx = new C9109zx(this.f17943IL);
        c9109zx.setGravity(1);
        c9109zx.setOrientation(1);
        C9057VzQ c9057VzQ = new C9057VzQ(this.f17943IL);
        this.eqN = c9057VzQ;
        c9057VzQ.setId(520093745);
        int m82537bX = ZQc.m82537bX(this.f17943IL, 64.0f);
        c9109zx.addView(this.eqN, new LinearLayout.LayoutParams(m82537bX, m82537bX));
        C9101Kg c9101Kg = new C9101Kg(this.f17943IL);
        this.f17946zx = c9101Kg;
        c9101Kg.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ZQc.m82537bX(this.f17943IL, 219.0f), -2);
        layoutParams.topMargin = ZQc.m82537bX(this.f17943IL, 16.0f);
        this.f17946zx.setLayoutParams(layoutParams);
        this.f17946zx.setEllipsize(TextUtils.TruncateAt.END);
        this.f17946zx.setGravity(17);
        this.f17946zx.setMaxWidth(ZQc.m82537bX(this.f17943IL, 150.0f));
        this.f17946zx.setMaxLines(2);
        this.f17946zx.setTextColor(-1);
        this.f17946zx.setTextSize(1, 16.0f);
        c9109zx.addView(this.f17946zx);
        this.f17944bX = new C9058WR(this.f17943IL);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ZQc.m82537bX(this.f17943IL, 219.0f), ZQc.m82537bX(this.f17943IL, 6.0f));
        layoutParams2.topMargin = ZQc.m82537bX(this.f17943IL, 32.0f);
        c9109zx.addView(this.f17944bX, layoutParams2);
        return c9109zx;
    }

    /* renamed from: IL */
    public C9057VzQ m86822IL() {
        return this.eqN;
    }

    /* renamed from: bX */
    public C9101Kg m86821bX() {
        return this.f17946zx;
    }

    /* renamed from: bg */
    public View m86820bg() {
        return this.f17945bg;
    }

    public void eqN() {
        this.f17945bg = null;
        this.f17943IL = null;
    }

    /* renamed from: bg */
    public void m86819bg(int i) {
        this.f17944bX.setProgress(i);
    }
}

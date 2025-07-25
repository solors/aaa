package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9107ldr;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.yDt */
/* loaded from: classes3.dex */
public class C7916yDt extends C9106iR {
    public C7916yDt(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private void m87430bg(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int m82537bX = ZQc.m82537bX(context, 60.0f);
        C9103bX c9103bX = new C9103bX(context);
        c9103bX.setId(C9514Ta.uny);
        c9103bX.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        c9103bX.setBackgroundColor(0);
        addView(c9103bX);
        C9105eqN c9105eqN = new C9105eqN(context);
        c9105eqN.setId(C9514Ta.JxS);
        c9105eqN.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c9105eqN.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c9103bX.addView(c9105eqN);
        C9107ldr c9107ldr = new C9107ldr(context);
        c9107ldr.setId(C9514Ta.KRc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m82537bX, m82537bX);
        layoutParams.gravity = 17;
        c9107ldr.setLayoutParams(layoutParams);
        c9107ldr.setIndeterminateDrawable(C9503Kg.m82632bg(context, "tt_video_loading_progress_bar"));
        c9103bX.addView(c9107ldr);
        C9105eqN c9105eqN2 = new C9105eqN(context);
        c9105eqN2.setId(C9514Ta.yda);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        c9105eqN2.setLayoutParams(layoutParams2);
        c9105eqN2.setScaleType(ImageView.ScaleType.CENTER);
        c9105eqN2.setImageDrawable(C9503Kg.m82632bg(context, "tt_play_movebar_textpage"));
        c9105eqN2.setVisibility(8);
        addView(c9105eqN2);
        View c7906px = new C7906PX(context);
        c7906px.setId(C9514Ta.ovC);
        c7906px.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(c7906px);
    }

    public C7916yDt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7916yDt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m87430bg(context);
    }
}

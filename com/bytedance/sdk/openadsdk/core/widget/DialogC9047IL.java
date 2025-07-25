package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9104bg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.IL */
/* loaded from: classes3.dex */
public class DialogC9047IL extends Dialog {

    /* renamed from: IL */
    private C9105eqN f20166IL;

    /* renamed from: Kg */
    private final Context f20167Kg;

    /* renamed from: PX */
    private String f20168PX;

    /* renamed from: Ta */
    private int f20169Ta;

    /* renamed from: VB */
    private String f20170VB;

    /* renamed from: WR */
    private String f20171WR;

    /* renamed from: bX */
    private C9101Kg f20172bX;

    /* renamed from: bg */
    public InterfaceC9050bg f20173bg;

    /* renamed from: eo */
    private String f20174eo;
    private C9101Kg eqN;

    /* renamed from: iR */
    private View f20175iR;
    private C9104bg ldr;
    private boolean yDt;

    /* renamed from: zx */
    private C9104bg f20176zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.IL$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9050bg {
        /* renamed from: IL */
        void mo83691IL();

        /* renamed from: bg */
        void mo83690bg();
    }

    public DialogC9047IL(Context context) {
        super(context, C7730Fy.ldr(context, "tt_custom_dialog"));
        this.f20169Ta = -1;
        this.yDt = false;
        this.f20167Kg = context;
    }

    /* renamed from: IL */
    private void m83699IL() {
        if (!TextUtils.isEmpty(this.f20174eo)) {
            this.f20172bX.setText(this.f20174eo);
            this.f20172bX.setVisibility(0);
        } else {
            this.f20172bX.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f20171WR)) {
            this.eqN.setText(this.f20171WR);
        }
        if (!TextUtils.isEmpty(this.f20170VB)) {
            this.ldr.setText(this.f20170VB);
        } else {
            this.ldr.setText(C7730Fy.m87917bg(C8838VzQ.m84740bg(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f20168PX)) {
            this.f20176zx.setText(this.f20168PX);
        } else {
            this.f20176zx.setText(C7730Fy.m87917bg(C8838VzQ.m84740bg(), "tt_negtive_txt"));
        }
        int i = this.f20169Ta;
        if (i != -1) {
            this.f20166IL.setImageResource(i);
            this.f20166IL.setVisibility(0);
        } else {
            this.f20166IL.setVisibility(8);
        }
        if (this.yDt) {
            this.f20175iR.setVisibility(8);
            this.f20176zx.setVisibility(8);
            return;
        }
        this.f20176zx.setVisibility(0);
        this.f20175iR.setVisibility(0);
    }

    /* renamed from: bg */
    private void m83696bg() {
        this.ldr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.IL.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC9050bg interfaceC9050bg = DialogC9047IL.this.f20173bg;
                if (interfaceC9050bg != null) {
                    interfaceC9050bg.mo83690bg();
                }
            }
        });
        this.f20176zx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.IL.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC9050bg interfaceC9050bg = DialogC9047IL.this.f20173bg;
                if (interfaceC9050bg != null) {
                    interfaceC9050bg.mo83691IL();
                }
            }
        });
    }

    /* renamed from: bX */
    public DialogC9047IL m83697bX(String str) {
        this.f20168PX = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m83694bg(this.f20167Kg));
        setCanceledOnTouchOutside(false);
        m83699IL();
        m83696bg();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m83699IL();
    }

    /* renamed from: bg */
    private View m83694bg(Context context) {
        C9106iR c9106iR = new C9106iR(context);
        c9106iR.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C9109zx c9109zx = new C9109zx(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        c9109zx.setMinimumWidth(m83695bg(260.0f));
        c9109zx.setPadding(0, m83695bg(32.0f), 0, 0);
        c9109zx.setBackground(C9503Kg.m82632bg(context, "tt_custom_dialog_bg"));
        c9109zx.setOrientation(1);
        c9109zx.setLayoutParams(layoutParams);
        this.f20172bX = new C9101Kg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = m83695bg(16.0f);
        layoutParams2.rightMargin = m83695bg(16.0f);
        layoutParams2.bottomMargin = m83695bg(16.0f);
        this.f20172bX.setGravity(17);
        this.f20172bX.setVisibility(0);
        this.f20172bX.setTextColor(Color.parseColor("#333333"));
        this.f20172bX.setTextSize(18.0f);
        this.f20172bX.setLayoutParams(layoutParams2);
        this.f20166IL = new C9105eqN(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = m83695bg(16.0f);
        layoutParams3.rightMargin = m83695bg(16.0f);
        layoutParams3.bottomMargin = m83695bg(10.0f);
        this.f20166IL.setMaxHeight(m83695bg(150.0f));
        this.f20166IL.setMaxWidth(m83695bg(150.0f));
        this.f20166IL.setVisibility(0);
        this.f20166IL.setLayoutParams(layoutParams3);
        this.eqN = new C9101Kg(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = m83695bg(20.0f);
        layoutParams4.rightMargin = m83695bg(20.0f);
        this.eqN.setGravity(17);
        this.eqN.setLineSpacing(m83695bg(3.0f), 1.2f);
        this.eqN.setTextSize(18.0f);
        this.eqN.setTextColor(Color.parseColor("#000000"));
        this.eqN.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = m83695bg(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        C9109zx c9109zx2 = new C9109zx(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        c9109zx2.setOrientation(0);
        c9109zx2.setLayoutParams(layoutParams6);
        C9104bg c9104bg = new C9104bg(context);
        this.f20176zx = c9104bg;
        c9104bg.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = m83695bg(10.0f);
        layoutParams7.weight = 1.0f;
        this.f20176zx.setPadding(0, m83695bg(16.0f), 0, m83695bg(16.0f));
        this.f20176zx.setBackground(null);
        this.f20176zx.setGravity(17);
        this.f20176zx.setSingleLine(true);
        this.f20176zx.setTextColor(Color.parseColor("#999999"));
        this.f20176zx.setTextSize(16.0f);
        this.f20176zx.setLayoutParams(layoutParams7);
        this.f20175iR = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.f20175iR.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.f20175iR.setLayoutParams(layoutParams8);
        this.ldr = new C9104bg(context);
        this.f20176zx.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = m83695bg(10.0f);
        layoutParams9.weight = 1.0f;
        this.ldr.setPadding(0, m83695bg(16.0f), 0, m83695bg(16.0f));
        this.ldr.setBackground(null);
        this.ldr.setGravity(17);
        this.ldr.setSingleLine(true);
        this.ldr.setTextColor(Color.parseColor("#38ADFF"));
        this.ldr.setTextSize(16.0f);
        this.ldr.setLayoutParams(layoutParams9);
        c9106iR.addView(c9109zx);
        c9109zx.addView(this.f20172bX);
        c9109zx.addView(this.f20166IL);
        c9109zx.addView(this.eqN);
        c9109zx.addView(view);
        c9109zx.addView(c9109zx2);
        c9109zx2.addView(this.f20176zx);
        c9109zx2.addView(this.f20175iR);
        c9109zx2.addView(this.ldr);
        return c9106iR;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    /* renamed from: IL */
    public DialogC9047IL m83698IL(String str) {
        this.f20170VB = str;
        return this;
    }

    /* renamed from: bg */
    private int m83695bg(float f) {
        return ZQc.m82537bX(getContext(), f);
    }

    /* renamed from: bg */
    public DialogC9047IL m83693bg(InterfaceC9050bg interfaceC9050bg) {
        this.f20173bg = interfaceC9050bg;
        return this;
    }

    /* renamed from: bg */
    public DialogC9047IL m83692bg(String str) {
        this.f20171WR = str;
        return this;
    }
}

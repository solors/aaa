package com.bytedance.sdk.openadsdk.p297bX;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p340zx.C9100IL;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.bX.PX */
/* loaded from: classes3.dex */
public class DialogC8108PX extends Dialog {

    /* renamed from: IL */
    private InterfaceC8114bg f17758IL;

    /* renamed from: Kg */
    private String f17759Kg;

    /* renamed from: WR */
    private String f17760WR;

    /* renamed from: bX */
    private C9100IL f17761bX;

    /* renamed from: bg */
    private C9109zx f17762bg;

    /* renamed from: eo */
    private final C8126eo f17763eo;
    private C9101Kg eqN;

    /* renamed from: iR */
    private String f17764iR;
    private C9105eqN ldr;

    /* renamed from: zx */
    private C9101Kg f17765zx;

    /* renamed from: com.bytedance.sdk.openadsdk.bX.PX$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8114bg {
        /* renamed from: IL */
        void mo86840IL();

        /* renamed from: bX */
        void mo86839bX();

        /* renamed from: bg */
        void mo86838bg();

        /* renamed from: bg */
        void mo86837bg(int i, FilterWord filterWord, String str);
    }

    public DialogC8108PX(@NonNull Context context, C8126eo c8126eo) {
        super(context, C7730Fy.ldr(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.f17763eo = c8126eo;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m87002IL();
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9109zx m86997bg = m86997bg(C8838VzQ.m84740bg());
        this.f17762bg = m86997bg;
        setContentView(m86997bg);
        m86996bg(this.f17762bg);
        m87000bX();
        m86998bg();
        eqN();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        InterfaceC8114bg interfaceC8114bg = this.f17758IL;
        if (interfaceC8114bg != null) {
            interfaceC8114bg.mo86838bg();
        }
    }

    /* renamed from: bX */
    private void m87000bX() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    /* renamed from: bg */
    private void m86996bg(View view) {
        m86995bg((EditText) this.f17761bX);
        C8126eo c8126eo = this.f17763eo;
        if (c8126eo != null) {
            String m86951iR = c8126eo.m86951iR();
            if (!TextUtils.isEmpty(m86951iR)) {
                this.f17761bX.setText(m86951iR);
                this.eqN.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(m86951iR.length()), "/200"));
            }
            this.f17765zx.setEnabled(!TextUtils.isEmpty(m86951iR));
        }
        this.f17765zx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String obj = DialogC8108PX.this.f17761bX.getText().toString();
                if (DialogC8108PX.this.f17758IL != null) {
                    DialogC8108PX.this.f17758IL.mo86837bg(4, C8126eo.f17798bg, obj);
                }
                DialogC8108PX.this.dismiss();
            }
        });
        this.ldr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (DialogC8108PX.this.f17758IL != null) {
                    DialogC8108PX.this.f17758IL.mo86840IL();
                }
                DialogC8108PX.this.dismiss();
            }
        });
        this.f17761bX.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.bX.PX.3
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C9101Kg c9101Kg;
                int round = Math.round(charSequence.length());
                DialogC8108PX.this.eqN.setText(round + "/200");
                boolean z = true;
                if (round <= 0) {
                    c9101Kg = DialogC8108PX.this.f17765zx;
                    if (DialogC8108PX.this.f17763eo == null || TextUtils.isEmpty(DialogC8108PX.this.f17763eo.m86951iR())) {
                        z = false;
                    }
                } else if (!DialogC8108PX.this.f17765zx.isEnabled()) {
                    c9101Kg = DialogC8108PX.this.f17765zx;
                } else {
                    return;
                }
                c9101Kg.setEnabled(z);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    private void eqN() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.bX.PX.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (DialogC8108PX.this.f17758IL != null) {
                    DialogC8108PX.this.f17758IL.mo86839bX();
                }
            }
        });
    }

    /* renamed from: IL */
    public void m87002IL() {
        InputMethodManager inputMethodManager;
        C9100IL c9100il = this.f17761bX;
        if (c9100il == null || (inputMethodManager = (InputMethodManager) c9100il.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.f17762bg.getWindowToken(), 0);
    }

    /* renamed from: bg */
    public static void m86995bg(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.bX.PX.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type != 19 && type != 28) {
                        i++;
                    } else {
                        return "";
                    }
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    /* renamed from: bg */
    public void m86994bg(InterfaceC8114bg interfaceC8114bg) {
        this.f17758IL = interfaceC8114bg;
    }

    /* renamed from: bg */
    public void m86998bg() {
        C9100IL c9100il = this.f17761bX;
        if (c9100il == null) {
            return;
        }
        c9100il.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    /* renamed from: bg */
    public void m86991bg(String str, String str2) {
        this.f17764iR = str;
        this.f17759Kg = str2;
        C8126eo c8126eo = this.f17763eo;
        if (c8126eo != null) {
            c8126eo.eqN(str2);
        }
    }

    /* renamed from: bg */
    public void m86992bg(String str) {
        this.f17760WR = str;
    }

    /* renamed from: bg */
    private C9109zx m86997bg(Context context) {
        C9109zx c9109zx = new C9109zx(context);
        c9109zx.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c9109zx.setOrientation(1);
        c9109zx.setBackground(C9503Kg.m82632bg(context, "tt_dislike_dialog_bg"));
        C9106iR c9106iR = new C9106iR(context);
        c9106iR.setLayoutParams(new LinearLayout.LayoutParams(-1, ZQc.m82537bX(context, 48.0f)));
        this.ldr = new C9105eqN(context);
        int m82537bX = ZQc.m82537bX(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m82537bX, m82537bX);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int m82537bX2 = ZQc.m82537bX(context, 10.0f);
        layoutParams.topMargin = m82537bX2;
        layoutParams.rightMargin = m82537bX2;
        this.ldr.setLayoutParams(layoutParams);
        this.ldr.setClickable(true);
        this.ldr.setFocusable(true);
        this.ldr.setImageDrawable(C9503Kg.m82632bg(context, "tt_titlebar_close_seletor"));
        C9101Kg c9101Kg = new C9101Kg(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = ZQc.m82537bX(context, 12.0f);
        c9101Kg.setLayoutParams(layoutParams2);
        c9101Kg.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c9101Kg.setGravity(17);
        c9101Kg.setSingleLine(true);
        c9101Kg.setText(C7730Fy.m87917bg(context, "tt_other_reason"));
        c9101Kg.setTextColor(Color.parseColor("#161823"));
        c9101Kg.setTextSize(15.0f);
        c9101Kg.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, ZQc.m82537bX(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        C9109zx c9109zx2 = new C9109zx(context);
        c9109zx2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c9109zx2.setOrientation(1);
        C9100IL c9100il = new C9100IL(context);
        this.f17761bX = c9100il;
        c9100il.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = ZQc.m82537bX(context, 16.0f);
        layoutParams3.rightMargin = ZQc.m82537bX(context, 16.0f);
        layoutParams3.topMargin = ZQc.m82537bX(context, 11.5f);
        this.f17761bX.setLayoutParams(layoutParams3);
        this.f17761bX.setLines(4);
        this.f17761bX.setGravity(48);
        this.f17761bX.setHint(C7730Fy.m87917bg(context, "tt_suggestion_description"));
        this.f17761bX.setTextSize(15.0f);
        this.f17761bX.setTextColor(Color.rgb(22, 24, 35));
        this.f17761bX.setHintTextColor(Color.parseColor("#57161823"));
        this.f17761bX.setBackground(null);
        this.f17761bX.setImeOptions(268435456);
        C9109zx c9109zx3 = new C9109zx(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int m82537bX3 = ZQc.m82537bX(context, 16.0f);
        int m82537bX4 = ZQc.m82537bX(context, 17.0f);
        c9109zx3.setPadding(m82537bX3, m82537bX4, m82537bX3, m82537bX4);
        c9109zx3.setLayoutParams(layoutParams4);
        c9109zx3.setOrientation(0);
        this.eqN = new C9101Kg(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = GravityCompat.START;
        this.eqN.setLayoutParams(layoutParams5);
        this.eqN.setText(String.format("0%s", "/200"));
        this.eqN.setGravity(GravityCompat.START);
        this.eqN.setTextColor(Color.parseColor("#57161823"));
        this.eqN.setTextSize(15.0f);
        this.f17765zx = new C9101Kg(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = GravityCompat.END;
        this.f17765zx.setLayoutParams(layoutParams6);
        this.f17765zx.setTextSize(14.0f);
        this.f17765zx.setTextColor(-1);
        this.f17765zx.setVisibility(0);
        this.f17765zx.setSingleLine(true);
        int m82537bX5 = ZQc.m82537bX(context, 27.0f);
        int m82537bX6 = ZQc.m82537bX(context, 5.0f);
        this.f17765zx.setPadding(m82537bX5, m82537bX6, m82537bX5, m82537bX6);
        int m82537bX7 = ZQc.m82537bX(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = m82537bX7;
        gradientDrawable.setCornerRadius(f);
        int rgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(rgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(rgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.f17765zx.setBackground(stateListDrawable);
        this.f17765zx.setText(C7730Fy.m87917bg(context, "tt_done"));
        this.f17765zx.setEnabled(false);
        c9109zx.addView(c9106iR);
        c9109zx.addView(view);
        c9109zx.addView(c9109zx2);
        c9106iR.addView(this.ldr);
        c9106iR.addView(c9101Kg);
        c9109zx2.addView(this.f17761bX);
        c9109zx2.addView(c9109zx3);
        c9109zx3.addView(this.eqN);
        c9109zx3.addView(this.f17765zx);
        return c9109zx;
    }
}

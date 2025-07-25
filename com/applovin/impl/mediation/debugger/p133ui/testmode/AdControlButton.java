package com.applovin.impl.mediation.debugger.p133ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC5539t3;
import com.applovin.impl.C5038o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton */
/* loaded from: classes2.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final GradientDrawable f8199a;

    /* renamed from: b */
    private final Button f8200b;

    /* renamed from: c */
    private final C5038o f8201c;

    /* renamed from: d */
    private EnumC4894b f8202d;

    /* renamed from: f */
    private MaxAdFormat f8203f;

    /* renamed from: g */
    private InterfaceC4893a f8204g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4893a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    /* loaded from: classes2.dex */
    public enum EnumC4894b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private int m97288a(EnumC4894b enumC4894b) {
        if (EnumC4894b.LOAD == enumC4894b) {
            return AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_brand_color, getContext());
        }
        if (EnumC4894b.LOADING == enumC4894b) {
            return AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_brand_color, getContext());
        }
        return AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    /* renamed from: b */
    private String m97287b(EnumC4894b enumC4894b) {
        if (EnumC4894b.LOAD == enumC4894b) {
            return "Load";
        }
        if (EnumC4894b.LOADING == enumC4894b) {
            return "";
        }
        return "Show";
    }

    /* renamed from: c */
    private void m97286c(EnumC4894b enumC4894b) {
        if (EnumC4894b.LOADING == enumC4894b) {
            setEnabled(false);
            this.f8201c.m96904a();
        } else {
            setEnabled(true);
            this.f8201c.m96903b();
        }
        this.f8200b.setText(m97287b(enumC4894b));
        this.f8199a.setColor(m97288a(enumC4894b));
    }

    public EnumC4894b getControlState() {
        return this.f8202d;
    }

    public MaxAdFormat getFormat() {
        return this.f8203f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC4893a interfaceC4893a = this.f8204g;
        if (interfaceC4893a != null) {
            interfaceC4893a.onClick(this);
        }
    }

    public void setControlState(EnumC4894b enumC4894b) {
        if (this.f8202d != enumC4894b) {
            m97286c(enumC4894b);
        }
        this.f8202d = enumC4894b;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f8203f = maxAdFormat;
    }

    public void setOnClickListener(InterfaceC4893a interfaceC4893a) {
        this.f8204g = interfaceC4893a;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f8199a = gradientDrawable;
        Button button = new Button(getContext());
        this.f8200b = button;
        C5038o c5038o = new C5038o(getContext(), 20, 16842873);
        this.f8201c = c5038o;
        EnumC4894b enumC4894b = EnumC4894b.LOAD;
        this.f8202d = enumC4894b;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        m97289a();
        c5038o.setColor(-1);
        addView(c5038o, new FrameLayout.LayoutParams(-1, -1, 17));
        m97286c(enumC4894b);
    }

    /* renamed from: a */
    private void m97289a() {
        this.f8200b.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}

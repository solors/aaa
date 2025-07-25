package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7475VB;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.component.utils.JAA;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.bg */
/* loaded from: classes3.dex */
public class C7530bg extends TextSwitcher implements ViewSwitcher.ViewFactory, JAA.InterfaceC7736bg {

    /* renamed from: IL */
    private List<String> f16377IL;

    /* renamed from: Kg */
    private int f16378Kg;

    /* renamed from: PX */
    private int f16379PX;

    /* renamed from: Ta */
    private int f16380Ta;

    /* renamed from: VB */
    private int f16381VB;

    /* renamed from: WR */
    private float f16382WR;

    /* renamed from: bX */
    private int f16383bX;

    /* renamed from: bg */
    Animation.AnimationListener f16384bg;

    /* renamed from: eo */
    private int f16385eo;
    private final int eqN;

    /* renamed from: iR */
    private int f16386iR;
    private TextView ldr;
    private Handler yDt;

    /* renamed from: zx */
    private Context f16387zx;

    public C7530bg(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.f16377IL = new ArrayList();
        this.f16383bX = 0;
        this.eqN = 1;
        this.yDt = new com.bytedance.sdk.component.utils.JAA(Looper.getMainLooper(), this);
        this.f16384bg = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.bg.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (C7530bg.this.ldr != null) {
                    C7530bg.this.ldr.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.f16387zx = context;
        this.f16378Kg = i;
        this.f16382WR = f;
        this.f16385eo = i2;
        this.f16380Ta = i3;
        m88606bX();
    }

    /* renamed from: bX */
    private void m88606bX() {
        setFactory(this);
    }

    /* renamed from: IL */
    public void m88607IL() {
        List<String> list = this.f16377IL;
        if (list != null && list.size() > 0) {
            int i = this.f16383bX;
            this.f16383bX = i + 1;
            this.f16381VB = i;
            setText(this.f16377IL.get(i));
            if (this.f16383bX > this.f16377IL.size() - 1) {
                this.f16383bX = 0;
            }
        }
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.ldr = textView;
        textView.setTextColor(this.f16378Kg);
        this.ldr.setTextSize(this.f16382WR);
        this.ldr.setMaxLines(this.f16385eo);
        this.ldr.setTextAlignment(this.f16380Ta);
        return this.ldr;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.yDt.sendEmptyMessageDelayed(1, this.f16386iR);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.yDt.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C7475VB.m88729IL(this.f16377IL.get(this.f16381VB), this.f16382WR, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    public void setAnimationDuration(int i) {
        this.f16386iR = i;
    }

    public void setAnimationText(List<String> list) {
        this.f16377IL = list;
    }

    public void setAnimationType(int i) {
        this.f16379PX = i;
    }

    public void setMaxLines(int i) {
        this.f16385eo = i;
    }

    public void setTextColor(int i) {
        this.f16378Kg = i;
    }

    public void setTextSize(float f) {
        this.f16382WR = f;
    }

    /* renamed from: bg */
    public void m88605bg() {
        int i = this.f16379PX;
        if (i == 1) {
            setInAnimation(getContext(), C7730Fy.m87921WR(this.f16387zx, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), C7730Fy.m87921WR(this.f16387zx, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), C7730Fy.m87921WR(this.f16387zx, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), C7730Fy.m87921WR(this.f16387zx, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f16384bg);
            getOutAnimation().setAnimationListener(this.f16384bg);
        }
        this.yDt.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.JAA.InterfaceC7736bg
    /* renamed from: bg */
    public void mo83648bg(Message message) {
        if (message.what != 1) {
            return;
        }
        m88607IL();
        this.yDt.sendEmptyMessageDelayed(1, this.f16386iR);
    }
}

package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.C7739LZ;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Fy */
/* loaded from: classes3.dex */
public class C7499Fy extends LinearLayout {

    /* renamed from: IL */
    private TextView f16277IL;

    /* renamed from: Kg */
    private LinearLayout f16278Kg;

    /* renamed from: PX */
    private JSONObject f16279PX;

    /* renamed from: VB */
    private int f16280VB;

    /* renamed from: WR */
    private int f16281WR;

    /* renamed from: bX */
    private ImageView f16282bX;

    /* renamed from: bg */
    private TextView f16283bg;

    /* renamed from: eo */
    private int f16284eo;
    private C7739LZ eqN;

    /* renamed from: iR */
    private InterfaceC7505bg f16285iR;
    private TextView ldr;

    /* renamed from: zx */
    private TextView f16286zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.Fy$1 */
    /* loaded from: classes3.dex */
    class RunnableC75001 implements Runnable {
        RunnableC75001() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7499Fy.this.f16282bX != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new animationInterpolatorC7504IL(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        C7499Fy.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C7499Fy.this.f16282bX.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                C7499Fy.this.f16282bX.startAnimation(rotateAnimation);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.Fy$IL  reason: invalid class name */
    /* loaded from: classes3.dex */
    private static class animationInterpolatorC7504IL implements Interpolator {
        private animationInterpolatorC7504IL() {
        }

        /* synthetic */ animationInterpolatorC7504IL(RunnableC75001 runnableC75001) {
            this();
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f <= 0.25f) {
                return (f * (-2.0f)) + 0.5f;
            }
            if (f <= 0.5f) {
                return (f * 4.0f) - 1.0f;
            }
            if (f <= 0.75f) {
                return (f * (-4.0f)) + 3.0f;
            }
            return (f * 2.0f) - 1.5f;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.Fy$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7505bg {
    }

    public C7499Fy(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.f16281WR = i;
        this.f16284eo = i2;
        this.f16280VB = i3;
        this.f16279PX = jSONObject;
        mo88641bg(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.f16278Kg;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.eqN == null) {
                this.eqN = new C7739LZ(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ldr.Fy.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(InterfaceC7505bg interfaceC7505bg) {
        this.f16285iR = interfaceC7505bg;
    }

    public void setShakeText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f16286zx.setVisibility(8);
            this.ldr.setVisibility(8);
            return;
        }
        this.f16286zx.setText(str);
    }

    /* renamed from: bg */
    protected void mo88641bg(Context context, View view) {
        addView(view);
        this.f16278Kg = (LinearLayout) findViewById(2097610727);
        this.f16282bX = (ImageView) findViewById(2097610725);
        this.f16283bg = (TextView) findViewById(2097610724);
        this.f16277IL = (TextView) findViewById(2097610726);
        this.f16286zx = (TextView) findViewById(2097610723);
        this.ldr = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f16278Kg.setBackground(gradientDrawable);
    }

    /* renamed from: bg */
    public void m88654bg() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        postDelayed(new RunnableC75001(), 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}

package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.VB */
/* loaded from: classes3.dex */
public class C7521VB extends FrameLayout {

    /* renamed from: IL */
    private final ImageView f16355IL;

    /* renamed from: bX */
    private final C7514PX f16356bX;

    /* renamed from: bg */
    private final TextView f16357bg;
    private final RotateAnimation eqN;

    public C7521VB(@NonNull Context context) {
        super(context);
        addView(C7300bg.eqN(context));
        this.f16357bg = (TextView) findViewById(2097610742);
        this.f16355IL = (ImageView) findViewById(2097610745);
        this.f16356bX = (C7514PX) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 30.0f, 1, 0.65f, 1, 0.9f);
        this.eqN = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1
            @Override // java.lang.Runnable
            public void run() {
                C7521VB.this.f16355IL.startAnimation(C7521VB.this.eqN);
                C7521VB.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C7521VB.this.f16356bX.m88632bg(4);
                    }
                }, 100L);
                C7521VB.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ldr.VB.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C7521VB.this.f16356bX.m88632bg(4);
                    }
                }, 300L);
                C7521VB c7521vb = C7521VB.this;
                c7521vb.postDelayed(c7521vb.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.f16357bg;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: IL */
    public void m88622IL() {
        this.eqN.cancel();
    }

    /* renamed from: bg */
    public void m88619bg() {
        postDelayed(getHaloAnimation(), 300L);
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo */
/* loaded from: classes3.dex */
public class C7338eo extends AbstractC7341eqN {
    private C7340bg eqN;
    private float ldr;

    /* renamed from: zx */
    private float f15857zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo$bg */
    /* loaded from: classes3.dex */
    private class C7340bg {

        /* renamed from: IL */
        private View f15860IL;

        public C7340bg(View view) {
            this.f15860IL = view;
        }

        /* renamed from: bg */
        public void m89106bg(int i) {
            if (ViewHierarchyConstants.DIMENSION_TOP_KEY.equals(C7338eo.this.f15862IL.m88948bg())) {
                if (C7338eo.this.f15863bX instanceof ViewGroup) {
                    for (int i2 = 0; i2 < ((ViewGroup) C7338eo.this.f15863bX).getChildCount(); i2++) {
                        ((ViewGroup) C7338eo.this.f15863bX).getChildAt(i2).setTranslationY(i - C7338eo.this.f15857zx);
                    }
                }
                C7338eo c7338eo = C7338eo.this;
                c7338eo.f15863bX.setTranslationY(c7338eo.f15857zx - i);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f15860IL.getLayoutParams();
            layoutParams.height = i;
            this.f15860IL.setLayoutParams(layoutParams);
            this.f15860IL.requestLayout();
        }
    }

    public C7338eo(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        int i;
        String str;
        View view = this.f15863bX;
        if ((view instanceof ImageView) && (view.getParent() instanceof AbstractC7449zx)) {
            this.f15863bX = (View) this.f15863bX.getParent();
        }
        this.f15863bX.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "alpha", 0.0f, 1.0f).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        this.eqN = new C7340bg(this.f15863bX);
        final int i2 = this.f15863bX.getLayoutParams().height;
        this.f15857zx = i2;
        this.ldr = this.f15863bX.getLayoutParams().width;
        if ("left".equals(this.f15862IL.m88948bg()) || "right".equals(this.f15862IL.m88948bg())) {
            i = (int) this.ldr;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.eqN, str, 0, i).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m89104bg(duration));
        arrayList.add(m89104bg(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eo.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C7338eo.this.eqN.m89106bg(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}

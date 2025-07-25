package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.learnings.abcenter.util.AbCenterConstant;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx */
/* loaded from: classes3.dex */
public class C7350zx extends AbstractC7341eqN {
    public C7350zx(View view, C7460bg c7460bg) {
        super(view, c7460bg);
    }

    /* renamed from: IL */
    private void m89101IL(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationY", 0.0f, -C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.m88966Fy())).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C7350zx.this.f15863bX.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(m89104bg(duration));
    }

    /* renamed from: bX */
    private void m89100bX(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationY", 0.0f, -C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.m88966Fy())).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.zx.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C7350zx.this.f15863bX.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(m89104bg(duration));
    }

    private void eqN(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationY", 0.0f, -C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.m88966Fy())).setDuration((int) (this.f15862IL.m88943eo() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(m89104bg(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg.AbstractC7341eqN
    /* renamed from: bg */
    List<ObjectAnimator> mo89099bg() {
        char c;
        ArrayList arrayList = new ArrayList();
        String m88959LZ = this.f15862IL.m88959LZ();
        switch (m88959LZ.hashCode()) {
            case 3029889:
                if (m88959LZ.equals(AbCenterConstant.OP_TYPE_BOTH)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (m88959LZ.equals("none")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 483313230:
                if (m88959LZ.equals("forwards")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1356771568:
                if (m88959LZ.equals("backwards")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            m89098bg(arrayList);
        } else if (c == 1) {
            eqN(arrayList);
        } else if (c != 2) {
            m89100bX(arrayList);
        } else {
            m89101IL(arrayList);
        }
        return arrayList;
    }

    /* renamed from: bg */
    private void m89098bg(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f15863bX, "translationY", 0.0f, -C7489Kg.m88675bg(C7487eqN.m88683bg(), this.f15862IL.m88966Fy())).setDuration(((int) (this.f15862IL.m88943eo() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        C7460bg c7460bg = this.f15862IL;
        c7460bg.ldr(c7460bg.m88958Lq() * 2);
        list.add(m89104bg(duration));
    }
}

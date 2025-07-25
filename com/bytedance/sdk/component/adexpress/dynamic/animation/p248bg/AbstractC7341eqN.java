package com.bytedance.sdk.component.adexpress.dynamic.animation.p248bg;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7433ldr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7460bg;
import com.bytedance.sdk.component.adexpress.eqN.C7495eqN;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN */
/* loaded from: classes3.dex */
public abstract class AbstractC7341eqN implements ZQc {

    /* renamed from: IL */
    C7460bg f15862IL;

    /* renamed from: bX */
    public View f15863bX;
    private Set<ScheduledFuture<?>> eqN = new HashSet();

    /* renamed from: bg */
    public List<ObjectAnimator> f15864bg = mo89099bg();

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN$bg */
    /* loaded from: classes3.dex */
    public class RunnableC7344bg implements Runnable {

        /* renamed from: IL */
        ScheduledFuture<?> f15869IL;

        /* renamed from: bg */
        ObjectAnimator f15871bg;

        RunnableC7344bg(ObjectAnimator objectAnimator) {
            this.f15871bg = objectAnimator;
        }

        /* renamed from: bg */
        public void m89102bg(ScheduledFuture<?> scheduledFuture) {
            this.f15869IL = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7324bg.m89118bg().m89119bX() != null) {
                C7324bg.m89118bg().m89119bX().mo85787bX().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC7344bg.this.f15871bg.resume();
                    }
                });
                if (this.f15869IL != null) {
                    AbstractC7341eqN.this.eqN.remove(this.f15869IL);
                }
            }
        }
    }

    public AbstractC7341eqN(View view, C7460bg c7460bg) {
        this.f15863bX = view;
        this.f15862IL = c7460bg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ZQc
    /* renamed from: IL */
    public void mo89017IL() {
        List<ObjectAnimator> list = this.f15864bg;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        for (ScheduledFuture<?> scheduledFuture : this.eqN) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: bX */
    public void m89105bX() {
        List<ObjectAnimator> list = this.f15864bg;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f15862IL.xxp() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        RunnableC7344bg runnableC7344bg = new RunnableC7344bg(objectAnimator);
                        ScheduledFuture<?> m88664bg = C7495eqN.m88664bg(runnableC7344bg, (long) (AbstractC7341eqN.this.f15862IL.xxp() * 1000.0d), TimeUnit.MILLISECONDS);
                        runnableC7344bg.m89102bg(m88664bg);
                        AbstractC7341eqN.this.eqN.add(m88664bg);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    /* renamed from: bg */
    abstract List<ObjectAnimator> mo89099bg();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public ObjectAnimator m89104bg(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f15862IL.yDt() * 1000.0d));
        if (this.f15862IL.m88958Lq() > 0) {
            objectAnimator.setRepeatCount(this.f15862IL.m88958Lq() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f15862IL.m88940vb())) {
            if (!SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE.equals(this.f15862IL.m88940vb()) && !"alternate-reverse".equals(this.f15862IL.m88940vb())) {
                objectAnimator.setRepeatMode(1);
            } else {
                objectAnimator.setRepeatMode(2);
            }
        }
        if ("ease-in-out".equals(this.f15862IL.m88956Ta())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f15862IL.m88940vb())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f15862IL.m88940vb())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.bg.eqN.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    AbstractC7341eqN.this.f15863bX.setVisibility(0);
                    if (AbstractC7341eqN.this.f15863bX.getParent() instanceof C7433ldr) {
                        ((View) AbstractC7341eqN.this.f15863bX.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}

package com.fyber.inneractive.sdk.player.p376ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.fyber.inneractive.sdk.player.ui.q */
/* loaded from: classes4.dex */
public final class C15199q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC15210t f30083a;

    public C15199q(AbstractC15210t abstractC15210t) {
        this.f30083a = abstractC15210t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC15210t abstractC15210t = this.f30083a;
        ViewGroup viewGroup = abstractC15210t.f30130r;
        if (viewGroup != null && viewGroup.getParent() != null) {
            ((View) abstractC15210t.f30130r.getParent()).setOnTouchListener(null);
        }
    }
}

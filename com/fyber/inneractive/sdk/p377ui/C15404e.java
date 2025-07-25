package com.fyber.inneractive.sdk.p377ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.fyber.inneractive.sdk.ui.e */
/* loaded from: classes4.dex */
public final class C15404e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f30544a;

    public C15404e(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f30544a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f30544a;
        fyberAdIdentifierLocal.f30518p = null;
        fyberAdIdentifierLocal.f30517o = !fyberAdIdentifierLocal.f30517o;
    }
}

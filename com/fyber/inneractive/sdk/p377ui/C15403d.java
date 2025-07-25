package com.fyber.inneractive.sdk.p377ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.C14169R;

/* renamed from: com.fyber.inneractive.sdk.ui.d */
/* loaded from: classes4.dex */
public final class C15403d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AnimatorSet f30542a;

    /* renamed from: b */
    public final /* synthetic */ FyberAdIdentifierLocal f30543b;

    public C15403d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f30543b = fyberAdIdentifierLocal;
        this.f30542a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f30543b;
        if (fyberAdIdentifierLocal.f30517o) {
            fyberAdIdentifierLocal.f30515m.setImageResource(C14169R.C14171drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f30543b;
            FyberAdIdentifierLocal.m76544a(fyberAdIdentifierLocal2.f30515m, fyberAdIdentifierLocal2.f30533g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f30520r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f30515m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f30515m.setImageResource(C14169R.C14171drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.m76544a(this.f30543b.f30515m, null);
        }
        this.f30542a.start();
        this.f30543b.f30518p = this.f30542a;
    }
}

package com.explorestack.iab.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.explorestack.iab.utils.n */
/* loaded from: classes3.dex */
public abstract class AbstractC10527n<T extends View> {
    @Nullable

    /* renamed from: a */
    private final View.OnClickListener f24083a;
    @Nullable

    /* renamed from: b */
    protected T f24084b;
    @Nullable

    /* renamed from: c */
    protected C10507d f24085c;

    /* renamed from: d */
    private boolean f24086d = false;

    /* renamed from: e */
    private final Runnable f24087e = new RunnableC10528a();

    /* renamed from: f */
    private final Animator.AnimatorListener f24088f = new C10529b();

    /* renamed from: com.explorestack.iab.utils.n$a */
    /* loaded from: classes3.dex */
    class RunnableC10528a implements Runnable {
        RunnableC10528a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC10527n.this.f24086d = false;
            AbstractC10527n abstractC10527n = AbstractC10527n.this;
            T t = abstractC10527n.f24084b;
            if (t != null && abstractC10527n.f24085c != null) {
                t.animate().alpha(0.0f).setDuration(400L).setListener(AbstractC10527n.this.f24088f).withLayer();
            }
        }
    }

    /* renamed from: com.explorestack.iab.utils.n$b */
    /* loaded from: classes3.dex */
    class C10529b extends AnimatorListenerAdapter {
        C10529b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            animator.removeAllListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            super.onAnimationEnd(animator);
            T t = AbstractC10527n.this.f24084b;
            if (t != null) {
                if (t.getAlpha() != 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                t.setClickable(z);
            }
        }
    }

    public AbstractC10527n(@Nullable View.OnClickListener onClickListener) {
        this.f24083a = onClickListener;
    }

    /* renamed from: b */
    protected ViewGroup.MarginLayoutParams m79232b(@NonNull Context context, @NonNull C10507d c10507d) {
        return new ViewGroup.MarginLayoutParams(c10507d.m79352z(context).intValue(), c10507d.m79368j(context).intValue());
    }

    /* renamed from: c */
    public void m79231c() {
        T t = this.f24084b;
        if (t != null) {
            t.bringToFront();
        }
    }

    /* renamed from: d */
    public void m79230d(int i) {
        T t = this.f24084b;
        if (t != null) {
            t.setVisibility(i);
        }
    }

    /* renamed from: f */
    public void m79229f(@NonNull Context context, @NonNull ViewGroup viewGroup, @Nullable C10507d c10507d) {
        RelativeLayout.LayoutParams layoutParams;
        C10507d c10507d2;
        C10507d m79373e = mo79212l(context, c10507d).m79373e(c10507d);
        if (!m79373e.m79399D().booleanValue()) {
            m79224m();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m79232b(context, m79373e));
            m79373e.m79377a(layoutParams2);
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m79232b(context, m79373e));
            m79373e.m79374d(layoutParams3);
            layoutParams = layoutParams3;
        } else {
            throw new IllegalArgumentException("Parent should be instance of FrameLayout or RelativeLayout");
        }
        m79373e.m79376b(context, layoutParams);
        T t = this.f24084b;
        if (t != null && (c10507d2 = this.f24085c) != null && !m79227h(t, c10507d2, m79373e)) {
            this.f24084b.setLayoutParams(layoutParams);
            this.f24084b.setVisibility(0);
        } else {
            C10512g.m79321L(this.f24084b);
            T mo79213j = mo79213j(context, m79373e);
            this.f24084b = mo79213j;
            viewGroup.addView(mo79213j, layoutParams);
        }
        this.f24084b.setAlpha(m79373e.m79361q().floatValue());
        m79373e.m79375c(context, this.f24084b);
        this.f24084b.setOnClickListener(this.f24083a);
        this.f24085c = m79373e;
        m79228g(this.f24084b, m79373e);
        mo79214e(context, this.f24084b, m79373e);
    }

    /* renamed from: g */
    protected void m79228g(@NonNull T t, @NonNull C10507d c10507d) {
        if (t instanceof InterfaceC10506c) {
            ((InterfaceC10506c) t).setStyle(c10507d);
        }
    }

    /* renamed from: h */
    protected boolean m79227h(@NonNull T t, @NonNull C10507d c10507d, @NonNull C10507d c10507d2) {
        return !TextUtils.equals(c10507d.m79354x(), c10507d2.m79354x());
    }

    @NonNull
    /* renamed from: j */
    abstract T mo79213j(@NonNull Context context, @NonNull C10507d c10507d);

    /* renamed from: k */
    public void m79225k() {
        this.f24086d = false;
        T t = this.f24084b;
        if (t != null && this.f24085c != null) {
            t.animate().cancel();
            this.f24084b.removeCallbacks(this.f24087e);
            this.f24084b.setClickable(true);
            this.f24084b.setAlpha(this.f24085c.m79361q().floatValue());
        }
    }

    @NonNull
    /* renamed from: l */
    protected abstract C10507d mo79212l(@NonNull Context context, @Nullable C10507d c10507d);

    /* renamed from: m */
    public void m79224m() {
        if (this.f24084b != null) {
            m79225k();
            C10512g.m79321L(this.f24084b);
            this.f24084b = null;
            this.f24085c = null;
        }
    }

    /* renamed from: n */
    public void m79223n() {
        if (m79222o()) {
            mo79214e(this.f24084b.getContext(), this.f24084b, this.f24085c);
        }
    }

    /* renamed from: o */
    public boolean m79222o() {
        if (this.f24084b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void m79221p() {
        C10507d c10507d;
        Float m79367k;
        if (!this.f24086d && this.f24084b != null && (c10507d = this.f24085c) != null && (m79367k = c10507d.m79367k()) != null && m79367k.floatValue() != 0.0f) {
            this.f24086d = true;
            this.f24084b.postDelayed(this.f24087e, m79367k.floatValue() * 1000.0f);
        }
    }

    /* renamed from: q */
    public void m79220q() {
        if (this.f24084b != null && this.f24085c != null) {
            m79225k();
            m79221p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo79214e(@NonNull Context context, @NonNull T t, @NonNull C10507d c10507d) {
    }
}

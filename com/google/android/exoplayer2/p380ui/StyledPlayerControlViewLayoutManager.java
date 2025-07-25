package com.google.android.exoplayer2.p380ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager */
/* loaded from: classes4.dex */
public final class StyledPlayerControlViewLayoutManager {

    /* renamed from: A */
    private boolean f35536A;

    /* renamed from: B */
    private boolean f35537B;

    /* renamed from: a */
    private final StyledPlayerControlView f35539a;
    @Nullable

    /* renamed from: b */
    private final View f35540b;
    @Nullable

    /* renamed from: c */
    private final ViewGroup f35541c;
    @Nullable

    /* renamed from: d */
    private final ViewGroup f35542d;
    @Nullable

    /* renamed from: e */
    private final ViewGroup f35543e;
    @Nullable

    /* renamed from: f */
    private final ViewGroup f35544f;
    @Nullable

    /* renamed from: g */
    private final ViewGroup f35545g;
    @Nullable

    /* renamed from: h */
    private final ViewGroup f35546h;
    @Nullable

    /* renamed from: i */
    private final ViewGroup f35547i;
    @Nullable

    /* renamed from: j */
    private final View f35548j;
    @Nullable

    /* renamed from: k */
    private final View f35549k;

    /* renamed from: l */
    private final AnimatorSet f35550l;

    /* renamed from: m */
    private final AnimatorSet f35551m;

    /* renamed from: n */
    private final AnimatorSet f35552n;

    /* renamed from: o */
    private final AnimatorSet f35553o;

    /* renamed from: p */
    private final AnimatorSet f35554p;

    /* renamed from: q */
    private final ValueAnimator f35555q;

    /* renamed from: r */
    private final ValueAnimator f35556r;

    /* renamed from: s */
    private final Runnable f35557s = new Runnable() { // from class: com.google.android.exoplayer2.ui.p
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StyledPlayerControlViewLayoutManager.this.m72917Q();
        }
    };

    /* renamed from: t */
    private final Runnable f35558t = new Runnable() { // from class: com.google.android.exoplayer2.ui.w
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StyledPlayerControlViewLayoutManager.this.m72932B();
        }
    };

    /* renamed from: u */
    private final Runnable f35559u = new Runnable() { // from class: com.google.android.exoplayer2.ui.x
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StyledPlayerControlViewLayoutManager.this.m72929E();
        }
    };

    /* renamed from: v */
    private final Runnable f35560v = new Runnable() { // from class: com.google.android.exoplayer2.ui.y
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StyledPlayerControlViewLayoutManager.this.m72930D();
        }
    };

    /* renamed from: w */
    private final Runnable f35561w = new Runnable() { // from class: com.google.android.exoplayer2.ui.z
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StyledPlayerControlViewLayoutManager.this.m72931C();
        }
    };

    /* renamed from: x */
    private final View.OnLayoutChangeListener f35562x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.a0
        {
            StyledPlayerControlViewLayoutManager.this = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerControlViewLayoutManager.this.m72923K(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };

    /* renamed from: C */
    private boolean f35538C = true;

    /* renamed from: z */
    private int f35564z = 0;

    /* renamed from: y */
    private final List<View> f35563y = new ArrayList();

    public StyledPlayerControlViewLayoutManager(final StyledPlayerControlView styledPlayerControlView) {
        this.f35539a = styledPlayerControlView;
        this.f35540b = styledPlayerControlView.findViewById(C16096R.C16101id.exo_controls_background);
        this.f35541c = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_center_controls);
        this.f35543e = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_bottom_bar);
        this.f35542d = viewGroup;
        this.f35547i = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_time);
        View findViewById = styledPlayerControlView.findViewById(C16096R.C16101id.exo_progress);
        this.f35548j = findViewById;
        this.f35544f = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_basic_controls);
        this.f35545g = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_extra_controls);
        this.f35546h = (ViewGroup) styledPlayerControlView.findViewById(C16096R.C16101id.exo_extra_controls_scroll_view);
        View findViewById2 = styledPlayerControlView.findViewById(C16096R.C16101id.exo_overflow_show);
        this.f35549k = findViewById2;
        View findViewById3 = styledPlayerControlView.findViewById(C16096R.C16101id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.b0
                {
                    StyledPlayerControlViewLayoutManager.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlViewLayoutManager.this.m72921M(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.b0
                {
                    StyledPlayerControlViewLayoutManager.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlViewLayoutManager.this.m72921M(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.c0
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StyledPlayerControlViewLayoutManager.this.m72928F(valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.1
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.f35540b != null) {
                    StyledPlayerControlViewLayoutManager.this.f35540b.setVisibility(4);
                }
                if (StyledPlayerControlViewLayoutManager.this.f35541c != null) {
                    StyledPlayerControlViewLayoutManager.this.f35541c.setVisibility(4);
                }
                if (StyledPlayerControlViewLayoutManager.this.f35543e != null) {
                    StyledPlayerControlViewLayoutManager.this.f35543e.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if ((StyledPlayerControlViewLayoutManager.this.f35548j instanceof DefaultTimeBar) && !StyledPlayerControlViewLayoutManager.this.f35536A) {
                    ((DefaultTimeBar) StyledPlayerControlViewLayoutManager.this.f35548j).hideScrubber(250L);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.q
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StyledPlayerControlViewLayoutManager.this.m72927G(valueAnimator);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.2
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                int i = 0;
                if (StyledPlayerControlViewLayoutManager.this.f35540b != null) {
                    StyledPlayerControlViewLayoutManager.this.f35540b.setVisibility(0);
                }
                if (StyledPlayerControlViewLayoutManager.this.f35541c != null) {
                    StyledPlayerControlViewLayoutManager.this.f35541c.setVisibility(0);
                }
                if (StyledPlayerControlViewLayoutManager.this.f35543e != null) {
                    ViewGroup viewGroup2 = StyledPlayerControlViewLayoutManager.this.f35543e;
                    if (!StyledPlayerControlViewLayoutManager.this.f35536A) {
                        i = 4;
                    }
                    viewGroup2.setVisibility(i);
                }
                if ((StyledPlayerControlViewLayoutManager.this.f35548j instanceof DefaultTimeBar) && !StyledPlayerControlViewLayoutManager.this.f35536A) {
                    ((DefaultTimeBar) StyledPlayerControlViewLayoutManager.this.f35548j).showScrubber(250L);
                }
            }
        });
        Resources resources = styledPlayerControlView.getResources();
        int i = C16096R.dimen.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i) - resources.getDimension(C16096R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35550l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.3
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(1);
                if (StyledPlayerControlViewLayoutManager.this.f35537B) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.f35557s);
                    StyledPlayerControlViewLayoutManager.this.f35537B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(3);
            }
        });
        animatorSet.play(ofFloat).with(m72924J(0.0f, dimension, findViewById)).with(m72924J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f35551m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.4
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(2);
                if (StyledPlayerControlViewLayoutManager.this.f35537B) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.f35557s);
                    StyledPlayerControlViewLayoutManager.this.f35537B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(3);
            }
        });
        animatorSet2.play(m72924J(dimension, dimension2, findViewById)).with(m72924J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f35552n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.5
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(2);
                if (StyledPlayerControlViewLayoutManager.this.f35537B) {
                    styledPlayerControlView.post(StyledPlayerControlViewLayoutManager.this.f35557s);
                    StyledPlayerControlViewLayoutManager.this.f35537B = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(3);
            }
        });
        animatorSet3.play(ofFloat).with(m72924J(0.0f, dimension2, findViewById)).with(m72924J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f35553o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.6
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(4);
            }
        });
        animatorSet4.play(ofFloat2).with(m72924J(dimension, 0.0f, findViewById)).with(m72924J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f35554p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.7
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                StyledPlayerControlViewLayoutManager.this.m72919O(4);
            }
        });
        animatorSet5.play(ofFloat2).with(m72924J(dimension2, 0.0f, findViewById)).with(m72924J(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35555q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.u
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StyledPlayerControlViewLayoutManager.this.m72926H(valueAnimator);
            }
        });
        ofFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.8
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.f35544f != null) {
                    StyledPlayerControlViewLayoutManager.this.f35544f.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.f35546h != null) {
                    StyledPlayerControlViewLayoutManager.this.f35546h.setVisibility(0);
                    StyledPlayerControlViewLayoutManager.this.f35546h.setTranslationX(StyledPlayerControlViewLayoutManager.this.f35546h.getWidth());
                    StyledPlayerControlViewLayoutManager.this.f35546h.scrollTo(StyledPlayerControlViewLayoutManager.this.f35546h.getWidth(), 0);
                }
            }
        });
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f35556r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.v
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StyledPlayerControlViewLayoutManager.this.m72925I(valueAnimator);
            }
        });
        ofFloat4.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.exoplayer2.ui.StyledPlayerControlViewLayoutManager.9
            {
                StyledPlayerControlViewLayoutManager.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.f35546h != null) {
                    StyledPlayerControlViewLayoutManager.this.f35546h.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (StyledPlayerControlViewLayoutManager.this.f35544f != null) {
                    StyledPlayerControlViewLayoutManager.this.f35544f.setVisibility(0);
                }
            }
        });
    }

    /* renamed from: A */
    private static int m72933A(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    /* renamed from: B */
    public void m72932B() {
        this.f35552n.start();
    }

    /* renamed from: C */
    public void m72931C() {
        m72919O(2);
    }

    /* renamed from: D */
    public void m72930D() {
        this.f35550l.start();
        m72920N(this.f35559u, 2000L);
    }

    /* renamed from: E */
    public void m72929E() {
        this.f35551m.start();
    }

    /* renamed from: F */
    public /* synthetic */ void m72928F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f35540b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f35541c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f35543e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* renamed from: G */
    public /* synthetic */ void m72927G(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f35540b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f35541c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f35543e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m72926H(ValueAnimator valueAnimator) {
        m72890y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: I */
    public /* synthetic */ void m72925I(ValueAnimator valueAnimator) {
        m72890y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: J */
    private static ObjectAnimator m72924J(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* renamed from: K */
    public void m72923K(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean m72915S = m72915S();
        if (this.f35536A != m72915S) {
            this.f35536A = m72915S;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.s
                {
                    StyledPlayerControlViewLayoutManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StyledPlayerControlViewLayoutManager.this.m72916R();
                }
            });
        }
        if (i3 - i != i7 - i5) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f35536A && z) {
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.t
                {
                    StyledPlayerControlViewLayoutManager.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StyledPlayerControlViewLayoutManager.this.m72922L();
                }
            });
        }
    }

    /* renamed from: L */
    public void m72922L() {
        int i;
        if (this.f35544f != null && this.f35545g != null) {
            int width = (this.f35539a.getWidth() - this.f35539a.getPaddingLeft()) - this.f35539a.getPaddingRight();
            while (true) {
                if (this.f35545g.getChildCount() <= 1) {
                    break;
                }
                int childCount = this.f35545g.getChildCount() - 2;
                View childAt = this.f35545g.getChildAt(childCount);
                this.f35545g.removeViewAt(childCount);
                this.f35544f.addView(childAt, 0);
            }
            View view = this.f35549k;
            if (view != null) {
                view.setVisibility(8);
            }
            int m72933A = m72933A(this.f35547i);
            int childCount2 = this.f35544f.getChildCount() - 1;
            for (int i2 = 0; i2 < childCount2; i2++) {
                m72933A += m72933A(this.f35544f.getChildAt(i2));
            }
            if (m72933A > width) {
                View view2 = this.f35549k;
                if (view2 != null) {
                    view2.setVisibility(0);
                    m72933A += m72933A(this.f35549k);
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = this.f35544f.getChildAt(i3);
                    m72933A -= m72933A(childAt2);
                    arrayList.add(childAt2);
                    if (m72933A <= width) {
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f35544f.removeViews(0, arrayList.size());
                    for (i = 0; i < arrayList.size(); i++) {
                        this.f35545g.addView((View) arrayList.get(i), this.f35545g.getChildCount() - 1);
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.f35546h;
            if (viewGroup != null && viewGroup.getVisibility() == 0 && !this.f35556r.isStarted()) {
                this.f35555q.cancel();
                this.f35556r.start();
            }
        }
    }

    /* renamed from: M */
    public void m72921M(View view) {
        resetHideCallbacks();
        if (view.getId() == C16096R.C16101id.exo_overflow_show) {
            this.f35555q.start();
        } else if (view.getId() == C16096R.C16101id.exo_overflow_hide) {
            this.f35556r.start();
        }
    }

    /* renamed from: N */
    private void m72920N(Runnable runnable, long j) {
        if (j >= 0) {
            this.f35539a.postDelayed(runnable, j);
        }
    }

    /* renamed from: O */
    public void m72919O(int i) {
        int i2 = this.f35564z;
        this.f35564z = i;
        if (i == 2) {
            this.f35539a.setVisibility(8);
        } else if (i2 == 2) {
            this.f35539a.setVisibility(0);
        }
        if (i2 != i) {
            this.f35539a.m72989c0();
        }
    }

    /* renamed from: P */
    private boolean m72918P(View view) {
        int id2 = view.getId();
        if (id2 != C16096R.C16101id.exo_bottom_bar && id2 != C16096R.C16101id.exo_prev && id2 != C16096R.C16101id.exo_next && id2 != C16096R.C16101id.exo_rew && id2 != C16096R.C16101id.exo_rew_with_amount && id2 != C16096R.C16101id.exo_ffwd && id2 != C16096R.C16101id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public void m72917Q() {
        if (!this.f35538C) {
            m72919O(0);
            resetHideCallbacks();
            return;
        }
        int i = this.f35564z;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    }
                } else {
                    this.f35537B = true;
                }
            } else {
                this.f35554p.start();
            }
        } else {
            this.f35553o.start();
        }
        resetHideCallbacks();
    }

    /* renamed from: R */
    public void m72916R() {
        int i;
        int i2;
        ViewGroup viewGroup = this.f35543e;
        if (viewGroup != null) {
            if (this.f35536A) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            viewGroup.setVisibility(i2);
        }
        if (this.f35548j != null) {
            int dimensionPixelSize = this.f35539a.getResources().getDimensionPixelSize(C16096R.dimen.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f35548j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f35536A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f35548j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f35548j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f35536A) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i3 = this.f35564z;
                    if (i3 == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i3 != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (View view2 : this.f35563y) {
            if (this.f35536A && m72918P(view2)) {
                i = 4;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: S */
    private boolean m72915S() {
        int i;
        int i2;
        int width = (this.f35539a.getWidth() - this.f35539a.getPaddingLeft()) - this.f35539a.getPaddingRight();
        int height = (this.f35539a.getHeight() - this.f35539a.getPaddingBottom()) - this.f35539a.getPaddingTop();
        int m72933A = m72933A(this.f35541c);
        ViewGroup viewGroup = this.f35541c;
        if (viewGroup != null) {
            i = viewGroup.getPaddingLeft() + this.f35541c.getPaddingRight();
        } else {
            i = 0;
        }
        int i3 = m72933A - i;
        int m72889z = m72889z(this.f35541c);
        ViewGroup viewGroup2 = this.f35541c;
        if (viewGroup2 != null) {
            i2 = viewGroup2.getPaddingTop() + this.f35541c.getPaddingBottom();
        } else {
            i2 = 0;
        }
        int max = Math.max(i3, m72933A(this.f35547i) + m72933A(this.f35549k));
        int m72889z2 = (m72889z - i2) + (m72889z(this.f35542d) * 2);
        if (width > max && height > m72889z2) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private void m72890y(float f) {
        ViewGroup viewGroup = this.f35546h;
        if (viewGroup != null) {
            this.f35546h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup2 = this.f35547i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f35544f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* renamed from: z */
    private static int m72889z(@Nullable View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height;
    }

    public boolean getShowButton(@Nullable View view) {
        if (view != null && this.f35563y.contains(view)) {
            return true;
        }
        return false;
    }

    public void hide() {
        int i = this.f35564z;
        if (i != 3 && i != 2) {
            removeHideCallbacks();
            if (!this.f35538C) {
                m72931C();
            } else if (this.f35564z == 1) {
                m72929E();
            } else {
                m72932B();
            }
        }
    }

    public void hideImmediately() {
        int i = this.f35564z;
        if (i != 3 && i != 2) {
            removeHideCallbacks();
            m72931C();
        }
    }

    public boolean isAnimationEnabled() {
        return this.f35538C;
    }

    public boolean isFullyVisible() {
        if (this.f35564z == 0 && this.f35539a.isVisible()) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        this.f35539a.addOnLayoutChangeListener(this.f35562x);
    }

    public void onDetachedFromWindow() {
        this.f35539a.removeOnLayoutChangeListener(this.f35562x);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f35540b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void removeHideCallbacks() {
        this.f35539a.removeCallbacks(this.f35561w);
        this.f35539a.removeCallbacks(this.f35558t);
        this.f35539a.removeCallbacks(this.f35560v);
        this.f35539a.removeCallbacks(this.f35559u);
    }

    public void resetHideCallbacks() {
        if (this.f35564z == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.f35539a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f35538C) {
                m72920N(this.f35561w, showTimeoutMs);
            } else if (this.f35564z == 1) {
                m72920N(this.f35559u, 2000L);
            } else {
                m72920N(this.f35560v, showTimeoutMs);
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f35538C = z;
    }

    public void setShowButton(@Nullable View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.f35563y.remove(view);
            return;
        }
        if (this.f35536A && m72918P(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f35563y.add(view);
    }

    public void show() {
        if (!this.f35539a.isVisible()) {
            this.f35539a.setVisibility(0);
            this.f35539a.m72973k0();
            this.f35539a.m72981g0();
        }
        m72917Q();
    }
}

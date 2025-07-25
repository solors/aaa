package com.explorestack.iab.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10524k;
import com.explorestack.iab.utils.C10525l;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.explorestack.iab.view.a */
/* loaded from: classes3.dex */
public class C10593a extends FrameLayout {
    @NonNull

    /* renamed from: b */
    private final C10596c f24315b;
    @Nullable

    /* renamed from: c */
    private C10524k f24316c;
    @Nullable

    /* renamed from: d */
    private C10525l f24317d;
    @Nullable

    /* renamed from: f */
    private RunnableC10595b f24318f;
    @Nullable

    /* renamed from: g */
    private InterfaceC10597d f24319g;
    @Nullable

    /* renamed from: h */
    private C10507d f24320h;
    @Nullable

    /* renamed from: i */
    private C10507d f24321i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.view.a$a */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC10594a implements View.OnClickListener {
        View$OnClickListenerC10594a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C10593a.this.f24319g != null) {
                C10593a.this.f24319g.onCloseClick();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.explorestack.iab.view.a$b */
    /* loaded from: classes3.dex */
    public class RunnableC10595b implements Runnable {
        private RunnableC10595b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C10593a.this.f24317d != null) {
                long j = C10593a.this.f24315b.f24327d;
                if (C10593a.this.isShown()) {
                    j += 50;
                    C10593a.this.f24315b.m78948a(j);
                    C10593a.this.f24317d.m79236r((int) ((100 * j) / C10593a.this.f24315b.f24326c), (int) Math.ceil((C10593a.this.f24315b.f24326c - j) / 1000.0d));
                }
                if (j >= C10593a.this.f24315b.f24326c) {
                    C10593a.this.m78950f();
                    if (C10593a.this.f24315b.f24325b > 0.0f && C10593a.this.f24319g != null) {
                        C10593a.this.f24319g.onCountDownFinish();
                        return;
                    }
                    return;
                }
                C10593a.this.postDelayed(this, 50L);
            }
        }

        /* synthetic */ RunnableC10595b(C10593a c10593a, View$OnClickListenerC10594a view$OnClickListenerC10594a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.explorestack.iab.view.a$c */
    /* loaded from: classes3.dex */
    public static class C10596c {

        /* renamed from: a */
        private boolean f24324a;

        /* renamed from: b */
        private float f24325b;

        /* renamed from: c */
        private long f24326c;

        /* renamed from: d */
        private long f24327d;

        /* renamed from: e */
        private long f24328e;

        /* renamed from: f */
        private long f24329f;

        private C10596c() {
            this.f24324a = false;
            this.f24325b = 0.0f;
            this.f24326c = 0L;
            this.f24327d = 0L;
            this.f24328e = 0L;
            this.f24329f = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m78946c(boolean z) {
            if (this.f24328e > 0) {
                this.f24329f += System.currentTimeMillis() - this.f24328e;
            }
            if (z) {
                this.f24328e = System.currentTimeMillis();
            } else {
                this.f24328e = 0L;
            }
        }

        /* renamed from: a */
        public void m78948a(long j) {
            this.f24327d = j;
        }

        /* renamed from: d */
        public void m78945d(boolean z, float f) {
            this.f24324a = z;
            this.f24325b = f;
            this.f24326c = f * 1000.0f;
            this.f24327d = 0L;
        }

        /* renamed from: e */
        public boolean m78944e() {
            long j = this.f24326c;
            if (j != 0 && this.f24327d < j) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public long m78941h() {
            long j = this.f24329f;
            if (this.f24328e > 0) {
                return System.currentTimeMillis() - this.f24328e;
            }
            return j;
        }

        /* renamed from: j */
        public boolean m78939j() {
            long j = this.f24326c;
            if (j != 0 && this.f24327d < j) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public boolean m78937l() {
            return this.f24324a;
        }

        /* synthetic */ C10596c(View$OnClickListenerC10594a view$OnClickListenerC10594a) {
            this();
        }
    }

    /* renamed from: com.explorestack.iab.view.a$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10597d {
        void onCloseClick();

        void onCountDownFinish();
    }

    public C10593a(@NonNull Context context) {
        super(context);
        this.f24315b = new C10596c(null);
    }

    /* renamed from: a */
    private void m78955a() {
        if (!isShown()) {
            return;
        }
        m78952d();
        RunnableC10595b runnableC10595b = new RunnableC10595b(this, null);
        this.f24318f = runnableC10595b;
        postDelayed(runnableC10595b, 50L);
    }

    /* renamed from: d */
    private void m78952d() {
        RunnableC10595b runnableC10595b = this.f24318f;
        if (runnableC10595b != null) {
            removeCallbacks(runnableC10595b);
            this.f24318f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m78950f() {
        if (this.f24315b.m78939j()) {
            C10524k c10524k = this.f24316c;
            if (c10524k != null) {
                c10524k.m79224m();
            }
            if (this.f24317d == null) {
                this.f24317d = new C10525l(null);
            }
            this.f24317d.m79229f(getContext(), this, this.f24321i);
            m78955a();
            return;
        }
        m78952d();
        if (this.f24316c == null) {
            this.f24316c = new C10524k(new View$OnClickListenerC10594a());
        }
        this.f24316c.m79229f(getContext(), this, this.f24320h);
        C10525l c10525l = this.f24317d;
        if (c10525l != null) {
            c10525l.m79224m();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C10524k c10524k = this.f24316c;
        if (c10524k != null) {
            c10524k.m79231c();
        }
        C10525l c10525l = this.f24317d;
        if (c10525l != null) {
            c10525l.m79231c();
        }
    }

    public boolean canBeClosed() {
        return this.f24315b.m78944e();
    }

    public long getOnScreenTimeMs() {
        return this.f24315b.m78941h();
    }

    public boolean isVisible() {
        return this.f24315b.m78937l();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            m78952d();
        } else if (this.f24315b.m78939j() && this.f24315b.m78937l()) {
            m78955a();
        }
        C10596c c10596c = this.f24315b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        c10596c.m78946c(z);
    }

    public void setCloseClickListener(@Nullable InterfaceC10597d interfaceC10597d) {
        this.f24319g = interfaceC10597d;
    }

    public void setCloseStyle(@Nullable C10507d c10507d) {
        this.f24320h = c10507d;
        C10524k c10524k = this.f24316c;
        if (c10524k != null && c10524k.m79222o()) {
            this.f24316c.m79229f(getContext(), this, c10507d);
        }
    }

    public void setCloseVisibility(boolean z, float f) {
        if (this.f24315b.f24324a == z && this.f24315b.f24325b == f) {
            return;
        }
        this.f24315b.m78945d(z, f);
        if (!z) {
            C10524k c10524k = this.f24316c;
            if (c10524k != null) {
                c10524k.m79224m();
            }
            C10525l c10525l = this.f24317d;
            if (c10525l != null) {
                c10525l.m79224m();
            }
            m78952d();
            return;
        }
        m78950f();
    }

    public void setCountDownStyle(@Nullable C10507d c10507d) {
        this.f24321i = c10507d;
        C10525l c10525l = this.f24317d;
        if (c10525l != null && c10525l.m79222o()) {
            this.f24317d.m79229f(getContext(), this, c10507d);
        }
    }
}

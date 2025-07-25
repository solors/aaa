package com.explorestack.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* renamed from: com.explorestack.iab.utils.s */
/* loaded from: classes3.dex */
public class C10534s {
    @NonNull

    /* renamed from: a */
    private final View f24092a;
    @NonNull

    /* renamed from: b */
    private final InterfaceC10537c f24093b;

    /* renamed from: c */
    private boolean f24094c = false;

    /* renamed from: d */
    private float f24095d = 0.0f;

    /* renamed from: e */
    private long f24096e = 0;

    /* renamed from: f */
    private long f24097f = 0;

    /* renamed from: g */
    private final ViewTreeObserver.OnGlobalLayoutListener f24098g;

    /* renamed from: h */
    private final Runnable f24099h;

    /* renamed from: com.explorestack.iab.utils.s$a */
    /* loaded from: classes3.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC10535a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC10535a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C10534s.this.m79201i();
        }
    }

    /* renamed from: com.explorestack.iab.utils.s$b */
    /* loaded from: classes3.dex */
    class RunnableC10536b implements Runnable {
        RunnableC10536b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = C10534s.this.f24097f;
            if (C10534s.this.f24092a.isShown()) {
                j = Math.min(C10534s.this.f24096e, j + 16);
                C10534s.this.m79207c(j);
                C10534s.this.f24093b.mo79195a((((float) C10534s.this.f24097f) * 100.0f) / ((float) C10534s.this.f24096e), C10534s.this.f24097f, C10534s.this.f24096e);
            }
            if (j >= C10534s.this.f24096e) {
                C10534s.this.f24093b.mo79196a();
            } else {
                C10534s.this.f24092a.postDelayed(this, 16L);
            }
        }
    }

    /* renamed from: com.explorestack.iab.utils.s$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC10537c {
        /* renamed from: a */
        void mo79196a();

        /* renamed from: a */
        void mo79195a(float f, long j, long j2);
    }

    public C10534s(@NonNull View view, @NonNull InterfaceC10537c interfaceC10537c) {
        ViewTreeObserver$OnGlobalLayoutListenerC10535a viewTreeObserver$OnGlobalLayoutListenerC10535a = new ViewTreeObserver$OnGlobalLayoutListenerC10535a();
        this.f24098g = viewTreeObserver$OnGlobalLayoutListenerC10535a;
        this.f24099h = new RunnableC10536b();
        this.f24092a = view;
        this.f24093b = interfaceC10537c;
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC10535a);
        m79201i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m79207c(long j) {
        this.f24097f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m79201i() {
        boolean isShown = this.f24092a.isShown();
        if (this.f24094c == isShown) {
            return;
        }
        this.f24094c = isShown;
        if (!isShown) {
            m79197m();
        } else if (m79203g()) {
            m79199k();
        }
    }

    /* renamed from: a */
    public void m79209a() {
        m79197m();
        this.f24092a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f24098g);
    }

    /* renamed from: b */
    public void m79208b(float f) {
        if (this.f24095d == f) {
            return;
        }
        this.f24095d = f;
        this.f24096e = f * 1000.0f;
        m79199k();
    }

    /* renamed from: g */
    public boolean m79203g() {
        long j = this.f24096e;
        if (j != 0 && this.f24097f < j) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m79199k() {
        if (this.f24092a.isShown() && this.f24096e != 0) {
            this.f24092a.postDelayed(this.f24099h, 16L);
        }
    }

    /* renamed from: m */
    public void m79197m() {
        this.f24092a.removeCallbacks(this.f24099h);
    }
}

package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.hl */
/* loaded from: classes2.dex */
public class C4531hl {

    /* renamed from: a */
    private final WeakHashMap f6661a = new WeakHashMap();

    /* renamed from: b */
    private final Object f6662b = new Object();

    /* renamed from: c */
    private final Handler f6663c = new Handler();

    /* renamed from: d */
    private boolean f6664d = false;

    /* renamed from: e */
    private final WeakReference f6665e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f6666f;

    /* renamed from: g */
    private InterfaceC4532a f6667g;

    /* renamed from: com.applovin.impl.hl$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4532a {
        /* renamed from: a */
        void mo92236a(int i, int i2);
    }

    public C4531hl(View view) {
        this.f6665e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.ux
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean m98664b;
                    m98664b = C4531hl.this.m98664b();
                    return m98664b;
                }
            };
            this.f6666f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f6666f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m98661c() {
        synchronized (this.f6662b) {
            this.f6664d = false;
            int i = -1;
            int i2 = -1;
            for (Map.Entry entry : this.f6661a.entrySet()) {
                if (m98668a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i == -1 && i2 == -1) {
                        i = num.intValue();
                        i2 = num.intValue();
                    } else {
                        i = Math.min(i, ((Integer) entry.getValue()).intValue());
                        i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            InterfaceC4532a interfaceC4532a = this.f6667g;
            if (interfaceC4532a != null) {
                interfaceC4532a.mo92236a(i, i2);
            }
        }
    }

    /* renamed from: d */
    private void m98660d() {
        if (this.f6664d) {
            return;
        }
        this.f6664d = true;
        this.f6663c.postDelayed(new Runnable() { // from class: com.applovin.impl.tx
            @Override // java.lang.Runnable
            public final void run() {
                C4531hl.this.m98661c();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m98664b() {
        m98660d();
        return true;
    }

    /* renamed from: a */
    public void m98669a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f6667g = null;
        View view = (View) this.f6665e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f6666f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f6665e.clear();
        }
    }

    /* renamed from: b */
    public void m98663b(View view) {
        synchronized (this.f6662b) {
            this.f6661a.remove(view);
        }
    }

    /* renamed from: a */
    private boolean m98668a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* renamed from: a */
    public void m98666a(InterfaceC4532a interfaceC4532a) {
        this.f6667g = interfaceC4532a;
    }

    /* renamed from: a */
    public void m98667a(View view, int i) {
        synchronized (this.f6662b) {
            this.f6661a.put(view, Integer.valueOf(i));
            m98660d();
        }
    }
}

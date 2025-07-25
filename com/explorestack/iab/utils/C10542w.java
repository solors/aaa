package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.explorestack.iab.mraid.C10472c;
import com.explorestack.iab.mraid.C10489q;

/* renamed from: com.explorestack.iab.utils.w */
/* loaded from: classes3.dex */
public class C10542w {

    /* renamed from: a */
    private final Rect f24109a;

    /* renamed from: b */
    private final Rect f24110b;
    @NonNull

    /* renamed from: c */
    private final Context f24111c;
    @NonNull

    /* renamed from: d */
    private final View f24112d;
    @NonNull

    /* renamed from: e */
    private final InterfaceC10546d f24113e;

    /* renamed from: f */
    private final float f24114f;

    /* renamed from: g */
    private ViewTreeObserver.OnPreDrawListener f24115g;

    /* renamed from: h */
    private View.OnAttachStateChangeListener f24116h;

    /* renamed from: i */
    private boolean f24117i;

    /* renamed from: j */
    private boolean f24118j;

    /* renamed from: k */
    private boolean f24119k;

    /* renamed from: l */
    private boolean f24120l;

    /* renamed from: m */
    private boolean f24121m;

    /* renamed from: n */
    private final Runnable f24122n;

    /* renamed from: com.explorestack.iab.utils.w$a */
    /* loaded from: classes3.dex */
    class RunnableC10543a implements Runnable {
        RunnableC10543a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10542w.this.m79177a();
            C10542w.this.f24119k = false;
        }
    }

    /* renamed from: com.explorestack.iab.utils.w$b */
    /* loaded from: classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC10544b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC10544b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C10542w.this.m79168j();
            return true;
        }
    }

    /* renamed from: com.explorestack.iab.utils.w$c */
    /* loaded from: classes3.dex */
    class View$OnAttachStateChangeListenerC10545c implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC10545c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            C10542w.this.m79177a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            C10542w.this.m79177a();
        }
    }

    /* renamed from: com.explorestack.iab.utils.w$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10546d {
        /* renamed from: a */
        void mo79166a(boolean z);
    }

    public C10542w(@NonNull Context context, @NonNull View view, @NonNull InterfaceC10546d interfaceC10546d) {
        this(context, view, interfaceC10546d, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m79177a() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f24112d.getVisibility() != 0) {
            m79175c(this.f24112d, "Visibility != View.VISIBLE");
        } else if (this.f24112d.getParent() == null) {
            m79175c(this.f24112d, "No parent");
        } else if (!this.f24112d.getGlobalVisibleRect(this.f24109a)) {
            m79175c(this.f24112d, "Can't get global visible rect");
        } else if (C10512g.m79332A(this.f24112d)) {
            m79175c(this.f24112d, "View is transparent (alpha = 0)");
        } else {
            float width = this.f24112d.getWidth() * this.f24112d.getHeight();
            if (width <= 0.0f) {
                m79175c(this.f24112d, "Ad View width or height is zero, show wasn't tracked");
                return;
            }
            float width2 = (this.f24109a.width() * this.f24109a.height()) / width;
            if (width2 < this.f24114f) {
                m79175c(this.f24112d, "Ad View is not completely visible (" + width2 + "), show wasn't tracked");
                return;
            }
            View m79472c = C10489q.m79472c(this.f24111c, this.f24112d);
            if (m79472c == null) {
                m79175c(this.f24112d, "Can't obtain root view");
                return;
            }
            m79472c.getGlobalVisibleRect(this.f24110b);
            if (!Rect.intersects(this.f24109a, this.f24110b)) {
                m79175c(this.f24112d, "Ad View is out of current window, show wasn't tracked");
                return;
            }
            m79176b(this.f24112d);
        }
    }

    /* renamed from: b */
    private void m79176b(@NonNull View view) {
        this.f24118j = false;
        m79173e(true);
    }

    /* renamed from: c */
    private void m79175c(@NonNull View view, @NonNull String str) {
        if (!this.f24118j) {
            this.f24118j = true;
            C10472c.m79529a("VisibilityTracker", str, new Object[0]);
        }
        m79173e(false);
    }

    /* renamed from: e */
    private void m79173e(boolean z) {
        if (this.f24117i != z) {
            this.f24117i = z;
            this.f24113e.mo79166a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m79168j() {
        if (this.f24119k) {
            return;
        }
        this.f24119k = true;
        C10512g.m79327F(this.f24122n, 100L);
    }

    /* renamed from: h */
    public boolean m79170h() {
        return this.f24117i;
    }

    /* renamed from: i */
    public void m79169i() {
        this.f24121m = true;
        this.f24120l = false;
        this.f24119k = false;
        this.f24112d.getViewTreeObserver().removeOnPreDrawListener(this.f24115g);
        this.f24112d.removeOnAttachStateChangeListener(this.f24116h);
        C10512g.m79305l(this.f24122n);
    }

    /* renamed from: k */
    public void m79167k() {
        if (this.f24121m || this.f24120l) {
            return;
        }
        this.f24120l = true;
        if (this.f24115g == null) {
            this.f24115g = new ViewTreeObserver$OnPreDrawListenerC10544b();
        }
        if (this.f24116h == null) {
            this.f24116h = new View$OnAttachStateChangeListenerC10545c();
        }
        this.f24112d.getViewTreeObserver().addOnPreDrawListener(this.f24115g);
        this.f24112d.addOnAttachStateChangeListener(this.f24116h);
        m79177a();
    }

    public C10542w(@NonNull Context context, @NonNull View view, @NonNull InterfaceC10546d interfaceC10546d, float f) {
        this.f24109a = new Rect();
        this.f24110b = new Rect();
        this.f24117i = false;
        this.f24118j = false;
        this.f24119k = false;
        this.f24120l = false;
        this.f24121m = false;
        this.f24122n = new RunnableC10543a();
        this.f24111c = context;
        this.f24112d = view;
        this.f24113e = interfaceC10546d;
        this.f24114f = f;
    }
}

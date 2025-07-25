package io.bidmachine.rendering.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import io.bidmachine.rendering.internal.InterfaceC37055s;
import io.bidmachine.rendering.model.VisibilityParams;
import io.bidmachine.rendering.utils.UiUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.rendering.internal.t */
/* loaded from: classes9.dex */
public class C37057t implements InterfaceC37055s {

    /* renamed from: a */
    private final WeakReference f97756a;

    /* renamed from: b */
    private final VisibilityParams f97757b;

    /* renamed from: c */
    private final InterfaceC37055s.InterfaceC37056a f97758c;

    /* renamed from: d */
    private final Runnable f97759d = new C37059b();

    /* renamed from: e */
    private final ViewTreeObserver.OnPreDrawListener f97760e = new ViewTreeObserver$OnPreDrawListenerC37060c();

    /* renamed from: f */
    private final Object f97761f = new Object();

    /* renamed from: g */
    private final AtomicBoolean f97762g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f97763h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f97764i = new AtomicBoolean(false);

    /* renamed from: io.bidmachine.rendering.internal.t$b */
    /* loaded from: classes9.dex */
    private class C37059b implements InterfaceC37036j {
        private C37059b() {
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public void onRun() {
            if (!C37057t.this.m19131c()) {
                C37057t.this.m19129d();
            }
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public void onThrows(Throwable th) {
            super.onThrows(th);
            C37057t.this.m19129d();
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.t$c */
    /* loaded from: classes9.dex */
    private class ViewTreeObserver$OnPreDrawListenerC37060c implements ViewTreeObserver.OnPreDrawListener {
        private ViewTreeObserver$OnPreDrawListenerC37060c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C37057t.this.m19125h();
            return true;
        }
    }

    public C37057t(View view, VisibilityParams visibilityParams, InterfaceC37055s.InterfaceC37056a interfaceC37056a) {
        this.f97756a = new WeakReference(view);
        this.f97757b = visibilityParams;
        this.f97758c = interfaceC37056a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m19129d() {
        this.f97763h.set(false);
        m19125h();
    }

    /* renamed from: f */
    private void m19127f() {
        if (!this.f97764i.compareAndSet(false, true)) {
            return;
        }
        this.f97758c.mo19139a();
    }

    /* renamed from: g */
    private void m19126g() {
        if (!this.f97764i.compareAndSet(true, false)) {
            return;
        }
        this.f97758c.mo19138b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m19125h() {
        if (!this.f97763h.compareAndSet(false, true)) {
            return;
        }
        UiUtils.cancelOnUiThread(this.f97759d);
        UiUtils.onUiThread(this.f97759d, 100L);
    }

    /* renamed from: e */
    public View m19128e() {
        return (View) this.f97756a.get();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37055s
    public void start() {
        synchronized (this.f97761f) {
            if (!this.f97762g.compareAndSet(false, true)) {
                return;
            }
            View m19128e = m19128e();
            if (m19128e == null) {
                stop();
                return;
            }
            AbstractC37037k.m19162b("VisibilityTracker", "Start tracking - %s", m19128e);
            ViewTreeObserver viewTreeObserver = m19128e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(this.f97760e);
            }
        }
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37055s
    public void stop() {
        synchronized (this.f97761f) {
            this.f97762g.set(false);
            View m19128e = m19128e();
            if (m19128e != null) {
                AbstractC37037k.m19162b("VisibilityTracker", "Stop tracking - %s", m19128e);
                ViewTreeObserver viewTreeObserver = m19128e.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f97760e);
                }
            }
            UiUtils.cancelOnUiThread(this.f97759d);
            this.f97763h.set(false);
            this.f97764i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m19131c() {
        View m19128e = m19128e();
        if (m19128e == null) {
            stop();
            return true;
        } else if (m19135a(m19128e, this.f97757b.getVisibilityPercent(), this.f97757b.isIgnoreWindowFocus(), this.f97757b.isIgnoreOverlap())) {
            m19127f();
            return false;
        } else {
            m19126g();
            return false;
        }
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37055s
    /* renamed from: a */
    public void mo19137a() {
        stop();
        this.f97756a.clear();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37055s
    /* renamed from: b */
    public boolean mo19133b() {
        return this.f97764i.get();
    }

    /* renamed from: a */
    private View m19136a(View view) {
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
        }
        return view2;
    }

    /* renamed from: a */
    private boolean m19135a(View view, float f, boolean z, boolean z2) {
        ViewGroup viewGroup = view;
        try {
        } catch (Exception e) {
            AbstractC37037k.m19161b(e);
        }
        if (!view.isShown()) {
            AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: view visibility verification failed - %s", viewGroup);
            return false;
        } else if (UiUtils.isViewTransparent(view)) {
            AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: view transparent verification failed - %s", viewGroup);
            return false;
        } else if (!z && !view.hasWindowFocus()) {
            AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: window focus verification failed - %s", viewGroup);
            return false;
        } else {
            float width = view.getWidth() * view.getHeight();
            if (width == 0.0f) {
                AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: view size verification failed - %s", viewGroup);
                return false;
            }
            Rect rect = new Rect();
            if (!viewGroup.getGlobalVisibleRect(rect)) {
                AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: global visibility verification failed - %s", viewGroup);
                return false;
            }
            float width2 = (rect.width() * rect.height()) / width;
            if (width2 < f) {
                AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: ad view not completely visible (%s / %s) - %s", Float.valueOf(width2), Float.valueOf(f), viewGroup);
                return false;
            }
            View m19136a = m19136a(view);
            if (m19136a == null) {
                AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: content or root layout not found - %s", viewGroup);
                return false;
            }
            Rect rect2 = new Rect();
            m19136a.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: ad view is out of current window - %s", viewGroup);
                return false;
            }
            if (!z2) {
                ViewGroup viewGroup2 = (ViewGroup) view.getRootView();
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                int i = 0;
                while (viewGroup3 != null) {
                    for (int indexOfChild = viewGroup3.indexOfChild(viewGroup) + 1; indexOfChild < viewGroup3.getChildCount(); indexOfChild++) {
                        View childAt = viewGroup3.getChildAt(indexOfChild);
                        if (UiUtils.isViewVisible(childAt)) {
                            Rect locationInWindow = UiUtils.getLocationInWindow(childAt);
                            if (Rect.intersects(rect, locationInWindow)) {
                                float notOverlappedAreaPercent = UiUtils.getNotOverlappedAreaPercent(rect, locationInWindow);
                                if (notOverlappedAreaPercent < f) {
                                    AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: ad view is covered by another view (visible percent - %s / %s, ad view - %s, overlapping view - %s)", Float.valueOf(notOverlappedAreaPercent), Float.valueOf(f), viewGroup, childAt);
                                    return false;
                                }
                                i++;
                                if (i >= 3) {
                                    AbstractC37037k.m19162b("VisibilityTracker", "Show wasn't tracked: ad view is covered by too many views (overlapping views count - %s, ad view - %s)", Integer.valueOf(i), viewGroup);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (viewGroup3 != viewGroup2) {
                        ViewGroup viewGroup4 = viewGroup3;
                        viewGroup3 = (ViewGroup) viewGroup3.getParent();
                        viewGroup = viewGroup4;
                    } else {
                        viewGroup3 = null;
                    }
                }
            }
            return true;
        }
    }
}

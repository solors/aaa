package sg.bigo.ads.common.p911e;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: sg.bigo.ads.common.e.a */
/* loaded from: classes10.dex */
public final class C43612a {

    /* renamed from: sg.bigo.ads.common.e.a$a */
    /* loaded from: classes10.dex */
    public static abstract class AbstractC43613a {

        /* renamed from: a */
        private final Object f114188a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                AbstractC43613a.this.mo3585a(z);
            }
        };

        @RequiresApi(api = 18)
        /* renamed from: a */
        final ViewTreeObserver.OnWindowFocusChangeListener m5307a() {
            Object obj = this.f114188a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        /* renamed from: a */
        public abstract void mo3585a(boolean z);
    }

    /* renamed from: a */
    public static void m5313a(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: b */
    public static void m5308b(View view, AbstractC43613a abstractC43613a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener m5307a;
        if (view != null && abstractC43613a != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (m5307a = abstractC43613a.m5307a()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(m5307a);
        }
    }

    /* renamed from: a */
    public static void m5312a(View view, float f) {
        if (view == null) {
            return;
        }
        view.setZ(f);
    }

    /* renamed from: a */
    public static void m5311a(View view, int i) {
        if (view == null) {
            return;
        }
        view.setElevation(i);
    }

    /* renamed from: a */
    public static void m5310a(@NonNull View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m5309a(View view, AbstractC43613a abstractC43613a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener m5307a;
        if (view == null || abstractC43613a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (m5307a = abstractC43613a.m5307a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(m5307a);
    }
}

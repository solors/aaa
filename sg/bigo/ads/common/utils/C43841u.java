package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import sg.bigo.ads.common.InterfaceC43601d;
import sg.bigo.ads.common.p906aa.C43588b;
import sg.bigo.ads.common.p930r.C43778a;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.u */
/* loaded from: classes10.dex */
public final class C43841u {

    /* renamed from: sg.bigo.ads.common.utils.u$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43846a {
        /* renamed from: a */
        void mo4791a(@NonNull Rect rect);
    }

    @NonNull
    /* renamed from: a */
    public static Point m4802a(View view, View view2) {
        if (view == null || view2 == null) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr);
        return new Point((-iArr[0]) + iArr[0], (-iArr[1]) + iArr[1]);
    }

    @SuppressLint({"ViewRemove"})
    /* renamed from: b */
    public static void m4797b(@Nullable View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
            return;
        }
        C43782a.m5009a(0, "Views", "parent is not a view group, parent:" + view.getParent());
    }

    /* renamed from: c */
    public static void m4794c(View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public static boolean m4793d(@NonNull View view) {
        ViewParent parent;
        if (C43588b.m5344c() || view.getWindowVisibility() != 0) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 0.9f && (parent = view.getParent()) != null) {
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    /* renamed from: e */
    private static Point m4792e(View view) {
        if (view != null && view.getVisibility() != 8) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            return new Point(iArr[0], iArr[1]);
        }
        return new Point();
    }

    /* renamed from: a */
    public static Rect m4805a(View view, int i) {
        if (view == null || view.getVisibility() == 8) {
            return new Rect();
        }
        Point m4792e = m4792e(view);
        int i2 = m4792e.x;
        return new Rect(i2 - i, m4792e.y - i, i2 + view.getMeasuredWidth() + i, m4792e.y + view.getMeasuredHeight() + i);
    }

    /* renamed from: b */
    public static boolean m4796b(@Nullable View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains(i - (iArr[0] - iArr2[0]), i2 - (iArr[1] - iArr2[1]));
    }

    /* renamed from: c */
    public static boolean m4795c(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @Nullable
    /* renamed from: a */
    public static View m4807a(@Nullable Context context, @Nullable View view) {
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        if (findViewById != null) {
            return findViewById;
        }
        if (view == null) {
            return null;
        }
        if (!m4795c(view)) {
            C43782a.m5007b("Views", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById2 = rootView.findViewById(16908290);
        return findViewById2 != null ? findViewById2 : rootView;
    }

    /* renamed from: a */
    public static void m4803a(View view, final View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (view == null || onAttachStateChangeListener == null) {
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.utils.u.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewAttachedToWindow(view2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewDetachedFromWindow(view2);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m4801a(@Nullable View view, @Nullable ViewGroup viewGroup, @Nullable ViewGroup.LayoutParams layoutParams, int i) {
        if (view == null || viewGroup == null) {
            return;
        }
        if (view.getParent() == null) {
            if (layoutParams == null) {
                viewGroup.addView(view, i);
            } else {
                viewGroup.addView(view, i, layoutParams);
            }
        } else if (view.getParent() != viewGroup) {
            m4797b(view);
            if (layoutParams == null) {
                viewGroup.addView(view, i);
            } else {
                viewGroup.addView(view, i, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m4800a(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.common.utils.u.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
                onGlobalLayoutListener.onGlobalLayout();
            }
        });
    }

    /* renamed from: a */
    public static void m4799a(final View view, final InterfaceC43846a interfaceC43846a) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: sg.bigo.ads.common.utils.u.2

            /* renamed from: c */
            private boolean f114690c = false;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                InterfaceC43846a interfaceC43846a2 = InterfaceC43846a.this;
                if (interfaceC43846a2 != null && !this.f114690c) {
                    this.f114690c = true;
                    Rect rect = new Rect(i, i2, i3, i4);
                    new Rect(i5, i6, i7, i8);
                    interfaceC43846a2.mo4791a(rect);
                }
                view.post(new Runnable() { // from class: sg.bigo.ads.common.utils.u.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.removeOnLayoutChangeListener(this);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static void m4798a(ViewGroup viewGroup, InterfaceC43601d<View> interfaceC43601d) {
        if (viewGroup == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                View childAt = viewGroup2.getChildAt(i);
                interfaceC43601d.mo4706a(childAt);
                if (childAt instanceof ViewGroup) {
                    linkedList.add((ViewGroup) childAt);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m4809a(int i, int i2, @NonNull View view) {
        return i >= view.getLeft() && i <= view.getRight() && i2 >= view.getTop() && i2 <= view.getBottom();
    }

    /* renamed from: a */
    private static boolean m4808a(Context context) {
        if (context instanceof Activity) {
            return C43778a.m5023a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return C43778a.m5023a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m4806a(View view) {
        if (view == null) {
            return false;
        }
        if (m4808a(view.getContext())) {
            return true;
        }
        while (true) {
            if ((view == null ? false : C43778a.m5023a(view.getClass(), "io.flutter.plugin.platform.PlatformViewWrapper", "io.flutter.embedding.android.FlutterView")) || m4808a(view.getContext())) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
    }

    /* renamed from: a */
    public static boolean m4804a(View view, int i, int i2) {
        return i >= 0 && i <= view.getWidth() && i2 >= 0 && i2 <= view.getHeight();
    }
}

package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.core.mraid.q */
/* loaded from: classes10.dex */
public final class C44297q {
    @NonNull

    /* renamed from: a */
    final WeakReference<View> f116288a;
    @Nullable

    /* renamed from: d */
    InterfaceC44300b f116291d;

    /* renamed from: e */
    boolean f116292e;
    @NonNull

    /* renamed from: i */
    private final ViewTreeObserver.OnPreDrawListener f116296i;
    @NonNull

    /* renamed from: j */
    private WeakReference<ViewTreeObserver> f116297j;

    /* renamed from: f */
    float f116293f = -1.0f;

    /* renamed from: g */
    Rect f116294g = new Rect();

    /* renamed from: h */
    boolean f116295h = false;
    @NonNull

    /* renamed from: c */
    final Handler f116290c = new Handler();
    @NonNull

    /* renamed from: b */
    final RunnableC44299a f116289b = new RunnableC44299a();

    /* renamed from: sg.bigo.ads.core.mraid.q$a */
    /* loaded from: classes10.dex */
    class RunnableC44299a implements Runnable {
        RunnableC44299a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.mraid.C44297q.RunnableC44299a.run():void");
        }
    }

    /* renamed from: sg.bigo.ads.core.mraid.q$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC44300b {
        /* renamed from: a */
        void mo3426a(boolean z, C44239b c44239b);
    }

    public C44297q(@NonNull View view) {
        String str;
        this.f116288a = new WeakReference<>(view);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.q.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C44297q c44297q = C44297q.this;
                if (!c44297q.f116292e) {
                    c44297q.f116292e = true;
                    c44297q.f116290c.postDelayed(c44297q.f116289b, 500L);
                }
                return true;
            }
        };
        this.f116296i = onPreDrawListener;
        this.f116297j = new WeakReference<>(null);
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = this.f116297j.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View m4807a = C43841u.m4807a(context, view);
            if (m4807a == null) {
                str = "Unable to set Visibility Tracker due to no available root view.";
            } else {
                ViewTreeObserver viewTreeObserver2 = m4807a.getViewTreeObserver();
                if (!viewTreeObserver2.isAlive()) {
                    str = "Visibility Tracker was unable to track views because the root view tree observer was not alive";
                } else {
                    this.f116297j = new WeakReference<>(viewTreeObserver2);
                    viewTreeObserver2.addOnPreDrawListener(onPreDrawListener);
                    return;
                }
            }
            C43782a.m5009a(0, "VisibilityTracker", str);
        }
    }

    /* renamed from: a */
    static Rect m3429a(Rect rect, int i) {
        return new Rect((rect.left * 160) / i, (rect.top * 160) / i, (rect.right * 160) / i, (rect.bottom * 160) / i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: a */
    static /* synthetic */ Pair m3428a(Rect rect, View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        loop0: while (true) {
            View view2 = view;
            view = (ViewGroup) view.getParent();
            while (true) {
                if (view == 0) {
                    z = false;
                    break loop0;
                }
                z = true;
                if (view.getAlpha() == 0.0f) {
                    break loop0;
                }
                for (int indexOfChild = view.indexOfChild(view2) + 1; indexOfChild < view.getChildCount(); indexOfChild++) {
                    View childAt = view.getChildAt(indexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        if (Rect.intersects(rect, rect2)) {
                            arrayList.add(new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom)));
                        }
                    }
                }
                if (view != viewGroup) {
                    break;
                }
                view = 0;
            }
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    /* renamed from: a */
    static /* synthetic */ List m3427a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m3429a((Rect) it.next(), i));
        }
        return arrayList;
    }
}

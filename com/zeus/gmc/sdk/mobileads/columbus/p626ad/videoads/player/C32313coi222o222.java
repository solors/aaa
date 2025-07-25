package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32724c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222 */
/* loaded from: classes8.dex */
public class C32313coi222o222 {
    private static final int cicic = 1000;
    private static final String coiic = "AutoPlayWatcher";
    @NonNull
    private final C32316cioccoiococ c2oc2i;
    @NonNull
    private final Handler c2oc2o;
    private boolean cco22;
    @NonNull
    final ViewTreeObserver.OnPreDrawListener cii2c2;
    @NonNull
    WeakReference<ViewTreeObserver> ciii2coi2;
    @NonNull
    private final RunnableC32315c2oc2o cioccoiococ;
    @NonNull
    private final Map<View, C32314c2oc2i> coi222o222;
    @NonNull
    private InterfaceC32317coi222o222 coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222$c2oc2i */
    /* loaded from: classes8.dex */
    public static class C32314c2oc2i {
        View coi222o222;
        int coo2iico;

        C32314c2oc2i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222$c2oc2o */
    /* loaded from: classes8.dex */
    public class RunnableC32315c2oc2o implements Runnable {
        RunnableC32315c2oc2o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C32313coi222o222.this.cco22 = false;
            for (Map.Entry entry : C32313coi222o222.this.coi222o222.entrySet()) {
                int i = ((C32314c2oc2i) entry.getValue()).coo2iico;
                View view = ((C32314c2oc2i) entry.getValue()).coi222o222;
                if (C32313coi222o222.this.c2oc2i.coo2iico(view, (View) entry.getKey(), i)) {
                    C32313coi222o222.this.coo2iico.coo2iico(true);
                    MLog.m25892d(C32313coi222o222.coiic, "VisibilityRunnable: Visible");
                } else {
                    C32313coi222o222.this.coo2iico.coo2iico(false);
                    MLog.m25892d(C32313coi222o222.coiic, "VisibilityRunnable: InVisible");
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    public interface InterfaceC32317coi222o222 {
        void coo2iico(boolean z);
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    class ViewTreeObserver$OnPreDrawListenerC32318coo2iico implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC32318coo2iico() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C32313coi222o222.this.c2oc2i();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32313coi222o222(@NonNull Context context) {
        this(context, new WeakHashMap(10), new C32316cioccoiococ(), new Handler());
    }

    C32313coi222o222(@NonNull Context context, @NonNull Map<View, C32314c2oc2i> map, @NonNull C32316cioccoiococ c32316cioccoiococ, @NonNull Handler handler) {
        this.coi222o222 = map;
        this.c2oc2i = c32316cioccoiococ;
        this.c2oc2o = handler;
        this.cioccoiococ = new RunnableC32315c2oc2o();
        this.cii2c2 = new ViewTreeObserver$OnPreDrawListenerC32318coo2iico();
        this.ciii2coi2 = new WeakReference<>(null);
        coo2iico(context, (View) null);
    }

    public void c2oc2i() {
        if (this.cco22) {
            return;
        }
        this.cco22 = true;
        this.c2oc2o.postDelayed(this.cioccoiococ, 1000L);
    }

    public void coi222o222() {
        coo2iico();
        ViewTreeObserver viewTreeObserver = this.ciii2coi2.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.cii2c2);
        }
        this.ciii2coi2.clear();
        this.coo2iico = null;
    }

    private void coo2iico(@NonNull Context context, @NonNull View view) {
        ViewTreeObserver viewTreeObserver = this.ciii2coi2.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View coo2iico = C32724c2oc2o.coo2iico(context, view);
            if (coo2iico == null) {
                MLog.m25892d(coiic, "Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = coo2iico.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                MLog.m25892d(coiic, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                return;
            }
            this.ciii2coi2 = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.cii2c2);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coi222o222$cioccoiococ */
    /* loaded from: classes8.dex */
    public static class C32316cioccoiococ {
        private final Rect coo2iico = new Rect();

        public boolean coo2iico(@NonNull View view, @NonNull View view2, int i) {
            if (view2 != null && view2.getVisibility() == 0 && view.getParent() != null) {
                if (!view2.isShown()) {
                    MLog.m25887i(C32313coi222o222.coiic, "isShown check: invisible");
                    return false;
                } else if (!view2.getGlobalVisibleRect(this.coo2iico)) {
                    MLog.m25887i(C32313coi222o222.coiic, "GlobalVisibleRect check: invisible");
                    return false;
                } else if (!coo2iico(this.coo2iico)) {
                    MLog.m25887i(C32313coi222o222.coiic, "isVisibleByXY check: invisible");
                    return false;
                } else {
                    long height = this.coo2iico.height() * this.coo2iico.width();
                    long height2 = view2.getHeight() * view2.getWidth();
                    MLog.m25892d(C32313coi222o222.coiic, "visibleViewArea = " + height + ", totalViewArea = " + height2);
                    return height2 > 0 && height * 100 >= ((long) i) * height2;
                }
            }
            MLog.m25887i(C32313coi222o222.coiic, "isVisible check: invisible");
            return false;
        }

        private boolean coo2iico(Rect rect) {
            StringBuilder sb2 = new StringBuilder("view xy: ");
            sb2.append("left = " + rect.left);
            sb2.append(", right = " + rect.right);
            sb2.append(", top = " + rect.top);
            sb2.append(", bottom = " + rect.bottom);
            MLog.m25892d(C32313coi222o222.coiic, sb2.toString());
            return rect.top != 0;
        }
    }

    public void coo2iico(@NonNull InterfaceC32317coi222o222 interfaceC32317coi222o222) {
        this.coo2iico = interfaceC32317coi222o222;
    }

    public void coo2iico(@NonNull View view, int i) {
        coo2iico(view, view, i);
    }

    private void coo2iico(@NonNull View view, @NonNull View view2, int i) {
        coo2iico(view2.getContext(), view2);
        C32314c2oc2i c32314c2oc2i = this.coi222o222.get(view2);
        if (c32314c2oc2i == null) {
            c32314c2oc2i = new C32314c2oc2i();
            this.coi222o222.put(view2, c32314c2oc2i);
            c2oc2i();
        }
        c32314c2oc2i.coi222o222 = view;
        c32314c2oc2i.coo2iico = i;
    }

    private void coo2iico() {
        this.coi222o222.clear();
        this.c2oc2o.removeMessages(0);
        this.cco22 = true;
    }
}

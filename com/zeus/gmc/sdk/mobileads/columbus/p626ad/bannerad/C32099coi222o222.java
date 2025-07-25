package com.zeus.gmc.sdk.mobileads.columbus.p626ad.bannerad;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C20096if;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32724c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.coi222o222 */
/* loaded from: classes8.dex */
public class C32099coi222o222 {
    private static final int ccoc2oic = 1000;
    private static final String cicc2iiccc = "ImpressionTracker";
    @NonNull
    private final View c2oc2i;
    @NonNull
    private final C32101cioccoiococ c2oc2o;
    @Nullable
    private InterfaceC32100c2oc2i cco22;
    private volatile boolean cicic;
    @NonNull
    private final RunnableC32102coi222o222 cii2c2;
    @NonNull
    private final Handler ciii2coi2;
    @NonNull
    private final WeakReference<View> cioccoiococ;
    @NonNull
    WeakReference<ViewTreeObserver> coi222o222;
    private volatile boolean coiic;
    @NonNull
    final ViewTreeObserver.OnPreDrawListener coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.coi222o222$c2oc2i */
    /* loaded from: classes8.dex */
    interface InterfaceC32100c2oc2i {
        void coo2iico();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.coi222o222$cioccoiococ */
    /* loaded from: classes8.dex */
    static class C32101cioccoiococ {
        private long c2oc2i = Long.MIN_VALUE;
        private final Rect cioccoiococ = new Rect();
        private int coi222o222;
        private int coo2iico;

        C32101cioccoiococ(int i, int i2) {
            this.coo2iico = i;
            this.coi222o222 = i2;
        }

        void c2oc2i() {
            this.c2oc2i = SystemClock.uptimeMillis();
        }

        boolean coi222o222() {
            if (!coo2iico() || SystemClock.uptimeMillis() - this.c2oc2i < this.coi222o222) {
                return false;
            }
            return true;
        }

        boolean coo2iico() {
            return this.c2oc2i != Long.MIN_VALUE;
        }

        boolean coo2iico(@Nullable View view, @Nullable View view2) {
            MLog.m25892d(C32099coi222o222.cicc2iiccc, C20096if.f50580k);
            return view2 != null && view2.getVisibility() == 0 && view != null && view.getParent() != null && view2.getWidth() > 0 && view2.getHeight() > 0 && view2.getGlobalVisibleRect(this.cioccoiococ) && ((long) (C32099coi222o222.c2oc2i((float) this.cioccoiococ.width(), view2.getContext()) * C32099coi222o222.c2oc2i((float) this.cioccoiococ.height(), view2.getContext()))) >= ((long) this.coo2iico);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    public static class RunnableC32102coi222o222 implements Runnable {
        private WeakReference<C32099coi222o222> coo2iico;

        RunnableC32102coi222o222(C32099coi222o222 c32099coi222o222) {
            this.coo2iico = new WeakReference<>(c32099coi222o222);
        }

        @Override // java.lang.Runnable
        public void run() {
            MLog.m25892d(C32099coi222o222.cicc2iiccc, "run");
            C32099coi222o222 c32099coi222o222 = this.coo2iico.get();
            if (c32099coi222o222 != null && !c32099coi222o222.cicic) {
                c32099coi222o222.coiic = false;
                if (c32099coi222o222.c2oc2o.coo2iico((View) c32099coi222o222.cioccoiococ.get(), c32099coi222o222.c2oc2i)) {
                    if (!c32099coi222o222.c2oc2o.coo2iico()) {
                        c32099coi222o222.c2oc2o.c2oc2i();
                    }
                    if (c32099coi222o222.c2oc2o.coi222o222() && c32099coi222o222.cco22 != null) {
                        c32099coi222o222.cco22.coo2iico();
                        c32099coi222o222.cicic = true;
                    }
                }
                if (!c32099coi222o222.cicic) {
                    c32099coi222o222.coi222o222();
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.bannerad.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    class ViewTreeObserver$OnPreDrawListenerC32103coo2iico implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC32103coo2iico() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C32099coi222o222.this.coi222o222();
            return true;
        }
    }

    public C32099coi222o222(@NonNull Context context, @NonNull View view, @NonNull View view2, int i, int i2) {
        MLog.m25892d(cicc2iiccc, "create");
        this.cioccoiococ = new WeakReference<>(view);
        this.c2oc2i = view2;
        this.c2oc2o = new C32101cioccoiococ(i, i2);
        this.ciii2coi2 = new Handler();
        this.cii2c2 = new RunnableC32102coi222o222(this);
        this.coiic = false;
        this.cicic = false;
        this.coo2iico = new ViewTreeObserver$OnPreDrawListenerC32103coo2iico();
        this.coi222o222 = new WeakReference<>(null);
        coo2iico(context, view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c2oc2i(float f, Context context) {
        return (int) (coi222o222(f, context) + 0.5f);
    }

    void coi222o222() {
        if (this.coiic) {
            return;
        }
        this.coiic = true;
        this.ciii2coi2.postDelayed(this.cii2c2, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico(@Nullable InterfaceC32100c2oc2i interfaceC32100c2oc2i) {
        this.cco22 = interfaceC32100c2oc2i;
    }

    private void coo2iico(@Nullable Context context, @Nullable View view) {
        ViewTreeObserver viewTreeObserver = this.coi222o222.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View coo2iico = C32724c2oc2o.coo2iico(context, view);
            if (coo2iico == null) {
                MLog.m25892d(cicc2iiccc, "Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = coo2iico.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                MLog.m25883w(cicc2iiccc, "Visibility Tracker was unable to track views because the root view tree observer was not alive");
                return;
            }
            this.coi222o222 = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.coo2iico);
        }
    }

    private static float coi222o222(float f, Context context) {
        return f / coo2iico(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico() {
        MLog.m25892d(cicc2iiccc, "destroy");
        this.cco22 = null;
        this.coiic = true;
        this.cicic = true;
        this.ciii2coi2.removeMessages(0);
        ViewTreeObserver viewTreeObserver = this.coi222o222.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.coo2iico);
        }
        this.coi222o222.clear();
    }

    private static float coo2iico(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}

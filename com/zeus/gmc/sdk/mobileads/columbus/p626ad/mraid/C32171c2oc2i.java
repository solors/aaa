package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32724c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i */
/* loaded from: classes8.dex */
class C32171c2oc2i {
    private static final int ccoc2oic = 500;
    private static final String cicc2iiccc = "MraidVisibilityTracker";
    static final int coiio2 = 50;
    @NonNull
    final ViewTreeObserver.OnPreDrawListener c2oc2i;
    @NonNull
    private final Map<View, C32175coi222o222> c2oc2o;
    @NonNull
    private final C32172c2oc2i cco22;
    private boolean cicic;
    @Nullable
    private InterfaceC32173c2oc2o cii2c2;
    @NonNull
    private final RunnableC32174cioccoiococ ciii2coi2;
    @NonNull
    WeakReference<ViewTreeObserver> cioccoiococ;
    private long coi222o222;
    @NonNull
    private final Handler coiic;
    @NonNull
    private final ArrayList<View> coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i$c2oc2i */
    /* loaded from: classes8.dex */
    public static class C32172c2oc2i {
        private final Rect coo2iico = new Rect();

        public boolean coo2iico(long j, int i) {
            return SystemClock.uptimeMillis() - j >= ((long) i);
        }

        public boolean coo2iico(@Nullable View view, @Nullable View view2, int i, @Nullable Integer num) {
            if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || !view2.getGlobalVisibleRect(this.coo2iico)) {
                return false;
            }
            long height = this.coo2iico.height() * this.coo2iico.width();
            long height2 = view2.getHeight() * view2.getWidth();
            if (height2 <= 0) {
                return false;
            }
            return (num == null || num.intValue() <= 0) ? height * 100 >= ((long) i) * height2 : height >= ((long) num.intValue());
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i$c2oc2o */
    /* loaded from: classes8.dex */
    public interface InterfaceC32173c2oc2o {
        void coo2iico(List<View> list, List<View> list2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i$cioccoiococ */
    /* loaded from: classes8.dex */
    public class RunnableC32174cioccoiococ implements Runnable {
        @NonNull
        private final ArrayList<View> coi222o222 = new ArrayList<>();
        @NonNull
        private final ArrayList<View> coo2iico = new ArrayList<>();

        RunnableC32174cioccoiococ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MLog.m25892d(C32171c2oc2i.cicc2iiccc, "mraid run");
            C32171c2oc2i.this.cicic = false;
            for (Map.Entry entry : C32171c2oc2i.this.c2oc2o.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((C32175coi222o222) entry.getValue()).coo2iico;
                int i2 = ((C32175coi222o222) entry.getValue()).coi222o222;
                Integer num = ((C32175coi222o222) entry.getValue()).c2oc2o;
                View view2 = ((C32175coi222o222) entry.getValue()).cioccoiococ;
                if (C32171c2oc2i.this.cco22.coo2iico(view2, view, i, num)) {
                    this.coo2iico.add(view);
                } else if (!C32171c2oc2i.this.cco22.coo2iico(view2, view, i2, null)) {
                    this.coi222o222.add(view);
                }
            }
            if (C32171c2oc2i.this.cii2c2 != null) {
                C32171c2oc2i.this.cii2c2.coo2iico(this.coo2iico, this.coi222o222);
            }
            this.coo2iico.clear();
            this.coi222o222.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i$coi222o222 */
    /* loaded from: classes8.dex */
    public static class C32175coi222o222 {
        long c2oc2i;
        @Nullable
        Integer c2oc2o;
        View cioccoiococ;
        int coi222o222;
        int coo2iico;

        C32175coi222o222() {
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.c2oc2i$coo2iico */
    /* loaded from: classes8.dex */
    class ViewTreeObserver$OnPreDrawListenerC32176coo2iico implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC32176coo2iico() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C32171c2oc2i.this.c2oc2i();
            return true;
        }
    }

    public C32171c2oc2i(@NonNull Context context) {
        this(context, new WeakHashMap(10), new C32172c2oc2i(), new Handler());
    }

    C32171c2oc2i(@NonNull Context context, @NonNull Map<View, C32175coi222o222> map, @NonNull C32172c2oc2i c32172c2oc2i, @NonNull Handler handler) {
        this.coi222o222 = 0L;
        this.c2oc2o = map;
        this.cco22 = c32172c2oc2i;
        this.coiic = handler;
        this.ciii2coi2 = new RunnableC32174cioccoiococ();
        this.coo2iico = new ArrayList<>(50);
        this.c2oc2i = new ViewTreeObserver$OnPreDrawListenerC32176coo2iico();
        this.cioccoiococ = new WeakReference<>(null);
        coo2iico(context, (View) null);
    }

    public void c2oc2i() {
        if (this.cicic) {
            return;
        }
        this.cicic = true;
        this.coiic.postDelayed(this.ciii2coi2, 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coi222o222() {
        MLog.m25892d(cicc2iiccc, "destroy");
        this.c2oc2o.clear();
        this.cicic = true;
        this.coiic.removeMessages(0);
        ViewTreeObserver viewTreeObserver = this.cioccoiococ.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c2oc2i);
        }
        this.cioccoiococ.clear();
        this.cii2c2 = null;
    }

    private void coo2iico(@Nullable Context context, @Nullable View view) {
        ViewTreeObserver viewTreeObserver = this.cioccoiococ.get();
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
            this.cioccoiococ = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.c2oc2i);
        }
    }

    public void coo2iico(@Nullable InterfaceC32173c2oc2o interfaceC32173c2oc2o) {
        this.cii2c2 = interfaceC32173c2oc2o;
    }

    public void coo2iico(@NonNull View view, int i, @Nullable Integer num) {
        coo2iico(view, view, i, num);
    }

    public void coo2iico(@NonNull View view, @NonNull View view2, int i, @Nullable Integer num) {
        coo2iico(view, view2, i, i, num);
    }

    public void coo2iico(@NonNull View view, @NonNull View view2, int i, int i2, @Nullable Integer num) {
        coo2iico(view2.getContext(), view2);
        C32175coi222o222 c32175coi222o222 = this.c2oc2o.get(view2);
        if (c32175coi222o222 == null) {
            c32175coi222o222 = new C32175coi222o222();
            this.c2oc2o.put(view2, c32175coi222o222);
            c2oc2i();
        }
        int min = Math.min(i2, i);
        c32175coi222o222.cioccoiococ = view;
        c32175coi222o222.coo2iico = i;
        c32175coi222o222.coi222o222 = min;
        long j = this.coi222o222;
        c32175coi222o222.c2oc2i = j;
        c32175coi222o222.c2oc2o = num;
        long j2 = j + 1;
        this.coi222o222 = j2;
        if (j2 % 50 == 0) {
            coo2iico(j2 - 50);
        }
    }

    private void coo2iico(long j) {
        for (Map.Entry<View, C32175coi222o222> entry : this.c2oc2o.entrySet()) {
            if (entry.getValue().c2oc2i < j) {
                this.coo2iico.add(entry.getKey());
            }
        }
        Iterator<View> it = this.coo2iico.iterator();
        while (it.hasNext()) {
            coo2iico(it.next());
        }
        this.coo2iico.clear();
    }

    public void coo2iico(@NonNull View view) {
        this.c2oc2o.remove(view);
    }

    public void coo2iico() {
        this.c2oc2o.clear();
        this.coiic.removeMessages(0);
        this.cicic = false;
    }
}

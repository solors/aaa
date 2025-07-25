package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ec2;
import com.yandex.mobile.ads.impl.ec2.InterfaceC30229a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class g50<T extends View & ec2.InterfaceC30229a> {
    @NotNull

    /* renamed from: a */
    private final T f79515a;
    @NotNull

    /* renamed from: b */
    private final e50 f79516b;
    @NotNull

    /* renamed from: c */
    private final eb1 f79517c;
    @NotNull

    /* renamed from: d */
    private final Handler f79518d;
    @Nullable

    /* renamed from: e */
    private RunnableC30365a f79519e;

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.g50$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC30365a<T extends View & ec2.InterfaceC30229a> implements Runnable {

        /* renamed from: f */
        static final /* synthetic */ KProperty<Object>[] f79520f = {C30452ha.m33588a(RunnableC30365a.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), C30452ha.m33588a(RunnableC30365a.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
        @NotNull

        /* renamed from: b */
        private final Handler f79521b;
        @NotNull

        /* renamed from: c */
        private final e50 f79522c;
        @NotNull

        /* renamed from: d */
        private final xj1 f79523d;
        @NotNull

        /* renamed from: e */
        private final xj1 f79524e;

        public RunnableC30365a(@NotNull Handler handler, @NotNull View view, @NotNull e50 exposureProvider, @NotNull eb1 exposureUpdateListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(exposureUpdateListener, "exposureUpdateListener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
            this.f79521b = handler;
            this.f79522c = exposureProvider;
            this.f79523d = yj1.m26872a(exposureUpdateListener);
            this.f79524e = yj1.m26872a(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            xj1 xj1Var = this.f79524e;
            KProperty<?>[] kPropertyArr = f79520f;
            View view = (View) xj1Var.getValue(this, kPropertyArr[1]);
            eb1 eb1Var = (eb1) this.f79523d.getValue(this, kPropertyArr[0]);
            if (view != null && eb1Var != null) {
                eb1Var.mo34051a(this.f79522c.m34665a(view));
                this.f79521b.postDelayed(this, 200L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g50(@NotNull Handler handler, @NotNull View view, @NotNull e50 exposureProvider, @NotNull eb1 listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f79515a = view;
        this.f79516b = exposureProvider;
        this.f79517c = listener;
        this.f79518d = handler;
    }

    /* renamed from: a */
    public final void m33920a() {
        if (this.f79519e == null) {
            RunnableC30365a runnableC30365a = new RunnableC30365a(this.f79518d, this.f79515a, this.f79516b, this.f79517c);
            this.f79519e = runnableC30365a;
            this.f79518d.post(runnableC30365a);
        }
    }

    /* renamed from: b */
    public final void m33919b() {
        this.f79518d.removeCallbacksAndMessages(null);
        this.f79519e = null;
    }

    public /* synthetic */ g50(View view, e50 e50Var, eb1 eb1Var) {
        this(new Handler(Looper.getMainLooper()), view, e50Var, eb1Var);
    }
}

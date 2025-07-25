package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.C31292rk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rk */
/* loaded from: classes8.dex */
public final class C31292rk {
    @NotNull

    /* renamed from: a */
    private final ExecutorService f84802a;

    /* renamed from: com.yandex.mobile.ads.impl.rk$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC31293a implements Runnable {
        @NotNull

        /* renamed from: b */
        private final Bitmap f84803b;
        @NotNull

        /* renamed from: c */
        private final InterfaceC31294b f84804c;
        @NotNull

        /* renamed from: d */
        private final Handler f84805d;
        @NotNull

        /* renamed from: e */
        private final C31826xk f84806e;

        public RunnableC31293a(@NotNull Bitmap originalBitmap, @NotNull wk1 listener, @NotNull Handler handler, @NotNull C31826xk blurredBitmapProvider) {
            Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
            this.f84803b = originalBitmap;
            this.f84804c = listener;
            this.f84805d = handler;
            this.f84806e = blurredBitmapProvider;
        }

        /* renamed from: a */
        private final void m30003a(final Bitmap bitmap) {
            this.f84805d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.hv2
                @Override // java.lang.Runnable
                public final void run() {
                    C31292rk.RunnableC31293a.m30001b(C31292rk.RunnableC31293a.this, bitmap);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m30001b(RunnableC31293a runnableC31293a, Bitmap bitmap) {
            m30002a(runnableC31293a, bitmap);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31826xk c31826xk = this.f84806e;
            Bitmap bitmap = this.f84803b;
            c31826xk.getClass();
            m30003a(C31826xk.m27474a(bitmap, 0.1d));
        }

        /* renamed from: a */
        public static final void m30002a(RunnableC31293a this$0, Bitmap blurredBitmap) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(blurredBitmap, "$blurredBitmap");
            this$0.f84804c.mo27876a(blurredBitmap);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rk$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31294b {
        /* renamed from: a */
        void mo27876a(@NotNull Bitmap bitmap);
    }

    public C31292rk() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f84802a = newSingleThreadExecutor;
    }

    /* renamed from: a */
    public final void m30004a(@NotNull Bitmap bitmap, @NotNull wk1 listener) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84802a.execute(new RunnableC31293a(bitmap, listener, new Handler(Looper.getMainLooper()), new C31826xk()));
    }
}

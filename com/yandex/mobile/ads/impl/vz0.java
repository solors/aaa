package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pz0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vz0 {
    @NotNull

    /* renamed from: a */
    private final wo1 f87045a;
    @NotNull

    /* renamed from: b */
    private final jq0 f87046b;

    /* renamed from: com.yandex.mobile.ads.impl.vz0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31710a {
        /* renamed from: a */
        void mo28100a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz0$b */
    /* loaded from: classes8.dex */
    public static final class C31711b implements pz0.InterfaceC31163a {
        @NotNull

        /* renamed from: a */
        private final wz0 f87047a;
        @NotNull

        /* renamed from: b */
        private final InterfaceC31710a f87048b;
        @NotNull

        /* renamed from: c */
        private final xr0 f87049c;

        public C31711b(@NotNull wz0 mraidWebViewPool, @NotNull InterfaceC31710a listener, @NotNull xr0 media) {
            Intrinsics.checkNotNullParameter(mraidWebViewPool, "mraidWebViewPool");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(media, "media");
            this.f87047a = mraidWebViewPool;
            this.f87048b = listener;
            this.f87049c = media;
        }

        @Override // com.yandex.mobile.ads.impl.pz0.InterfaceC31163a
        /* renamed from: a */
        public final void mo28099a() {
            this.f87047a.m27718b(this.f87049c);
            this.f87048b.mo28100a();
        }

        @Override // com.yandex.mobile.ads.impl.pz0.InterfaceC31163a
        /* renamed from: b */
        public final void mo28098b() {
            this.f87048b.mo28100a();
        }
    }

    public /* synthetic */ vz0() {
        this(new wo1());
    }

    /* renamed from: a */
    public final void m28103a(@NotNull final Context context, @NotNull final xr0 media, @NotNull final InterfaceC31710a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f87046b.m32795a(new Runnable() { // from class: com.yandex.mobile.ads.impl.xz2
            @Override // java.lang.Runnable
            public final void run() {
                vz0.m28102a(context, media, listener, this);
            }
        });
    }

    public vz0(@NotNull wo1 safeMraidWebViewFactory) {
        Intrinsics.checkNotNullParameter(safeMraidWebViewFactory, "safeMraidWebViewFactory");
        this.f87045a = safeMraidWebViewFactory;
        this.f87046b = new jq0();
    }

    /* renamed from: a */
    public static final void m28102a(Context context, xr0 media, InterfaceC31710a listener, vz0 this$0) {
        pz0 pz0Var;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(media, "$media");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wz0 m27717a = wz0.f87445c.m27717a(context);
        String m27421b = media.m27421b();
        if (!m27717a.m27719b() && !m27717a.m27720a(media) && m27421b != null) {
            this$0.f87045a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                pz0Var = new pz0(context);
            } catch (Throwable unused) {
                pz0Var = null;
            }
            if (pz0Var != null) {
                pz0Var.setPreloadListener(new C31711b(m27717a, listener, media));
                m27717a.m27722a(pz0Var, media);
                pz0Var.m30548c(m27421b);
                return;
            }
            listener.mo28100a();
            return;
        }
        listener.mo28100a();
    }
}

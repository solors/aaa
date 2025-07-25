package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sl0 {
    @NotNull

    /* renamed from: c */
    public static final C31378a f85301c = new C31378a(0);
    @Nullable

    /* renamed from: d */
    private static volatile sl0 f85302d;
    @NotNull

    /* renamed from: a */
    private final Object f85303a;
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<InterfaceC30192dt, C31835xr> f85304b;

    /* renamed from: com.yandex.mobile.ads.impl.sl0$a */
    /* loaded from: classes8.dex */
    public static final class C31378a {
        private C31378a() {
        }

        @NotNull
        /* renamed from: a */
        public final sl0 m29586a() {
            sl0 sl0Var = sl0.f85302d;
            if (sl0Var == null) {
                synchronized (this) {
                    sl0Var = sl0.f85302d;
                    if (sl0Var == null) {
                        sl0Var = new sl0(0);
                        sl0.f85302d = sl0Var;
                    }
                }
            }
            return sl0Var;
        }

        public /* synthetic */ C31378a(int i) {
            this();
        }
    }

    private sl0() {
        this.f85303a = new Object();
        this.f85304b = new WeakHashMap<>();
    }

    /* renamed from: b */
    public final void m29587b(@NotNull InterfaceC30192dt videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f85303a) {
            this.f85304b.remove(videoPlayer);
        }
    }

    @Nullable
    /* renamed from: a */
    public final C31835xr m29590a(@NotNull InterfaceC30192dt videoPlayer) {
        C31835xr c31835xr;
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        synchronized (this.f85303a) {
            c31835xr = this.f85304b.get(videoPlayer);
        }
        return c31835xr;
    }

    public /* synthetic */ sl0(int i) {
        this();
    }

    /* renamed from: a */
    public final void m29589a(@NotNull InterfaceC30192dt videoPlayer, @NotNull C31835xr adBinder) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f85303a) {
            this.f85304b.put(videoPlayer, adBinder);
            Unit unit = Unit.f99208a;
        }
    }
}

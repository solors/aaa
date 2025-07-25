package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t40 {
    @NotNull

    /* renamed from: b */
    private static final Object f85499b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile t40 f85500c;

    /* renamed from: d */
    public static final /* synthetic */ int f85501d = 0;
    @NotNull

    /* renamed from: a */
    private final s40 f85502a;

    /* renamed from: com.yandex.mobile.ads.impl.t40$a */
    /* loaded from: classes8.dex */
    public static final class C31424a {
        @NotNull
        /* renamed from: a */
        public static t40 m29300a() {
            t40 t40Var;
            t40 t40Var2 = t40.f85500c;
            if (t40Var2 == null) {
                synchronized (t40.f85499b) {
                    t40Var = t40.f85500c;
                    if (t40Var == null) {
                        t40Var = new t40(0);
                        t40.f85500c = t40Var;
                    }
                }
                return t40Var;
            }
            return t40Var2;
        }
    }

    private t40() {
        this.f85502a = new s40(t92.m29253a());
    }

    @Nullable
    /* renamed from: a */
    public final e71 m29304a(@NotNull m62<?> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return this.f85502a.get(videoAdInfo);
    }

    public /* synthetic */ t40(int i) {
        this();
    }

    /* renamed from: a */
    public final void m29303a(@NotNull m62 videoAdInfo, @NotNull w40 exoVideoAdPlayer) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(exoVideoAdPlayer, "exoVideoAdPlayer");
        this.f85502a.put(videoAdInfo, exoVideoAdPlayer);
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.as1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
/* loaded from: classes8.dex */
public final class wz0 {
    @NotNull

    /* renamed from: c */
    public static final C31779a f87445c = new C31779a(0);
    @Nullable

    /* renamed from: d */
    private static volatile wz0 f87446d;

    /* renamed from: a */
    private final int f87447a;
    @NotNull

    /* renamed from: b */
    private final WeakHashMap<xr0, pz0> f87448b;

    /* renamed from: com.yandex.mobile.ads.impl.wz0$a */
    /* loaded from: classes8.dex */
    public static final class C31779a {
        private C31779a() {
        }

        @AnyThread
        @NotNull
        /* renamed from: a */
        public final wz0 m27717a(@NotNull Context context) {
            int i;
            Intrinsics.checkNotNullParameter(context, "context");
            wz0 wz0Var = wz0.f87446d;
            if (wz0Var == null) {
                synchronized (this) {
                    wz0Var = wz0.f87446d;
                    if (wz0Var == null) {
                        int i2 = as1.f76895l;
                        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
                        if (m35796a != null) {
                            i = m35796a.m26794C();
                        } else {
                            i = 0;
                        }
                        wz0 wz0Var2 = new wz0(i, 0);
                        wz0.f87446d = wz0Var2;
                        wz0Var = wz0Var2;
                    }
                }
            }
            return wz0Var;
        }

        public /* synthetic */ C31779a(int i) {
            this();
        }
    }

    private wz0(int i) {
        this.f87447a = i;
        this.f87448b = new WeakHashMap<>();
    }

    @Nullable
    /* renamed from: b */
    public final pz0 m27718b(@NotNull xr0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f87448b.remove(media);
    }

    /* renamed from: a */
    public final boolean m27720a(@NotNull xr0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        return this.f87448b.containsKey(media);
    }

    /* renamed from: b */
    public final boolean m27719b() {
        return this.f87448b.size() == this.f87447a;
    }

    public /* synthetic */ wz0(int i, int i2) {
        this(i);
    }

    /* renamed from: a */
    public final void m27722a(@NotNull pz0 mraidWebView, @NotNull xr0 media) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
        if (this.f87448b.size() < this.f87447a) {
            this.f87448b.put(media, mraidWebView);
        }
    }
}

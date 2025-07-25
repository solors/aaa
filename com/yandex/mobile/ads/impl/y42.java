package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class y42 {
    @NotNull

    /* renamed from: a */
    private final C30530i2 f88055a;
    @Nullable

    /* renamed from: b */
    private final Map<String, String> f88056b;

    /* renamed from: com.yandex.mobile.ads.impl.y42$a */
    /* loaded from: classes8.dex */
    public static final class C31869a {
        @NotNull

        /* renamed from: a */
        private final C30530i2 f88057a;
        @Nullable

        /* renamed from: b */
        private Map<String, String> f88058b;

        public C31869a(@NotNull C30530i2 adBreak) {
            Intrinsics.checkNotNullParameter(adBreak, "adBreak");
            this.f88057a = adBreak;
            i82.m33347a(adBreak);
        }

        @NotNull
        /* renamed from: a */
        public final C30530i2 m27034a() {
            return this.f88057a;
        }

        @Nullable
        /* renamed from: b */
        public final Map<String, String> m27033b() {
            return this.f88058b;
        }

        @NotNull
        /* renamed from: c */
        public final C31869a m27032c() {
            this.f88058b = null;
            return this;
        }
    }

    private y42(C31869a c31869a) {
        this.f88055a = c31869a.m27034a();
        this.f88056b = c31869a.m27033b();
    }

    @NotNull
    /* renamed from: a */
    public final C30530i2 m27036a() {
        return this.f88055a;
    }

    @Nullable
    /* renamed from: b */
    public final Map<String, String> m27035b() {
        return this.f88056b;
    }

    public /* synthetic */ y42(C31869a c31869a, int i) {
        this(c31869a);
    }
}

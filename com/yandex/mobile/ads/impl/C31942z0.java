package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z0 */
/* loaded from: classes8.dex */
public final class C31942z0 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f88629a;
    @NotNull

    /* renamed from: b */
    private final C30359g3 f88630b;
    @Nullable

    /* renamed from: c */
    private final uq1 f88631c;
    @Nullable

    /* renamed from: d */
    private final f31 f88632d;

    /* renamed from: e */
    private final int f88633e;
    @NotNull

    /* renamed from: f */
    private final C30537i8 f88634f;

    /* renamed from: com.yandex.mobile.ads.impl.z0$a */
    /* loaded from: classes8.dex */
    public static final class C31943a {
        @NotNull

        /* renamed from: a */
        private final C30149d8<?> f88635a;
        @NotNull

        /* renamed from: b */
        private final C30359g3 f88636b;
        @NotNull

        /* renamed from: c */
        private final C30537i8 f88637c;
        @Nullable

        /* renamed from: d */
        private uq1 f88638d;
        @Nullable

        /* renamed from: e */
        private f31 f88639e;

        /* renamed from: f */
        private int f88640f;

        public C31943a(@NotNull C30149d8<?> adResponse, @NotNull C30359g3 adConfiguration, @NotNull C30537i8 adResultReceiver) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
            this.f88635a = adResponse;
            this.f88636b = adConfiguration;
            this.f88637c = adResultReceiver;
        }

        @NotNull
        /* renamed from: a */
        public final C30359g3 m26503a() {
            return this.f88636b;
        }

        @NotNull
        /* renamed from: b */
        public final C30149d8<?> m26499b() {
            return this.f88635a;
        }

        @NotNull
        /* renamed from: c */
        public final C30537i8 m26498c() {
            return this.f88637c;
        }

        @Nullable
        /* renamed from: d */
        public final f31 m26497d() {
            return this.f88639e;
        }

        /* renamed from: e */
        public final int m26496e() {
            return this.f88640f;
        }

        @Nullable
        /* renamed from: f */
        public final uq1 m26495f() {
            return this.f88638d;
        }

        @NotNull
        /* renamed from: a */
        public final C31943a m26501a(@NotNull f31 nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            this.f88639e = nativeAd;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31943a m26502a(int i) {
            this.f88640f = i;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31943a m26500a(@NotNull uq1 contentController) {
            Intrinsics.checkNotNullParameter(contentController, "contentController");
            this.f88638d = contentController;
            return this;
        }
    }

    public C31942z0(@NotNull C31943a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f88629a = builder.m26499b();
        this.f88630b = builder.m26503a();
        this.f88631c = builder.m26495f();
        this.f88632d = builder.m26497d();
        this.f88633e = builder.m26496e();
        this.f88634f = builder.m26498c();
    }

    @NotNull
    /* renamed from: a */
    public final C30359g3 m26509a() {
        return this.f88630b;
    }

    @NotNull
    /* renamed from: b */
    public final C30149d8<?> m26508b() {
        return this.f88629a;
    }

    @NotNull
    /* renamed from: c */
    public final C30537i8 m26507c() {
        return this.f88634f;
    }

    @Nullable
    /* renamed from: d */
    public final f31 m26506d() {
        return this.f88632d;
    }

    /* renamed from: e */
    public final int m26505e() {
        return this.f88633e;
    }

    @Nullable
    /* renamed from: f */
    public final uq1 m26504f() {
        return this.f88631c;
    }
}

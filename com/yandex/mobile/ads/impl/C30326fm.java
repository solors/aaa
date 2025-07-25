package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fm */
/* loaded from: classes8.dex */
public final class C30326fm {
    @Nullable

    /* renamed from: a */
    private final nl1 f79169a;
    @Nullable

    /* renamed from: b */
    private final mm1 f79170b;

    /* renamed from: com.yandex.mobile.ads.impl.fm$a */
    /* loaded from: classes8.dex */
    public static final class C30327a {
        @NotNull

        /* renamed from: a */
        private final nl1 f79171a;

        public C30327a(long j, @NotNull nl1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f79171a = request;
        }

        @NotNull
        /* renamed from: a */
        public final C30326fm m34115a() {
            C30326fm c30326fm = new C30326fm(this.f79171a, null);
            if (c30326fm.m34116b() != null && this.f79171a.m31481b().m29113a()) {
                return new C30326fm(null, null);
            }
            return c30326fm;
        }
    }

    public C30326fm(@Nullable nl1 nl1Var, @Nullable mm1 mm1Var) {
        this.f79169a = nl1Var;
        this.f79170b = mm1Var;
    }

    @Nullable
    /* renamed from: a */
    public final mm1 m34117a() {
        return this.f79170b;
    }

    @Nullable
    /* renamed from: b */
    public final nl1 m34116b() {
        return this.f79169a;
    }
}

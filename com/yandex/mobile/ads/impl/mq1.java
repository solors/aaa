package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface mq1 {

    /* renamed from: com.yandex.mobile.ads.impl.mq1$a */
    /* loaded from: classes8.dex */
    public static final class C30876a implements mq1 {
        @NotNull

        /* renamed from: a */
        private final yc2 f82345a;

        public C30876a(@NotNull yc2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f82345a = error;
        }

        @NotNull
        /* renamed from: a */
        public final yc2 m31871a() {
            return this.f82345a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30876a) && Intrinsics.m17075f(this.f82345a, ((C30876a) obj).f82345a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f82345a.hashCode();
        }

        @NotNull
        public final String toString() {
            yc2 yc2Var = this.f82345a;
            return "Failure(error=" + yc2Var + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mq1$b */
    /* loaded from: classes8.dex */
    public static final class C30877b implements mq1 {
        @NotNull

        /* renamed from: a */
        private final yp1 f82346a;

        public C30877b(@NotNull yp1 sdkConfiguration) {
            Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
            this.f82346a = sdkConfiguration;
        }

        @NotNull
        /* renamed from: a */
        public final yp1 m31870a() {
            return this.f82346a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C30877b) && Intrinsics.m17075f(this.f82346a, ((C30877b) obj).f82346a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f82346a.hashCode();
        }

        @NotNull
        public final String toString() {
            yp1 yp1Var = this.f82346a;
            return "Success(sdkConfiguration=" + yp1Var + ")";
        }
    }
}

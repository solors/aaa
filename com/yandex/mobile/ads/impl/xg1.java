package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class xg1 {

    /* renamed from: com.yandex.mobile.ads.impl.xg1$a */
    /* loaded from: classes8.dex */
    public static final class C31821a extends xg1 {
        @NotNull

        /* renamed from: a */
        private final C31082p3 f87685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31821a(@NotNull C31082p3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f87685a = adRequestError;
        }

        @NotNull
        /* renamed from: a */
        public final C31082p3 m27502a() {
            return this.f87685a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31821a) && Intrinsics.m17075f(this.f87685a, ((C31821a) obj).f87685a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87685a.hashCode();
        }

        @NotNull
        public final String toString() {
            C31082p3 c31082p3 = this.f87685a;
            return "Failure(adRequestError=" + c31082p3 + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xg1$b */
    /* loaded from: classes8.dex */
    public static final class C31822b extends xg1 {
        @NotNull

        /* renamed from: a */
        private final b70 f87686a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31822b(@NotNull b70 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f87686a = feedItem;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31822b) && Intrinsics.m17075f(this.f87686a, ((C31822b) obj).f87686a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87686a.hashCode();
        }

        @NotNull
        public final String toString() {
            b70 b70Var = this.f87686a;
            return "Success(feedItem=" + b70Var + ")";
        }
    }

    private xg1() {
    }

    public /* synthetic */ xg1(int i) {
        this();
    }
}

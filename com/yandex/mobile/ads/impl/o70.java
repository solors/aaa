package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class o70 {

    /* renamed from: com.yandex.mobile.ads.impl.o70$a */
    /* loaded from: classes8.dex */
    public static final class C31022a extends o70 {
        @NotNull

        /* renamed from: a */
        private final C31082p3 f83354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31022a(@NotNull C31082p3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f83354a = adRequestError;
        }

        @NotNull
        /* renamed from: a */
        public final C31082p3 m31141a() {
            return this.f83354a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31022a) && Intrinsics.m17075f(this.f83354a, ((C31022a) obj).f83354a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f83354a.hashCode();
        }

        @NotNull
        public final String toString() {
            C31082p3 c31082p3 = this.f83354a;
            return "Failure(adRequestError=" + c31082p3 + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o70$b */
    /* loaded from: classes8.dex */
    public static final class C31023b extends o70 {
        @NotNull

        /* renamed from: a */
        private final ip0 f83355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31023b(@NotNull ip0 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f83355a = feedItem;
        }

        @NotNull
        /* renamed from: a */
        public final ip0 m31140a() {
            return this.f83355a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31023b) && Intrinsics.m17075f(this.f83355a, ((C31023b) obj).f83355a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f83355a.hashCode();
        }

        @NotNull
        public final String toString() {
            ip0 ip0Var = this.f83355a;
            return "Success(feedItem=" + ip0Var + ")";
        }
    }

    private o70() {
    }

    public /* synthetic */ o70(int i) {
        this();
    }
}

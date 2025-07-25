package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class s70 {

    /* renamed from: com.yandex.mobile.ads.impl.s70$a */
    /* loaded from: classes8.dex */
    public static final class C31333a extends s70 {
        @NotNull

        /* renamed from: a */
        private final C31082p3 f85025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31333a(@NotNull C31082p3 adFetchRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            this.f85025a = adFetchRequestError;
        }

        @NotNull
        /* renamed from: a */
        public final C31082p3 m29845a() {
            return this.f85025a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31333a) && Intrinsics.m17075f(this.f85025a, ((C31333a) obj).f85025a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f85025a.hashCode();
        }

        @NotNull
        public final String toString() {
            C31082p3 c31082p3 = this.f85025a;
            return "Failed(adFetchRequestError=" + c31082p3 + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s70$b */
    /* loaded from: classes8.dex */
    public static final class C31334b extends s70 {
        @NotNull

        /* renamed from: a */
        public static final C31334b f85026a = new C31334b();

        private C31334b() {
            super(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s70$c */
    /* loaded from: classes8.dex */
    public static final class C31335c extends s70 {
        @NotNull

        /* renamed from: a */
        public static final C31335c f85027a = new C31335c();

        private C31335c() {
            super(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.s70$d */
    /* loaded from: classes8.dex */
    public static final class C31336d extends s70 {
        @NotNull

        /* renamed from: a */
        public static final C31336d f85028a = new C31336d();

        private C31336d() {
            super(0);
        }
    }

    private s70() {
    }

    public /* synthetic */ s70(int i) {
        this();
    }
}

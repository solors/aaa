package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.vv */
/* loaded from: classes8.dex */
public abstract class AbstractC31685vv {
    @NotNull

    /* renamed from: a */
    private final String f86882a;

    /* renamed from: com.yandex.mobile.ads.impl.vv$a */
    /* loaded from: classes8.dex */
    public static final class C31686a extends AbstractC31685vv {
        @NotNull

        /* renamed from: b */
        private final String f86883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31686a(@NotNull String unitId) {
            super("Ad Units", 0);
            Intrinsics.checkNotNullParameter(unitId, "unitId");
            this.f86883b = unitId;
        }

        @NotNull
        /* renamed from: b */
        public final String m28214b() {
            return this.f86883b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31686a) && Intrinsics.m17075f(this.f86883b, ((C31686a) obj).f86883b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f86883b.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f86883b;
            return "AdUnit(unitId=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vv$b */
    /* loaded from: classes8.dex */
    public static final class C31687b extends AbstractC31685vv {
        @NotNull

        /* renamed from: b */
        private final AbstractC31846xw.C31854g f86884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31687b(@NotNull AbstractC31846xw.C31854g adapter) {
            super(adapter.m27191f(), 0);
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f86884b = adapter;
        }

        @NotNull
        /* renamed from: b */
        public final AbstractC31846xw.C31854g m28213b() {
            return this.f86884b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31687b) && Intrinsics.m17075f(this.f86884b, ((C31687b) obj).f86884b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f86884b.hashCode();
        }

        @NotNull
        public final String toString() {
            AbstractC31846xw.C31854g c31854g = this.f86884b;
            return "AdUnitMediationAdapter(adapter=" + c31854g + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vv$c */
    /* loaded from: classes8.dex */
    public static final class C31688c extends AbstractC31685vv {
        @NotNull

        /* renamed from: b */
        public static final C31688c f86885b = new C31688c();

        private C31688c() {
            super("Ad Units", 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vv$d */
    /* loaded from: classes8.dex */
    public static final class C31689d extends AbstractC31685vv {
        @NotNull

        /* renamed from: b */
        public static final C31689d f86886b = new C31689d();

        private C31689d() {
            super("Debug Panel", 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vv$e */
    /* loaded from: classes8.dex */
    public static final class C31690e extends AbstractC31685vv {
        @NotNull

        /* renamed from: b */
        private final String f86887b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31690e(@NotNull String network) {
            super(network, 0);
            Intrinsics.checkNotNullParameter(network, "network");
            this.f86887b = network;
        }

        @NotNull
        /* renamed from: b */
        public final String m28212b() {
            return this.f86887b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31690e) && Intrinsics.m17075f(this.f86887b, ((C31690e) obj).f86887b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f86887b.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f86887b;
            return "MediationNetwork(network=" + str + ")";
        }
    }

    private AbstractC31685vv(String str) {
        this.f86882a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m28215a() {
        return this.f86882a;
    }

    public /* synthetic */ AbstractC31685vv(String str, int i) {
        this(str);
    }
}

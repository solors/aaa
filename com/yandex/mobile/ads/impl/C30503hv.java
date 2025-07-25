package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hv */
/* loaded from: classes8.dex */
public final class C30503hv {
    @NotNull

    /* renamed from: a */
    private final String f80201a;
    @Nullable

    /* renamed from: b */
    private final String f80202b;

    /* renamed from: c */
    private final boolean f80203c;
    @Nullable

    /* renamed from: d */
    private final String f80204d;
    @Nullable

    /* renamed from: e */
    private final String f80205e;
    @Nullable

    /* renamed from: f */
    private final String f80206f;
    @NotNull

    /* renamed from: g */
    private final InterfaceC30504a f80207g;
    @Nullable

    /* renamed from: h */
    private final List<String> f80208h;

    /* renamed from: com.yandex.mobile.ads.impl.hv$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30504a {

        /* renamed from: com.yandex.mobile.ads.impl.hv$a$a */
        /* loaded from: classes8.dex */
        public static final class C30505a implements InterfaceC30504a {
            @NotNull

            /* renamed from: a */
            public static final C30505a f80209a = new C30505a();

            private C30505a() {
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.hv$a$b */
        /* loaded from: classes8.dex */
        public static final class C30506b implements InterfaceC30504a {
            @NotNull

            /* renamed from: a */
            private final pw0 f80210a;

            public C30506b() {
                pw0 error = pw0.f84094b;
                Intrinsics.checkNotNullParameter(error, "error");
                this.f80210a = error;
            }

            @NotNull
            /* renamed from: a */
            public final pw0 m33459a() {
                return this.f80210a;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C30506b) && this.f80210a == ((C30506b) obj).f80210a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f80210a.hashCode();
            }

            @NotNull
            public final String toString() {
                pw0 pw0Var = this.f80210a;
                return "InvalidIntegration(error=" + pw0Var + ")";
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.hv$a$c */
        /* loaded from: classes8.dex */
        public static final class C30507c implements InterfaceC30504a {
            @NotNull

            /* renamed from: a */
            public static final C30507c f80211a = new C30507c();

            private C30507c() {
            }
        }
    }

    public C30503hv(@NotNull String name, @Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull InterfaceC30504a adapterStatus, @Nullable ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
        this.f80201a = name;
        this.f80202b = str;
        this.f80203c = z;
        this.f80204d = str2;
        this.f80205e = str3;
        this.f80206f = str4;
        this.f80207g = adapterStatus;
        this.f80208h = arrayList;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC30504a m33465a() {
        return this.f80207g;
    }

    @Nullable
    /* renamed from: b */
    public final String m33464b() {
        return this.f80204d;
    }

    @Nullable
    /* renamed from: c */
    public final String m33463c() {
        return this.f80205e;
    }

    @Nullable
    /* renamed from: d */
    public final String m33462d() {
        return this.f80202b;
    }

    @NotNull
    /* renamed from: e */
    public final String m33461e() {
        return this.f80201a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30503hv)) {
            return false;
        }
        C30503hv c30503hv = (C30503hv) obj;
        if (Intrinsics.m17075f(this.f80201a, c30503hv.f80201a) && Intrinsics.m17075f(this.f80202b, c30503hv.f80202b) && this.f80203c == c30503hv.f80203c && Intrinsics.m17075f(this.f80204d, c30503hv.f80204d) && Intrinsics.m17075f(this.f80205e, c30503hv.f80205e) && Intrinsics.m17075f(this.f80206f, c30503hv.f80206f) && Intrinsics.m17075f(this.f80207g, c30503hv.f80207g) && Intrinsics.m17075f(this.f80208h, c30503hv.f80208h)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m33460f() {
        return this.f80206f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f80201a.hashCode() * 31;
        String str = this.f80202b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int m29848a = C31331s6.m29848a(this.f80203c, (hashCode5 + hashCode) * 31, 31);
        String str2 = this.f80204d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (m29848a + hashCode2) * 31;
        String str3 = this.f80205e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.f80206f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int hashCode6 = (this.f80207g.hashCode() + ((i3 + hashCode4) * 31)) * 31;
        List<String> list = this.f80208h;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f80201a;
        String str2 = this.f80202b;
        boolean z = this.f80203c;
        String str3 = this.f80204d;
        String str4 = this.f80205e;
        String str5 = this.f80206f;
        InterfaceC30504a interfaceC30504a = this.f80207g;
        List<String> list = this.f80208h;
        return "DebugPanelAdapterData(name=" + str + ", logoUrl=" + str2 + ", adapterIntegrationStatus=" + z + ", adapterVersion=" + str3 + ", latestAdapterVersion=" + str4 + ", sdkVersion=" + str5 + ", adapterStatus=" + interfaceC30504a + ", formats=" + list + ")";
    }
}

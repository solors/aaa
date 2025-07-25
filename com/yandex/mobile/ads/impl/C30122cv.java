package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cv */
/* loaded from: classes8.dex */
public final class C30122cv {
    @Nullable

    /* renamed from: a */
    private final String f77775a;
    @NotNull

    /* renamed from: b */
    private final String f77776b;
    @NotNull

    /* renamed from: c */
    private final List<C30341fw> f77777c;
    @Nullable

    /* renamed from: d */
    private final String f77778d;
    @Nullable

    /* renamed from: e */
    private final String f77779e;
    @NotNull

    /* renamed from: f */
    private final InterfaceC30123a f77780f;

    /* renamed from: com.yandex.mobile.ads.impl.cv$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30123a {

        /* renamed from: com.yandex.mobile.ads.impl.cv$a$a */
        /* loaded from: classes8.dex */
        public static final class C30124a implements InterfaceC30123a {
            @NotNull

            /* renamed from: a */
            public static final C30124a f77781a = new C30124a();

            private C30124a() {
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.cv$a$b */
        /* loaded from: classes8.dex */
        public static final class C30125b implements InterfaceC30123a {
            @Nullable

            /* renamed from: a */
            private final C30053bx f77782a;
            @NotNull

            /* renamed from: b */
            private final List<C29967ax> f77783b;

            public C30125b(@Nullable C30053bx c30053bx, @NotNull List<C29967ax> cpmFloors) {
                Intrinsics.checkNotNullParameter(cpmFloors, "cpmFloors");
                this.f77782a = c30053bx;
                this.f77783b = cpmFloors;
            }

            @NotNull
            /* renamed from: a */
            public final List<C29967ax> m35149a() {
                return this.f77783b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C30125b)) {
                    return false;
                }
                C30125b c30125b = (C30125b) obj;
                if (Intrinsics.m17075f(this.f77782a, c30125b.f77782a) && Intrinsics.m17075f(this.f77783b, c30125b.f77783b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                C30053bx c30053bx = this.f77782a;
                if (c30053bx == null) {
                    hashCode = 0;
                } else {
                    hashCode = c30053bx.hashCode();
                }
                return this.f77783b.hashCode() + (hashCode * 31);
            }

            @NotNull
            public final String toString() {
                C30053bx c30053bx = this.f77782a;
                List<C29967ax> list = this.f77783b;
                return "Waterfall(currency=" + c30053bx + ", cpmFloors=" + list + ")";
            }
        }
    }

    public C30122cv(@Nullable String str, @NotNull String adapterName, @NotNull ArrayList parameters, @Nullable String str2, @Nullable String str3, @NotNull InterfaceC30123a type) {
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f77775a = str;
        this.f77776b = adapterName;
        this.f77777c = parameters;
        this.f77778d = str2;
        this.f77779e = str3;
        this.f77780f = type;
    }

    @Nullable
    /* renamed from: a */
    public final String m35155a() {
        return this.f77778d;
    }

    @NotNull
    /* renamed from: b */
    public final String m35154b() {
        return this.f77776b;
    }

    @Nullable
    /* renamed from: c */
    public final String m35153c() {
        return this.f77775a;
    }

    @Nullable
    /* renamed from: d */
    public final String m35152d() {
        return this.f77779e;
    }

    @NotNull
    /* renamed from: e */
    public final List<C30341fw> m35151e() {
        return this.f77777c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30122cv)) {
            return false;
        }
        C30122cv c30122cv = (C30122cv) obj;
        if (Intrinsics.m17075f(this.f77775a, c30122cv.f77775a) && Intrinsics.m17075f(this.f77776b, c30122cv.f77776b) && Intrinsics.m17075f(this.f77777c, c30122cv.f77777c) && Intrinsics.m17075f(this.f77778d, c30122cv.f77778d) && Intrinsics.m17075f(this.f77779e, c30122cv.f77779e) && Intrinsics.m17075f(this.f77780f, c30122cv.f77780f)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final InterfaceC30123a m35150f() {
        return this.f77780f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f77775a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int m30807a = C31097p9.m30807a(this.f77777c, C31014o3.m31189a(this.f77776b, hashCode * 31, 31), 31);
        String str2 = this.f77778d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (m30807a + hashCode2) * 31;
        String str3 = this.f77779e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.f77780f.hashCode() + ((i2 + i) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f77775a;
        String str2 = this.f77776b;
        List<C30341fw> list = this.f77777c;
        String str3 = this.f77778d;
        String str4 = this.f77779e;
        InterfaceC30123a interfaceC30123a = this.f77780f;
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + str + ", adapterName=" + str2 + ", parameters=" + list + ", adUnitId=" + str3 + ", networkAdUnitIdName=" + str4 + ", type=" + interfaceC30123a + ")";
    }
}

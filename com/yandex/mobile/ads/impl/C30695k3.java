package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k3 */
/* loaded from: classes8.dex */
public final class C30695k3 extends yc2 {

    /* renamed from: d */
    public static final /* synthetic */ int f81250d = 0;
    @NotNull

    /* renamed from: c */
    private final EnumC31171q3 f81251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30695k3(@NotNull EnumC31171q3 reason, @Nullable c91 c91Var) {
        super(c91Var);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f81251c = reason;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC31171q3 m32679a() {
        return this.f81251c;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(C30695k3.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        if (this.f81251c == ((C30695k3) obj).f81251c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81251c.hashCode();
    }

    /* renamed from: com.yandex.mobile.ads.impl.k3$a */
    /* loaded from: classes8.dex */
    public static final class C30696a {
        @NotNull
        /* renamed from: a */
        public static C30695k3 m32678a(@Nullable c91 c91Var) {
            EnumC31171q3 enumC31171q3;
            int i = c91Var != null ? c91Var.f77556a : -1;
            um0.m28727b(Integer.valueOf(i));
            if (204 == i) {
                enumC31171q3 = EnumC31171q3.f84191d;
            } else {
                Map<String, String> responseHeaders = c91Var != null ? c91Var.f77558c : null;
                Integer valueOf = c91Var != null ? Integer.valueOf(c91Var.f77556a) : null;
                if (valueOf != null && 400 == valueOf.intValue() && responseHeaders != null) {
                    df0 httpHeader = df0.f78079Y;
                    int i2 = wc0.f87204b;
                    Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                    Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
                    String m27983a = wc0.m27983a(responseHeaders, httpHeader);
                    if (m27983a != null && Boolean.parseBoolean(m27983a)) {
                        enumC31171q3 = EnumC31171q3.f84195h;
                    }
                }
                if (403 == i) {
                    enumC31171q3 = EnumC31171q3.f84194g;
                } else if (404 == i) {
                    enumC31171q3 = EnumC31171q3.f84189b;
                } else if (500 <= i && i <= 599) {
                    enumC31171q3 = EnumC31171q3.f84193f;
                } else if (-1 == i) {
                    enumC31171q3 = EnumC31171q3.f84198k;
                } else {
                    enumC31171q3 = EnumC31171q3.f84192e;
                }
            }
            return new C30695k3(enumC31171q3, c91Var);
        }

        @NotNull
        /* renamed from: a */
        public static C30695k3 m32677a(@NotNull yc2 volleyError) {
            EnumC31171q3 enumC31171q3;
            Intrinsics.checkNotNullParameter(volleyError, "volleyError");
            c91 c91Var = volleyError.f88158b;
            Integer valueOf = c91Var != null ? Integer.valueOf(c91Var.f77556a) : null;
            if (valueOf == null) {
                if (volleyError instanceof r91) {
                    enumC31171q3 = EnumC31171q3.f84198k;
                } else if (volleyError instanceof j02) {
                    enumC31171q3 = EnumC31171q3.f84199l;
                } else if (volleyError instanceof C30313fh) {
                    enumC31171q3 = EnumC31171q3.f84200m;
                } else if (volleyError instanceof C29954ao) {
                    enumC31171q3 = EnumC31171q3.f84201n;
                } else {
                    enumC31171q3 = volleyError instanceof fc1 ? EnumC31171q3.f84202o : EnumC31171q3.f84203p;
                }
            } else {
                int intValue = valueOf.intValue();
                enumC31171q3 = (500 > intValue || intValue > 599) ? EnumC31171q3.f84192e : EnumC31171q3.f84193f;
            }
            um0.m28727b(valueOf);
            return new C30695k3(enumC31171q3, c91Var);
        }
    }
}

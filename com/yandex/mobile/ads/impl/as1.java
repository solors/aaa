package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.InterfaceC30263eq;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class as1 {
    @NotNull

    /* renamed from: j */
    private static final Object f76893j = new Object();
    @Nullable

    /* renamed from: k */
    private static volatile as1 f76894k;

    /* renamed from: l */
    public static final /* synthetic */ int f76895l = 0;
    @Nullable

    /* renamed from: a */
    private yp1 f76896a;
    @Nullable

    /* renamed from: b */
    private Boolean f76897b;
    @Nullable

    /* renamed from: c */
    private Boolean f76898c;

    /* renamed from: d */
    private boolean f76899d;

    /* renamed from: e */
    private boolean f76900e;

    /* renamed from: f */
    private boolean f76901f;

    /* renamed from: g */
    private boolean f76902g;
    @Nullable

    /* renamed from: h */
    private Integer f76903h;

    /* renamed from: i */
    private boolean f76904i;

    /* renamed from: com.yandex.mobile.ads.impl.as1$a */
    /* loaded from: classes8.dex */
    public static final class C29962a {
        @NotNull
        /* renamed from: a */
        public static as1 m35776a() {
            as1 as1Var;
            as1 as1Var2 = as1.f76894k;
            if (as1Var2 == null) {
                synchronized (as1.f76893j) {
                    as1Var = as1.f76894k;
                    if (as1Var == null) {
                        as1Var = new as1(0);
                        as1.f76894k = as1Var;
                    }
                }
                return as1Var;
            }
            return as1Var2;
        }
    }

    private as1() {
        this.f76901f = true;
        this.f76902g = true;
    }

    @Nullable
    /* renamed from: c */
    public static void m35789c() {
        synchronized (f76893j) {
        }
    }

    /* renamed from: d */
    public final boolean m35787d() {
        boolean z;
        synchronized (f76893j) {
            z = this.f76904i;
        }
        return z;
    }

    @Nullable
    /* renamed from: e */
    public final Integer m35785e() {
        Integer num;
        synchronized (f76893j) {
            num = this.f76903h;
        }
        return num;
    }

    @Nullable
    /* renamed from: f */
    public final Boolean m35783f() {
        Boolean bool;
        synchronized (f76893j) {
            bool = this.f76898c;
        }
        return bool;
    }

    /* renamed from: g */
    public final boolean m35781g() {
        boolean z;
        synchronized (f76893j) {
            z = this.f76902g;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean m35780h() {
        boolean z;
        synchronized (f76893j) {
            z = this.f76899d;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean m35779i() {
        boolean z;
        synchronized (f76893j) {
            z = this.f76900e;
        }
        return z;
    }

    @Nullable
    /* renamed from: j */
    public final Boolean m35778j() {
        Boolean bool;
        synchronized (f76893j) {
            bool = this.f76897b;
        }
        return bool;
    }

    /* renamed from: k */
    public final boolean m35777k() {
        boolean z;
        synchronized (f76893j) {
            z = this.f76901f;
        }
        return z;
    }

    @Nullable
    /* renamed from: a */
    public final yp1 m35796a(@NotNull Context context) {
        yp1 yp1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f76893j) {
            if (this.f76896a == null) {
                InterfaceC30263eq.f78746a.getClass();
                this.f76896a = InterfaceC30263eq.C30264a.m34472a(context).mo34107a();
            }
            yp1Var = this.f76896a;
        }
        return yp1Var;
    }

    /* renamed from: b */
    public final void m35790b(boolean z) {
        synchronized (f76893j) {
            this.f76899d = z;
            this.f76900e = z;
            this.f76901f = z;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: c */
    public final void m35788c(boolean z) {
        synchronized (f76893j) {
            this.f76898c = Boolean.valueOf(z);
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: d */
    public final void m35786d(boolean z) {
        synchronized (f76893j) {
            this.f76902g = z;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: e */
    public final void m35784e(boolean z) {
        synchronized (f76893j) {
            this.f76904i = z;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: f */
    public final void m35782f(boolean z) {
        synchronized (f76893j) {
            this.f76897b = Boolean.valueOf(z);
            Unit unit = Unit.f99208a;
        }
    }

    public /* synthetic */ as1(int i) {
        this();
    }

    /* renamed from: a */
    public final void m35795a(@NotNull Context context, @NotNull yp1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (f76893j) {
            this.f76896a = sdkConfiguration;
            InterfaceC30263eq.f78746a.getClass();
            InterfaceC30263eq.C30264a.m34472a(context).mo34106a(sdkConfiguration);
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public final void m35793a(@Nullable Integer num) {
        synchronized (f76893j) {
            this.f76903h = num;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public final void m35792a(boolean z) {
        synchronized (f76893j) {
            this.f76899d = z;
            this.f76901f = z;
            Unit unit = Unit.f99208a;
        }
    }
}

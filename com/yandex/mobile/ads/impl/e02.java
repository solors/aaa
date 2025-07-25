package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class e02 {
    @NotNull

    /* renamed from: a */
    private final th1 f78398a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31326s1 f78399b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC29972ay f78400c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC30261eo f78401d;
    @NotNull

    /* renamed from: e */
    private final C31597uo f78402e;

    public /* synthetic */ e02(th1 th1Var, InterfaceC31326s1 interfaceC31326s1, InterfaceC29972ay interfaceC29972ay, InterfaceC30261eo interfaceC30261eo) {
        this(th1Var, interfaceC31326s1, interfaceC29972ay, interfaceC30261eo, new C31597uo());
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC31326s1 m34734a() {
        return this.f78399b;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC30261eo m34733b() {
        return this.f78401d;
    }

    @NotNull
    /* renamed from: c */
    public final C31597uo m34732c() {
        return this.f78402e;
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC29972ay m34731d() {
        return this.f78400c;
    }

    @NotNull
    /* renamed from: e */
    public final th1 m34730e() {
        return this.f78398a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e02)) {
            return false;
        }
        e02 e02Var = (e02) obj;
        if (Intrinsics.m17075f(this.f78398a, e02Var.f78398a) && Intrinsics.m17075f(this.f78399b, e02Var.f78399b) && Intrinsics.m17075f(this.f78400c, e02Var.f78400c) && Intrinsics.m17075f(this.f78401d, e02Var.f78401d) && Intrinsics.m17075f(this.f78402e, e02Var.f78402e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f78399b.hashCode();
        int hashCode2 = this.f78400c.hashCode();
        int hashCode3 = this.f78401d.hashCode();
        return this.f78402e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f78398a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        th1 th1Var = this.f78398a;
        InterfaceC31326s1 interfaceC31326s1 = this.f78399b;
        InterfaceC29972ay interfaceC29972ay = this.f78400c;
        InterfaceC30261eo interfaceC30261eo = this.f78401d;
        C31597uo c31597uo = this.f78402e;
        return "TimeProviderContainer(progressIncrementer=" + th1Var + ", adBlockDurationProvider=" + interfaceC31326s1 + ", defaultContentDelayProvider=" + interfaceC29972ay + ", closableAdChecker=" + interfaceC30261eo + ", closeTimerProgressIncrementer=" + c31597uo + ")";
    }

    public e02(@NotNull th1 progressIncrementer, @NotNull InterfaceC31326s1 adBlockDurationProvider, @NotNull InterfaceC29972ay defaultContentDelayProvider, @NotNull InterfaceC30261eo closableAdChecker, @NotNull C31597uo closeTimerProgressIncrementer) {
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        this.f78398a = progressIncrementer;
        this.f78399b = adBlockDurationProvider;
        this.f78400c = defaultContentDelayProvider;
        this.f78401d = closableAdChecker;
        this.f78402e = closeTimerProgressIncrementer;
    }
}

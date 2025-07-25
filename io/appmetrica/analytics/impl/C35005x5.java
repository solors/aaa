package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.x5 */
/* loaded from: classes9.dex */
public final class C35005x5 implements InterfaceC33818Cc {

    /* renamed from: a */
    public final String f95588a;

    public C35005x5(@NotNull String str) {
        this.f95588a = str;
    }

    @NotNull
    /* renamed from: a */
    public final C35005x5 m20788a(@NotNull String str) {
        return new C35005x5(str);
    }

    @NotNull
    /* renamed from: b */
    public final String m20787b() {
        return this.f95588a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C35005x5) && Intrinsics.m17075f(this.f95588a, ((C35005x5) obj).f95588a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f95588a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f95588a + ')';
    }

    /* renamed from: a */
    public static C35005x5 m20789a(C35005x5 c35005x5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35005x5.f95588a;
        }
        c35005x5.getClass();
        return new C35005x5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33818Cc
    @NotNull
    /* renamed from: a */
    public final String mo20790a() {
        return this.f95588a;
    }
}

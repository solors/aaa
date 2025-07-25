package com.ironsource;

import com.ironsource.C20303m1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.e0 */
/* loaded from: classes6.dex */
public final class C19796e0 {
    @NotNull

    /* renamed from: a */
    private C20303m1.EnumC20304a f49847a;

    public C19796e0(@NotNull C20303m1.EnumC20304a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f49847a = performance;
    }

    /* renamed from: a */
    public static /* synthetic */ C19796e0 m58836a(C19796e0 c19796e0, C20303m1.EnumC20304a enumC20304a, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC20304a = c19796e0.f49847a;
        }
        return c19796e0.m58835a(enumC20304a);
    }

    @NotNull
    /* renamed from: b */
    public final C20303m1.EnumC20304a m58834b() {
        return this.f49847a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19796e0) && this.f49847a == ((C19796e0) obj).f49847a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f49847a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.f49847a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19796e0 m58835a(@NotNull C20303m1.EnumC20304a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new C19796e0(performance);
    }

    /* renamed from: b */
    public final void m58833b(@NotNull C20303m1.EnumC20304a enumC20304a) {
        Intrinsics.checkNotNullParameter(enumC20304a, "<set-?>");
        this.f49847a = enumC20304a;
    }

    @NotNull
    /* renamed from: a */
    public final C20303m1.EnumC20304a m58837a() {
        return this.f49847a;
    }
}

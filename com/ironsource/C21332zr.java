package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.zr */
/* loaded from: classes6.dex */
public final class C21332zr {

    /* renamed from: a */
    private final int f54828a;
    @NotNull

    /* renamed from: b */
    private final EnumC19963g8 f54829b;

    public C21332zr(int i, @NotNull EnumC19963g8 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f54828a = i;
        this.f54829b = unit;
    }

    /* renamed from: a */
    public final int m53739a() {
        return this.f54828a;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC19963g8 m53738b() {
        return this.f54829b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f54828a + ", unit=" + this.f54829b + ')';
    }
}

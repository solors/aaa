package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.pn */
/* loaded from: classes6.dex */
public final class C20650pn {

    /* renamed from: a */
    private final long f52446a;
    @NotNull

    /* renamed from: b */
    private final EnumC19963g8 f52447b;

    public C20650pn(long j, @NotNull EnumC19963g8 unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f52446a = j;
        this.f52447b = unit;
    }

    /* renamed from: a */
    public final long m55775a() {
        return this.f52446a;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC19963g8 m55774b() {
        return this.f52447b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f52446a + " unit=" + this.f52447b + ')';
    }

    public /* synthetic */ C20650pn(long j, EnumC19963g8 enumC19963g8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? EnumC19963g8.Second : enumC19963g8);
    }
}

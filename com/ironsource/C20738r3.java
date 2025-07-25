package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.r3 */
/* loaded from: classes6.dex */
public final class C20738r3 {
    @NotNull

    /* renamed from: a */
    private final String f52702a;

    public C20738r3() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C20738r3 m55565a(C20738r3 c20738r3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20738r3.f52702a;
        }
        return c20738r3.m55564a(str);
    }

    @NotNull
    /* renamed from: b */
    public final String m55563b() {
        return this.f52702a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20738r3) && Intrinsics.m17075f(this.f52702a, ((C20738r3) obj).f52702a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f52702a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f52702a + ')';
    }

    public C20738r3(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f52702a = auctionData;
    }

    @NotNull
    /* renamed from: a */
    public final C20738r3 m55564a(@NotNull String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C20738r3(auctionData);
    }

    public /* synthetic */ C20738r3(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @NotNull
    /* renamed from: a */
    public final String m55566a() {
        return this.f52702a;
    }
}

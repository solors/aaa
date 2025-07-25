package com.ironsource;

import com.ironsource.mediationsdk.C20406i;
import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.l6 */
/* loaded from: classes6.dex */
public final class C20251l6 extends C20500n1 {
    @Nullable

    /* renamed from: b */
    private final ISBannerSize f50961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20251l6(@NotNull C19610b1 adProperties, @Nullable ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f50961b = iSBannerSize;
    }

    @Override // com.ironsource.C20500n1, com.ironsource.InterfaceC21293z4
    /* renamed from: a */
    public void mo53908a(@NotNull C20406i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.mo53908a(auctionRequestParams);
        auctionRequestParams.m56856a(this.f50961b);
    }
}

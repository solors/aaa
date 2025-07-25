package com.ironsource;

import com.ironsource.mediationsdk.C20406i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.n1 */
/* loaded from: classes6.dex */
public class C20500n1 implements InterfaceC21293z4 {
    @NotNull

    /* renamed from: a */
    private final C19610b1 f52106a;

    public C20500n1(@NotNull C19610b1 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f52106a = adProperties;
    }

    @Override // com.ironsource.InterfaceC21293z4
    /* renamed from: a */
    public void mo53908a(@NotNull C20406i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.m56844b(this.f52106a.m59387b());
        auctionRequestParams.m56849a(this.f52106a.m59389a().toString());
        auctionRequestParams.m56850a(Boolean.TRUE);
    }
}

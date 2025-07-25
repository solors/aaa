package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.om */
/* loaded from: classes6.dex */
public final class C20597om implements InterfaceC20532nm {
    @Override // com.ironsource.InterfaceC20532nm
    @NotNull
    /* renamed from: a */
    public String mo55948a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }

    @Override // com.ironsource.InterfaceC20532nm
    /* renamed from: a */
    public void mo55947a(@NotNull C20473mi adInstance, @NotNull C20648pm loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.m55776a());
    }
}

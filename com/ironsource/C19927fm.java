package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.fm */
/* loaded from: classes6.dex */
public final class C19927fm implements InterfaceC19839em {
    @Override // com.ironsource.InterfaceC19839em
    /* renamed from: a */
    public void mo58538a(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("destroy ad with identifier: " + adInstance.m56302e() + " failed. error: " + e.getMessage());
        }
    }
}

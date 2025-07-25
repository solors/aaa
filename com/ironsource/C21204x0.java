package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.x0 */
/* loaded from: classes6.dex */
public final class C21204x0 implements InterfaceC21161w0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC21021tm f54397a;

    public C21204x0(@NotNull InterfaceC21021tm networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f54397a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC21161w0
    /* renamed from: a */
    public void mo54210a(@NotNull Activity activity, @NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("Show: networkInstanceId=" + adInstance.m56300g() + " adInstanceId=" + adInstance.m56302e());
        this.f54397a.mo54614a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC21161w0
    /* renamed from: a */
    public boolean mo54209a(@NotNull C20473mi adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f54397a.mo54613a(adInstance);
    }
}

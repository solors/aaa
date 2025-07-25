package com.ironsource;

import com.ironsource.lifecycle.C20271b;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.xe */
/* loaded from: classes6.dex */
public final class C21222xe implements InterfaceC19953g4 {
    @Override // com.ironsource.InterfaceC19953g4
    /* renamed from: a */
    public void mo54142a(@NotNull InterfaceC20105ij observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        C20271b.m57448d().m57457a(observer);
    }

    @Override // com.ironsource.InterfaceC19953g4
    /* renamed from: b */
    public void mo54141b(@NotNull InterfaceC20105ij observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        C20271b.m57448d().m57453b(observer);
    }
}

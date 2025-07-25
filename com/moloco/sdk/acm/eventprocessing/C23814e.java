package com.moloco.sdk.acm.eventprocessing;

import com.moloco.sdk.acm.p544db.C23794b;
import com.moloco.sdk.acm.services.InterfaceC23854g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.acm.eventprocessing.e */
/* loaded from: classes7.dex */
public final class C23814e {
    @NotNull

    /* renamed from: a */
    public final InterfaceC23854g f61808a;

    /* renamed from: b */
    public final long f61809b;

    public C23814e(@NotNull InterfaceC23854g timeProviderService, long j) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f61808a = timeProviderService;
        this.f61809b = j;
    }

    /* renamed from: a */
    public final boolean m47681a(@NotNull C23794b eventEntity) {
        Intrinsics.checkNotNullParameter(eventEntity, "eventEntity");
        if (this.f61808a.invoke() - eventEntity.m47705f() >= this.f61809b * 1000) {
            return true;
        }
        return false;
    }
}

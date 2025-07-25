package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.InterfaceC24252b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* renamed from: com.moloco.sdk.internal.services.usertracker.c */
/* loaded from: classes7.dex */
public final class C24395c implements InterfaceC24394b {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24252b0 f63128a;

    public C24395c(@NotNull InterfaceC24252b0 dataStoreService) {
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.f63128a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.InterfaceC24394b
    @Nullable
    /* renamed from: a */
    public Object mo46499a(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object mo46594b = this.f63128a.mo46594b("com.moloco.sdk.mref", str, continuation);
        m6959e = C42688d.m6959e();
        if (mo46594b == m6959e) {
            return mo46594b;
        }
        return Unit.f99208a;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.InterfaceC24394b
    @Nullable
    /* renamed from: b */
    public Object mo46498b(@NotNull Continuation<? super String> continuation) {
        return this.f63128a.mo46595a("com.moloco.sdk.mref", continuation);
    }
}

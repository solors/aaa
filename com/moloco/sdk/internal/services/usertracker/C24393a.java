package com.moloco.sdk.internal.services.usertracker;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.usertracker.a */
/* loaded from: classes7.dex */
public final class C24393a implements InterfaceC24396d {
    @Override // com.moloco.sdk.internal.services.usertracker.InterfaceC24396d
    @NotNull
    /* renamed from: a */
    public String mo46497a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        return uuid;
    }
}

package com.ironsource;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.wj */
/* loaded from: classes6.dex */
public final class C21183wj {
    @NotNull

    /* renamed from: a */
    private final UUID f54342a;

    public C21183wj() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        this.f54342a = randomUUID;
    }

    @NotNull
    /* renamed from: a */
    public final String m54337a() {
        String uuid = this.f54342a.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    @NotNull
    /* renamed from: b */
    public final UUID m54336b() {
        return this.f54342a;
    }
}

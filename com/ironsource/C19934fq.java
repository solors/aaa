package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.fq */
/* loaded from: classes6.dex */
public final class C19934fq extends IllegalArgumentException {
    @NotNull

    /* renamed from: a */
    private final IronSourceError f50134a;

    /* renamed from: b */
    private final int f50135b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19934fq(@NotNull IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.f50134a = error;
        this.f50135b = error.getErrorCode();
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceError m58523a() {
        return this.f50134a;
    }

    /* renamed from: b */
    public final int m58522b() {
        return this.f50135b;
    }
}

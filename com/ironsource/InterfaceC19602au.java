package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.au */
/* loaded from: classes6.dex */
public interface InterfaceC19602au {
    /* renamed from: a */
    void mo54173a() throws C19934fq;

    /* renamed from: a */
    default void m59390a(boolean z, @NotNull Functions<? extends IronSourceError> lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (z) {
            return;
        }
        throw new C19934fq(lazyError.invoke());
    }
}

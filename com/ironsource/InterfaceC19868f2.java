package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f2 */
/* loaded from: classes6.dex */
public interface InterfaceC19868f2 {
    @Nullable
    /* renamed from: a */
    Unit mo54491a(@NotNull C20617p1 c20617p1, @Nullable IronSourceError ironSourceError);

    /* renamed from: i */
    default void mo54483i(@NotNull C20617p1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
    }

    @Nullable
    /* renamed from: l */
    Unit mo54482l(@NotNull C20617p1 c20617p1);
}

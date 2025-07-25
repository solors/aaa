package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.wc */
/* loaded from: classes6.dex */
public interface InterfaceC21174wc {
    /* renamed from: c */
    void mo54354c(@NotNull C20617p1 c20617p1, @Nullable IronSourceError ironSourceError);

    /* renamed from: d */
    void mo54353d(@NotNull C20617p1 c20617p1, @Nullable IronSourceError ironSourceError);

    /* renamed from: e */
    void mo54352e(@NotNull C20617p1 c20617p1);

    /* renamed from: g */
    default void mo54351g(@NotNull C20617p1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
    }

    /* renamed from: k */
    void mo54350k(@NotNull C20617p1 c20617p1);
}

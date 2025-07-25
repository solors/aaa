package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.u0 */
/* loaded from: classes6.dex */
public interface InterfaceC21056u0 {
    @NotNull
    /* renamed from: a */
    String mo54541a();

    /* renamed from: a */
    default void mo54540a(@NotNull C20473mi adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
    }
}

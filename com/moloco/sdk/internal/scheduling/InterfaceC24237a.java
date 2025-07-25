package com.moloco.sdk.internal.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.moloco.sdk.internal.scheduling.a */
/* loaded from: classes7.dex */
public interface InterfaceC24237a {
    @NotNull
    /* renamed from: a */
    CoroutineContext mo46738a();

    @NotNull
    CoroutineContext getDefault();

    @NotNull
    CoroutineContext getIo();

    @NotNull
    CoroutineContext getMain();
}

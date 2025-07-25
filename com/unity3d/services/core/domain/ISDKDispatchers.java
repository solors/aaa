package com.unity3d.services.core.domain;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: ISDKDispatchers.kt */
@Metadata
/* loaded from: classes7.dex */
public interface ISDKDispatchers {
    @NotNull
    CoroutineDispatcher getDefault();

    @NotNull
    CoroutineDispatcher getIo();

    @NotNull
    CoroutineDispatcher getMain();
}

package com.unity3d.services.core.domain;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: SDKDispatchers.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SDKDispatchers implements ISDKDispatchers {
    @NotNull

    /* renamed from: io */
    private final CoroutineDispatcher f74986io = Dispatchers.m16377b();
    @NotNull

    /* renamed from: default  reason: not valid java name */
    private final CoroutineDispatcher f119460default = Dispatchers.m16378a();
    @NotNull
    private final CoroutineDispatcher main = Dispatchers.m16376c();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getDefault() {
        return this.f119460default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getIo() {
        return this.f74986io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public CoroutineDispatcher getMain() {
        return this.main;
    }
}

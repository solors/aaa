package com.moloco.sdk.internal.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.scheduling.b */
/* loaded from: classes7.dex */
public final class C24238b implements InterfaceC24237a {
    @Override // com.moloco.sdk.internal.scheduling.InterfaceC24237a
    @NotNull
    /* renamed from: b */
    public CoroutineDispatcher getDefault() {
        return Dispatchers.m16378a();
    }

    @Override // com.moloco.sdk.internal.scheduling.InterfaceC24237a
    @NotNull
    /* renamed from: c */
    public CoroutineDispatcher getIo() {
        return Dispatchers.m16377b();
    }

    @Override // com.moloco.sdk.internal.scheduling.InterfaceC24237a
    @NotNull
    /* renamed from: d */
    public CoroutineDispatcher getMain() {
        return Dispatchers.m16376c();
    }

    @Override // com.moloco.sdk.internal.scheduling.InterfaceC24237a
    @NotNull
    /* renamed from: e */
    public CoroutineDispatcher mo46738a() {
        return Dispatchers.m16376c().getImmediate();
    }
}

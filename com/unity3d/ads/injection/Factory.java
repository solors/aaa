package com.unity3d.ads.injection;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;

/* compiled from: Factory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Factory<T> implements InterfaceC38501j<T> {
    @NotNull
    private final Functions<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // p804nd.InterfaceC38501j
    public T getValue() {
        return this.initializer.invoke();
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        return false;
    }
}

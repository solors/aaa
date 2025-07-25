package com.mobilefuse.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TestableLazy.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TestableLazy<T> {
    private T _value;
    private final Functions<T> initializer;
    private boolean isInitialized;

    /* JADX WARN: Multi-variable type inference failed */
    public TestableLazy(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    public final T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (!this.isInitialized) {
            this._value = this.initializer.invoke();
            this.isInitialized = true;
        }
        T t = this._value;
        Intrinsics.m17074g(t);
        return t;
    }

    public final void reset() {
        this.isInitialized = false;
        this._value = null;
    }

    public final void setValue(@Nullable Object obj, @NotNull KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(property, "property");
        this._value = t;
        this.isInitialized = true;
    }
}

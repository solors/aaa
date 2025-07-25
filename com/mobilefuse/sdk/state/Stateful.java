package com.mobilefuse.sdk.state;

import java.lang.Enum;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Stateful.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class Stateful<T extends Enum<T>> {
    @NotNull
    private Functions<Unit> onStateChanged;
    @NotNull
    private T state;

    public Stateful(@NotNull T initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.state = initialState;
        this.onStateChanged = Stateful$onStateChanged$1.INSTANCE;
    }

    public final void followState(@NotNull Stateful<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.onStateChanged = new Stateful$followState$1(this, other);
    }

    @NotNull
    public final Functions<Unit> getOnStateChanged() {
        return this.onStateChanged;
    }

    @NotNull
    public final T getState() {
        return this.state;
    }

    public final void setOnStateChanged(@NotNull Functions<Unit> functions) {
        Intrinsics.checkNotNullParameter(functions, "<set-?>");
        this.onStateChanged = functions;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setState(@NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.m17075f(this.state, value)) {
            return;
        }
        this.state = value;
        this.onStateChanged.invoke();
    }

    public final boolean stateIsNot(@NotNull T... validStates) {
        Intrinsics.checkNotNullParameter(validStates, "validStates");
        for (T t : validStates) {
            if (Intrinsics.m17075f(this.state, t)) {
                return false;
            }
        }
        return true;
    }

    public final boolean stateIsOneOf(@NotNull T... validStates) {
        Intrinsics.checkNotNullParameter(validStates, "validStates");
        for (T t : validStates) {
            if (Intrinsics.m17075f(this.state, t)) {
                return true;
            }
        }
        return false;
    }
}

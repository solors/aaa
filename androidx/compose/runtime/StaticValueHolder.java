package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ValueHolders.kt */
@Metadata
/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements State<T> {
    private final T value;

    public StaticValueHolder(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = staticValueHolder.getValue();
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return getValue();
    }

    @NotNull
    public final StaticValueHolder<T> copy(T t) {
        return new StaticValueHolder<>(t);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StaticValueHolder) && Intrinsics.m17075f(getValue(), ((StaticValueHolder) obj).getValue())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    @NotNull
    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}

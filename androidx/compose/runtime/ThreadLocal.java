package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActualJvm.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    @NotNull
    private final Functions<T> initialValue;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocal(@NotNull Functions<? extends T> initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        this.initialValue = initialValue;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    protected T initialValue() {
        return this.initialValue.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t) {
        super.set(t);
    }
}

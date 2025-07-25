package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata
/* renamed from: androidx.compose.runtime.MutableState */
/* loaded from: classes.dex */
public interface SnapshotState<T> extends State<T> {
    T component1();

    @NotNull
    Function1<T, Unit> component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t);
}

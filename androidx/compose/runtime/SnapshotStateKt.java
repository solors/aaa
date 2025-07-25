package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import ge.InterfaceC33327h;
import ge.StateFlow;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, R r, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        return SnapshotFlow.collectAsState(interfaceC33327h, r, coroutineContext, composer, i, i2);
    }

    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull Functions<? extends T> functions) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(functions);
    }

    public static final <T> T getValue(@NotNull State<? extends T> state, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
    }

    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @NotNull
    public static final <T> SnapshotState<T> mutableStateOf(T t, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static /* synthetic */ SnapshotState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, snapshotMutationPolicy, i, obj2);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull Function1<? super State<?>, Unit> function1, @NotNull Function1<? super State<?>, Unit> function12, @NotNull Functions<? extends R> functions) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(function1, function12, functions);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, function2, composer, i);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    @NotNull
    public static final <T> State<T> rememberUpdatedState(T t, @Nullable Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> void setValue(@NotNull SnapshotState<T> snapshotState, @Nullable Object obj, @NotNull KProperty<?> kProperty, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(snapshotState, obj, kProperty, t);
    }

    @NotNull
    public static final <T> InterfaceC33327h<T> snapshotFlow(@NotNull Functions<? extends T> functions) {
        return SnapshotFlow.snapshotFlow(functions);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    @NotNull
    public static final <T> SnapshotStateList<T> toMutableStateList(@NotNull Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@NotNull Iterable<? extends Tuples<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull StateFlow<? extends T> stateFlow, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i, int i2) {
        return SnapshotFlow.collectAsState(stateFlow, coroutineContext, composer, i, i2);
    }

    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf(@NotNull T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@NotNull Tuples<? extends K, ? extends V>... tuplesArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(tuplesArr);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @Nullable Object obj, @NotNull Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @NotNull Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, function2, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t, @NotNull Object[] objArr, @NotNull Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t, objArr, (Function2) function2, composer, i);
    }
}

package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionLocal.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    @NotNull
    private final ValueHolders<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(Functions functions, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions);
    }

    @Composable
    @ReadOnlyComposable
    public final T getCurrent(@Nullable Composer composer, int i) {
        return (T) composer.consume(this);
    }

    @NotNull
    public final ValueHolders<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @Composable
    @NotNull
    public abstract State<T> provided$runtime_release(T t, @Nullable Composer composer, int i);

    private CompositionLocal(Functions<? extends T> functions) {
        this.defaultValueHolder = new ValueHolders<>(functions);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getDefaultValueHolder$runtime_release$annotations() {
    }
}

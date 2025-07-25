package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionLocal.kt */
@Metadata
/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticProvidableCompositionLocal(@NotNull Functions<? extends T> defaultFactory) {
        super(defaultFactory);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }

    @Override // androidx.compose.runtime.CompositionLocal
    @Composable
    @NotNull
    public State<T> provided$runtime_release(T t, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1121811719);
        StaticValueHolder staticValueHolder = new StaticValueHolder(t);
        composer.endReplaceableGroup();
        return staticValueHolder;
    }
}

package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionLocal.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    @NotNull
    private final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocals;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalContext(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> compositionLocals) {
        Intrinsics.checkNotNullParameter(compositionLocals, "compositionLocals");
        this.compositionLocals = compositionLocals;
    }

    @NotNull
    public final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocals$runtime_release() {
        return this.compositionLocals;
    }
}

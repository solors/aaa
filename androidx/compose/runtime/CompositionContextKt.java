package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositionContext.kt */
@Metadata
/* loaded from: classes.dex */
public final class CompositionContextKt {
    @NotNull
    private static final PersistentMap<CompositionLocal<Object>, State<Object>> EmptyCompositionLocalMap = extensions.persistentHashMapOf();

    public static final /* synthetic */ PersistentMap access$getEmptyCompositionLocalMap$p() {
        return EmptyCompositionLocalMap;
    }
}

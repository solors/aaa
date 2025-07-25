package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.o0 */
/* loaded from: classes7.dex */
public interface CoroutineScope {
    @NotNull
    CoroutineContext getCoroutineContext();
}

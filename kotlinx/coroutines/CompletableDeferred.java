package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.x */
/* loaded from: classes7.dex */
public interface CompletableDeferred<T> extends Deferred<T> {
    /* renamed from: b */
    boolean mo16073b(@NotNull Throwable th);

    /* renamed from: n */
    boolean mo16069n(T t);
}

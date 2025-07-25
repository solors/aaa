package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.a0 */
/* loaded from: classes7.dex */
public interface CompletableJob extends InterfaceC37708b2 {
    /* renamed from: b */
    boolean mo16373b(@NotNull Throwable th);

    boolean complete();
}

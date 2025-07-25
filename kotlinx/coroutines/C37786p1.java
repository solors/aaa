package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Exceptions.kt */
@Metadata
/* renamed from: kotlinx.coroutines.p1 */
/* loaded from: classes7.dex */
public final class C37786p1 {
    @NotNull
    /* renamed from: a */
    public static final CancellationException m16121a(@Nullable String str, @Nullable Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}

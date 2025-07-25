package p719ic;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ic.d */
/* loaded from: classes9.dex */
public final class ExceptionUtilsJvm {
    @NotNull
    /* renamed from: a */
    public static final Throwable m23028a(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Throwable th2 = th;
        while (th2 instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) th2;
            if (Intrinsics.m17075f(th2, cancellationException.getCause())) {
                return th;
            }
            th2 = cancellationException.getCause();
        }
        if (th2 != null) {
            return th2;
        }
        return th;
    }
}

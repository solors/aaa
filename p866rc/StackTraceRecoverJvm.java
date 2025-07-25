package p866rc;

import io.ktor.utils.p731io.C37231r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: rc.j */
/* loaded from: classes9.dex */
public final class StackTraceRecoverJvm {
    @NotNull
    /* renamed from: a */
    public static final Throwable m12540a(@NotNull Throwable th, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th2 != null && !Intrinsics.m17075f(th.getCause(), th2)) {
            Throwable m18698e = C37231r.m18698e(th, th2);
            if (m18698e == null) {
                return th;
            }
            m18698e.setStackTrace(th.getStackTrace());
            return m18698e;
        }
        return th;
    }
}

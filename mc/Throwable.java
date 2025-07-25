package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.z */
/* loaded from: classes9.dex */
public final class Throwable {
    @Nullable
    /* renamed from: a */
    public static final java.lang.Throwable m15184a(@NotNull java.lang.Throwable th) {
        java.lang.Throwable th2;
        Intrinsics.checkNotNullParameter(th, "<this>");
        while (true) {
            if (th != null) {
                th2 = th.getCause();
            } else {
                th2 = null;
            }
            if (th2 != null) {
                th = th.getCause();
            } else {
                return th;
            }
        }
    }
}

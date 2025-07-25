package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;

/* compiled from: Result.kt */
@Metadata
/* renamed from: nd.r */
/* loaded from: classes5.dex */
public final class C38508r {
    @NotNull
    /* renamed from: a */
    public static final Object m14540a(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.C38507b(exception);
    }

    /* renamed from: b */
    public static final void m14539b(@NotNull Object obj) {
        if (!(obj instanceof Result.C38507b)) {
            return;
        }
        throw ((Result.C38507b) obj).f101872b;
    }
}

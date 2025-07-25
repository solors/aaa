package p1074zb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: zb.a */
/* loaded from: classes9.dex */
public final class HttpClientCall extends IllegalStateException {
    @NotNull

    /* renamed from: b */
    private final String f118961b;

    public HttpClientCall(@NotNull C45245b call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f118961b = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f118961b;
    }
}

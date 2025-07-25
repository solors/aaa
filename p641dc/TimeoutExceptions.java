package p641dc;

import java.net.ConnectException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: dc.a */
/* loaded from: classes9.dex */
public final class TimeoutExceptions extends ConnectException {
    @Nullable

    /* renamed from: b */
    private final Throwable f89581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutExceptions(@NotNull String message, @Nullable Throwable th) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f89581b = th;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f89581b;
    }
}

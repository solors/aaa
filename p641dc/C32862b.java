package p641dc;

import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimeoutExceptions.kt */
@Metadata
/* renamed from: dc.b */
/* loaded from: classes9.dex */
public final class C32862b extends SocketTimeoutException {
    @Nullable

    /* renamed from: b */
    private final Throwable f89582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32862b(@NotNull String message, @Nullable Throwable th) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f89582b = th;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f89582b;
    }
}

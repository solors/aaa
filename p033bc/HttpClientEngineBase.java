package p033bc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: bc.a */
/* loaded from: classes9.dex */
public final class HttpClientEngineBase extends IllegalStateException {
    @Nullable

    /* renamed from: b */
    private final Throwable f1669b;

    public /* synthetic */ HttpClientEngineBase(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f1669b;
    }

    public HttpClientEngineBase(@Nullable Throwable th) {
        super("Client already closed");
        this.f1669b = th;
    }
}

package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata
/* renamed from: ie.i */
/* loaded from: classes8.dex */
public final class C33637i extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final transient CoroutineContext f92096b;

    public C33637i(@NotNull CoroutineContext coroutineContext) {
        this.f92096b = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return this.f92096b.toString();
    }
}

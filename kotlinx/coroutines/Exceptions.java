package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.c2 */
/* loaded from: classes7.dex */
public final class Exceptions extends CancellationException implements InterfaceC37735i0<Exceptions> {
    @NotNull

    /* renamed from: b */
    public final transient InterfaceC37708b2 f99521b;

    public Exceptions(@NotNull String str, @Nullable Throwable th, @NotNull InterfaceC37708b2 interfaceC37708b2) {
        super(str);
        this.f99521b = interfaceC37708b2;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC37735i0
    @Nullable
    /* renamed from: b */
    public Exceptions mo16316a() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof Exceptions) {
                Exceptions exceptions = (Exceptions) obj;
                if (!Intrinsics.m17075f(exceptions.getMessage(), getMessage()) || !Intrinsics.m17075f(exceptions.f99521b, this.f99521b) || !Intrinsics.m17075f(exceptions.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int i;
        String message = getMessage();
        Intrinsics.m17074g(message);
        int hashCode = ((message.hashCode() * 31) + this.f99521b.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.f99521b;
    }
}

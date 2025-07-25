package p704he;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlowExceptions.kt */
@Metadata
/* renamed from: he.j */
/* loaded from: classes8.dex */
public final class C33519j extends CancellationException {
    public C33519j() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

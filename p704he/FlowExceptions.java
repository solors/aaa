package p704he;

import ge.FlowCollector;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: he.a */
/* loaded from: classes8.dex */
public final class FlowExceptions extends CancellationException {
    @NotNull

    /* renamed from: b */
    public final transient FlowCollector<?> f91461b;

    public FlowExceptions(@NotNull FlowCollector<?> flowCollector) {
        super("Flow was aborted, no more elements needed");
        this.f91461b = flowCollector;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: okio.d */
/* loaded from: classes10.dex */
public final class Okio implements Sink {
    @Override // okio.Sink
    @NotNull
    public C39196c1 timeout() {
        return C39196c1.NONE;
    }

    @Override // okio.Sink
    public void write(@NotNull C39200e source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }
}

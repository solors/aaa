package cf;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: cf.e */
/* loaded from: classes10.dex */
public class FaultHidingSink extends ForwardingSink {
    @NotNull

    /* renamed from: g */
    private final Function1<IOException, Unit> f2063g;

    /* renamed from: h */
    private boolean f2064h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull Sink delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f2063g = onException;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2064h) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f2064h = true;
            this.f2063g.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.f2064h) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f2064h = true;
            this.f2063g.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull C39200e source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f2064h) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException e) {
            this.f2064h = true;
            this.f2063g.invoke(e);
        }
    }
}

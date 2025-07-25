package p706i;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.C39200e;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

/* compiled from: FaultHidingSink.kt */
@Metadata
/* renamed from: i.c */
/* loaded from: classes2.dex */
public final class C33589c extends ForwardingSink {
    @NotNull

    /* renamed from: g */
    private final Function1<IOException, Unit> f91821g;

    /* renamed from: h */
    private boolean f91822h;

    /* JADX WARN: Multi-variable type inference failed */
    public C33589c(@NotNull Sink sink, @NotNull Function1<? super IOException, Unit> function1) {
        super(sink);
        this.f91821g = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f91822h = true;
            this.f91821g.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f91822h = true;
            this.f91821g.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull C39200e c39200e, long j) {
        if (this.f91822h) {
            c39200e.skip(j);
            return;
        }
        try {
            super.write(c39200e, j);
        } catch (IOException e) {
            this.f91822h = true;
            this.f91821g.invoke(e);
        }
    }
}

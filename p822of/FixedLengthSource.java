package p822of;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.C39200e;
import okio.ForwardingSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: of.g */
/* loaded from: classes10.dex */
public final class FixedLengthSource extends ForwardingSource {

    /* renamed from: h */
    private final long f102892h;

    /* renamed from: i */
    private final boolean f102893i;

    /* renamed from: j */
    private long f102894j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(@NotNull Source delegate, long j, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f102892h = j;
        this.f102893i = z;
    }

    /* renamed from: a */
    private final void m13683a(C39200e c39200e, long j) {
        C39200e c39200e2 = new C39200e();
        c39200e2.mo13440H(c39200e);
        c39200e.write(c39200e2, j);
        c39200e2.m13597b();
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull C39200e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j2 = this.f102894j;
        long j3 = this.f102892h;
        if (j2 > j3) {
            j = 0;
        } else if (this.f102893i) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long read = super.read(sink, j);
        int i = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
        if (i != 0) {
            this.f102894j += read;
        }
        long j5 = this.f102894j;
        long j6 = this.f102892h;
        if ((j5 < j6 && i == 0) || j5 > j6) {
            if (read > 0 && j5 > j6) {
                m13683a(sink, sink.size() - (this.f102894j - this.f102892h));
            }
            throw new IOException("expected " + this.f102892h + " bytes but got " + this.f102894j);
        }
        return read;
    }
}

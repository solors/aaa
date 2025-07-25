package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: okio.t0 */
/* loaded from: classes10.dex */
public final class PeekSource implements Source {
    @NotNull

    /* renamed from: b */
    private final BufferedSource f103006b;
    @NotNull

    /* renamed from: c */
    private final C39200e f103007c;
    @Nullable

    /* renamed from: d */
    private Segment f103008d;

    /* renamed from: f */
    private int f103009f;

    /* renamed from: g */
    private boolean f103010g;

    /* renamed from: h */
    private long f103011h;

    public PeekSource(@NotNull BufferedSource upstream) {
        int i;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f103006b = upstream;
        C39200e mo13418z = upstream.mo13418z();
        this.f103007c = mo13418z;
        Segment segment = mo13418z.f102937b;
        this.f103008d = segment;
        if (segment != null) {
            i = segment.f103022b;
        } else {
            i = -1;
        }
        this.f103009f = i;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f103010g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f103022b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(@org.jetbrains.annotations.NotNull okio.C39200e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f103010g
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            okio.w0 r5 = r8.f103008d
            if (r5 == 0) goto L2a
            okio.e r6 = r8.f103007c
            okio.w0 r6 = r6.f102937b
            if (r5 != r6) goto L2b
            int r5 = r8.f103009f
            kotlin.jvm.internal.Intrinsics.m17074g(r6)
            int r6 = r6.f103022b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            okio.g r0 = r8.f103006b
            long r1 = r8.f103011h
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.w0 r0 = r8.f103008d
            if (r0 != 0) goto L53
            okio.e r0 = r8.f103007c
            okio.w0 r0 = r0.f102937b
            if (r0 == 0) goto L53
            r8.f103008d = r0
            kotlin.jvm.internal.Intrinsics.m17074g(r0)
            int r0 = r0.f103022b
            r8.f103009f = r0
        L53:
            okio.e r0 = r8.f103007c
            long r0 = r0.size()
            long r2 = r8.f103011h
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.e r2 = r8.f103007c
            long r4 = r8.f103011h
            r3 = r9
            r6 = r10
            r2.m13593i(r3, r4, r6)
            long r0 = r8.f103011h
            long r0 = r0 + r10
            r8.f103011h = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.e, long):long");
    }

    @Override // okio.Source
    @NotNull
    public C39196c1 timeout() {
        return this.f103006b.timeout();
    }
}

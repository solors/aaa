package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.j */
/* loaded from: classes10.dex */
public abstract class FileHandle implements Closeable {

    /* renamed from: b */
    private final boolean f102960b;

    /* renamed from: c */
    private boolean f102961c;

    /* renamed from: d */
    private int f102962d;
    @NotNull

    /* renamed from: f */
    private final ReentrantLock f102963f = C39206f1.m13574b();

    /* compiled from: FileHandle.kt */
    @Metadata
    /* renamed from: okio.j$a */
    /* loaded from: classes10.dex */
    private static final class C39212a implements Source {
        @NotNull

        /* renamed from: b */
        private final FileHandle f102964b;

        /* renamed from: c */
        private long f102965c;

        /* renamed from: d */
        private boolean f102966d;

        public C39212a(@NotNull FileHandle fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f102964b = fileHandle;
            this.f102965c = j;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f102966d) {
                return;
            }
            this.f102966d = true;
            ReentrantLock m13534h = this.f102964b.m13534h();
            m13534h.lock();
            try {
                FileHandle fileHandle = this.f102964b;
                fileHandle.f102962d--;
                if (this.f102964b.f102962d == 0 && this.f102964b.f102961c) {
                    Unit unit = Unit.f99208a;
                    m13534h.unlock();
                    this.f102964b.mo13444i();
                }
            } finally {
                m13534h.unlock();
            }
        }

        @Override // okio.Source
        public long read(@NotNull C39200e sink, long j) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!this.f102966d) {
                long m13533m = this.f102964b.m13533m(this.f102965c, sink, j);
                if (m13533m != -1) {
                    this.f102965c += m13533m;
                }
                return m13533m;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Source
        @NotNull
        public C39196c1 timeout() {
            return C39196c1.NONE;
        }
    }

    public FileHandle(boolean z) {
        this.f102960b = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final long m13533m(long j, C39200e c39200e, long j2) {
        boolean z;
        int i;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = j + j2;
            long j4 = j;
            while (true) {
                if (j4 >= j3) {
                    break;
                }
                Segment m13583w = c39200e.m13583w(1);
                int mo13443k = mo13443k(j4, m13583w.f103021a, m13583w.f103023c, (int) Math.min(j3 - j4, 8192 - i));
                if (mo13443k == -1) {
                    if (m13583w.f103022b == m13583w.f103023c) {
                        c39200e.f102937b = m13583w.m13415b();
                        SegmentPool.m13408b(m13583w);
                    }
                    if (j == j4) {
                        return -1L;
                    }
                } else {
                    m13583w.f103023c += mo13443k;
                    long j5 = mo13443k;
                    j4 += j5;
                    c39200e.m13586t(c39200e.size() + j5);
                }
            }
            return j4 - j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f102963f;
        reentrantLock.lock();
        try {
            if (this.f102961c) {
                return;
            }
            this.f102961c = true;
            if (this.f102962d != 0) {
                return;
            }
            Unit unit = Unit.f99208a;
            reentrantLock.unlock();
            mo13444i();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    /* renamed from: h */
    public final ReentrantLock m13534h() {
        return this.f102963f;
    }

    /* renamed from: i */
    protected abstract void mo13444i() throws IOException;

    /* renamed from: k */
    protected abstract int mo13443k(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: l */
    protected abstract long mo13442l() throws IOException;

    @NotNull
    /* renamed from: n */
    public final Source m13532n(long j) throws IOException {
        ReentrantLock reentrantLock = this.f102963f;
        reentrantLock.lock();
        try {
            if (!this.f102961c) {
                this.f102962d++;
                reentrantLock.unlock();
                return new C39212a(this, j);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f102963f;
        reentrantLock.lock();
        try {
            if (!this.f102961c) {
                Unit unit = Unit.f99208a;
                reentrantLock.unlock();
                return mo13442l();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package p1029wc;

import androidx.concurrent.futures.C1074a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1061yc.InterfaceC45101f;
import p1061yc.Pool;
import tc.MemoryFactoryJvm;
import tc.MemoryJvm;
import vc.BufferFactory;
import vc.C44557a;

@Metadata
/* renamed from: wc.a */
/* loaded from: classes9.dex */
public class ChunkBuffer extends C44557a {
    @NotNull

    /* renamed from: j */
    public static final C44651d f117160j = new C44651d(null);

    /* renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f117161k;

    /* renamed from: l */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f117162l;
    @NotNull

    /* renamed from: m */
    private static final InterfaceC45101f<ChunkBuffer> f117163m;
    @NotNull

    /* renamed from: n */
    private static final ChunkBuffer f117164n;
    @NotNull

    /* renamed from: o */
    private static final InterfaceC45101f<ChunkBuffer> f117165o;
    @NotNull

    /* renamed from: p */
    private static final InterfaceC45101f<ChunkBuffer> f117166p;
    @Nullable

    /* renamed from: h */
    private final InterfaceC45101f<ChunkBuffer> f117167h;
    @Nullable

    /* renamed from: i */
    private ChunkBuffer f117168i;
    @NotNull
    private volatile /* synthetic */ Object nextRef;
    @NotNull
    private volatile /* synthetic */ int refCount;

    /* compiled from: ChunkBuffer.kt */
    @Metadata
    /* renamed from: wc.a$b */
    /* loaded from: classes9.dex */
    public static final class C44649b extends Pool<ChunkBuffer> {
        C44649b() {
        }

        @Override // p1061yc.InterfaceC45101f
        @NotNull
        /* renamed from: a */
        public ChunkBuffer mo916L() {
            return new ChunkBuffer(MemoryFactoryJvm.f116541a.mo3123b(4096), null, this, null);
        }

        @Override // p1061yc.Pool, p1061yc.InterfaceC45101f
        /* renamed from: b */
        public void mo915p(@NotNull ChunkBuffer instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            MemoryFactoryJvm.f116541a.mo3124a(instance.m2510g());
        }
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata
    /* renamed from: wc.a$c */
    /* loaded from: classes9.dex */
    public static final class C44650c extends Pool<ChunkBuffer> {
        C44650c() {
        }

        @Override // p1061yc.InterfaceC45101f
        @NotNull
        /* renamed from: a */
        public ChunkBuffer mo916L() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        @Override // p1061yc.Pool, p1061yc.InterfaceC45101f
        /* renamed from: b */
        public void mo915p(@NotNull ChunkBuffer instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
        }
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata
    /* renamed from: wc.a$d */
    /* loaded from: classes9.dex */
    public static final class C44651d {
        private C44651d() {
        }

        public /* synthetic */ C44651d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final ChunkBuffer m2142a() {
            return ChunkBuffer.f117164n;
        }

        @NotNull
        /* renamed from: b */
        public final InterfaceC45101f<ChunkBuffer> m2141b() {
            return ChunkBuffer.f117163m;
        }

        @NotNull
        /* renamed from: c */
        public final InterfaceC45101f<ChunkBuffer> m2140c() {
            return BufferFactory.m2494a();
        }
    }

    static {
        C44648a c44648a = new C44648a();
        f117163m = c44648a;
        f117164n = new ChunkBuffer(MemoryJvm.f116542a.m3118a(), null, c44648a, null);
        f117165o = new C44649b();
        f117166p = new C44650c();
        f117161k = AtomicReferenceFieldUpdater.newUpdater(ChunkBuffer.class, Object.class, "nextRef");
        f117162l = AtomicIntegerFieldUpdater.newUpdater(ChunkBuffer.class, "refCount");
    }

    public /* synthetic */ ChunkBuffer(ByteBuffer byteBuffer, ChunkBuffer chunkBuffer, InterfaceC45101f interfaceC45101f, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, chunkBuffer, interfaceC45101f);
    }

    /* renamed from: v */
    private final void m2153v(ChunkBuffer chunkBuffer) {
        if (C1074a.m105283a(f117161k, this, null, chunkBuffer)) {
            return;
        }
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    /* renamed from: A */
    public void m2161A(@NotNull InterfaceC45101f<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (m2160B()) {
            ChunkBuffer chunkBuffer = this.f117168i;
            if (chunkBuffer != null) {
                m2158D();
                chunkBuffer.m2161A(pool);
                return;
            }
            InterfaceC45101f<ChunkBuffer> interfaceC45101f = this.f117167h;
            if (interfaceC45101f != null) {
                pool = interfaceC45101f;
            }
            pool.mo915p(this);
        }
    }

    /* renamed from: B */
    public final boolean m2160B() {
        int i;
        int i2;
        do {
            i = this.refCount;
            if (i > 0) {
                i2 = i - 1;
            } else {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
        } while (!f117162l.compareAndSet(this, i, i2));
        if (i2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final void m2159C(@Nullable ChunkBuffer chunkBuffer) {
        if (chunkBuffer == null) {
            m2152w();
        } else {
            m2153v(chunkBuffer);
        }
    }

    /* renamed from: D */
    public final void m2158D() {
        if (f117162l.compareAndSet(this, 0, -1)) {
            m2152w();
            this.f117168i = null;
            return;
        }
        throw new IllegalStateException("Unable to unlink: buffer is in use.");
    }

    /* renamed from: E */
    public final void m2157E() {
        int i;
        do {
            i = this.refCount;
            if (i >= 0) {
                if (i > 0) {
                    throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
                }
            } else {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
        } while (!f117162l.compareAndSet(this, i, 1));
    }

    @Override // vc.C44557a
    /* renamed from: q */
    public final void mo2156q() {
        boolean z;
        if (this.f117168i == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            super.mo2156q();
            this.nextRef = null;
            return;
        }
        throw new IllegalArgumentException("Unable to reset buffer with origin".toString());
    }

    @Nullable
    /* renamed from: w */
    public final ChunkBuffer m2152w() {
        return (ChunkBuffer) f117161k.getAndSet(this, null);
    }

    @Nullable
    /* renamed from: x */
    public final ChunkBuffer m2151x() {
        return (ChunkBuffer) this.nextRef;
    }

    @Nullable
    /* renamed from: y */
    public final ChunkBuffer m2150y() {
        return this.f117168i;
    }

    /* renamed from: z */
    public final int m2149z() {
        return this.refCount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChunkBuffer(ByteBuffer memory, ChunkBuffer chunkBuffer, InterfaceC45101f<ChunkBuffer> interfaceC45101f) {
        super(memory, null);
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.f117167h = interfaceC45101f;
        if (chunkBuffer != this) {
            this.nextRef = null;
            this.refCount = 1;
            this.f117168i = chunkBuffer;
            return;
        }
        throw new IllegalArgumentException("A chunk couldn't be a view of itself.".toString());
    }

    /* compiled from: ChunkBuffer.kt */
    @Metadata
    /* renamed from: wc.a$a */
    /* loaded from: classes9.dex */
    public static final class C44648a implements InterfaceC45101f<ChunkBuffer> {
        C44648a() {
        }

        @Override // p1061yc.InterfaceC45101f
        @NotNull
        /* renamed from: a */
        public ChunkBuffer mo916L() {
            return ChunkBuffer.f117160j.m2142a();
        }

        @Override // p1061yc.InterfaceC45101f
        /* renamed from: b */
        public void mo915p(@NotNull ChunkBuffer instance) {
            boolean z;
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (instance == ChunkBuffer.f117160j.m2142a()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InterfaceC45101f.C45102a.m914a(this);
        }

        @Override // p1061yc.InterfaceC45101f
        public void dispose() {
        }
    }
}

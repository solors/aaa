package io.ktor.utils.p731io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: io.ktor.utils.io.internal.g */
/* loaded from: classes9.dex */
public abstract class ReadWriteBufferState {
    @NotNull

    /* renamed from: a */
    public final ByteBuffer f98222a;
    @NotNull

    /* renamed from: b */
    public final RingBufferCapacity f98223b;

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$a */
    /* loaded from: classes9.dex */
    public static final class C37198a extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        public static final C37198a f98224c = new C37198a();

        private C37198a() {
            super(C37205h.m18771a(), C37205h.m18770b(), null);
        }

        @NotNull
        public String toString() {
            return "IDLE(empty)";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$b */
    /* loaded from: classes9.dex */
    public static final class C37199b extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        private final C37200c f98225c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37199b(@NotNull C37200c initial) {
            super(initial.f98222a, initial.f98223b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f98225c = initial;
        }

        @NotNull
        /* renamed from: g */
        public final C37200c m18792g() {
            return this.f98225c;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: h */
        public C37201d mo18775c() {
            return this.f98225c.m18788h();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: i */
        public C37204g mo18783d() {
            return this.f98225c.m18786j();
        }

        @NotNull
        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$c */
    /* loaded from: classes9.dex */
    public static final class C37200c extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        private final ByteBuffer f98226c;
        @NotNull

        /* renamed from: d */
        private final ByteBuffer f98227d;
        @NotNull

        /* renamed from: e */
        private final C37199b f98228e;
        @NotNull

        /* renamed from: f */
        private final C37201d f98229f;
        @NotNull

        /* renamed from: g */
        private final C37204g f98230g;
        @NotNull

        /* renamed from: h */
        private final C37202e f98231h;

        public /* synthetic */ C37200c(ByteBuffer byteBuffer, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i2 & 2) != 0 ? 8 : i);
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: a */
        public ByteBuffer mo18780a() {
            return this.f98227d;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: b */
        public ByteBuffer mo18776b() {
            return this.f98226c;
        }

        @NotNull
        /* renamed from: g */
        public final C37199b m18789g() {
            return this.f98228e;
        }

        @NotNull
        /* renamed from: h */
        public final C37201d m18788h() {
            return this.f98229f;
        }

        @NotNull
        /* renamed from: i */
        public final C37202e m18787i() {
            return this.f98231h;
        }

        @NotNull
        /* renamed from: j */
        public final C37204g m18786j() {
            return this.f98230g;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: k */
        public C37201d mo18775c() {
            return this.f98229f;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: l */
        public C37204g mo18783d() {
            return this.f98230g;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37200c(@NotNull ByteBuffer backingBuffer, int i) {
            super(backingBuffer, new RingBufferCapacity(backingBuffer.capacity() - i), null);
            Intrinsics.checkNotNullParameter(backingBuffer, "backingBuffer");
            if (backingBuffer.position() == 0) {
                if (backingBuffer.limit() == backingBuffer.capacity()) {
                    ByteBuffer duplicate = backingBuffer.duplicate();
                    Intrinsics.checkNotNullExpressionValue(duplicate, "backingBuffer.duplicate()");
                    this.f98226c = duplicate;
                    ByteBuffer duplicate2 = backingBuffer.duplicate();
                    Intrinsics.checkNotNullExpressionValue(duplicate2, "backingBuffer.duplicate()");
                    this.f98227d = duplicate2;
                    this.f98228e = new C37199b(this);
                    this.f98229f = new C37201d(this);
                    this.f98230g = new C37204g(this);
                    this.f98231h = new C37202e(this);
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$d */
    /* loaded from: classes9.dex */
    public static final class C37201d extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        private final C37200c f98232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37201d(@NotNull C37200c initial) {
            super(initial.f98222a, initial.f98223b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f98232c = initial;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: a */
        public ByteBuffer mo18780a() {
            return this.f98232c.mo18780a();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: g */
        public C37202e mo18783d() {
            return this.f98232c.m18787i();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: h */
        public C37199b mo18779e() {
            return this.f98232c.m18789g();
        }

        @NotNull
        public String toString() {
            return "Reading";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$e */
    /* loaded from: classes9.dex */
    public static final class C37202e extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        private final C37200c f98233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37202e(@NotNull C37200c initial) {
            super(initial.f98222a, initial.f98223b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f98233c = initial;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: a */
        public ByteBuffer mo18780a() {
            return this.f98233c.mo18780a();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: b */
        public ByteBuffer mo18776b() {
            return this.f98233c.mo18776b();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: g */
        public C37204g mo18779e() {
            return this.f98233c.m18786j();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: h */
        public C37201d mo18774f() {
            return this.f98233c.m18788h();
        }

        @NotNull
        public String toString() {
            return "Reading+Writing";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$f */
    /* loaded from: classes9.dex */
    public static final class C37203f extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        public static final C37203f f98234c = new C37203f();

        private C37203f() {
            super(C37205h.m18771a(), C37205h.m18770b(), null);
        }

        @NotNull
        public String toString() {
            return "Terminated";
        }
    }

    /* compiled from: ReadWriteBufferState.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.g$g */
    /* loaded from: classes9.dex */
    public static final class C37204g extends ReadWriteBufferState {
        @NotNull

        /* renamed from: c */
        private final C37200c f98235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37204g(@NotNull C37200c initial) {
            super(initial.f98222a, initial.f98223b, null);
            Intrinsics.checkNotNullParameter(initial, "initial");
            this.f98235c = initial;
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: b */
        public ByteBuffer mo18776b() {
            return this.f98235c.mo18776b();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: g */
        public C37202e mo18775c() {
            return this.f98235c.m18787i();
        }

        @Override // io.ktor.utils.p731io.internal.ReadWriteBufferState
        @NotNull
        /* renamed from: h */
        public C37199b mo18774f() {
            return this.f98235c.m18789g();
        }

        @NotNull
        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ ReadWriteBufferState(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, ringBufferCapacity);
    }

    @NotNull
    /* renamed from: a */
    public ByteBuffer mo18780a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    @NotNull
    /* renamed from: b */
    public ByteBuffer mo18776b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    @NotNull
    /* renamed from: c */
    public ReadWriteBufferState mo18775c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    @NotNull
    /* renamed from: d */
    public ReadWriteBufferState mo18783d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    @NotNull
    /* renamed from: e */
    public ReadWriteBufferState mo18779e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    @NotNull
    /* renamed from: f */
    public ReadWriteBufferState mo18774f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    private ReadWriteBufferState(ByteBuffer byteBuffer, RingBufferCapacity ringBufferCapacity) {
        this.f98222a = byteBuffer;
        this.f98223b = ringBufferCapacity;
    }
}

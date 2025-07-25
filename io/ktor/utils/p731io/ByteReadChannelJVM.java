package io.ktor.utils.p731io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.ChunkBuffer;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import vc.ByteReadPacket;

@Metadata
/* renamed from: io.ktor.utils.io.g */
/* loaded from: classes9.dex */
public interface ByteReadChannelJVM {
    @NotNull

    /* renamed from: a */
    public static final C37185a f98178a = C37185a.f98179a;

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.g$a */
    /* loaded from: classes9.dex */
    public static final class C37185a {

        /* renamed from: a */
        static final /* synthetic */ C37185a f98179a = new C37185a();
        @NotNull

        /* renamed from: b */
        private static final InterfaceC38501j<ByteChannelCtor> f98180b;

        /* compiled from: ByteReadChannelJVM.kt */
        @Metadata
        /* renamed from: io.ktor.utils.io.g$a$a */
        /* loaded from: classes9.dex */
        static final class C37186a extends Lambda implements Functions<ByteChannelCtor> {

            /* renamed from: g */
            public static final C37186a f98181g = new C37186a();

            C37186a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            @NotNull
            /* renamed from: b */
            public final ByteChannelCtor invoke() {
                ByteChannelCtor m18869c = ByteChannel.m18869c(false, 1, null);
                C37224k.m18713a(m18869c);
                return m18869c;
            }
        }

        static {
            InterfaceC38501j<ByteChannelCtor> m14554a;
            m14554a = LazyJVM.m14554a(C37186a.f98181g);
            f98180b = m14554a;
        }

        private C37185a() {
        }

        @NotNull
        /* renamed from: a */
        public final ByteReadChannelJVM m18832a() {
            return f98180b.getValue();
        }
    }

    /* compiled from: ByteReadChannelJVM.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.g$b */
    /* loaded from: classes9.dex */
    public static final class C37187b {
        /* renamed from: a */
        public static /* synthetic */ Object m18830a(ByteReadChannelJVM byteReadChannelJVM, long j, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = Long.MAX_VALUE;
                }
                return byteReadChannelJVM.mo18837g(j, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
        }
    }

    /* renamed from: c */
    boolean mo18840c(@Nullable Throwable th);

    /* renamed from: e */
    int mo18839e();

    @Nullable
    /* renamed from: f */
    Object mo18838f(@NotNull ChunkBuffer chunkBuffer, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    /* renamed from: g */
    Object mo18837g(long j, @NotNull Continuation<? super ByteReadPacket> continuation);

    @Nullable
    /* renamed from: h */
    Throwable mo18836h();

    @Nullable
    /* renamed from: i */
    Object mo18835i(@NotNull byte[] bArr, int i, int i2, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    /* renamed from: l */
    Object mo18834l(int i, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: n */
    boolean mo18833n();
}

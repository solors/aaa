package p1045xc;

import io.ktor.utils.p731io.ByteReadChannelJVM;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37608m0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Writing.kt */
@Metadata
/* renamed from: xc.a */
/* loaded from: classes9.dex */
public final class C44964a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Writing.kt */
    @DebugMetadata(m17095c = "io.ktor.utils.io.jvm.nio.WritingKt", m17094f = "Writing.kt", m17093l = {50}, m17092m = "copyTo")
    @Metadata
    /* renamed from: xc.a$a */
    /* loaded from: classes9.dex */
    public static final class C44965a extends AbstractC37589d {

        /* renamed from: l */
        Object f118305l;

        /* renamed from: m */
        Object f118306m;

        /* renamed from: n */
        Object f118307n;

        /* renamed from: o */
        long f118308o;

        /* renamed from: p */
        /* synthetic */ Object f118309p;

        /* renamed from: q */
        int f118310q;

        C44965a(Continuation<? super C44965a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f118309p = obj;
            this.f118310q |= Integer.MIN_VALUE;
            return C44964a.m1226a(null, null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Writing.kt */
    @Metadata
    /* renamed from: xc.a$b */
    /* loaded from: classes9.dex */
    public static final class C44966b extends Lambda implements Function1<ByteBuffer, Unit> {

        /* renamed from: g */
        final /* synthetic */ long f118311g;

        /* renamed from: h */
        final /* synthetic */ C37608m0 f118312h;

        /* renamed from: i */
        final /* synthetic */ WritableByteChannel f118313i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44966b(long j, C37608m0 c37608m0, WritableByteChannel writableByteChannel) {
            super(1);
            this.f118311g = j;
            this.f118312h = c37608m0;
            this.f118313i = writableByteChannel;
        }

        /* renamed from: a */
        public final void m1224a(@NotNull ByteBuffer bb2) {
            Intrinsics.checkNotNullParameter(bb2, "bb");
            long j = this.f118311g - this.f118312h.f99326b;
            if (j < bb2.remaining()) {
                int limit = bb2.limit();
                bb2.limit(bb2.position() + ((int) j));
                while (bb2.hasRemaining()) {
                    this.f118313i.write(bb2);
                }
                bb2.limit(limit);
                this.f118312h.f99326b += j;
                return;
            }
            long j2 = 0;
            while (bb2.hasRemaining()) {
                j2 += this.f118313i.write(bb2);
            }
            this.f118312h.f99326b += j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ByteBuffer byteBuffer) {
            m1224a(byteBuffer);
            return Unit.f99208a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r8.mo18833n() == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0099 -> B:39:0x009c). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1226a(@org.jetbrains.annotations.NotNull io.ktor.utils.p731io.ByteReadChannelJVM r8, @org.jetbrains.annotations.NotNull java.nio.channels.WritableByteChannel r9, long r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Long> r12) {
        /*
            boolean r0 = r12 instanceof p1045xc.C44964a.C44965a
            if (r0 == 0) goto L13
            r0 = r12
            xc.a$a r0 = (p1045xc.C44964a.C44965a) r0
            int r1 = r0.f118310q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f118310q = r1
            goto L18
        L13:
            xc.a$a r0 = new xc.a$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f118309p
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f118310q
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            long r8 = r0.f118308o
            java.lang.Object r10 = r0.f118307n
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r0.f118306m
            kotlin.jvm.internal.m0 r11 = (kotlin.jvm.internal.C37608m0) r11
            java.lang.Object r2 = r0.f118305l
            io.ktor.utils.io.g r2 = (io.ktor.utils.p731io.ByteReadChannelJVM) r2
            p804nd.C38508r.m14539b(r12)
            r12 = r11
            r7 = r2
            r2 = r10
            r10 = r8
            r8 = r7
            goto L9c
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            p804nd.C38508r.m14539b(r12)
            r5 = 0
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 < 0) goto L50
            r12 = r4
            goto L51
        L50:
            r12 = r3
        L51:
            if (r12 == 0) goto Lb0
            boolean r12 = r9 instanceof java.nio.channels.SelectableChannel
            if (r12 == 0) goto L69
            r12 = r9
            java.nio.channels.SelectableChannel r12 = (java.nio.channels.SelectableChannel) r12
            boolean r12 = r12.isBlocking()
            if (r12 == 0) goto L61
            goto L69
        L61:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Non-blocking channels are not supported"
            r8.<init>(r9)
            throw r8
        L69:
            boolean r12 = r8.mo18833n()
            if (r12 == 0) goto L7b
            java.lang.Throwable r8 = r8.mo18836h()
            if (r8 != 0) goto L7a
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.boxing.m17096e(r5)
            return r8
        L7a:
            throw r8
        L7b:
            kotlin.jvm.internal.m0 r12 = new kotlin.jvm.internal.m0
            r12.<init>()
            xc.a$b r2 = new xc.a$b
            r2.<init>(r10, r12, r9)
        L85:
            long r5 = r12.f99326b
            int r9 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r9 >= 0) goto La2
            r0.f118305l = r8
            r0.f118306m = r12
            r0.f118307n = r2
            r0.f118308o = r10
            r0.f118310q = r4
            java.lang.Object r9 = r8.mo18834l(r3, r2, r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            boolean r9 = r8.mo18833n()
            if (r9 == 0) goto L85
        La2:
            java.lang.Throwable r8 = r8.mo18836h()
            if (r8 != 0) goto Laf
            long r8 = r12.f99326b
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.boxing.m17096e(r8)
            return r8
        Laf:
            throw r8
        Lb0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Limit shouldn't be negative: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p1045xc.C44964a.m1226a(io.ktor.utils.io.g, java.nio.channels.WritableByteChannel, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m1225b(ByteReadChannelJVM byteReadChannelJVM, WritableByteChannel writableByteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return m1226a(byteReadChannelJVM, writableByteChannel, j, continuation);
    }
}

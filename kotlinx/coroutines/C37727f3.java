package kotlinx.coroutines;

import je.Undispatched;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* compiled from: Timeout.kt */
@Metadata
/* renamed from: kotlinx.coroutines.f3 */
/* loaded from: classes7.dex */
public final class C37727f3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeout.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.TimeoutKt", m17094f = "Timeout.kt", m17093l = {104}, m17092m = "withTimeoutOrNull")
    @Metadata
    /* renamed from: kotlinx.coroutines.f3$a */
    /* loaded from: classes7.dex */
    public static final class C37728a<T> extends AbstractC37589d {

        /* renamed from: l */
        long f99549l;

        /* renamed from: m */
        Object f99550m;

        /* renamed from: n */
        Object f99551n;

        /* renamed from: o */
        /* synthetic */ Object f99552o;

        /* renamed from: p */
        int f99553p;

        C37728a(Continuation<? super C37728a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f99552o = obj;
            this.f99553p |= Integer.MIN_VALUE;
            return C37727f3.m16350e(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == null) goto L10;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.Timeout m16354a(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC37814x0 r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC37708b2 r5) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.InterfaceC37823z0
            if (r0 == 0) goto L7
            kotlinx.coroutines.z0 r4 = (kotlinx.coroutines.InterfaceC37823z0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.b$a r0 = kotlin.time.Duration.f99494c
            ee.b r0 = ee.DurationUnitJvm.f90129f
            long r0 = kotlin.time.C37700c.m16451t(r2, r0)
            java.lang.String r4 = r4.m16060m(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.d3 r2 = new kotlinx.coroutines.d3
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C37727f3.m16354a(long, kotlinx.coroutines.x0, kotlinx.coroutines.b2):kotlinx.coroutines.d3");
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m16353b(RunnableC37721e3<U, ? super T> runnableC37721e3, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        C37726f2.m16359k(runnableC37721e3, C37819y0.m16067b(runnableC37721e3.f92085f.getContext()).invokeOnTimeout(runnableC37721e3.f99544g, runnableC37721e3, runnableC37721e3.getContext()));
        return Undispatched.m18364c(runnableC37721e3, runnableC37721e3, function2);
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m16352c(long j, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object m6959e;
        if (j > 0) {
            Object m16353b = m16353b(new RunnableC37721e3(j, continuation), function2);
            m6959e = C42688d.m6959e();
            if (m16353b == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m16353b;
        }
        throw new Timeout("Timed out immediately");
    }

    @Nullable
    /* renamed from: d */
    public static final <T> Object m16351d(long j, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m16352c(C37819y0.m16066c(j), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.e3] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m16350e(long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.C37727f3.C37728a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.f3$a r0 = (kotlinx.coroutines.C37727f3.C37728a) r0
            int r1 = r0.f99553p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99553p = r1
            goto L18
        L13:
            kotlinx.coroutines.f3$a r0 = new kotlinx.coroutines.f3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f99552o
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f99553p
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f99551n
            kotlin.jvm.internal.n0 r7 = (kotlin.jvm.internal.C37609n0) r7
            java.lang.Object r8 = r0.f99550m
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            p804nd.C38508r.m14539b(r10)     // Catch: kotlinx.coroutines.Timeout -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p804nd.C38508r.m14539b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.n0 r10 = new kotlin.jvm.internal.n0
            r10.<init>()
            r0.f99550m = r9     // Catch: kotlinx.coroutines.Timeout -> L6c
            r0.f99551n = r10     // Catch: kotlinx.coroutines.Timeout -> L6c
            r0.f99549l = r7     // Catch: kotlinx.coroutines.Timeout -> L6c
            r0.f99553p = r4     // Catch: kotlinx.coroutines.Timeout -> L6c
            kotlinx.coroutines.e3 r2 = new kotlinx.coroutines.e3     // Catch: kotlinx.coroutines.Timeout -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.Timeout -> L6c
            r10.f99327b = r2     // Catch: kotlinx.coroutines.Timeout -> L6c
            java.lang.Object r7 = m16353b(r2, r9)     // Catch: kotlinx.coroutines.Timeout -> L6c
            java.lang.Object r8 = sd.C42683b.m6964e()     // Catch: kotlinx.coroutines.Timeout -> L6c
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.C37591h.m17084c(r0)     // Catch: kotlinx.coroutines.Timeout -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            kotlinx.coroutines.b2 r9 = r8.f99530b
            T r7 = r7.f99327b
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C37727f3.m16350e(long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    /* renamed from: f */
    public static final <T> Object m16349f(long j, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m16350e(C37819y0.m16066c(j), function2, continuation);
    }
}

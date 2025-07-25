package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import kotlinx.coroutines.C37793r;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.BufferOverflow;
import p704he.AbstractSharedFlow;
import p704he.C33506c;
import p704he.InterfaceC33528p;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: SharedFlow.kt */
@Metadata
/* renamed from: ge.e0 */
/* loaded from: classes8.dex */
public class C33318e0<T> extends AbstractSharedFlow<C33326g0> implements InterfaceC33420y<T>, InterfaceC33312c<T>, InterfaceC33528p<T> {

    /* renamed from: g */
    private final int f90918g;

    /* renamed from: h */
    private final int f90919h;
    @NotNull

    /* renamed from: i */
    private final BufferOverflow f90920i;
    @Nullable

    /* renamed from: j */
    private Object[] f90921j;

    /* renamed from: k */
    private long f90922k;

    /* renamed from: l */
    private long f90923l;

    /* renamed from: m */
    private int f90924m;

    /* renamed from: n */
    private int f90925n;

    /* compiled from: SharedFlow.kt */
    @Metadata
    /* renamed from: ge.e0$a */
    /* loaded from: classes8.dex */
    public static final class C33319a implements InterfaceC37731g1 {
        @NotNull

        /* renamed from: b */
        public final C33318e0<?> f90926b;

        /* renamed from: c */
        public long f90927c;
        @Nullable

        /* renamed from: d */
        public final Object f90928d;
        @NotNull

        /* renamed from: f */
        public final Continuation<Unit> f90929f;

        /* JADX WARN: Multi-variable type inference failed */
        public C33319a(@NotNull C33318e0<?> c33318e0, long j, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f90926b = c33318e0;
            this.f90927c = j;
            this.f90928d = obj;
            this.f90929f = continuation;
        }

        @Override // kotlinx.coroutines.InterfaceC37731g1
        public void dispose() {
            this.f90926b.m24131y(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata
    /* renamed from: ge.e0$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C33320b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SharedFlow.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.flow.SharedFlowImpl", m17094f = "SharedFlow.kt", m17093l = {372, 379, 382}, m17092m = "collect$suspendImpl")
    @Metadata
    /* renamed from: ge.e0$c */
    /* loaded from: classes8.dex */
    public static final class C33321c<T> extends AbstractC37589d {

        /* renamed from: l */
        Object f90930l;

        /* renamed from: m */
        Object f90931m;

        /* renamed from: n */
        Object f90932n;

        /* renamed from: o */
        Object f90933o;

        /* renamed from: p */
        /* synthetic */ Object f90934p;

        /* renamed from: q */
        final /* synthetic */ C33318e0<T> f90935q;

        /* renamed from: r */
        int f90936r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33321c(C33318e0<T> c33318e0, Continuation<? super C33321c> continuation) {
            super(continuation);
            this.f90935q = c33318e0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f90934p = obj;
            this.f90936r |= Integer.MIN_VALUE;
            return C33318e0.m24166A(this.f90935q, null, this);
        }
    }

    public C33318e0(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        this.f90918g = i;
        this.f90919h = i2;
        this.f90920i = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <T> java.lang.Object m24166A(ge.C33318e0<T> r8, ge.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<?> r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33318e0.m24166A(ge.e0, ge.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0006, code lost:
        r0 = ((p704he.AbstractSharedFlow) r8).f91462b;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m24165B(long r9) {
        /*
            r8 = this;
            int r0 = p704he.AbstractSharedFlow.m23601c(r8)
            if (r0 == 0) goto L27
            he.d[] r0 = p704he.AbstractSharedFlow.m23599g(r8)
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            if (r3 == 0) goto L24
            ge.g0 r3 = (ge.C33326g0) r3
            long r4 = r3.f90948a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L24
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L24
            r3.f90948a = r9
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            r8.f90923l = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33318e0.m24165B(long):void");
    }

    /* renamed from: E */
    private final void m24162E() {
        Object[] objArr = this.f90921j;
        Intrinsics.m17074g(objArr);
        C33323f0.m24122g(objArr, m24156K(), null);
        this.f90924m--;
        long m24156K = m24156K() + 1;
        if (this.f90922k < m24156K) {
            this.f90922k = m24156K;
        }
        if (this.f90923l < m24156K) {
            m24165B(m24156K);
        }
    }

    /* renamed from: F */
    static /* synthetic */ <T> Object m24161F(C33318e0<T> c33318e0, T t, Continuation<? super Unit> continuation) {
        Object m6959e;
        if (c33318e0.mo23983e(t)) {
            return Unit.f99208a;
        }
        Object m24160G = c33318e0.m24160G(t, continuation);
        m6959e = C42688d.m6959e();
        if (m24160G == m6959e) {
            return m24160G;
        }
        return Unit.f99208a;
    }

    /* renamed from: G */
    private final Object m24160G(T t, Continuation<? super Unit> continuation) {
        Continuation m6961c;
        Continuation<Unit>[] continuationArr;
        C33319a c33319a;
        Object m6959e;
        Object m6959e2;
        m6961c = IntrinsicsJvm.m6961c(continuation);
        C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        Continuation<Unit>[] continuationArr2 = C33506c.f91466a;
        synchronized (this) {
            if (m24149R(t)) {
                Result.C38506a c38506a = Result.f101870c;
                c37784p.resumeWith(Result.m14549b(Unit.f99208a));
                continuationArr = m24158I(continuationArr2);
                c33319a = null;
            } else {
                C33319a c33319a2 = new C33319a(this, m24151P() + m24156K(), t, c37784p);
                m24159H(c33319a2);
                this.f90925n++;
                if (this.f90919h == 0) {
                    continuationArr2 = m24158I(continuationArr2);
                }
                continuationArr = continuationArr2;
                c33319a = c33319a2;
            }
        }
        if (c33319a != null) {
            C37793r.m16110a(c37784p, c33319a);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.C38506a c38506a2 = Result.f101870c;
                continuation2.resumeWith(Result.m14549b(Unit.f99208a));
            }
        }
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        m6959e2 = C42688d.m6959e();
        if (m16135u == m6959e2) {
            return m16135u;
        }
        return Unit.f99208a;
    }

    /* renamed from: H */
    public final void m24159H(Object obj) {
        int m24151P = m24151P();
        Object[] objArr = this.f90921j;
        if (objArr == null) {
            objArr = m24150Q(null, 0, 2);
        } else if (m24151P >= objArr.length) {
            objArr = m24150Q(objArr, m24151P, objArr.length * 2);
        }
        C33323f0.m24122g(objArr, m24156K() + m24151P, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0007, code lost:
        r1 = ((p704he.AbstractSharedFlow) r10).f91462b;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m24158I(kotlin.coroutines.Continuation<kotlin.Unit>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = p704he.AbstractSharedFlow.m23601c(r10)
            if (r1 == 0) goto L47
            he.d[] r1 = p704he.AbstractSharedFlow.m23599g(r10)
            if (r1 == 0) goto L47
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            if (r4 == 0) goto L44
            ge.g0 r4 = (ge.C33326g0) r4
            kotlin.coroutines.d<? super kotlin.Unit> r5 = r4.f90949b
            if (r5 != 0) goto L1c
            goto L44
        L1c:
            long r6 = r10.m24147T(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L44
            int r6 = r11.length
            if (r0 < r6) goto L39
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)
        L39:
            r6 = r11
            kotlin.coroutines.d[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f90949b = r0
            r0 = r7
        L44:
            int r3 = r3 + 1
            goto Lf
        L47:
            kotlin.coroutines.d[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33318e0.m24158I(kotlin.coroutines.d[]):kotlin.coroutines.d[]");
    }

    /* renamed from: J */
    private final long m24157J() {
        return m24156K() + this.f90924m;
    }

    /* renamed from: K */
    public final long m24156K() {
        return Math.min(this.f90923l, this.f90922k);
    }

    /* renamed from: M */
    private final Object m24154M(long j) {
        Object m24123f;
        Object[] objArr = this.f90921j;
        Intrinsics.m17074g(objArr);
        m24123f = C33323f0.m24123f(objArr, j);
        if (m24123f instanceof C33319a) {
            return ((C33319a) m24123f).f90928d;
        }
        return m24123f;
    }

    /* renamed from: N */
    private final long m24153N() {
        return m24156K() + this.f90924m + this.f90925n;
    }

    /* renamed from: O */
    private final int m24152O() {
        return (int) ((m24156K() + this.f90924m) - this.f90922k);
    }

    /* renamed from: P */
    public final int m24151P() {
        return this.f90924m + this.f90925n;
    }

    /* renamed from: Q */
    private final Object[] m24150Q(Object[] objArr, int i, int i2) {
        boolean z;
        Object m24123f;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f90921j = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m24156K = m24156K();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + m24156K;
                m24123f = C33323f0.m24123f(objArr, j);
                C33323f0.m24122g(objArr2, j, m24123f);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: R */
    public final boolean m24149R(T t) {
        if (m23594l() == 0) {
            return m24148S(t);
        }
        if (this.f90924m >= this.f90919h && this.f90923l <= this.f90922k) {
            int i = C33320b.$EnumSwitchMapping$0[this.f90920i.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m24159H(t);
        int i2 = this.f90924m + 1;
        this.f90924m = i2;
        if (i2 > this.f90919h) {
            m24162E();
        }
        if (m24152O() > this.f90918g) {
            m24145V(this.f90922k + 1, this.f90923l, m24157J(), m24153N());
        }
        return true;
    }

    /* renamed from: S */
    private final boolean m24148S(T t) {
        if (this.f90918g == 0) {
            return true;
        }
        m24159H(t);
        int i = this.f90924m + 1;
        this.f90924m = i;
        if (i > this.f90918g) {
            m24162E();
        }
        this.f90923l = m24156K() + this.f90924m;
        return true;
    }

    /* renamed from: T */
    public final long m24147T(C33326g0 c33326g0) {
        long j = c33326g0.f90948a;
        if (j < m24157J()) {
            return j;
        }
        if (this.f90919h > 0 || j > m24156K() || this.f90925n == 0) {
            return -1L;
        }
        return j;
    }

    /* renamed from: U */
    private final Object m24146U(C33326g0 c33326g0) {
        Object obj;
        Continuation<Unit>[] continuationArr = C33506c.f91466a;
        synchronized (this) {
            long m24147T = m24147T(c33326g0);
            if (m24147T < 0) {
                obj = C33323f0.f90938a;
            } else {
                long j = c33326g0.f90948a;
                Object m24154M = m24154M(m24147T);
                c33326g0.f90948a = m24147T + 1;
                continuationArr = m24144W(j);
                obj = m24154M;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(Unit.f99208a));
            }
        }
        return obj;
    }

    /* renamed from: V */
    private final void m24145V(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m24156K = m24156K(); m24156K < min; m24156K++) {
            Object[] objArr = this.f90921j;
            Intrinsics.m17074g(objArr);
            C33323f0.m24122g(objArr, m24156K, null);
        }
        this.f90922k = j;
        this.f90923l = j2;
        this.f90924m = (int) (j3 - min);
        this.f90925n = (int) (j4 - j3);
    }

    /* renamed from: x */
    private final Object m24132x(C33326g0 c33326g0, Continuation<? super Unit> continuation) {
        Continuation m6961c;
        Object m6959e;
        Object m6959e2;
        m6961c = IntrinsicsJvm.m6961c(continuation);
        C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        synchronized (this) {
            if (m24147T(c33326g0) < 0) {
                c33326g0.f90949b = c37784p;
            } else {
                Result.C38506a c38506a = Result.f101870c;
                c37784p.resumeWith(Result.m14549b(Unit.f99208a));
            }
            Unit unit = Unit.f99208a;
        }
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        m6959e2 = C42688d.m6959e();
        if (m16135u == m6959e2) {
            return m16135u;
        }
        return Unit.f99208a;
    }

    /* renamed from: y */
    public final void m24131y(C33319a c33319a) {
        Object m24123f;
        synchronized (this) {
            if (c33319a.f90927c < m24156K()) {
                return;
            }
            Object[] objArr = this.f90921j;
            Intrinsics.m17074g(objArr);
            m24123f = C33323f0.m24123f(objArr, c33319a.f90927c);
            if (m24123f == c33319a) {
                C33323f0.m24122g(objArr, c33319a.f90927c, C33323f0.f90938a);
                m24130z();
                Unit unit = Unit.f99208a;
            }
        }
    }

    /* renamed from: z */
    private final void m24130z() {
        Object m24123f;
        if (this.f90919h == 0 && this.f90925n <= 1) {
            return;
        }
        Object[] objArr = this.f90921j;
        Intrinsics.m17074g(objArr);
        while (this.f90925n > 0) {
            m24123f = C33323f0.m24123f(objArr, (m24156K() + m24151P()) - 1);
            if (m24123f == C33323f0.f90938a) {
                this.f90925n--;
                C33323f0.m24122g(objArr, m24156K() + m24151P(), null);
            } else {
                return;
            }
        }
    }

    @Override // p704he.AbstractSharedFlow
    @NotNull
    /* renamed from: C */
    public C33326g0 mo23597i() {
        return new C33326g0();
    }

    @Override // p704he.AbstractSharedFlow
    @NotNull
    /* renamed from: D */
    public C33326g0[] mo23596j(int i) {
        return new C33326g0[i];
    }

    /* renamed from: L */
    public final T m24155L() {
        Object m24123f;
        Object[] objArr = this.f90921j;
        Intrinsics.m17074g(objArr);
        m24123f = C33323f0.m24123f(objArr, (this.f90922k + m24152O()) - 1);
        return (T) m24123f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0024, code lost:
        r4 = ((p704he.AbstractSharedFlow) r21).f91462b;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m24144W(long r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33318e0.m24144W(long):kotlin.coroutines.d[]");
    }

    /* renamed from: X */
    public final long m24143X() {
        long j = this.f90922k;
        if (j < this.f90923l) {
            this.f90923l = j;
        }
        return j;
    }

    @Override // p704he.InterfaceC33528p
    @NotNull
    /* renamed from: b */
    public InterfaceC33327h<T> mo23569b(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        return C33323f0.m24124e(this, coroutineContext, i, bufferOverflow);
    }

    @Override // ge.SharedFlow, ge.InterfaceC33327h
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation) {
        return m24166A(this, flowCollector, continuation);
    }

    @Override // ge.InterfaceC33420y
    /* renamed from: d */
    public void mo23984d() {
        synchronized (this) {
            m24145V(m24157J(), this.f90923l, m24157J(), m24153N());
            Unit unit = Unit.f99208a;
        }
    }

    @Override // ge.InterfaceC33420y
    /* renamed from: e */
    public boolean mo23983e(T t) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArr = C33506c.f91466a;
        synchronized (this) {
            if (m24149R(t)) {
                continuationArr = m24158I(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(Unit.f99208a));
            }
        }
        return z;
    }

    @Override // ge.InterfaceC33420y, ge.FlowCollector
    @Nullable
    public Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        return m24161F(this, t, continuation);
    }
}

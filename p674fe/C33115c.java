package p674fe;

import com.google.common.primitives.Longs;
import ie.C33640k0;
import ie.Symbol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedChannel.kt */
@Metadata
/* renamed from: fe.c */
/* loaded from: classes7.dex */
public final class C33115c {
    @NotNull

    /* renamed from: a */
    private static final C33124i<Object> f90460a = new C33124i<>(-1, null, null, 0);

    /* renamed from: b */
    public static final int f90461b;

    /* renamed from: c */
    private static final int f90462c;
    @NotNull

    /* renamed from: d */
    public static final Symbol f90463d;
    @NotNull

    /* renamed from: e */
    private static final Symbol f90464e;
    @NotNull

    /* renamed from: f */
    private static final Symbol f90465f;
    @NotNull

    /* renamed from: g */
    private static final Symbol f90466g;
    @NotNull

    /* renamed from: h */
    private static final Symbol f90467h;
    @NotNull

    /* renamed from: i */
    private static final Symbol f90468i;
    @NotNull

    /* renamed from: j */
    private static final Symbol f90469j;
    @NotNull

    /* renamed from: k */
    private static final Symbol f90470k;
    @NotNull

    /* renamed from: l */
    private static final Symbol f90471l;
    @NotNull

    /* renamed from: m */
    private static final Symbol f90472m;
    @NotNull

    /* renamed from: n */
    private static final Symbol f90473n;
    @NotNull

    /* renamed from: o */
    private static final Symbol f90474o;
    @NotNull

    /* renamed from: p */
    private static final Symbol f90475p;
    @NotNull

    /* renamed from: q */
    private static final Symbol f90476q;
    @NotNull

    /* renamed from: r */
    private static final Symbol f90477r;
    @NotNull

    /* renamed from: s */
    private static final Symbol f90478s;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    @Metadata
    /* renamed from: fe.c$a */
    /* loaded from: classes7.dex */
    /* synthetic */ class C33116a<E> extends FunctionReferenceImpl implements Function2<Long, C33124i<E>, C33124i<E>> {

        /* renamed from: c */
        public static final C33116a f90479c = new C33116a();

        C33116a() {
            super(2, C33115c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @NotNull
        /* renamed from: a */
        public final C33124i<E> m24694a(long j, @NotNull C33124i<E> c33124i) {
            return C33115c.m24697x(j, c33124i);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo105910invoke(Long l, Object obj) {
            return m24694a(l.longValue(), (C33124i) obj);
        }
    }

    static {
        int m22954e;
        int m22954e2;
        m22954e = C33640k0.m22954e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f90461b = m22954e;
        m22954e2 = C33640k0.m22954e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f90462c = m22954e2;
        f90463d = new Symbol("BUFFERED");
        f90464e = new Symbol("SHOULD_BUFFER");
        f90465f = new Symbol("S_RESUMING_BY_RCV");
        f90466g = new Symbol("RESUMING_BY_EB");
        f90467h = new Symbol("POISONED");
        f90468i = new Symbol("DONE_RCV");
        f90469j = new Symbol("INTERRUPTED_SEND");
        f90470k = new Symbol("INTERRUPTED_RCV");
        f90471l = new Symbol("CHANNEL_CLOSED");
        f90472m = new Symbol("SUSPEND");
        f90473n = new Symbol("SUSPEND_NO_WAITER");
        f90474o = new Symbol("FAILED");
        f90475p = new Symbol("NO_RECEIVE_RESULT");
        f90476q = new Symbol("CLOSE_HANDLER_CLOSED");
        f90477r = new Symbol("CLOSE_HANDLER_INVOKED");
        f90478s = new Symbol("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final long m24723A(int i) {
        if (i != 0) {
            if (i != Integer.MAX_VALUE) {
                return i;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static final <T> boolean m24722B(InterfaceC37780o<? super T> interfaceC37780o, T t, Function1<? super Throwable, Unit> function1) {
        Object mo15170C = interfaceC37780o.mo15170C(t, null, function1);
        if (mo15170C != null) {
            interfaceC37780o.mo15161w(mo15170C);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ boolean m24721C(InterfaceC37780o interfaceC37780o, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m24722B(interfaceC37780o, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final long m24699v(long j, boolean z) {
        long j2;
        if (z) {
            j2 = Longs.MAX_POWER_OF_TWO;
        } else {
            j2 = 0;
        }
        return j2 + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final long m24698w(long j, int i) {
        return (i << 60) + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final <E> C33124i<E> m24697x(long j, C33124i<E> c33124i) {
        return new C33124i<>(j, c33124i, c33124i.m24669u(), 0);
    }

    @NotNull
    /* renamed from: y */
    public static final <E> KFunction<C33124i<E>> m24696y() {
        return C33116a.f90479c;
    }

    @NotNull
    /* renamed from: z */
    public static final Symbol m24695z() {
        return f90471l;
    }
}

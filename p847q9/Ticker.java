package p847q9;

import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37608m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: q9.c */
/* loaded from: classes8.dex */
public class Ticker {
    @NotNull

    /* renamed from: q */
    public static final C39356a f103508q = new C39356a(null);
    @NotNull

    /* renamed from: a */
    private final String f103509a;
    @NotNull

    /* renamed from: b */
    private final Function1<Long, Unit> f103510b;
    @NotNull

    /* renamed from: c */
    private final Function1<Long, Unit> f103511c;
    @NotNull

    /* renamed from: d */
    private final Function1<Long, Unit> f103512d;
    @NotNull

    /* renamed from: e */
    private final Function1<Long, Unit> f103513e;
    @Nullable

    /* renamed from: f */
    private final ErrorCollector f103514f;
    @Nullable

    /* renamed from: g */
    private Long f103515g;
    @Nullable

    /* renamed from: h */
    private Long f103516h;
    @Nullable

    /* renamed from: i */
    private Long f103517i;
    @Nullable

    /* renamed from: j */
    private Long f103518j;
    @NotNull

    /* renamed from: k */
    private EnumC39357b f103519k;

    /* renamed from: l */
    private long f103520l;

    /* renamed from: m */
    private long f103521m;

    /* renamed from: n */
    private long f103522n;
    @Nullable

    /* renamed from: o */
    private Timer f103523o;
    @Nullable

    /* renamed from: p */
    private TimerTask f103524p;

    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$a */
    /* loaded from: classes8.dex */
    public static final class C39356a {
        private C39356a() {
        }

        public /* synthetic */ C39356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$b */
    /* loaded from: classes8.dex */
    public enum EnumC39357b {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C39358c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC39357b.values().length];
            try {
                iArr[EnumC39357b.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC39357b.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC39357b.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$d */
    /* loaded from: classes8.dex */
    public static final class C39359d extends Lambda implements Functions<Unit> {

        /* renamed from: h */
        final /* synthetic */ long f103530h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39359d(long j) {
            super(0);
            this.f103530h = j;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Ticker.this.m12847i();
            Ticker.this.f103512d.invoke(Long.valueOf(this.f103530h));
            Ticker.this.f103519k = EnumC39357b.STOPPED;
            Ticker.this.m12838r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$e */
    /* loaded from: classes8.dex */
    public static final class C39360e extends Lambda implements Functions<Unit> {
        C39360e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Ticker.this.m12846j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$f */
    /* loaded from: classes8.dex */
    public static final class C39361f extends Lambda implements Functions<Unit> {

        /* renamed from: g */
        final /* synthetic */ long f103532g;

        /* renamed from: h */
        final /* synthetic */ Ticker f103533h;

        /* renamed from: i */
        final /* synthetic */ C37608m0 f103534i;

        /* renamed from: j */
        final /* synthetic */ long f103535j;

        /* renamed from: k */
        final /* synthetic */ Functions<Unit> f103536k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Ticker.kt */
        @Metadata
        /* renamed from: q9.c$f$a */
        /* loaded from: classes8.dex */
        public static final class C39362a extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            final /* synthetic */ Functions<Unit> f103537g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C39362a(Functions<Unit> functions) {
                super(0);
                this.f103537g = functions;
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f99208a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f103537g.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39361f(long j, Ticker ticker, C37608m0 c37608m0, long j2, Functions<Unit> functions) {
            super(0);
            this.f103532g = j;
            this.f103533h = ticker;
            this.f103534i = c37608m0;
            this.f103535j = j2;
            this.f103536k = functions;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long m12843m = this.f103532g - this.f103533h.m12843m();
            this.f103533h.m12846j();
            C37608m0 c37608m0 = this.f103534i;
            c37608m0.f99326b--;
            boolean z = false;
            if (1 <= m12843m && m12843m < this.f103535j) {
                z = true;
            }
            if (z) {
                this.f103533h.m12847i();
                Ticker.m12859A(this.f103533h, m12843m, 0L, new C39362a(this.f103536k), 2, null);
            } else if (m12843m <= 0) {
                this.f103536k.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ticker.kt */
    @Metadata
    /* renamed from: q9.c$g */
    /* loaded from: classes8.dex */
    public static final class C39363g extends Lambda implements Functions<Unit> {

        /* renamed from: g */
        final /* synthetic */ C37608m0 f103538g;

        /* renamed from: h */
        final /* synthetic */ Ticker f103539h;

        /* renamed from: i */
        final /* synthetic */ long f103540i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39363g(C37608m0 c37608m0, Ticker ticker, long j) {
            super(0);
            this.f103538g = c37608m0;
            this.f103539h = ticker;
            this.f103540i = j;
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f103538g.f99326b > 0) {
                this.f103539h.f103513e.invoke(Long.valueOf(this.f103540i));
            }
            this.f103539h.f103512d.invoke(Long.valueOf(this.f103540i));
            this.f103539h.m12847i();
            this.f103539h.m12838r();
            this.f103539h.f103519k = EnumC39357b.STOPPED;
        }
    }

    /* compiled from: Timer.kt */
    @Metadata
    /* renamed from: q9.c$h */
    /* loaded from: classes8.dex */
    public static final class C39364h extends TimerTask {

        /* renamed from: b */
        final /* synthetic */ Functions f103541b;

        public C39364h(Functions functions) {
            this.f103541b = functions;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f103541b.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@NotNull String name, @NotNull Function1<? super Long, Unit> onInterrupt, @NotNull Function1<? super Long, Unit> onStart, @NotNull Function1<? super Long, Unit> onEnd, @NotNull Function1<? super Long, Unit> onTick, @Nullable ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(onInterrupt, "onInterrupt");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        this.f103509a = name;
        this.f103510b = onInterrupt;
        this.f103511c = onStart;
        this.f103512d = onEnd;
        this.f103513e = onTick;
        this.f103514f = errorCollector;
        this.f103519k = EnumC39357b.STOPPED;
        this.f103521m = -1L;
        this.f103522n = -1L;
    }

    /* renamed from: A */
    public static /* synthetic */ void m12859A(Ticker ticker, long j, long j2, Functions functions, int i, Object obj) {
        long j3;
        if (obj == null) {
            if ((i & 2) != 0) {
                j3 = j;
            } else {
                j3 = j2;
            }
            ticker.m12830z(j, j3, functions);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupTimer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m12846j() {
        long m16911k;
        Long l = this.f103515g;
        if (l != null) {
            Function1<Long, Unit> function1 = this.f103513e;
            m16911k = _Ranges.m16911k(m12843m(), l.longValue());
            function1.invoke(Long.valueOf(m16911k));
            return;
        }
        this.f103513e.invoke(Long.valueOf(m12843m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final long m12843m() {
        return m12842n() + this.f103520l;
    }

    /* renamed from: n */
    private final long m12842n() {
        if (this.f103521m == -1) {
            return 0L;
        }
        return m12844l() - this.f103521m;
    }

    /* renamed from: o */
    private final void m12841o(String str) {
        ErrorCollector errorCollector = this.f103514f;
        if (errorCollector != null) {
            errorCollector.m36941e(new IllegalArgumentException(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m12838r() {
        this.f103521m = -1L;
        this.f103522n = -1L;
        this.f103520l = 0L;
    }

    /* renamed from: u */
    private final void m12835u(long j) {
        long m12843m = j - m12843m();
        if (m12843m >= 0) {
            m12859A(this, m12843m, 0L, new C39359d(j), 2, null);
            return;
        }
        this.f103512d.invoke(Long.valueOf(j));
        m12838r();
    }

    /* renamed from: v */
    private final void m12834v(long j) {
        m12830z(j, j - (m12843m() % j), new C39360e());
    }

    /* renamed from: w */
    private final void m12833w(long j, long j2) {
        C37608m0 c37608m0 = new C37608m0();
        c37608m0.f99326b = (j / j2) - (m12843m() / j2);
        m12830z(j2, j2 - (m12843m() % j2), new C39361f(j, this, c37608m0, j2, new C39363g(c37608m0, this, j)));
    }

    /* renamed from: x */
    private final void m12832x() {
        Long l = this.f103518j;
        Long l2 = this.f103517i;
        if (l != null && this.f103522n != -1 && m12844l() - this.f103522n > l.longValue()) {
            m12846j();
        }
        if (l == null && l2 != null) {
            m12835u(l2.longValue());
        } else if (l != null && l2 != null) {
            m12833w(l2.longValue(), l.longValue());
        } else if (l != null && l2 == null) {
            m12834v(l.longValue());
        }
    }

    /* renamed from: B */
    public void m12858B() {
        int i = C39358c.$EnumSwitchMapping$0[this.f103519k.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m12841o("The timer '" + this.f103509a + "' paused!");
                    return;
                }
                return;
            }
            m12841o("The timer '" + this.f103509a + "' already working!");
            return;
        }
        m12847i();
        this.f103517i = this.f103515g;
        this.f103518j = this.f103516h;
        this.f103519k = EnumC39357b.WORKING;
        this.f103511c.invoke(Long.valueOf(m12843m()));
        m12832x();
    }

    /* renamed from: C */
    public void m12857C() {
        int i = C39358c.$EnumSwitchMapping$0[this.f103519k.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.f103519k = EnumC39357b.STOPPED;
                this.f103512d.invoke(Long.valueOf(m12843m()));
                m12847i();
                m12838r();
                return;
            }
            return;
        }
        m12841o("The timer '" + this.f103509a + "' already stopped!");
    }

    /* renamed from: D */
    public void m12856D(long j, @Nullable Long l) {
        Long valueOf;
        this.f103516h = l;
        if (j == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(j);
        }
        this.f103515g = valueOf;
    }

    /* renamed from: g */
    public void m12849g(@NotNull Timer parentTimer) {
        Intrinsics.checkNotNullParameter(parentTimer, "parentTimer");
        this.f103523o = parentTimer;
    }

    /* renamed from: h */
    public void m12848h() {
        int i = C39358c.$EnumSwitchMapping$0[this.f103519k.ordinal()];
        if (i == 2 || i == 3) {
            this.f103519k = EnumC39357b.STOPPED;
            m12847i();
            this.f103510b.invoke(Long.valueOf(m12843m()));
            m12838r();
        }
    }

    /* renamed from: i */
    protected void m12847i() {
        TimerTask timerTask = this.f103524p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f103524p = null;
    }

    /* renamed from: k */
    public void m12845k() {
        this.f103523o = null;
    }

    /* renamed from: l */
    public long m12844l() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public void m12840p() {
        int i = C39358c.$EnumSwitchMapping$0[this.f103519k.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m12841o("The timer '" + this.f103509a + "' already paused!");
                    return;
                }
                return;
            }
            this.f103519k = EnumC39357b.PAUSED;
            this.f103510b.invoke(Long.valueOf(m12843m()));
            m12831y();
            this.f103521m = -1L;
            return;
        }
        m12841o("The timer '" + this.f103509a + "' already stopped!");
    }

    /* renamed from: q */
    public void m12839q() {
        m12848h();
        m12858B();
    }

    /* renamed from: s */
    public final void m12837s(boolean z) {
        if (!z) {
            this.f103522n = -1L;
        }
        m12832x();
    }

    /* renamed from: t */
    public void m12836t() {
        int i = C39358c.$EnumSwitchMapping$0[this.f103519k.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f103519k = EnumC39357b.WORKING;
                    m12837s(false);
                    return;
                }
                return;
            }
            m12841o("The timer '" + this.f103509a + "' already working!");
            return;
        }
        m12841o("The timer '" + this.f103509a + "' is stopped!");
    }

    /* renamed from: y */
    public final void m12831y() {
        if (this.f103521m != -1) {
            this.f103520l += m12844l() - this.f103521m;
            this.f103522n = m12844l();
            this.f103521m = -1L;
        }
        m12847i();
    }

    /* renamed from: z */
    protected void m12830z(long j, long j2, @NotNull Functions<Unit> onTick) {
        Intrinsics.checkNotNullParameter(onTick, "onTick");
        TimerTask timerTask = this.f103524p;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f103524p = new C39364h(onTick);
        this.f103521m = m12844l();
        Timer timer = this.f103523o;
        if (timer != null) {
            timer.scheduleAtFixedRate(this.f103524p, j2, j);
        }
    }
}

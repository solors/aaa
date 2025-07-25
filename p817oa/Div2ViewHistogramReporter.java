package p817oa;

import android.os.SystemClock;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import pa.RenderMetrics;
import qa.HistogramReporter;
import sa.C39638b;
import sa.KAssert;

@Metadata
@MainThread
/* renamed from: oa.f */
/* loaded from: classes8.dex */
public final class Div2ViewHistogramReporter {
    @NotNull

    /* renamed from: a */
    private final Functions<HistogramReporter> f102751a;
    @NotNull

    /* renamed from: b */
    private final Functions<RenderConfiguration> f102752b;
    @Nullable

    /* renamed from: c */
    private String f102753c;

    /* renamed from: d */
    private boolean f102754d;
    @Nullable

    /* renamed from: e */
    private Long f102755e;
    @Nullable

    /* renamed from: f */
    private Long f102756f;
    @Nullable

    /* renamed from: g */
    private Long f102757g;
    @Nullable

    /* renamed from: h */
    private Long f102758h;
    @Nullable

    /* renamed from: i */
    private Long f102759i;
    @Nullable

    /* renamed from: j */
    private Long f102760j;
    @Nullable

    /* renamed from: k */
    private Long f102761k;
    @NotNull

    /* renamed from: l */
    private final InterfaceC38501j f102762l;

    /* compiled from: Div2ViewHistogramReporter.kt */
    @Metadata
    /* renamed from: oa.f$a */
    /* loaded from: classes8.dex */
    /* synthetic */ class C39121a extends FunctionReferenceImpl implements Functions<RenderMetrics> {

        /* renamed from: c */
        public static final C39121a f102763c = new C39121a();

        C39121a() {
            super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: c */
        public final RenderMetrics invoke() {
            return new RenderMetrics();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(@NotNull Functions<? extends HistogramReporter> histogramReporter, @NotNull Functions<RenderConfiguration> renderConfig) {
        InterfaceC38501j m14553b;
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(renderConfig, "renderConfig");
        this.f102751a = histogramReporter;
        this.f102752b = renderConfig;
        m14553b = LazyJVM.m14553b(EnumC38505n.f101867d, C39121a.f102763c);
        this.f102762l = m14553b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final long m13902d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    private final RenderMetrics m13901e() {
        return (RenderMetrics) this.f102762l.getValue();
    }

    /* renamed from: s */
    private final void m13887s(RenderMetrics renderMetrics) {
        HistogramReporter invoke = this.f102751a.invoke();
        RenderConfiguration invoke2 = this.f102752b.invoke();
        HistogramReporter.m12806b(invoke, "Div.Render.Total", renderMetrics.m13205h(), this.f102753c, null, invoke2.m13850d(), 8, null);
        HistogramReporter.m12806b(invoke, "Div.Render.Measure", renderMetrics.m13206g(), this.f102753c, null, invoke2.m13851c(), 8, null);
        HistogramReporter.m12806b(invoke, "Div.Render.Layout", renderMetrics.m13207f(), this.f102753c, null, invoke2.m13852b(), 8, null);
        HistogramReporter.m12806b(invoke, "Div.Render.Draw", renderMetrics.m13208e(), this.f102753c, null, invoke2.m13853a(), 8, null);
    }

    /* renamed from: t */
    private final void m13886t() {
        this.f102754d = false;
        this.f102760j = null;
        this.f102759i = null;
        this.f102761k = null;
        m13901e().m13203j();
    }

    /* renamed from: v */
    private final long m13884v(long j) {
        return m13902d() - j;
    }

    @Nullable
    /* renamed from: c */
    public final String m13903c() {
        return this.f102753c;
    }

    /* renamed from: f */
    public final void m13900f() {
        String str;
        long m13902d;
        Long l = this.f102755e;
        Long l2 = this.f102756f;
        Long l3 = this.f102757g;
        RenderMetrics m13901e = m13901e();
        if (l == null) {
            KAssert kAssert = KAssert.f104132a;
            if (C39638b.m11995q()) {
                str = "start time of Div.Binding is null";
                C39638b.m12001k(str);
            }
        } else {
            if (l2 != null && l3 != null) {
                m13902d = ((m13902d() - l3.longValue()) + l2.longValue()) - l.longValue();
            } else if (l2 == null && l3 == null) {
                m13902d = m13902d() - l.longValue();
            } else {
                KAssert kAssert2 = KAssert.f104132a;
                if (C39638b.m11995q()) {
                    str = "when Div.Binding has paused time it should have resumed time and otherwise";
                    C39638b.m12001k(str);
                }
            }
            m13901e.m13209d(m13902d);
            HistogramReporter.m12806b((HistogramReporter) this.f102751a.invoke(), "Div.Binding", m13902d, m13903c(), null, null, 24, null);
        }
        this.f102755e = null;
        this.f102756f = null;
        this.f102757g = null;
    }

    /* renamed from: g */
    public final void m13899g() {
        this.f102756f = Long.valueOf(m13902d());
    }

    /* renamed from: h */
    public final void m13898h() {
        this.f102757g = Long.valueOf(m13902d());
    }

    /* renamed from: i */
    public final void m13897i() {
        this.f102755e = Long.valueOf(m13902d());
    }

    /* renamed from: j */
    public final void m13896j() {
        Long l = this.f102761k;
        if (l != null) {
            m13901e().m13212a(m13884v(l.longValue()));
        }
        if (this.f102754d) {
            m13887s(m13901e());
        }
        m13886t();
    }

    /* renamed from: k */
    public final void m13895k() {
        this.f102761k = Long.valueOf(m13902d());
    }

    /* renamed from: l */
    public final void m13894l() {
        Long l = this.f102760j;
        if (l != null) {
            m13901e().m13211b(m13884v(l.longValue()));
        }
    }

    /* renamed from: m */
    public final void m13893m() {
        this.f102760j = Long.valueOf(m13902d());
    }

    /* renamed from: n */
    public final void m13892n() {
        Long l = this.f102759i;
        if (l != null) {
            m13901e().m13210c(m13884v(l.longValue()));
        }
    }

    /* renamed from: o */
    public final void m13891o() {
        this.f102759i = Long.valueOf(m13902d());
    }

    /* renamed from: p */
    public final void m13890p() {
        Long l = this.f102758h;
        RenderMetrics m13901e = m13901e();
        if (l == null) {
            KAssert kAssert = KAssert.f104132a;
            if (C39638b.m11995q()) {
                C39638b.m12001k("start time of Div.Rebinding is null");
            }
        } else {
            long m13902d = m13902d() - l.longValue();
            m13901e.m13204i(m13902d);
            HistogramReporter.m12806b((HistogramReporter) this.f102751a.invoke(), "Div.Rebinding", m13902d, m13903c(), null, null, 24, null);
        }
        this.f102758h = null;
    }

    /* renamed from: q */
    public final void m13889q() {
        this.f102758h = Long.valueOf(m13902d());
    }

    /* renamed from: r */
    public final void m13888r() {
        this.f102754d = true;
    }

    /* renamed from: u */
    public final void m13885u(@Nullable String str) {
        this.f102753c = str;
    }
}

package p866rc;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import mc.C38260d;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p866rc.PipelinePhaseRelation;

@Metadata
/* renamed from: rc.d */
/* loaded from: classes9.dex */
public class Pipeline<TSubject, TContext> {
    @NotNull
    private volatile /* synthetic */ Object _interceptors;
    @NotNull

    /* renamed from: a */
    private final InterfaceC38258b f103775a;

    /* renamed from: b */
    private final boolean f103776b;
    @NotNull

    /* renamed from: c */
    private final List<Object> f103777c;

    /* renamed from: d */
    private int f103778d;

    /* renamed from: e */
    private boolean f103779e;
    @Nullable

    /* renamed from: f */
    private C39471h f103780f;

    public Pipeline(@NotNull C39471h... phases) {
        List<Object> m17160s;
        Intrinsics.checkNotNullParameter(phases, "phases");
        this.f103775a = C38260d.m15249a(true);
        m17160s = C37563v.m17160s(Arrays.copyOf(phases, phases.length));
        this.f103777c = m17160s;
        this._interceptors = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        r0 = kotlin.collections.C37563v.m17164o(r1);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<p1076zd.InterfaceC45268n<p866rc.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> m12562b() {
        /*
            r7 = this;
            int r0 = r7.f103778d
            if (r0 != 0) goto L10
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            r7.m12551m(r0)
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            return r0
        L10:
            java.util.List<java.lang.Object> r1 = r7.f103777c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L40
            int r0 = kotlin.collections.C37561t.m17199o(r1)
            if (r0 < 0) goto L40
            r4 = r3
        L1e:
            java.lang.Object r5 = r1.get(r4)
            boolean r6 = r5 instanceof p866rc.PhaseContent
            if (r6 == 0) goto L29
            rc.c r5 = (p866rc.PhaseContent) r5
            goto L2a
        L29:
            r5 = r2
        L2a:
            if (r5 != 0) goto L2d
            goto L3b
        L2d:
            boolean r6 = r5.m12565h()
            if (r6 != 0) goto L3b
            java.util.List r0 = r5.m12564i()
            r7.m12548p(r5)
            return r0
        L3b:
            if (r4 == r0) goto L40
            int r4 = r4 + 1
            goto L1e
        L40:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r4 = kotlin.collections.C37561t.m17199o(r1)
            if (r4 < 0) goto L62
        L4b:
            java.lang.Object r5 = r1.get(r3)
            boolean r6 = r5 instanceof p866rc.PhaseContent
            if (r6 == 0) goto L56
            rc.c r5 = (p866rc.PhaseContent) r5
            goto L57
        L56:
            r5 = r2
        L57:
            if (r5 != 0) goto L5a
            goto L5d
        L5a:
            r5.m12571b(r0)
        L5d:
            if (r3 == r4) goto L62
            int r3 = r3 + 1
            goto L4b
        L62:
            r7.m12551m(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p866rc.Pipeline.m12562b():java.util.List");
    }

    /* renamed from: c */
    private final PipelineContext<TSubject, TContext> m12561c(TContext tcontext, TSubject tsubject, CoroutineContext coroutineContext) {
        return C39469f.m12544a(tcontext, m12547q(), tsubject, coroutineContext, mo12557g());
    }

    /* renamed from: e */
    private final PhaseContent<TSubject, TContext> m12559e(C39471h c39471h) {
        List<Object> list = this.f103777c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == c39471h) {
                PhaseContent<TSubject, TContext> phaseContent = new PhaseContent<>(c39471h, PipelinePhaseRelation.C39474c.f103786a);
                list.set(i, phaseContent);
                return phaseContent;
            }
            if (obj instanceof PhaseContent) {
                PhaseContent<TSubject, TContext> phaseContent2 = (PhaseContent) obj;
                if (phaseContent2.m12568e() == c39471h) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private final int m12558f(C39471h c39471h) {
        List<Object> list = this.f103777c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == c39471h || ((obj instanceof PhaseContent) && ((PhaseContent) obj).m12568e() == c39471h)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    private final List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> m12556h() {
        return (List) this._interceptors;
    }

    /* renamed from: i */
    private final boolean m12555i(C39471h c39471h) {
        List<Object> list = this.f103777c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != c39471h) {
                if ((obj instanceof PhaseContent) && ((PhaseContent) obj).m12568e() == c39471h) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private final void m12551m(List<? extends InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> list) {
        m12549o(list);
        this.f103779e = false;
        this.f103780f = null;
    }

    /* renamed from: n */
    private final void m12550n() {
        m12549o(null);
        this.f103779e = false;
        this.f103780f = null;
    }

    /* renamed from: o */
    private final void m12549o(List<? extends InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> list) {
        this._interceptors = list;
    }

    /* renamed from: p */
    private final void m12548p(PhaseContent<TSubject, TContext> phaseContent) {
        m12549o(phaseContent.m12564i());
        this.f103779e = false;
        this.f103780f = phaseContent.m12568e();
    }

    /* renamed from: q */
    private final List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> m12547q() {
        if (m12556h() == null) {
            m12562b();
        }
        this.f103779e = true;
        List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> m12556h = m12556h();
        Intrinsics.m17074g(m12556h);
        return m12556h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    private final boolean m12546r(C39471h c39471h, InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object> interfaceC45268n) {
        Object m17577B0;
        int m17164o;
        List<InterfaceC45268n<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> m12556h = m12556h();
        if (this.f103777c.isEmpty() || m12556h == null || this.f103779e || !TypeIntrinsics.m16999l(m12556h)) {
            return false;
        }
        if (!Intrinsics.m17075f(this.f103780f, c39471h)) {
            m17577B0 = _Collections.m17577B0(this.f103777c);
            if (!Intrinsics.m17075f(c39471h, m17577B0)) {
                int m12558f = m12558f(c39471h);
                m17164o = C37563v.m17164o(this.f103777c);
                if (m12558f != m17164o) {
                    return false;
                }
            }
            PhaseContent<TSubject, TContext> m12559e = m12559e(c39471h);
            Intrinsics.m17074g(m12559e);
            m12559e.m12572a(interfaceC45268n);
            m12556h.add(interfaceC45268n);
            return true;
        }
        m12556h.add(interfaceC45268n);
        return true;
    }

    @Nullable
    /* renamed from: d */
    public final Object m12560d(@NotNull TContext tcontext, @NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        return m12561c(tcontext, tsubject, continuation.getContext()).mo12537b(tsubject, continuation);
    }

    /* renamed from: g */
    public boolean mo12557g() {
        return this.f103776b;
    }

    /* renamed from: j */
    public final void m12554j(@NotNull C39471h reference, @NotNull C39471h phase) {
        int m17164o;
        PhaseContent phaseContent;
        PipelinePhaseRelation m12567f;
        C39471h m12541a;
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (m12555i(phase)) {
            return;
        }
        int m12558f = m12558f(reference);
        if (m12558f != -1) {
            int i = m12558f + 1;
            m17164o = C37563v.m17164o(this.f103777c);
            if (i <= m17164o) {
                while (true) {
                    Object obj = this.f103777c.get(i);
                    PipelinePhaseRelation.C39472a c39472a = null;
                    if (obj instanceof PhaseContent) {
                        phaseContent = (PhaseContent) obj;
                    } else {
                        phaseContent = null;
                    }
                    if (phaseContent != null && (m12567f = phaseContent.m12567f()) != null) {
                        if (m12567f instanceof PipelinePhaseRelation.C39472a) {
                            c39472a = (PipelinePhaseRelation.C39472a) m12567f;
                        }
                        if (c39472a != null && (m12541a = c39472a.m12541a()) != null && Intrinsics.m17075f(m12541a, reference)) {
                            m12558f = i;
                        }
                        if (i == m17164o) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            this.f103777c.add(m12558f + 1, new PhaseContent(phase, new PipelinePhaseRelation.C39472a(reference)));
            return;
        }
        throw new PipelinePhase("Phase " + reference + " was not registered for this pipeline");
    }

    /* renamed from: k */
    public final void m12553k(@NotNull C39471h reference, @NotNull C39471h phase) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(phase, "phase");
        if (m12555i(phase)) {
            return;
        }
        int m12558f = m12558f(reference);
        if (m12558f != -1) {
            this.f103777c.add(m12558f, new PhaseContent(phase, new PipelinePhaseRelation.C39473b(reference)));
            return;
        }
        throw new PipelinePhase("Phase " + reference + " was not registered for this pipeline");
    }

    /* renamed from: l */
    public final void m12552l(@NotNull C39471h phase, @NotNull InterfaceC45268n<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(block, "block");
        PhaseContent<TSubject, TContext> m12559e = m12559e(phase);
        if (m12559e != null) {
            InterfaceC45268n interfaceC45268n = (InterfaceC45268n) TypeIntrinsics.m17006e(block, 3);
            if (m12546r(phase, block)) {
                this.f103778d++;
                return;
            }
            m12559e.m12572a(block);
            this.f103778d++;
            m12550n();
            m12563a();
            return;
        }
        throw new PipelinePhase("Phase " + phase + " was not registered for this pipeline");
    }

    /* renamed from: a */
    public void m12563a() {
    }
}

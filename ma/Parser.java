package ma;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ma.InterfaceC38214e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p759ka.Evaluable;
import p759ka.EvaluableException;

@Metadata
/* renamed from: ma.b */
/* loaded from: classes8.dex */
public final class Parser {
    @NotNull

    /* renamed from: a */
    public static final Parser f101089a = new Parser();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Parser.kt */
    @Metadata
    /* renamed from: ma.b$a */
    /* loaded from: classes8.dex */
    public static final class C38211a {
        @NotNull

        /* renamed from: a */
        private final List<InterfaceC38214e> f101090a;
        @NotNull

        /* renamed from: b */
        private final String f101091b;

        /* renamed from: c */
        private int f101092c;

        /* JADX WARN: Multi-variable type inference failed */
        public C38211a(@NotNull List<? extends InterfaceC38214e> tokens, @NotNull String rawExpr) {
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
            this.f101090a = tokens;
            this.f101091b = rawExpr;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC38214e m15324a() {
            return this.f101090a.get(this.f101092c);
        }

        /* renamed from: b */
        public final int m15323b() {
            int i = this.f101092c;
            this.f101092c = i + 1;
            return i;
        }

        @NotNull
        /* renamed from: c */
        public final String m15322c() {
            return this.f101091b;
        }

        /* renamed from: d */
        public final boolean m15321d() {
            if (this.f101092c >= this.f101090a.size()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m15320e() {
            return !m15321d();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38211a)) {
                return false;
            }
            C38211a c38211a = (C38211a) obj;
            if (Intrinsics.m17075f(this.f101090a, c38211a.f101090a) && Intrinsics.m17075f(this.f101091b, c38211a.f101091b)) {
                return true;
            }
            return false;
        }

        @NotNull
        /* renamed from: f */
        public final InterfaceC38214e m15319f() {
            return this.f101090a.get(m15323b());
        }

        public int hashCode() {
            return (this.f101090a.hashCode() * 31) + this.f101091b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ParsingState(tokens=" + this.f101090a + ", rawExpr=" + this.f101091b + ')';
        }
    }

    private Parser() {
    }

    /* renamed from: a */
    private final Evaluable m15339a(C38211a c38211a) {
        Evaluable m15335e = m15335e(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38237d.C38238a)) {
            c38211a.m15323b();
            m15335e = new Evaluable.C37411a(InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38237d.C38238a.f101110a, m15335e, m15335e(c38211a), c38211a.m15322c());
        }
        return m15335e;
    }

    /* renamed from: b */
    private final Evaluable m15338b(C38211a c38211a, Evaluable evaluable) {
        if (!c38211a.m15321d()) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            if (evaluable != null && !(m15319f instanceof InterfaceC38214e.C38215a)) {
                throw new EvaluableException("Method expected after .", null, 2, null);
            }
            if (m15319f instanceof InterfaceC38214e.InterfaceC38217b.InterfaceC38218a) {
                return new Evaluable.C37420j((InterfaceC38214e.InterfaceC38217b.InterfaceC38218a) m15319f, c38211a.m15322c());
            }
            if (m15319f instanceof InterfaceC38214e.InterfaceC38217b.C38222b) {
                return new Evaluable.C37421k(((InterfaceC38214e.InterfaceC38217b.C38222b) m15319f).m15293g(), c38211a.m15322c(), null);
            }
            if (m15319f instanceof InterfaceC38214e.C38215a) {
                return m15328l((InterfaceC38214e.C38215a) m15319f, c38211a, evaluable);
            }
            if (m15319f instanceof C38212c) {
                Evaluable m15333g = m15333g(c38211a);
                if (!(c38211a.m15319f() instanceof C38213d)) {
                    throw new EvaluableException("')' expected after expression", null, 2, null);
                }
                return m15333g;
            } else if (m15319f instanceof C38255h) {
                ArrayList arrayList = new ArrayList();
                while (c38211a.m15320e() && !(c38211a.m15324a() instanceof C38253f)) {
                    if (!(c38211a.m15324a() instanceof C38256i) && !(c38211a.m15324a() instanceof C38254g)) {
                        arrayList.add(m15333g(c38211a));
                    } else {
                        c38211a.m15323b();
                    }
                }
                if (c38211a.m15319f() instanceof C38253f) {
                    return new Evaluable.C37416f(arrayList, c38211a.m15322c());
                }
                throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
            } else {
                throw new EvaluableException("Expression expected", null, 2, null);
            }
        }
        throw new EvaluableException("Expression expected", null, 2, null);
    }

    /* renamed from: c */
    static /* synthetic */ Evaluable m15337c(Parser parser, C38211a c38211a, Evaluable evaluable, int i, Object obj) {
        if ((i & 2) != 0) {
            evaluable = null;
        }
        return parser.m15338b(c38211a, evaluable);
    }

    /* renamed from: d */
    private final Evaluable m15336d(C38211a c38211a) {
        Evaluable m15327m = m15327m(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38225a)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Evaluable m15327m2 = m15327m(c38211a);
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            m15327m = new Evaluable.C37411a((InterfaceC38214e.InterfaceC38223c.InterfaceC38224a) m15319f, m15327m, m15327m2, c38211a.m15322c());
        }
        return m15327m;
    }

    /* renamed from: e */
    private final Evaluable m15335e(C38211a c38211a) {
        Evaluable m15336d = m15336d(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38230b)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Evaluable m15336d2 = m15336d(c38211a);
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            m15336d = new Evaluable.C37411a((InterfaceC38214e.InterfaceC38223c.InterfaceC38224a) m15319f, m15336d, m15336d2, c38211a.m15322c());
        }
        return m15336d;
    }

    /* renamed from: f */
    private final Evaluable m15334f(C38211a c38211a) {
        Evaluable m15331i = m15331i(c38211a);
        if (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.C38240e)) {
            c38211a.m15323b();
            return new Evaluable.C37411a(InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.C38240e.f101112a, m15331i, m15325o(c38211a), c38211a.m15322c());
        }
        return m15331i;
    }

    /* renamed from: g */
    private final Evaluable m15333g(C38211a c38211a) {
        Evaluable m15326n = m15326n(c38211a);
        if (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.C38246d)) {
            c38211a.m15323b();
            Evaluable m15333g = m15333g(c38211a);
            if (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.C38245c) {
                c38211a.m15323b();
                return new Evaluable.C37417g(InterfaceC38214e.InterfaceC38223c.C38247e.f101118a, m15326n, m15333g, m15333g(c38211a), c38211a.m15322c());
            }
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        return m15326n;
    }

    /* renamed from: h */
    private final Evaluable m15332h(C38211a c38211a) {
        Evaluable m15325o = m15325o(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38233c)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            m15325o = new Evaluable.C37411a((InterfaceC38214e.InterfaceC38223c.InterfaceC38224a) m15319f, m15325o, m15325o(c38211a), c38211a.m15322c());
        }
        return m15325o;
    }

    /* renamed from: i */
    private final Evaluable m15331i(C38211a c38211a) {
        Evaluable m15337c = m15337c(this, c38211a, null, 2, null);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.C38244b)) {
            c38211a.m15323b();
            m15337c = m15338b(c38211a, m15337c);
        }
        return m15337c;
    }

    /* renamed from: j */
    private final Evaluable m15330j(C38211a c38211a) {
        Evaluable m15339a = m15339a(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38237d.C38239b)) {
            c38211a.m15323b();
            m15339a = new Evaluable.C37411a(InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38237d.C38239b.f101111a, m15339a, m15339a(c38211a), c38211a.m15322c());
        }
        return m15339a;
    }

    /* renamed from: l */
    private final Evaluable m15328l(InterfaceC38214e.C38215a c38215a, C38211a c38211a, Evaluable evaluable) {
        if (c38211a.m15319f() instanceof C38212c) {
            ArrayList arrayList = new ArrayList();
            if (evaluable != null) {
                arrayList.add(evaluable);
            }
            while (!(c38211a.m15324a() instanceof C38213d)) {
                arrayList.add(m15333g(c38211a));
                if (c38211a.m15324a() instanceof InterfaceC38214e.C38215a.C38216a) {
                    c38211a.m15323b();
                }
            }
            if (c38211a.m15319f() instanceof C38213d) {
                if (evaluable == null) {
                    return new Evaluable.C37413c(c38215a, arrayList, c38211a.m15322c());
                }
                return new Evaluable.C37415e(c38215a, arrayList, c38211a.m15322c());
            }
            throw new EvaluableException("expected ')' after a function call", null, 2, null);
        }
        throw new EvaluableException("'(' expected after function call", null, 2, null);
    }

    /* renamed from: m */
    private final Evaluable m15327m(C38211a c38211a) {
        Evaluable m15332h = m15332h(c38211a);
        while (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38224a.InterfaceC38241f)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            m15332h = new Evaluable.C37411a((InterfaceC38214e.InterfaceC38223c.InterfaceC38224a) m15319f, m15332h, m15332h(c38211a), c38211a.m15322c());
        }
        return m15332h;
    }

    /* renamed from: n */
    private final Evaluable m15326n(C38211a c38211a) {
        Evaluable m15330j = m15330j(c38211a);
        if (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.C38248f)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Evaluable m15333g = m15333g(c38211a);
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Try");
            return new Evaluable.C37418h((InterfaceC38214e.InterfaceC38223c.C38248f) m15319f, m15330j, m15333g, c38211a.m15322c());
        }
        return m15330j;
    }

    /* renamed from: o */
    private final Evaluable m15325o(C38211a c38211a) {
        if (c38211a.m15320e() && (c38211a.m15324a() instanceof InterfaceC38214e.InterfaceC38223c.InterfaceC38249g)) {
            InterfaceC38214e m15319f = c38211a.m15319f();
            Intrinsics.m17073h(m15319f, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator");
            return new Evaluable.C37419i((InterfaceC38214e.InterfaceC38223c) m15319f, m15325o(c38211a), c38211a.m15322c());
        }
        return m15334f(c38211a);
    }

    @NotNull
    /* renamed from: k */
    public final Evaluable m15329k(@NotNull List<? extends InterfaceC38214e> tokens, @NotNull String rawExpression) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        if (!tokens.isEmpty()) {
            C38211a c38211a = new C38211a(tokens, rawExpression);
            Evaluable m15333g = m15333g(c38211a);
            if (!c38211a.m15320e()) {
                return m15333g;
            }
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        throw new EvaluableException("Expression expected", null, 2, null);
    }
}

package p759ka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.collections._CollectionsJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ma.InterfaceC38214e;
import ma.Parser;
import ma.Tokenizer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: ka.a */
/* loaded from: classes8.dex */
public abstract class Evaluable {
    @NotNull

    /* renamed from: d */
    public static final C37412b f98723d = new C37412b(null);
    @NotNull

    /* renamed from: a */
    private final String f98724a;

    /* renamed from: b */
    private boolean f98725b;

    /* renamed from: c */
    private boolean f98726c;

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$a */
    /* loaded from: classes8.dex */
    public static final class C37411a extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.InterfaceC38223c.InterfaceC38224a f98727e;
        @NotNull

        /* renamed from: f */
        private final Evaluable f98728f;
        @NotNull

        /* renamed from: g */
        private final Evaluable f98729g;
        @NotNull

        /* renamed from: h */
        private final String f98730h;
        @NotNull

        /* renamed from: i */
        private final List<String> f98731i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37411a(@NotNull InterfaceC38214e.InterfaceC38223c.InterfaceC38224a token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            super(rawExpression);
            List<String> m17569J0;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98727e = token;
            this.f98728f = left;
            this.f98729g = right;
            this.f98730h = rawExpression;
            m17569J0 = _Collections.m17569J0(left.mo18108f(), right.mo18108f());
            this.f98731i = m17569J0;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18084e(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37411a)) {
                return false;
            }
            C37411a c37411a = (C37411a) obj;
            if (Intrinsics.m17075f(this.f98727e, c37411a.f98727e) && Intrinsics.m17075f(this.f98728f, c37411a.f98728f) && Intrinsics.m17075f(this.f98729g, c37411a.f98729g) && Intrinsics.m17075f(this.f98730h, c37411a.f98730h)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98731i;
        }

        @NotNull
        /* renamed from: h */
        public final Evaluable m18127h() {
            return this.f98728f;
        }

        public int hashCode() {
            return (((((this.f98727e.hashCode() * 31) + this.f98728f.hashCode()) * 31) + this.f98729g.hashCode()) * 31) + this.f98730h.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final Evaluable m18126i() {
            return this.f98729g;
        }

        @NotNull
        /* renamed from: j */
        public final InterfaceC38214e.InterfaceC38223c.InterfaceC38224a m18125j() {
            return this.f98727e;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.f98728f);
            sb2.append(' ');
            sb2.append(this.f98727e);
            sb2.append(' ');
            sb2.append(this.f98729g);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$b */
    /* loaded from: classes8.dex */
    public static final class C37412b {
        private C37412b() {
        }

        public /* synthetic */ C37412b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Evaluable m18124a(@NotNull String expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new C37414d(expr);
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$c */
    /* loaded from: classes8.dex */
    public static final class C37413c extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.C38215a f98732e;
        @NotNull

        /* renamed from: f */
        private final List<Evaluable> f98733f;
        @NotNull

        /* renamed from: g */
        private final String f98734g;
        @NotNull

        /* renamed from: h */
        private final List<String> f98735h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C37413c(@NotNull InterfaceC38214e.C38215a token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            int m17154x;
            Object obj;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98732e = token;
            this.f98733f = arguments;
            this.f98734g = rawExpression;
            List<? extends Evaluable> list = arguments;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (Evaluable evaluable : list) {
                arrayList.add(evaluable.mo18108f());
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                while (it.hasNext()) {
                    next = _Collections.m17569J0((List) next, (List) it.next());
                }
                obj = next;
            }
            List<String> list2 = (List) obj;
            this.f98735h = list2 == null ? C37563v.m17166m() : list2;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18080i(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37413c)) {
                return false;
            }
            C37413c c37413c = (C37413c) obj;
            if (Intrinsics.m17075f(this.f98732e, c37413c.f98732e) && Intrinsics.m17075f(this.f98733f, c37413c.f98733f) && Intrinsics.m17075f(this.f98734g, c37413c.f98734g)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98735h;
        }

        @NotNull
        /* renamed from: h */
        public final List<Evaluable> m18123h() {
            return this.f98733f;
        }

        public int hashCode() {
            return (((this.f98732e.hashCode() * 31) + this.f98733f.hashCode()) * 31) + this.f98734g.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final InterfaceC38214e.C38215a m18122i() {
            return this.f98732e;
        }

        @NotNull
        public String toString() {
            String m17521z0;
            m17521z0 = _Collections.m17521z0(this.f98733f, InterfaceC38214e.C38215a.C38216a.f101096a.toString(), null, null, 0, null, null, 62, null);
            return this.f98732e.m15318a() + '(' + m17521z0 + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$d */
    /* loaded from: classes8.dex */
    public static final class C37414d extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final String f98736e;
        @NotNull

        /* renamed from: f */
        private final List<InterfaceC38214e> f98737f;

        /* renamed from: g */
        private Evaluable f98738g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37414d(@NotNull String expr) {
            super(expr);
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.f98736e = expr;
            this.f98737f = Tokenizer.f101127a.m15270w(expr);
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            if (this.f98738g == null) {
                this.f98738g = Parser.f101089a.m15329k(this.f98737f, m18129e());
            }
            Evaluable evaluable = this.f98738g;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                Intrinsics.m17056y("expression");
                evaluable = null;
            }
            Object m18130c = evaluable.m18130c(evaluator);
            Evaluable evaluable3 = this.f98738g;
            if (evaluable3 == null) {
                Intrinsics.m17056y("expression");
            } else {
                evaluable2 = evaluable3;
            }
            m18128g(evaluable2.f98725b);
            return m18130c;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            List m17582b0;
            int m17154x;
            Evaluable evaluable = this.f98738g;
            if (evaluable == null) {
                m17582b0 = _CollectionsJvm.m17582b0(this.f98737f, InterfaceC38214e.InterfaceC38217b.C38222b.class);
                List<InterfaceC38214e.InterfaceC38217b.C38222b> list = m17582b0;
                m17154x = C37566w.m17154x(list, 10);
                ArrayList arrayList = new ArrayList(m17154x);
                for (InterfaceC38214e.InterfaceC38217b.C38222b c38222b : list) {
                    arrayList.add(c38222b.m15293g());
                }
                return arrayList;
            }
            if (evaluable == null) {
                Intrinsics.m17056y("expression");
                evaluable = null;
            }
            return evaluable.mo18108f();
        }

        @NotNull
        public String toString() {
            return this.f98736e;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$e */
    /* loaded from: classes8.dex */
    public static final class C37415e extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.C38215a f98739e;
        @NotNull

        /* renamed from: f */
        private final List<Evaluable> f98740f;
        @NotNull

        /* renamed from: g */
        private final String f98741g;
        @NotNull

        /* renamed from: h */
        private final List<String> f98742h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C37415e(@NotNull InterfaceC38214e.C38215a token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            int m17154x;
            Object obj;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98739e = token;
            this.f98740f = arguments;
            this.f98741g = rawExpression;
            List<? extends Evaluable> list = arguments;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (Evaluable evaluable : list) {
                arrayList.add(evaluable.mo18108f());
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                while (it.hasNext()) {
                    next = _Collections.m17569J0((List) next, (List) it.next());
                }
                obj = next;
            }
            List<String> list2 = (List) obj;
            this.f98742h = list2 == null ? C37563v.m17166m() : list2;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18078k(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37415e)) {
                return false;
            }
            C37415e c37415e = (C37415e) obj;
            if (Intrinsics.m17075f(this.f98739e, c37415e.f98739e) && Intrinsics.m17075f(this.f98740f, c37415e.f98740f) && Intrinsics.m17075f(this.f98741g, c37415e.f98741g)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98742h;
        }

        @NotNull
        /* renamed from: h */
        public final List<Evaluable> m18121h() {
            return this.f98740f;
        }

        public int hashCode() {
            return (((this.f98739e.hashCode() * 31) + this.f98740f.hashCode()) * 31) + this.f98741g.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final InterfaceC38214e.C38215a m18120i() {
            return this.f98739e;
        }

        @NotNull
        public String toString() {
            String str;
            Object m17531p0;
            if (this.f98740f.size() > 1) {
                List<Evaluable> list = this.f98740f;
                str = _Collections.m17521z0(list.subList(1, list.size()), InterfaceC38214e.C38215a.C38216a.f101096a.toString(), null, null, 0, null, null, 62, null);
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder();
            m17531p0 = _Collections.m17531p0(this.f98740f);
            sb2.append(m17531p0);
            sb2.append('.');
            sb2.append(this.f98739e.m15318a());
            sb2.append('(');
            sb2.append(str);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$f */
    /* loaded from: classes8.dex */
    public static final class C37416f extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final List<Evaluable> f98743e;
        @NotNull

        /* renamed from: f */
        private final String f98744f;
        @NotNull

        /* renamed from: g */
        private final List<String> f98745g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C37416f(@NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            int m17154x;
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98743e = arguments;
            this.f98744f = rawExpression;
            List<? extends Evaluable> list = arguments;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (Evaluable evaluable : list) {
                arrayList.add(evaluable.mo18108f());
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = _Collections.m17569J0((List) next, (List) it.next());
                }
                this.f98745g = (List) next;
                return;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18077l(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37416f)) {
                return false;
            }
            C37416f c37416f = (C37416f) obj;
            if (Intrinsics.m17075f(this.f98743e, c37416f.f98743e) && Intrinsics.m17075f(this.f98744f, c37416f.f98744f)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98745g;
        }

        @NotNull
        /* renamed from: h */
        public final List<Evaluable> m18119h() {
            return this.f98743e;
        }

        public int hashCode() {
            return (this.f98743e.hashCode() * 31) + this.f98744f.hashCode();
        }

        @NotNull
        public String toString() {
            String m17521z0;
            m17521z0 = _Collections.m17521z0(this.f98743e, "", null, null, 0, null, null, 62, null);
            return m17521z0;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$g */
    /* loaded from: classes8.dex */
    public static final class C37417g extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.InterfaceC38223c f98746e;
        @NotNull

        /* renamed from: f */
        private final Evaluable f98747f;
        @NotNull

        /* renamed from: g */
        private final Evaluable f98748g;
        @NotNull

        /* renamed from: h */
        private final Evaluable f98749h;
        @NotNull

        /* renamed from: i */
        private final String f98750i;
        @NotNull

        /* renamed from: j */
        private final List<String> f98751j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37417g(@NotNull InterfaceC38214e.InterfaceC38223c token, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            super(rawExpression);
            List m17569J0;
            List<String> m17569J02;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(firstExpression, "firstExpression");
            Intrinsics.checkNotNullParameter(secondExpression, "secondExpression");
            Intrinsics.checkNotNullParameter(thirdExpression, "thirdExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98746e = token;
            this.f98747f = firstExpression;
            this.f98748g = secondExpression;
            this.f98749h = thirdExpression;
            this.f98750i = rawExpression;
            m17569J0 = _Collections.m17569J0(firstExpression.mo18108f(), secondExpression.mo18108f());
            m17569J02 = _Collections.m17569J0(m17569J0, thirdExpression.mo18108f());
            this.f98751j = m17569J02;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18076m(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37417g)) {
                return false;
            }
            C37417g c37417g = (C37417g) obj;
            if (Intrinsics.m17075f(this.f98746e, c37417g.f98746e) && Intrinsics.m17075f(this.f98747f, c37417g.f98747f) && Intrinsics.m17075f(this.f98748g, c37417g.f98748g) && Intrinsics.m17075f(this.f98749h, c37417g.f98749h) && Intrinsics.m17075f(this.f98750i, c37417g.f98750i)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98751j;
        }

        @NotNull
        /* renamed from: h */
        public final Evaluable m18118h() {
            return this.f98747f;
        }

        public int hashCode() {
            return (((((((this.f98746e.hashCode() * 31) + this.f98747f.hashCode()) * 31) + this.f98748g.hashCode()) * 31) + this.f98749h.hashCode()) * 31) + this.f98750i.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final Evaluable m18117i() {
            return this.f98748g;
        }

        @NotNull
        /* renamed from: j */
        public final Evaluable m18116j() {
            return this.f98749h;
        }

        @NotNull
        /* renamed from: k */
        public final InterfaceC38214e.InterfaceC38223c m18115k() {
            return this.f98746e;
        }

        @NotNull
        public String toString() {
            InterfaceC38214e.InterfaceC38223c.C38246d c38246d = InterfaceC38214e.InterfaceC38223c.C38246d.f101117a;
            InterfaceC38214e.InterfaceC38223c.C38245c c38245c = InterfaceC38214e.InterfaceC38223c.C38245c.f101116a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.f98747f);
            sb2.append(' ');
            sb2.append(c38246d);
            sb2.append(' ');
            sb2.append(this.f98748g);
            sb2.append(' ');
            sb2.append(c38245c);
            sb2.append(' ');
            sb2.append(this.f98749h);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$h */
    /* loaded from: classes8.dex */
    public static final class C37418h extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.InterfaceC38223c.C38248f f98752e;
        @NotNull

        /* renamed from: f */
        private final Evaluable f98753f;
        @NotNull

        /* renamed from: g */
        private final Evaluable f98754g;
        @NotNull

        /* renamed from: h */
        private final String f98755h;
        @NotNull

        /* renamed from: i */
        private final List<String> f98756i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37418h(@NotNull InterfaceC38214e.InterfaceC38223c.C38248f token, @NotNull Evaluable tryExpression, @NotNull Evaluable fallbackExpression, @NotNull String rawExpression) {
            super(rawExpression);
            List<String> m17569J0;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(tryExpression, "tryExpression");
            Intrinsics.checkNotNullParameter(fallbackExpression, "fallbackExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98752e = token;
            this.f98753f = tryExpression;
            this.f98754g = fallbackExpression;
            this.f98755h = rawExpression;
            m17569J0 = _Collections.m17569J0(tryExpression.mo18108f(), fallbackExpression.mo18108f());
            this.f98756i = m17569J0;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18075n(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37418h)) {
                return false;
            }
            C37418h c37418h = (C37418h) obj;
            if (Intrinsics.m17075f(this.f98752e, c37418h.f98752e) && Intrinsics.m17075f(this.f98753f, c37418h.f98753f) && Intrinsics.m17075f(this.f98754g, c37418h.f98754g) && Intrinsics.m17075f(this.f98755h, c37418h.f98755h)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98756i;
        }

        @NotNull
        /* renamed from: h */
        public final Evaluable m18114h() {
            return this.f98754g;
        }

        public int hashCode() {
            return (((((this.f98752e.hashCode() * 31) + this.f98753f.hashCode()) * 31) + this.f98754g.hashCode()) * 31) + this.f98755h.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final Evaluable m18113i() {
            return this.f98753f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.f98753f);
            sb2.append(' ');
            sb2.append(this.f98752e);
            sb2.append(' ');
            sb2.append(this.f98754g);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$i */
    /* loaded from: classes8.dex */
    public static final class C37419i extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.InterfaceC38223c f98757e;
        @NotNull

        /* renamed from: f */
        private final Evaluable f98758f;
        @NotNull

        /* renamed from: g */
        private final String f98759g;
        @NotNull

        /* renamed from: h */
        private final List<String> f98760h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37419i(@NotNull InterfaceC38214e.InterfaceC38223c token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98757e = token;
            this.f98758f = expression;
            this.f98759g = rawExpression;
            this.f98760h = expression.mo18108f();
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18074o(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37419i)) {
                return false;
            }
            C37419i c37419i = (C37419i) obj;
            if (Intrinsics.m17075f(this.f98757e, c37419i.f98757e) && Intrinsics.m17075f(this.f98758f, c37419i.f98758f) && Intrinsics.m17075f(this.f98759g, c37419i.f98759g)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98760h;
        }

        @NotNull
        /* renamed from: h */
        public final Evaluable m18112h() {
            return this.f98758f;
        }

        public int hashCode() {
            return (((this.f98757e.hashCode() * 31) + this.f98758f.hashCode()) * 31) + this.f98759g.hashCode();
        }

        @NotNull
        /* renamed from: i */
        public final InterfaceC38214e.InterfaceC38223c m18111i() {
            return this.f98757e;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f98757e);
            sb2.append(this.f98758f);
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$j */
    /* loaded from: classes8.dex */
    public static final class C37420j extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final InterfaceC38214e.InterfaceC38217b.InterfaceC38218a f98761e;
        @NotNull

        /* renamed from: f */
        private final String f98762f;
        @NotNull

        /* renamed from: g */
        private final List<String> f98763g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37420j(@NotNull InterfaceC38214e.InterfaceC38217b.InterfaceC38218a token, @NotNull String rawExpression) {
            super(rawExpression);
            List<String> m17166m;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98761e = token;
            this.f98762f = rawExpression;
            m17166m = C37563v.m17166m();
            this.f98763g = m17166m;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18073p(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37420j)) {
                return false;
            }
            C37420j c37420j = (C37420j) obj;
            if (Intrinsics.m17075f(this.f98761e, c37420j.f98761e) && Intrinsics.m17075f(this.f98762f, c37420j.f98762f)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98763g;
        }

        @NotNull
        /* renamed from: h */
        public final InterfaceC38214e.InterfaceC38217b.InterfaceC38218a m18110h() {
            return this.f98761e;
        }

        public int hashCode() {
            return (this.f98761e.hashCode() * 31) + this.f98762f.hashCode();
        }

        @NotNull
        public String toString() {
            InterfaceC38214e.InterfaceC38217b.InterfaceC38218a interfaceC38218a = this.f98761e;
            if (interfaceC38218a instanceof InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38221c) {
                return '\'' + ((InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38221c) this.f98761e).m15300f() + '\'';
            } else if (interfaceC38218a instanceof InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38220b) {
                return ((InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38220b) interfaceC38218a).m15306f().toString();
            } else {
                if (interfaceC38218a instanceof InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38219a) {
                    return String.valueOf(((InterfaceC38214e.InterfaceC38217b.InterfaceC38218a.C38219a) interfaceC38218a).m15312f());
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata
    /* renamed from: ka.a$k */
    /* loaded from: classes8.dex */
    public static final class C37421k extends Evaluable {
        @NotNull

        /* renamed from: e */
        private final String f98764e;
        @NotNull

        /* renamed from: f */
        private final String f98765f;
        @NotNull

        /* renamed from: g */
        private final List<String> f98766g;

        public /* synthetic */ C37421k(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: d */
        protected Object mo18109d(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.m18072q(this);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37421k)) {
                return false;
            }
            C37421k c37421k = (C37421k) obj;
            if (InterfaceC38214e.InterfaceC38217b.C38222b.m15296d(this.f98764e, c37421k.f98764e) && Intrinsics.m17075f(this.f98765f, c37421k.f98765f)) {
                return true;
            }
            return false;
        }

        @Override // p759ka.Evaluable
        @NotNull
        /* renamed from: f */
        public List<String> mo18108f() {
            return this.f98766g;
        }

        @NotNull
        /* renamed from: h */
        public final String m18107h() {
            return this.f98764e;
        }

        public int hashCode() {
            return (InterfaceC38214e.InterfaceC38217b.C38222b.m15295e(this.f98764e) * 31) + this.f98765f.hashCode();
        }

        @NotNull
        public String toString() {
            return this.f98764e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C37421k(String token, String rawExpression) {
            super(rawExpression);
            List<String> m17175e;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.f98764e = token;
            this.f98765f = rawExpression;
            m17175e = CollectionsJVM.m17175e(token);
            this.f98766g = m17175e;
        }
    }

    public Evaluable(@NotNull String rawExpr) {
        Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
        this.f98724a = rawExpr;
        this.f98725b = true;
    }

    /* renamed from: b */
    public final boolean m18131b() {
        return this.f98725b;
    }

    @NotNull
    /* renamed from: c */
    public final Object m18130c(@NotNull Evaluator evaluator) throws EvaluableException {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object mo18109d = mo18109d(evaluator);
        this.f98726c = true;
        return mo18109d;
    }

    @NotNull
    /* renamed from: d */
    protected abstract Object mo18109d(@NotNull Evaluator evaluator) throws EvaluableException;

    @NotNull
    /* renamed from: e */
    public final String m18129e() {
        return this.f98724a;
    }

    @NotNull
    /* renamed from: f */
    public abstract List<String> mo18108f();

    /* renamed from: g */
    public final void m18128g(boolean z) {
        boolean z2;
        if (this.f98725b && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f98725b = z2;
    }
}

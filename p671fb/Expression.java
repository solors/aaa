package p671fb;

import com.yandex.div.core.InterfaceC29586d;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import ma.LiteralsEscaper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.C32965h;
import p656eb.ParsingErrorLogger;
import p656eb.ParsingException;
import p759ka.Evaluable;
import p759ka.EvaluableException;
import va.InterfaceC44553w;
import va.TypeHelpers;

@Metadata
/* renamed from: fb.b */
/* loaded from: classes8.dex */
public abstract class Expression<T> {
    @NotNull

    /* renamed from: a */
    public static final C33094a f90385a = new C33094a(null);
    @NotNull

    /* renamed from: b */
    private static final ConcurrentHashMap<Object, Expression<?>> f90386b = new ConcurrentHashMap<>(1000);

    /* compiled from: Expression.kt */
    @Metadata
    /* renamed from: fb.b$a */
    /* loaded from: classes8.dex */
    public static final class C33094a {
        private C33094a() {
        }

        public /* synthetic */ C33094a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <T> Expression<T> m24848a(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = Expression.f90386b;
            Object obj = concurrentHashMap.get(value);
            if (obj == null) {
                if (value instanceof String) {
                    obj = new C33098d((String) value, null, null, 6, null);
                } else {
                    obj = new C33095b(value);
                }
                Object putIfAbsent = concurrentHashMap.putIfAbsent(value, obj);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            }
            Expression<T> expression = (Expression) obj;
            Intrinsics.m17073h(expression, "null cannot be cast to non-null type com.yandex.div.json.expressions.Expression<T of com.yandex.div.json.expressions.Expression.Companion.constant>");
            return expression;
        }

        /* renamed from: b */
        public final boolean m24847b(@Nullable Object obj) {
            boolean m16592R;
            if (obj instanceof String) {
                m16592R = C37690r.m16592R((CharSequence) obj, "@{", false, 2, null);
                if (!m16592R) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* compiled from: Expression.kt */
    @Metadata
    /* renamed from: fb.b$b */
    /* loaded from: classes8.dex */
    public static class C33095b<T> extends Expression<T> {
        @NotNull

        /* renamed from: c */
        private final T f90387c;

        public C33095b(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f90387c = value;
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: c */
        public T mo24837c(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return this.f90387c;
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: d */
        public Object mo24845d() {
            T t = this.f90387c;
            Intrinsics.m17073h(t, "null cannot be cast to non-null type kotlin.Any");
            return t;
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: f */
        public InterfaceC29586d mo24844f(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return InterfaceC29586d.f75159W7;
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: g */
        public InterfaceC29586d mo24846g(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke((T) this.f90387c);
            return InterfaceC29586d.f75159W7;
        }
    }

    /* compiled from: Expression.kt */
    @Metadata
    /* renamed from: fb.b$c */
    /* loaded from: classes8.dex */
    public static final class C33096c<R, T> extends Expression<T> {
        @NotNull

        /* renamed from: c */
        private final String f90388c;
        @NotNull

        /* renamed from: d */
        private final String f90389d;
        @Nullable

        /* renamed from: e */
        private final Function1<R, T> f90390e;
        @NotNull

        /* renamed from: f */
        private final InterfaceC44553w<T> f90391f;
        @NotNull

        /* renamed from: g */
        private final ParsingErrorLogger f90392g;
        @NotNull

        /* renamed from: h */
        private final TypeHelpers<T> f90393h;
        @Nullable

        /* renamed from: i */
        private final Expression<T> f90394i;
        @NotNull

        /* renamed from: j */
        private final String f90395j;
        @Nullable

        /* renamed from: k */
        private Evaluable f90396k;
        @Nullable

        /* renamed from: l */
        private T f90397l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Expression.kt */
        @Metadata
        /* renamed from: fb.b$c$a */
        /* loaded from: classes8.dex */
        public static final class C33097a extends Lambda implements Functions<Unit> {

            /* renamed from: g */
            final /* synthetic */ Function1<T, Unit> f90398g;

            /* renamed from: h */
            final /* synthetic */ C33096c<R, T> f90399h;

            /* renamed from: i */
            final /* synthetic */ ExpressionResolver f90400i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C33097a(Function1<? super T, Unit> function1, C33096c<R, T> c33096c, ExpressionResolver expressionResolver) {
                super(0);
                this.f90398g = function1;
                this.f90399h = c33096c;
                this.f90400i = expressionResolver;
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f99208a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                this.f90398g.invoke(this.f90399h.mo24837c(this.f90400i));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C33096c(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Function1<? super R, ? extends T> function1, @NotNull InterfaceC44553w<T> validator, @NotNull ParsingErrorLogger logger, @NotNull TypeHelpers<T> typeHelper, @Nullable Expression<T> expression) {
            Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(typeHelper, "typeHelper");
            this.f90388c = expressionKey;
            this.f90389d = rawExpression;
            this.f90390e = function1;
            this.f90391f = validator;
            this.f90392g = logger;
            this.f90393h = typeHelper;
            this.f90394i = expression;
            this.f90395j = rawExpression;
        }

        /* renamed from: h */
        private final Evaluable m24843h() {
            Evaluable evaluable = this.f90396k;
            if (evaluable == null) {
                try {
                    Evaluable m18124a = Evaluable.f98723d.m18124a(this.f90389d);
                    this.f90396k = m18124a;
                    return m18124a;
                } catch (EvaluableException e) {
                    throw C32965h.m25376n(this.f90388c, this.f90389d, e);
                }
            }
            return evaluable;
        }

        /* renamed from: k */
        private final void m24840k(ParsingException parsingException, ExpressionResolver expressionResolver) {
            this.f90392g.mo2528b(parsingException);
            expressionResolver.mo24835a(parsingException);
        }

        /* renamed from: l */
        private final T m24839l(ExpressionResolver expressionResolver) {
            T t = (T) expressionResolver.mo24834b(this.f90388c, this.f90389d, m24843h(), this.f90390e, this.f90391f, this.f90393h, this.f90392g);
            if (t != null) {
                if (this.f90393h.mo2519b(t)) {
                    return t;
                }
                throw C32965h.m25368v(this.f90388c, this.f90389d, t, null, 8, null);
            }
            throw C32965h.m25375o(this.f90388c, this.f90389d, null, 4, null);
        }

        /* renamed from: m */
        private final T m24838m(ExpressionResolver expressionResolver) {
            T mo24837c;
            try {
                T m24839l = m24839l(expressionResolver);
                this.f90397l = m24839l;
                return m24839l;
            } catch (ParsingException e) {
                m24840k(e, expressionResolver);
                T t = this.f90397l;
                if (t != null) {
                    return t;
                }
                try {
                    Expression<T> expression = this.f90394i;
                    if (expression != null && (mo24837c = expression.mo24837c(expressionResolver)) != null) {
                        this.f90397l = mo24837c;
                        return mo24837c;
                    }
                    return this.f90393h.mo2520a();
                } catch (ParsingException e2) {
                    m24840k(e2, expressionResolver);
                    throw e2;
                }
            }
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: c */
        public T mo24837c(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return m24838m(resolver);
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: f */
        public InterfaceC29586d mo24844f(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            try {
                List<String> m24841j = m24841j();
                if (m24841j.isEmpty()) {
                    return InterfaceC29586d.f75159W7;
                }
                return resolver.mo24833c(this.f90389d, m24841j, new C33097a(callback, this, resolver));
            } catch (Exception e) {
                m24840k(C32965h.m25376n(this.f90388c, this.f90389d, e), resolver);
                return InterfaceC29586d.f75159W7;
            }
        }

        @Override // p671fb.Expression
        @NotNull
        /* renamed from: i */
        public String mo24845d() {
            return this.f90395j;
        }

        @NotNull
        /* renamed from: j */
        public final List<String> m24841j() {
            return m24843h().mo18108f();
        }
    }

    @NotNull
    /* renamed from: b */
    public static final <T> Expression<T> m24850b(@NotNull T t) {
        return f90385a.m24848a(t);
    }

    /* renamed from: e */
    public static final boolean m24849e(@Nullable Object obj) {
        return f90385a.m24847b(obj);
    }

    @NotNull
    /* renamed from: c */
    public abstract T mo24837c(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    /* renamed from: d */
    public abstract Object mo24845d();

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Expression)) {
            return false;
        }
        return Intrinsics.m17075f(mo24845d(), ((Expression) obj).mo24845d());
    }

    @NotNull
    /* renamed from: f */
    public abstract InterfaceC29586d mo24844f(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super T, Unit> function1);

    @NotNull
    /* renamed from: g */
    public InterfaceC29586d mo24846g(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
        T t;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            t = mo24837c(resolver);
        } catch (ParsingException unused) {
            t = null;
        }
        if (t != null) {
            callback.invoke(t);
        }
        return mo24844f(resolver, callback);
    }

    public int hashCode() {
        return mo24845d().hashCode() * 16;
    }

    /* compiled from: Expression.kt */
    @Metadata
    /* renamed from: fb.b$d */
    /* loaded from: classes8.dex */
    public static final class C33098d extends C33095b<String> {
        @NotNull

        /* renamed from: d */
        private final String f90401d;
        @NotNull

        /* renamed from: e */
        private final String f90402e;
        @NotNull

        /* renamed from: f */
        private final ParsingErrorLogger f90403f;
        @Nullable

        /* renamed from: g */
        private String f90404g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ C33098d(java.lang.String r1, java.lang.String r2, p656eb.ParsingErrorLogger r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r4 = r4 & 4
                if (r4 == 0) goto L11
                eb.f r3 = p656eb.ParsingErrorLogger.f89835a
                java.lang.String r4 = "LOG"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            L11:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p671fb.Expression.C33098d.<init>(java.lang.String, java.lang.String, eb.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // p671fb.Expression.C33095b, p671fb.Expression
        @NotNull
        /* renamed from: h */
        public String mo24837c(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            String str = this.f90404g;
            if (str == null) {
                try {
                    String m15340e = LiteralsEscaper.m15340e(LiteralsEscaper.f101087a, this.f90401d, null, 2, null);
                    this.f90404g = m15340e;
                    return m15340e;
                } catch (EvaluableException e) {
                    this.f90403f.mo2528b(e);
                    String str2 = this.f90402e;
                    this.f90404g = str2;
                    return str2;
                }
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33098d(@NotNull String value, @NotNull String defaultValue, @NotNull ParsingErrorLogger logger) {
            super(value);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f90401d = value;
            this.f90402e = defaultValue;
            this.f90403f = logger;
        }
    }
}

package p759ka;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import na.C38480a;
import na.C38484c;
import na.DateTime;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p759ka.EvaluableType;

/* compiled from: Function.kt */
@Metadata
/* renamed from: ka.h */
/* loaded from: classes8.dex */
public abstract class AbstractC37429h {
    @NotNull

    /* renamed from: a */
    public static final C37431b f98789a = new C37431b(null);
    @NotNull

    /* renamed from: b */
    public static final AbstractC37429h f98790b = new C37430a();

    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$a */
    /* loaded from: classes8.dex */
    public static final class C37430a extends AbstractC37429h {
        @NotNull

        /* renamed from: c */
        private final String f98791c = "stub";
        @NotNull

        /* renamed from: d */
        private final List<FunctionArgument> f98792d;
        @NotNull

        /* renamed from: e */
        private final EvaluableType f98793e;

        /* renamed from: f */
        private final boolean f98794f;

        C37430a() {
            List<FunctionArgument> m17166m;
            m17166m = C37563v.m17166m();
            this.f98792d = m17166m;
            this.f98793e = EvaluableType.BOOLEAN;
            this.f98794f = true;
        }

        @Override // p759ka.AbstractC37429h
        @NotNull
        /* renamed from: c */
        protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
            Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
            Intrinsics.checkNotNullParameter(args, "args");
            return Boolean.TRUE;
        }

        @Override // p759ka.AbstractC37429h
        @NotNull
        /* renamed from: d */
        public List<FunctionArgument> mo15589d() {
            return this.f98792d;
        }

        @Override // p759ka.AbstractC37429h
        @NotNull
        /* renamed from: f */
        public String mo15588f() {
            return this.f98791c;
        }

        @Override // p759ka.AbstractC37429h
        @NotNull
        /* renamed from: g */
        public EvaluableType mo15587g() {
            return this.f98793e;
        }

        @Override // p759ka.AbstractC37429h
        /* renamed from: i */
        public boolean mo15586i() {
            return this.f98794f;
        }
    }

    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$b */
    /* loaded from: classes8.dex */
    public static final class C37431b {
        private C37431b() {
        }

        public /* synthetic */ C37431b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC37432c {

        /* compiled from: Function.kt */
        @Metadata
        /* renamed from: ka.h$c$a */
        /* loaded from: classes8.dex */
        public static final class C37433a extends AbstractC37432c {

            /* renamed from: a */
            private final int f98795a;

            public C37433a(int i) {
                super(null);
                this.f98795a = i;
            }

            /* renamed from: a */
            public final int m18060a() {
                return this.f98795a;
            }
        }

        /* compiled from: Function.kt */
        @Metadata
        /* renamed from: ka.h$c$b */
        /* loaded from: classes8.dex */
        public static final class C37434b extends AbstractC37432c {
            @NotNull

            /* renamed from: a */
            private final EvaluableType f98796a;
            @NotNull

            /* renamed from: b */
            private final EvaluableType f98797b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C37434b(@NotNull EvaluableType expected, @NotNull EvaluableType actual) {
                super(null);
                Intrinsics.checkNotNullParameter(expected, "expected");
                Intrinsics.checkNotNullParameter(actual, "actual");
                this.f98796a = expected;
                this.f98797b = actual;
            }

            @NotNull
            /* renamed from: a */
            public final EvaluableType m18059a() {
                return this.f98797b;
            }

            @NotNull
            /* renamed from: b */
            public final EvaluableType m18058b() {
                return this.f98796a;
            }
        }

        /* compiled from: Function.kt */
        @Metadata
        /* renamed from: ka.h$c$c */
        /* loaded from: classes8.dex */
        public static final class C37435c extends AbstractC37432c {
            @NotNull

            /* renamed from: a */
            public static final C37435c f98798a = new C37435c();

            private C37435c() {
                super(null);
            }
        }

        private AbstractC37432c() {
        }

        public /* synthetic */ AbstractC37432c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$d */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C37436d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$e */
    /* loaded from: classes8.dex */
    public static final class C37437e extends Lambda implements Function2<EvaluableType, EvaluableType, Boolean> {

        /* renamed from: g */
        public static final C37437e f98799g = new C37437e();

        C37437e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final Boolean mo105910invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
            boolean z;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(declaredType, "declaredType");
            if (type == declaredType) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$f */
    /* loaded from: classes8.dex */
    public static final class C37438f extends Lambda implements Function2<EvaluableType, EvaluableType, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37438f() {
            super(2);
            AbstractC37429h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final Boolean mo105910invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
            boolean z;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(declaredType, "declaredType");
            if (type != declaredType && !AbstractC37429h.this.m18066b(type, declaredType)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Function.kt */
    @Metadata
    /* renamed from: ka.h$g */
    /* loaded from: classes8.dex */
    static final class C37439g extends Lambda implements Function1<FunctionArgument, CharSequence> {

        /* renamed from: g */
        public static final C37439g f98801g = new C37439g();

        C37439g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final CharSequence invoke(@NotNull FunctionArgument arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            if (arg.m18053b()) {
                return "vararg " + arg.m18054a();
            }
            return arg.m18054a().toString();
        }
    }

    /* renamed from: b */
    public final boolean m18066b(EvaluableType evaluableType, EvaluableType evaluableType2) {
        if (evaluableType != EvaluableType.INTEGER || C37436d.$EnumSwitchMapping$0[evaluableType2.ordinal()] != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final AbstractC37432c m18063j(List<? extends EvaluableType> list, Function2<? super EvaluableType, ? super EvaluableType, Boolean> function2) {
        int size;
        int m17164o;
        int m16912j;
        int size2 = mo15589d().size();
        if (m18065e()) {
            size = Integer.MAX_VALUE;
        } else {
            size = mo15589d().size();
        }
        if (list.size() >= size2 && list.size() <= size) {
            int size3 = list.size();
            for (int i = 0; i < size3; i++) {
                List<FunctionArgument> mo15589d = mo15589d();
                m17164o = C37563v.m17164o(mo15589d());
                m16912j = _Ranges.m16912j(i, m17164o);
                EvaluableType m18054a = mo15589d.get(m16912j).m18054a();
                if (!function2.mo105910invoke(list.get(i), m18054a).booleanValue()) {
                    return new AbstractC37432c.C37434b(m18054a, list.get(i));
                }
            }
            return AbstractC37432c.C37435c.f98798a;
        }
        return new AbstractC37432c.C37433a(size2);
    }

    @NotNull
    /* renamed from: c */
    protected abstract Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list);

    @NotNull
    /* renamed from: d */
    public abstract List<FunctionArgument> mo15589d();

    /* renamed from: e */
    public final boolean m18065e() {
        Object m17576C0;
        m17576C0 = _Collections.m17576C0(mo15589d());
        FunctionArgument functionArgument = (FunctionArgument) m17576C0;
        if (functionArgument != null) {
            return functionArgument.m18053b();
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public abstract String mo15588f();

    @NotNull
    /* renamed from: g */
    public abstract EvaluableType mo15587g();

    @NotNull
    /* renamed from: h */
    public final Object m18064h(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object mo15590c = mo15590c(evaluationContext, expressionContext, args);
        EvaluableType.C37425a c37425a = EvaluableType.f98769c;
        boolean z = mo15590c instanceof Long;
        if (z) {
            evaluableType = EvaluableType.INTEGER;
        } else if (mo15590c instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (mo15590c instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (mo15590c instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (mo15590c instanceof DateTime) {
            evaluableType = EvaluableType.DATETIME;
        } else if (mo15590c instanceof C38480a) {
            evaluableType = EvaluableType.COLOR;
        } else if (mo15590c instanceof C38484c) {
            evaluableType = EvaluableType.URL;
        } else if (mo15590c instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else if (mo15590c instanceof JSONArray) {
            evaluableType = EvaluableType.ARRAY;
        } else if (mo15590c == null) {
            throw new EvaluableException("Unable to find type for null", null, 2, null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to find type for ");
            Intrinsics.m17074g(mo15590c);
            sb2.append(mo15590c.getClass().getName());
            throw new EvaluableException(sb2.toString(), null, 2, null);
        }
        if (evaluableType != mo15587g()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Function returned ");
            if (!z) {
                if (!(mo15590c instanceof Double)) {
                    if (!(mo15590c instanceof Boolean)) {
                        if (!(mo15590c instanceof String)) {
                            if (!(mo15590c instanceof DateTime)) {
                                if (!(mo15590c instanceof C38480a)) {
                                    if (!(mo15590c instanceof C38484c)) {
                                        if (!(mo15590c instanceof JSONObject)) {
                                            if (!(mo15590c instanceof JSONArray)) {
                                                if (mo15590c == null) {
                                                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                                                }
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("Unable to find type for ");
                                                Intrinsics.m17074g(mo15590c);
                                                sb4.append(mo15590c.getClass().getName());
                                                throw new EvaluableException(sb4.toString(), null, 2, null);
                                            }
                                            evaluableType2 = EvaluableType.ARRAY;
                                        } else {
                                            evaluableType2 = EvaluableType.DICT;
                                        }
                                    } else {
                                        evaluableType2 = EvaluableType.URL;
                                    }
                                } else {
                                    evaluableType2 = EvaluableType.COLOR;
                                }
                            } else {
                                evaluableType2 = EvaluableType.DATETIME;
                            }
                        } else {
                            evaluableType2 = EvaluableType.STRING;
                        }
                    } else {
                        evaluableType2 = EvaluableType.BOOLEAN;
                    }
                } else {
                    evaluableType2 = EvaluableType.NUMBER;
                }
            } else {
                evaluableType2 = EvaluableType.INTEGER;
            }
            sb3.append(evaluableType2);
            sb3.append(", but ");
            sb3.append(mo15587g());
            sb3.append(" was expected");
            throw new EvaluableException(sb3.toString(), null, 2, null);
        }
        return mo15590c;
    }

    /* renamed from: i */
    public abstract boolean mo15586i();

    @NotNull
    /* renamed from: k */
    public final AbstractC37432c m18062k(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return m18063j(argTypes, C37437e.f98799g);
    }

    @NotNull
    /* renamed from: l */
    public final AbstractC37432c m18061l(@NotNull List<? extends EvaluableType> argTypes) {
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        return m18063j(argTypes, new C37438f());
    }

    @NotNull
    public String toString() {
        String m17521z0;
        List<FunctionArgument> mo15589d = mo15589d();
        m17521z0 = _Collections.m17521z0(mo15589d, null, mo15588f() + '(', ")", 0, null, C37439g.f98801g, 25, null);
        return m17521z0;
    }
}

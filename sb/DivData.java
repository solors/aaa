package sb;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p656eb.JSONSerializable;
import p656eb.ParsingEnvironment;
import p656eb.ParsingErrorLogger;
import p671fb.Expression;
import p743ja.C37301e;
import p743ja.ErrorsCollectorEnvironment;
import p743ja.Hashable;
import va.C44527j;
import va.JsonParser;
import va.ParsingConverters;
import va.ParsingValidators;
import va.TypeHelpers;

@Metadata
/* renamed from: sb.l5 */
/* loaded from: classes8.dex */
public class DivData implements JSONSerializable, Hashable {
    @NotNull

    /* renamed from: i */
    public static final C40791c f106829i = new C40791c(null);
    @NotNull

    /* renamed from: j */
    private static final Expression<DivTransitionSelector> f106830j = Expression.f90385a.m24848a(DivTransitionSelector.NONE);
    @NotNull

    /* renamed from: k */
    private static final TypeHelpers<DivTransitionSelector> f106831k;
    @NotNull

    /* renamed from: l */
    private static final ParsingValidators<C40792d> f106832l;
    @NotNull

    /* renamed from: m */
    private static final Function2<ParsingEnvironment, JSONObject, DivData> f106833m;
    @NotNull

    /* renamed from: a */
    public final String f106834a;
    @NotNull

    /* renamed from: b */
    public final List<C40792d> f106835b;
    @Nullable

    /* renamed from: c */
    public final List<DivTimer> f106836c;
    @NotNull

    /* renamed from: d */
    public final Expression<DivTransitionSelector> f106837d;
    @Nullable

    /* renamed from: e */
    public final List<DivTrigger> f106838e;
    @Nullable

    /* renamed from: f */
    public final List<DivVariable> f106839f;
    @Nullable

    /* renamed from: g */
    public final List<Exception> f106840g;
    @Nullable

    /* renamed from: h */
    private Integer f106841h;

    /* compiled from: DivData.kt */
    @Metadata
    /* renamed from: sb.l5$a */
    /* loaded from: classes8.dex */
    static final class C40789a extends Lambda implements Function2<ParsingEnvironment, JSONObject, DivData> {

        /* renamed from: g */
        public static final C40789a f106842g = new C40789a();

        C40789a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final DivData mo105910invoke(@NotNull ParsingEnvironment env, @NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return DivData.f106829i.m10210a(env, it);
        }
    }

    /* compiled from: DivData.kt */
    @Metadata
    /* renamed from: sb.l5$b */
    /* loaded from: classes8.dex */
    static final class C40790b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: g */
        public static final C40790b f106843g = new C40790b();

        C40790b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof DivTransitionSelector);
        }
    }

    /* compiled from: DivData.kt */
    @Metadata
    /* renamed from: sb.l5$c */
    /* loaded from: classes8.dex */
    public static final class C40791c {
        private C40791c() {
        }

        public /* synthetic */ C40791c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final DivData m10210a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            ErrorsCollectorEnvironment m18499a = C37301e.m18499a(env);
            ParsingErrorLogger mo2529b = m18499a.mo2529b();
            Object m2621o = JsonParser.m2621o(json, "log_id", mo2529b, m18499a);
            Intrinsics.checkNotNullExpressionValue(m2621o, "read(json, \"log_id\", logger, env)");
            String str = (String) m2621o;
            List m2655A = JsonParser.m2655A(json, "states", C40792d.f106844d.m10206b(), DivData.f106832l, mo2529b, m18499a);
            Intrinsics.checkNotNullExpressionValue(m2655A, "readList(json, \"states\",…S_VALIDATOR, logger, env)");
            List m2638R = JsonParser.m2638R(json, "timers", DivTimer.f109020h.m8863b(), mo2529b, m18499a);
            Expression m2646J = JsonParser.m2646J(json, "transition_animation_selector", DivTransitionSelector.f111230c.m7336a(), mo2529b, m18499a, DivData.f106830j, DivData.f106831k);
            if (m2646J == null) {
                m2646J = DivData.f106830j;
            }
            return new DivData(str, m2655A, m2638R, m2646J, JsonParser.m2638R(json, "variable_triggers", DivTrigger.f104955e.m11499b(), mo2529b, m18499a), JsonParser.m2638R(json, "variables", DivVariable.f105982b.m10750b(), mo2529b, m18499a), m18499a.m18501d());
        }
    }

    /* compiled from: DivData.kt */
    @Metadata
    /* renamed from: sb.l5$d */
    /* loaded from: classes8.dex */
    public static class C40792d implements JSONSerializable, Hashable {
        @NotNull

        /* renamed from: d */
        public static final C40794b f106844d = new C40794b(null);
        @NotNull

        /* renamed from: e */
        private static final Function2<ParsingEnvironment, JSONObject, C40792d> f106845e = C40793a.f106849g;
        @NotNull

        /* renamed from: a */
        public final Div f106846a;

        /* renamed from: b */
        public final long f106847b;
        @Nullable

        /* renamed from: c */
        private Integer f106848c;

        /* compiled from: DivData.kt */
        @Metadata
        /* renamed from: sb.l5$d$a */
        /* loaded from: classes8.dex */
        static final class C40793a extends Lambda implements Function2<ParsingEnvironment, JSONObject, C40792d> {

            /* renamed from: g */
            public static final C40793a f106849g = new C40793a();

            C40793a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* renamed from: a */
            public final C40792d mo105910invoke(@NotNull ParsingEnvironment env, @NotNull JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return C40792d.f106844d.m10207a(env, it);
            }
        }

        /* compiled from: DivData.kt */
        @Metadata
        /* renamed from: sb.l5$d$b */
        /* loaded from: classes8.dex */
        public static final class C40794b {
            private C40794b() {
            }

            public /* synthetic */ C40794b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* renamed from: a */
            public final C40792d m10207a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(json, "json");
                ParsingErrorLogger mo2529b = env.mo2529b();
                Object m2618r = JsonParser.m2618r(json, "div", Div.f109920c.m8302b(), mo2529b, env);
                Intrinsics.checkNotNullExpressionValue(m2618r, "read(json, \"div\", Div.CREATOR, logger, env)");
                Object m2620p = JsonParser.m2620p(json, "state_id", ParsingConverters.m2539d(), mo2529b, env);
                Intrinsics.checkNotNullExpressionValue(m2620p, "read(json, \"state_id\", NUMBER_TO_INT, logger, env)");
                return new C40792d((Div) m2618r, ((Number) m2620p).longValue());
            }

            @NotNull
            /* renamed from: b */
            public final Function2<ParsingEnvironment, JSONObject, C40792d> m10206b() {
                return C40792d.f106845e;
            }
        }

        public C40792d(@NotNull Div div, long j) {
            Intrinsics.checkNotNullParameter(div, "div");
            this.f106846a = div;
            this.f106847b = j;
        }

        @Override // p743ja.Hashable
        public int hash() {
            Integer num = this.f106848c;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.m17042b(getClass()).hashCode() + this.f106846a.hash() + Long.hashCode(this.f106847b);
            this.f106848c = Integer.valueOf(hashCode);
            return hashCode;
        }

        @Override // p656eb.JSONSerializable
        @NotNull
        /* renamed from: q */
        public JSONObject mo7023q() {
            JSONObject jSONObject = new JSONObject();
            Div div = this.f106846a;
            if (div != null) {
                jSONObject.put("div", div.mo7023q());
            }
            C44527j.m2595h(jSONObject, "state_id", Long.valueOf(this.f106847b), null, 4, null);
            return jSONObject;
        }
    }

    /* compiled from: DivData.kt */
    @Metadata
    /* renamed from: sb.l5$e */
    /* loaded from: classes8.dex */
    public static final class C40795e extends Lambda implements Function1<DivTransitionSelector, String> {

        /* renamed from: g */
        public static final C40795e f106850g = new C40795e();

        C40795e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final String invoke(@NotNull DivTransitionSelector v) {
            Intrinsics.checkNotNullParameter(v, "v");
            return DivTransitionSelector.f111230c.m7335b(v);
        }
    }

    static {
        Object m17331U;
        TypeHelpers.C44543a c44543a = TypeHelpers.f116923a;
        m17331U = _Arrays.m17331U(DivTransitionSelector.values());
        f106831k = c44543a.m2527a(m17331U, C40790b.f106843g);
        f106832l = new ParsingValidators() { // from class: sb.k5
            @Override // va.ParsingValidators
            public final boolean isValid(List list) {
                boolean m10215b;
                m10215b = DivData.m10215b(list);
                return m10215b;
            }
        };
        f106833m = C40789a.f106842g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivData(@NotNull String logId, @NotNull List<? extends C40792d> states, @Nullable List<? extends DivTimer> list, @NotNull Expression<DivTransitionSelector> transitionAnimationSelector, @Nullable List<? extends DivTrigger> list2, @Nullable List<? extends DivVariable> list3, @Nullable List<? extends Exception> list4) {
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        this.f106834a = logId;
        this.f106835b = states;
        this.f106836c = list;
        this.f106837d = transitionAnimationSelector;
        this.f106838e = list2;
        this.f106839f = list3;
        this.f106840g = list4;
    }

    /* renamed from: b */
    public static final boolean m10215b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.size() >= 1) {
            return true;
        }
        return false;
    }

    @Override // p743ja.Hashable
    public int hash() {
        int i;
        int i2;
        Integer num = this.f106841h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.m17042b(getClass()).hashCode() + this.f106834a.hashCode();
        int i3 = 0;
        int i4 = 0;
        for (C40792d c40792d : this.f106835b) {
            i4 += c40792d.hash();
        }
        int i5 = hashCode + i4;
        List<DivTimer> list = this.f106836c;
        if (list != null) {
            i = 0;
            for (DivTimer divTimer : list) {
                i += divTimer.hash();
            }
        } else {
            i = 0;
        }
        int hashCode2 = i5 + i + this.f106837d.hashCode();
        List<DivTrigger> list2 = this.f106838e;
        if (list2 != null) {
            i2 = 0;
            for (DivTrigger divTrigger : list2) {
                i2 += divTrigger.hash();
            }
        } else {
            i2 = 0;
        }
        int i6 = hashCode2 + i2;
        List<DivVariable> list3 = this.f106839f;
        if (list3 != null) {
            for (DivVariable divVariable : list3) {
                i3 += divVariable.hash();
            }
        }
        int i7 = i6 + i3;
        this.f106841h = Integer.valueOf(i7);
        return i7;
    }

    @Override // p656eb.JSONSerializable
    @NotNull
    /* renamed from: q */
    public JSONObject mo7023q() {
        JSONObject jSONObject = new JSONObject();
        C44527j.m2595h(jSONObject, "log_id", this.f106834a, null, 4, null);
        C44527j.m2597f(jSONObject, "states", this.f106835b);
        C44527j.m2597f(jSONObject, "timers", this.f106836c);
        C44527j.m2593j(jSONObject, "transition_animation_selector", this.f106837d, C40795e.f106850g);
        C44527j.m2597f(jSONObject, "variable_triggers", this.f106838e);
        C44527j.m2597f(jSONObject, "variables", this.f106839f);
        return jSONObject;
    }

    public /* synthetic */ DivData(String str, List list, List list2, Expression expression, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? f106830j : expression, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : list5);
    }
}

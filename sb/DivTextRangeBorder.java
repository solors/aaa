package sb;

import kotlin.Metadata;
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
import p743ja.Hashable;
import va.C44527j;
import va.C44545v;
import va.InterfaceC44553w;
import va.JsonParser;
import va.ParsingConverters;

@Metadata
/* renamed from: sb.dp */
/* loaded from: classes8.dex */
public class DivTextRangeBorder implements JSONSerializable, Hashable {
    @NotNull

    /* renamed from: d */
    public static final C40114b f105401d = new C40114b(null);
    @NotNull

    /* renamed from: e */
    private static final InterfaceC44553w<Long> f105402e = new InterfaceC44553w() { // from class: sb.cp
        @Override // va.InterfaceC44553w
        /* renamed from: a */
        public final boolean mo2517a(Object obj) {
            boolean m11204b;
            m11204b = DivTextRangeBorder.m11204b(((Long) obj).longValue());
            return m11204b;
        }
    };
    @NotNull

    /* renamed from: f */
    private static final Function2<ParsingEnvironment, JSONObject, DivTextRangeBorder> f105403f = C40113a.f105407g;
    @Nullable

    /* renamed from: a */
    public final Expression<Long> f105404a;
    @Nullable

    /* renamed from: b */
    public final DivStroke f105405b;
    @Nullable

    /* renamed from: c */
    private Integer f105406c;

    /* compiled from: DivTextRangeBorder.kt */
    @Metadata
    /* renamed from: sb.dp$a */
    /* loaded from: classes8.dex */
    static final class C40113a extends Lambda implements Function2<ParsingEnvironment, JSONObject, DivTextRangeBorder> {

        /* renamed from: g */
        public static final C40113a f105407g = new C40113a();

        C40113a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final DivTextRangeBorder mo105910invoke(@NotNull ParsingEnvironment env, @NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return DivTextRangeBorder.f105401d.m11200a(env, it);
        }
    }

    /* compiled from: DivTextRangeBorder.kt */
    @Metadata
    /* renamed from: sb.dp$b */
    /* loaded from: classes8.dex */
    public static final class C40114b {
        private C40114b() {
        }

        public /* synthetic */ C40114b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final DivTextRangeBorder m11200a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            ParsingErrorLogger mo2529b = env.mo2529b();
            return new DivTextRangeBorder(JsonParser.m2643M(json, "corner_radius", ParsingConverters.m2539d(), DivTextRangeBorder.f105402e, mo2529b, env, C44545v.f116928b), (DivStroke) JsonParser.m2653C(json, "stroke", DivStroke.f109875e.m8334b(), mo2529b, env));
        }

        @NotNull
        /* renamed from: b */
        public final Function2<ParsingEnvironment, JSONObject, DivTextRangeBorder> m11199b() {
            return DivTextRangeBorder.f105403f;
        }
    }

    public DivTextRangeBorder() {
        this(null, null, 3, null);
    }

    /* renamed from: b */
    public static final boolean m11204b(long j) {
        if (j >= 0) {
            return true;
        }
        return false;
    }

    @Override // p743ja.Hashable
    public int hash() {
        int i;
        Integer num = this.f105406c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.m17042b(getClass()).hashCode();
        Expression<Long> expression = this.f105404a;
        int i2 = 0;
        if (expression != null) {
            i = expression.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        DivStroke divStroke = this.f105405b;
        if (divStroke != null) {
            i2 = divStroke.hash();
        }
        int i4 = i3 + i2;
        this.f105406c = Integer.valueOf(i4);
        return i4;
    }

    @Override // p656eb.JSONSerializable
    @NotNull
    /* renamed from: q */
    public JSONObject mo7023q() {
        JSONObject jSONObject = new JSONObject();
        C44527j.m2594i(jSONObject, "corner_radius", this.f105404a);
        DivStroke divStroke = this.f105405b;
        if (divStroke != null) {
            jSONObject.put("stroke", divStroke.mo7023q());
        }
        return jSONObject;
    }

    public DivTextRangeBorder(@Nullable Expression<Long> expression, @Nullable DivStroke divStroke) {
        this.f105404a = expression;
        this.f105405b = divStroke;
    }

    public /* synthetic */ DivTextRangeBorder(Expression expression, DivStroke divStroke, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : expression, (i & 2) != 0 ? null : divStroke);
    }
}

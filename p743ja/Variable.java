package p743ja;

import android.net.Uri;
import androidx.annotation.MainThread;
import com.yandex.div.core.ObserverList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import na.C38480a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1059ya.ConvertUtils;
import p656eb.JSONSerializable;
import p804nd.NoWhenBranchMatchedException;
import sa.C39638b;
import sb.ArrayVariable;
import sb.BoolVariable;
import sb.ColorVariable;
import sb.DictVariable;
import sb.IntegerVariable;
import sb.NumberVariable;
import sb.StrVariable;
import sb.UrlVariable;
import va.ParsingConverters;

@Metadata
/* renamed from: ja.h */
/* loaded from: classes8.dex */
public abstract class Variable {
    @NotNull

    /* renamed from: a */
    private final ObserverList<Function1<Variable, Unit>> f98497a;

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$a */
    /* loaded from: classes8.dex */
    public static class C37310a extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98498b;
        @NotNull

        /* renamed from: c */
        private final JSONArray f98499c;
        @NotNull

        /* renamed from: d */
        private JSONArray f98500d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37310a(@NotNull String name, @NotNull JSONArray defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.f98498b = name;
            this.f98499c = defaultValue;
            this.f98500d = m18472o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98498b;
        }

        @NotNull
        /* renamed from: o */
        public JSONArray m18472o() {
            return this.f98499c;
        }

        @NotNull
        /* renamed from: p */
        public JSONArray m18471p() {
            return this.f98500d;
        }

        @MainThread
        /* renamed from: q */
        public void m18470q(@NotNull JSONArray newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            m18469r(newValue);
        }

        /* renamed from: r */
        public void m18469r(@NotNull JSONArray value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.m17075f(this.f98500d, value)) {
                return;
            }
            this.f98500d = value;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$b */
    /* loaded from: classes8.dex */
    public static class C37311b extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98501b;

        /* renamed from: c */
        private final boolean f98502c;

        /* renamed from: d */
        private boolean f98503d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37311b(@NotNull String name, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98501b = name;
            this.f98502c = z;
            this.f98503d = m18468o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98501b;
        }

        /* renamed from: o */
        public boolean m18468o() {
            return this.f98502c;
        }

        /* renamed from: p */
        public boolean m18467p() {
            return this.f98503d;
        }

        @MainThread
        /* renamed from: q */
        public void m18466q(boolean z) {
            m18465r(z);
        }

        /* renamed from: r */
        public void m18465r(boolean z) {
            if (this.f98503d == z) {
                return;
            }
            this.f98503d = z;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$c */
    /* loaded from: classes8.dex */
    public static class C37312c extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98504b;

        /* renamed from: c */
        private final int f98505c;

        /* renamed from: d */
        private int f98506d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37312c(@NotNull String name, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98504b = name;
            this.f98505c = i;
            this.f98506d = C38480a.m14650d(m18464o());
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98504b;
        }

        /* renamed from: o */
        public int m18464o() {
            return this.f98505c;
        }

        /* renamed from: p */
        public int m18463p() {
            return this.f98506d;
        }

        @MainThread
        /* renamed from: q */
        public void m18462q(int i) throws VariableMutationException {
            Integer invoke = ParsingConverters.m2538e().invoke(C38480a.m14651c(i));
            if (invoke != null) {
                m18461r(C38480a.m14650d(invoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) C38480a.m14644j(i)) + '\'', null, 2, null);
        }

        /* renamed from: r */
        public void m18461r(int i) {
            if (C38480a.m14648f(this.f98506d, i)) {
                return;
            }
            this.f98506d = i;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$d */
    /* loaded from: classes8.dex */
    public static class C37313d extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98507b;
        @NotNull

        /* renamed from: c */
        private final JSONObject f98508c;
        @NotNull

        /* renamed from: d */
        private JSONObject f98509d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37313d(@NotNull String name, @NotNull JSONObject defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.f98507b = name;
            this.f98508c = defaultValue;
            this.f98509d = m18460o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98507b;
        }

        @NotNull
        /* renamed from: o */
        public JSONObject m18460o() {
            return this.f98508c;
        }

        @NotNull
        /* renamed from: p */
        public JSONObject m18459p() {
            return this.f98509d;
        }

        @MainThread
        /* renamed from: q */
        public void m18458q(@NotNull JSONObject newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            m18457r(newValue);
        }

        /* renamed from: r */
        public void m18457r(@NotNull JSONObject value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.m17075f(this.f98509d, value)) {
                return;
            }
            this.f98509d = value;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$e */
    /* loaded from: classes8.dex */
    public static class C37314e extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98510b;

        /* renamed from: c */
        private final double f98511c;

        /* renamed from: d */
        private double f98512d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37314e(@NotNull String name, double d) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98510b = name;
            this.f98511c = d;
            this.f98512d = m18456o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98510b;
        }

        /* renamed from: o */
        public double m18456o() {
            return this.f98511c;
        }

        /* renamed from: p */
        public double m18455p() {
            return this.f98512d;
        }

        @MainThread
        /* renamed from: q */
        public void m18454q(double d) {
            m18453r(d);
        }

        /* renamed from: r */
        public void m18453r(double d) {
            boolean z;
            if (this.f98512d == d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            this.f98512d = d;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$f */
    /* loaded from: classes8.dex */
    public static class C37315f extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98513b;

        /* renamed from: c */
        private final long f98514c;

        /* renamed from: d */
        private long f98515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37315f(@NotNull String name, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98513b = name;
            this.f98514c = j;
            this.f98515d = m18452o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98513b;
        }

        /* renamed from: o */
        public long m18452o() {
            return this.f98514c;
        }

        /* renamed from: p */
        public long m18451p() {
            return this.f98515d;
        }

        @MainThread
        /* renamed from: q */
        public void m18450q(long j) {
            m18449r(j);
        }

        /* renamed from: r */
        public void m18449r(long j) {
            if (this.f98515d == j) {
                return;
            }
            this.f98515d = j;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$g */
    /* loaded from: classes8.dex */
    public static class C37316g extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98516b;
        @NotNull

        /* renamed from: c */
        private final String f98517c;
        @NotNull

        /* renamed from: d */
        private String f98518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37316g(@NotNull String name, @NotNull String defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.f98516b = name;
            this.f98517c = defaultValue;
            this.f98518d = m18448o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98516b;
        }

        @NotNull
        /* renamed from: o */
        public String m18448o() {
            return this.f98517c;
        }

        @NotNull
        /* renamed from: p */
        public String m18447p() {
            return this.f98518d;
        }

        /* renamed from: q */
        public void m18446q(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.m17075f(this.f98518d, value)) {
                return;
            }
            this.f98518d = value;
            m18483d(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata
    /* renamed from: ja.h$h */
    /* loaded from: classes8.dex */
    public static class C37317h extends Variable {
        @NotNull

        /* renamed from: b */
        private final String f98519b;
        @NotNull

        /* renamed from: c */
        private final Uri f98520c;
        @NotNull

        /* renamed from: d */
        private Uri f98521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37317h(@NotNull String name, @NotNull Uri defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.f98519b = name;
            this.f98520c = defaultValue;
            this.f98521d = m18444o();
        }

        @Override // p743ja.Variable
        @NotNull
        /* renamed from: b */
        public String mo18445b() {
            return this.f98519b;
        }

        @NotNull
        /* renamed from: o */
        public Uri m18444o() {
            return this.f98520c;
        }

        @NotNull
        /* renamed from: p */
        public Uri m18443p() {
            return this.f98521d;
        }

        @MainThread
        /* renamed from: q */
        public void m18442q(@NotNull Uri newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            m18441r(newValue);
        }

        /* renamed from: r */
        public void m18441r(@NotNull Uri value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.m17075f(this.f98521d, value)) {
                return;
            }
            this.f98521d = value;
            m18483d(this);
        }
    }

    public /* synthetic */ Variable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: e */
    private boolean m18482e(String str) {
        Boolean m16573a1;
        try {
            m16573a1 = C37690r.m16573a1(str);
            if (m16573a1 != null) {
                return m16573a1.booleanValue();
            }
            return ConvertUtils.m1008b(m18480g(str));
        } catch (IllegalArgumentException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: f */
    private double m18481f(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: g */
    private int m18480g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: h */
    private JSONObject m18479h(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: i */
    private long m18478i(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: j */
    private Uri m18477j(String str) {
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "{\n            Uri.parse(this)\n        }");
            return parse;
        } catch (IllegalArgumentException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    /* renamed from: a */
    public void m18485a(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f98497a.m37277e(observer);
    }

    @NotNull
    /* renamed from: b */
    public abstract String mo18445b();

    @NotNull
    /* renamed from: c */
    public Object m18484c() {
        if (this instanceof C37316g) {
            return ((C37316g) this).m18447p();
        }
        if (this instanceof C37315f) {
            return Long.valueOf(((C37315f) this).m18451p());
        }
        if (this instanceof C37311b) {
            return Boolean.valueOf(((C37311b) this).m18467p());
        }
        if (this instanceof C37314e) {
            return Double.valueOf(((C37314e) this).m18455p());
        }
        if (this instanceof C37312c) {
            return C38480a.m14651c(((C37312c) this).m18463p());
        }
        if (this instanceof C37317h) {
            return ((C37317h) this).m18443p();
        }
        if (this instanceof C37313d) {
            return ((C37313d) this).m18459p();
        }
        if (this instanceof C37310a) {
            return ((C37310a) this).m18471p();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    protected void m18483d(@NotNull Variable v) {
        Intrinsics.checkNotNullParameter(v, "v");
        C39638b.m12007e();
        for (Function1<Variable, Unit> function1 : this.f98497a) {
            function1.invoke(v);
        }
    }

    /* renamed from: k */
    public void m18476k(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f98497a.m37271k(observer);
    }

    @MainThread
    /* renamed from: l */
    public void m18475l(@NotNull String newValue) throws VariableMutationException {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (this instanceof C37316g) {
            ((C37316g) this).m18446q(newValue);
        } else if (this instanceof C37315f) {
            ((C37315f) this).m18449r(m18478i(newValue));
        } else if (this instanceof C37311b) {
            ((C37311b) this).m18465r(m18482e(newValue));
        } else if (this instanceof C37314e) {
            ((C37314e) this).m18453r(m18481f(newValue));
        } else if (this instanceof C37312c) {
            Integer invoke = ParsingConverters.m2538e().invoke(newValue);
            if (invoke != null) {
                ((C37312c) this).m18461r(C38480a.m14650d(invoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + newValue + '\'', null, 2, null);
        } else if (this instanceof C37317h) {
            ((C37317h) this).m18441r(m18477j(newValue));
        } else if (this instanceof C37313d) {
            ((C37313d) this).m18457r(m18479h(newValue));
        } else if (this instanceof C37310a) {
            throw new VariableMutationException("Url action set_variable not allowed for arrays, use property \"typed\" instead", null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @MainThread
    /* renamed from: m */
    public void m18474m(@NotNull Variable from) throws VariableMutationException {
        Intrinsics.checkNotNullParameter(from, "from");
        if ((this instanceof C37316g) && (from instanceof C37316g)) {
            ((C37316g) this).m18446q(((C37316g) from).m18447p());
        } else if ((this instanceof C37315f) && (from instanceof C37315f)) {
            ((C37315f) this).m18449r(((C37315f) from).m18451p());
        } else if ((this instanceof C37311b) && (from instanceof C37311b)) {
            ((C37311b) this).m18465r(((C37311b) from).m18467p());
        } else if ((this instanceof C37314e) && (from instanceof C37314e)) {
            ((C37314e) this).m18453r(((C37314e) from).m18455p());
        } else if ((this instanceof C37312c) && (from instanceof C37312c)) {
            ((C37312c) this).m18461r(((C37312c) from).m18463p());
        } else if ((this instanceof C37317h) && (from instanceof C37317h)) {
            ((C37317h) this).m18441r(((C37317h) from).m18443p());
        } else if ((this instanceof C37313d) && (from instanceof C37313d)) {
            ((C37313d) this).m18457r(((C37313d) from).m18459p());
        } else if ((this instanceof C37310a) && (from instanceof C37310a)) {
            ((C37310a) this).m18469r(((C37310a) from).m18471p());
        } else {
            throw new VariableMutationException("Setting value to " + this + " from " + from + " not supported!", null, 2, null);
        }
    }

    @NotNull
    /* renamed from: n */
    public JSONObject m18473n() {
        JSONSerializable urlVariable;
        if (this instanceof C37310a) {
            urlVariable = new ArrayVariable(mo18445b(), ((C37310a) this).m18471p());
        } else if (this instanceof C37311b) {
            urlVariable = new BoolVariable(mo18445b(), ((C37311b) this).m18467p());
        } else if (this instanceof C37312c) {
            urlVariable = new ColorVariable(mo18445b(), ((C37312c) this).m18463p());
        } else if (this instanceof C37313d) {
            urlVariable = new DictVariable(mo18445b(), ((C37313d) this).m18459p());
        } else if (this instanceof C37314e) {
            urlVariable = new NumberVariable(mo18445b(), ((C37314e) this).m18455p());
        } else if (this instanceof C37315f) {
            urlVariable = new IntegerVariable(mo18445b(), ((C37315f) this).m18451p());
        } else if (this instanceof C37316g) {
            urlVariable = new StrVariable(mo18445b(), ((C37316g) this).m18447p());
        } else if (this instanceof C37317h) {
            urlVariable = new UrlVariable(mo18445b(), ((C37317h) this).m18443p());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JSONObject mo7023q = urlVariable.mo7023q();
        Intrinsics.checkNotNullExpressionValue(mo7023q, "serializable.writeToJSON()");
        return mo7023q;
    }

    private Variable() {
        this.f98497a = new ObserverList<>();
    }
}

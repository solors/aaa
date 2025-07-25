package va;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: TypeHelpers.kt */
@Metadata
/* renamed from: va.v */
/* loaded from: classes8.dex */
public final class C44545v {
    @NotNull

    /* renamed from: a */
    public static final TypeHelpers<Boolean> f116927a = new C44546a();
    @NotNull

    /* renamed from: b */
    public static final TypeHelpers<Long> f116928b = new C44549d();
    @NotNull

    /* renamed from: c */
    public static final TypeHelpers<String> f116929c = new C44551f();
    @NotNull

    /* renamed from: d */
    public static final TypeHelpers<Double> f116930d = new C44548c();
    @NotNull

    /* renamed from: e */
    public static final TypeHelpers<Uri> f116931e = new C44552g();
    @NotNull

    /* renamed from: f */
    public static final TypeHelpers<Integer> f116932f = new C44547b();
    @NotNull

    /* renamed from: g */
    public static final TypeHelpers<JSONArray> f116933g = new C44550e();

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$a */
    /* loaded from: classes8.dex */
    public static final class C44546a implements TypeHelpers<Boolean> {

        /* renamed from: b */
        private final boolean f116934b;

        C44546a() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof Boolean;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public Boolean mo2520a() {
            return Boolean.valueOf(this.f116934b);
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$b */
    /* loaded from: classes8.dex */
    public static final class C44547b implements TypeHelpers<Integer> {

        /* renamed from: b */
        private final int f116935b = ViewCompat.MEASURED_STATE_MASK;

        C44547b() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof Integer;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public Integer mo2520a() {
            return Integer.valueOf(this.f116935b);
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$c */
    /* loaded from: classes8.dex */
    public static final class C44548c implements TypeHelpers<Double> {

        /* renamed from: b */
        private final double f116936b;

        C44548c() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof Double;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public Double mo2520a() {
            return Double.valueOf(this.f116936b);
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$d */
    /* loaded from: classes8.dex */
    public static final class C44549d implements TypeHelpers<Long> {

        /* renamed from: b */
        private final long f116937b;

        C44549d() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof Long;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public Long mo2520a() {
            return Long.valueOf(this.f116937b);
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$e */
    /* loaded from: classes8.dex */
    public static final class C44550e implements TypeHelpers<JSONArray> {
        @NotNull

        /* renamed from: b */
        private final JSONArray f116938b = new JSONArray();

        C44550e() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof JSONArray;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public JSONArray mo2520a() {
            return this.f116938b;
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$f */
    /* loaded from: classes8.dex */
    public static final class C44551f implements TypeHelpers<String> {
        @NotNull

        /* renamed from: b */
        private final String f116939b = "";

        C44551f() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof String;
        }

        @Override // va.TypeHelpers
        @NotNull
        /* renamed from: c */
        public String mo2520a() {
            return this.f116939b;
        }
    }

    /* compiled from: TypeHelpers.kt */
    @Metadata
    /* renamed from: va.v$g */
    /* loaded from: classes8.dex */
    public static final class C44552g implements TypeHelpers<Uri> {

        /* renamed from: b */
        private final Uri f116940b = Uri.EMPTY;

        C44552g() {
        }

        @Override // va.TypeHelpers
        /* renamed from: b */
        public boolean mo2519b(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value instanceof Uri;
        }

        @Override // va.TypeHelpers
        /* renamed from: c */
        public Uri mo2520a() {
            return this.f116940b;
        }
    }
}

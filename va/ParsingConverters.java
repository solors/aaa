package va;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.ConvertUtils;

@Metadata
/* renamed from: va.r */
/* loaded from: classes8.dex */
public final class ParsingConverters {
    @NotNull

    /* renamed from: a */
    private static final Function1<Integer, String> f116905a = C44537b.f116913g;
    @NotNull

    /* renamed from: b */
    private static final Function1<Object, Integer> f116906b = C44540e.f116916g;
    @NotNull

    /* renamed from: c */
    private static final Function1<Uri, String> f116907c = C44542g.f116918g;
    @NotNull

    /* renamed from: d */
    private static final Function1<String, Uri> f116908d = C44541f.f116917g;
    @NotNull

    /* renamed from: e */
    private static final Function1<Object, Boolean> f116909e = C44536a.f116912g;
    @NotNull

    /* renamed from: f */
    private static final Function1<Number, Double> f116910f = C44538c.f116914g;
    @NotNull

    /* renamed from: g */
    private static final Function1<Number, Long> f116911g = C44539d.f116915g;

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$a */
    /* loaded from: classes8.dex */
    static final class C44536a extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: g */
        public static final C44536a f116912g = new C44536a();

        C44536a() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Boolean invoke(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof Number) {
                return ConvertUtils.m1009a((Number) value);
            }
            if (value instanceof Boolean) {
                return (Boolean) value;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$b */
    /* loaded from: classes8.dex */
    static final class C44537b extends Lambda implements Function1<Integer, String> {

        /* renamed from: g */
        public static final C44537b f116913g = new C44537b();

        C44537b() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public final String m2535a(int i) {
            return C38480a.m14644j(C38480a.m14650d(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return m2535a(num.intValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$c */
    /* loaded from: classes8.dex */
    static final class C44538c extends Lambda implements Function1<Number, Double> {

        /* renamed from: g */
        public static final C44538c f116914g = new C44538c();

        C44538c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Double invoke(@NotNull Number n) {
            Intrinsics.checkNotNullParameter(n, "n");
            return Double.valueOf(n.doubleValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$d */
    /* loaded from: classes8.dex */
    static final class C44539d extends Lambda implements Function1<Number, Long> {

        /* renamed from: g */
        public static final C44539d f116915g = new C44539d();

        C44539d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Long invoke(@NotNull Number n) {
            Intrinsics.checkNotNullParameter(n, "n");
            return Long.valueOf(n.longValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$e */
    /* loaded from: classes8.dex */
    static final class C44540e extends Lambda implements Function1<Object, Integer> {

        /* renamed from: g */
        public static final C44540e f116916g = new C44540e();

        C44540e() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Integer invoke(@Nullable Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(C38480a.f101823b.m14641b((String) obj));
            }
            if (obj instanceof C38480a) {
                return Integer.valueOf(((C38480a) obj).m14643k());
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$f */
    /* loaded from: classes8.dex */
    static final class C44541f extends Lambda implements Function1<String, Uri> {

        /* renamed from: g */
        public static final C44541f f116917g = new C44541f();

        C44541f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final Uri invoke(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Uri parse = Uri.parse(value);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(value)");
            return parse;
        }
    }

    /* compiled from: ParsingConverters.kt */
    @Metadata
    /* renamed from: va.r$g */
    /* loaded from: classes8.dex */
    static final class C44542g extends Lambda implements Function1<Uri, String> {

        /* renamed from: g */
        public static final C44542g f116918g = new C44542g();

        C44542g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final String invoke(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            return uri2;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final Function1<Object, Boolean> m2542a() {
        return f116909e;
    }

    @NotNull
    /* renamed from: b */
    public static final Function1<Integer, String> m2541b() {
        return f116905a;
    }

    @NotNull
    /* renamed from: c */
    public static final Function1<Number, Double> m2540c() {
        return f116910f;
    }

    @NotNull
    /* renamed from: d */
    public static final Function1<Number, Long> m2539d() {
        return f116911g;
    }

    @NotNull
    /* renamed from: e */
    public static final Function1<Object, Integer> m2538e() {
        return f116906b;
    }

    @NotNull
    /* renamed from: f */
    public static final Function1<String, Uri> m2537f() {
        return f116908d;
    }

    @NotNull
    /* renamed from: g */
    public static final Function1<Uri, String> m2536g() {
        return f116907c;
    }
}

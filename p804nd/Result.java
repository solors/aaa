package p804nd;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: nd.q */
/* loaded from: classes5.dex */
public final class Result<T> implements Serializable {
    @NotNull

    /* renamed from: c */
    public static final C38506a f101870c = new C38506a(null);
    @Nullable

    /* renamed from: b */
    private final Object f101871b;

    /* compiled from: Result.kt */
    @Metadata
    /* renamed from: nd.q$a */
    /* loaded from: classes5.dex */
    public static final class C38506a {
        private C38506a() {
        }

        public /* synthetic */ C38506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Result.kt */
    @Metadata
    /* renamed from: nd.q$b */
    /* loaded from: classes5.dex */
    public static final class C38507b implements Serializable {
        @NotNull

        /* renamed from: b */
        public final Throwable f101872b;

        public C38507b(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f101872b = exception;
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof C38507b) && Intrinsics.m17075f(this.f101872b, ((C38507b) obj).f101872b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f101872b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.f101872b + ')';
        }
    }

    private /* synthetic */ Result(Object obj) {
        this.f101871b = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ Result m14550a(Object obj) {
        return new Result(obj);
    }

    /* renamed from: c */
    public static boolean m14548c(Object obj, Object obj2) {
        if (!(obj2 instanceof Result) || !Intrinsics.m17075f(obj, ((Result) obj2).m14541j())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m14547d(Object obj, Object obj2) {
        return Intrinsics.m17075f(obj, obj2);
    }

    @Nullable
    /* renamed from: e */
    public static final Throwable m14546e(Object obj) {
        if (obj instanceof C38507b) {
            return ((C38507b) obj).f101872b;
        }
        return null;
    }

    /* renamed from: f */
    public static int m14545f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m14544g(Object obj) {
        return obj instanceof C38507b;
    }

    /* renamed from: h */
    public static final boolean m14543h(Object obj) {
        return !(obj instanceof C38507b);
    }

    @NotNull
    /* renamed from: i */
    public static String m14542i(Object obj) {
        if (obj instanceof C38507b) {
            return ((C38507b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m14548c(this.f101871b, obj);
    }

    public int hashCode() {
        return m14545f(this.f101871b);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m14541j() {
        return this.f101871b;
    }

    @NotNull
    public String toString() {
        return m14542i(this.f101871b);
    }

    @NotNull
    /* renamed from: b */
    public static <T> Object m14549b(@Nullable Object obj) {
        return obj;
    }
}

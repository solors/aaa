package p674fe;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channel.kt */
@Metadata
/* renamed from: fe.h */
/* loaded from: classes7.dex */
public final class C33120h<T> {
    @NotNull

    /* renamed from: b */
    public static final C33122b f90484b = new C33122b(null);
    @NotNull

    /* renamed from: c */
    private static final C33123c f90485c = new C33123c();
    @Nullable

    /* renamed from: a */
    private final Object f90486a;

    /* compiled from: Channel.kt */
    @Metadata
    /* renamed from: fe.h$a */
    /* loaded from: classes7.dex */
    public static final class C33121a extends C33123c {
        @Nullable

        /* renamed from: a */
        public final Throwable f90487a;

        public C33121a(@Nullable Throwable th) {
            this.f90487a = th;
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof C33121a) && Intrinsics.m17075f(this.f90487a, ((C33121a) obj).f90487a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f90487a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p674fe.C33120h.C33123c
        @NotNull
        public String toString() {
            return "Closed(" + this.f90487a + ')';
        }
    }

    /* compiled from: Channel.kt */
    @Metadata
    /* renamed from: fe.h$b */
    /* loaded from: classes7.dex */
    public static final class C33122b {
        private C33122b() {
        }

        public /* synthetic */ C33122b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <E> Object m24677a(@Nullable Throwable th) {
            return C33120h.m24686c(new C33121a(th));
        }

        @NotNull
        /* renamed from: b */
        public final <E> Object m24676b() {
            return C33120h.m24686c(C33120h.f90485c);
        }

        @NotNull
        /* renamed from: c */
        public final <E> Object m24675c(E e) {
            return C33120h.m24686c(e);
        }
    }

    /* compiled from: Channel.kt */
    @Metadata
    /* renamed from: fe.h$c */
    /* loaded from: classes7.dex */
    public static class C33123c {
        @NotNull
        public String toString() {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        }
    }

    private /* synthetic */ C33120h(Object obj) {
        this.f90486a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C33120h m24687b(Object obj) {
        return new C33120h(obj);
    }

    /* renamed from: d */
    public static boolean m24685d(Object obj, Object obj2) {
        if (!(obj2 instanceof C33120h) || !Intrinsics.m17075f(obj, ((C33120h) obj2).m24678k())) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: e */
    public static final Throwable m24684e(Object obj) {
        C33121a c33121a;
        if (obj instanceof C33121a) {
            c33121a = (C33121a) obj;
        } else {
            c33121a = null;
        }
        if (c33121a == null) {
            return null;
        }
        return c33121a.f90487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: f */
    public static final T m24683f(Object obj) {
        if (obj instanceof C33123c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m24682g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m24681h(Object obj) {
        return obj instanceof C33121a;
    }

    /* renamed from: i */
    public static final boolean m24680i(Object obj) {
        return !(obj instanceof C33123c);
    }

    @NotNull
    /* renamed from: j */
    public static String m24679j(Object obj) {
        if (obj instanceof C33121a) {
            return ((C33121a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m24685d(this.f90486a, obj);
    }

    public int hashCode() {
        return m24682g(this.f90486a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m24678k() {
        return this.f90486a;
    }

    @NotNull
    public String toString() {
        return m24679j(this.f90486a);
    }

    @NotNull
    /* renamed from: c */
    public static <T> Object m24686c(@Nullable Object obj) {
        return obj;
    }
}

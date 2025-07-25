package p744jb;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p803nb.RawJson;

/* compiled from: RawJsonRepositoryResult.kt */
@Metadata
/* renamed from: jb.p */
/* loaded from: classes8.dex */
public final class C37341p {
    @NotNull

    /* renamed from: c */
    public static final C37342a f98579c = new C37342a(null);
    @NotNull

    /* renamed from: d */
    private static final C37341p f98580d;
    @NotNull

    /* renamed from: a */
    private final List<RawJson> f98581a;
    @NotNull

    /* renamed from: b */
    private final List<RawJsonRepositoryException> f98582b;

    /* compiled from: RawJsonRepositoryResult.kt */
    @Metadata
    /* renamed from: jb.p$a */
    /* loaded from: classes8.dex */
    public static final class C37342a {
        private C37342a() {
        }

        public /* synthetic */ C37342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C37341p m18374a() {
            return C37341p.f98580d;
        }
    }

    static {
        List m17166m;
        List m17166m2;
        m17166m = C37563v.m17166m();
        m17166m2 = C37563v.m17166m();
        f98580d = new C37341p(m17166m, m17166m2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37341p(@NotNull List<? extends RawJson> resultData, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f98581a = resultData;
        this.f98582b = errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static /* synthetic */ C37341p m18377d(C37341p c37341p, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c37341p.f98581a;
        }
        if ((i & 2) != 0) {
            list2 = c37341p.f98582b;
        }
        return c37341p.m18378c(list, list2);
    }

    @NotNull
    /* renamed from: b */
    public final C37341p m18379b(@NotNull Collection<? extends RawJson> data) {
        List m17569J0;
        Intrinsics.checkNotNullParameter(data, "data");
        m17569J0 = _Collections.m17569J0(this.f98581a, data);
        return m18377d(this, m17569J0, null, 2, null);
    }

    @NotNull
    /* renamed from: c */
    public final C37341p m18378c(@NotNull List<? extends RawJson> resultData, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new C37341p(resultData, errors);
    }

    @NotNull
    /* renamed from: e */
    public final List<RawJsonRepositoryException> m18376e() {
        return this.f98582b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37341p)) {
            return false;
        }
        C37341p c37341p = (C37341p) obj;
        if (Intrinsics.m17075f(this.f98581a, c37341p.f98581a) && Intrinsics.m17075f(this.f98582b, c37341p.f98582b)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final List<RawJson> m18375f() {
        return this.f98581a;
    }

    public int hashCode() {
        return (this.f98581a.hashCode() * 31) + this.f98582b.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.f98581a + ", errors=" + this.f98582b + ')';
    }
}

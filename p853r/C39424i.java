package p853r;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p853r.AbstractC39420c;

/* compiled from: Size.kt */
@Metadata
/* renamed from: r.i */
/* loaded from: classes2.dex */
public final class C39424i {
    @NotNull

    /* renamed from: c */
    public static final C39425a f103648c = new C39425a(null);
    @NotNull

    /* renamed from: d */
    public static final C39424i f103649d;
    @NotNull

    /* renamed from: a */
    private final AbstractC39420c f103650a;
    @NotNull

    /* renamed from: b */
    private final AbstractC39420c f103651b;

    /* compiled from: Size.kt */
    @Metadata
    /* renamed from: r.i$a */
    /* loaded from: classes2.dex */
    public static final class C39425a {
        private C39425a() {
        }

        public /* synthetic */ C39425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AbstractC39420c.C39422b c39422b = AbstractC39420c.C39422b.f103636a;
        f103649d = new C39424i(c39422b, c39422b);
    }

    public C39424i(@NotNull AbstractC39420c abstractC39420c, @NotNull AbstractC39420c abstractC39420c2) {
        this.f103650a = abstractC39420c;
        this.f103651b = abstractC39420c2;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC39420c m12723a() {
        return this.f103651b;
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC39420c m12722b() {
        return this.f103650a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39424i)) {
            return false;
        }
        C39424i c39424i = (C39424i) obj;
        if (Intrinsics.m17075f(this.f103650a, c39424i.f103650a) && Intrinsics.m17075f(this.f103651b, c39424i.f103651b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f103650a.hashCode() * 31) + this.f103651b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.f103650a + ", height=" + this.f103651b + ')';
    }
}

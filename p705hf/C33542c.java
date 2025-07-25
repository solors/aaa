package p705hf;

import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Header.kt */
@Metadata
/* renamed from: hf.c */
/* loaded from: classes10.dex */
public final class C33542c {
    @NotNull

    /* renamed from: d */
    public static final C33543a f91568d = new C33543a(null);
    @NotNull

    /* renamed from: e */
    public static final C39208h f91569e;
    @NotNull

    /* renamed from: f */
    public static final C39208h f91570f;
    @NotNull

    /* renamed from: g */
    public static final C39208h f91571g;
    @NotNull

    /* renamed from: h */
    public static final C39208h f91572h;
    @NotNull

    /* renamed from: i */
    public static final C39208h f91573i;
    @NotNull

    /* renamed from: j */
    public static final C39208h f91574j;
    @NotNull

    /* renamed from: a */
    public final C39208h f91575a;
    @NotNull

    /* renamed from: b */
    public final C39208h f91576b;

    /* renamed from: c */
    public final int f91577c;

    /* compiled from: Header.kt */
    @Metadata
    /* renamed from: hf.c$a */
    /* loaded from: classes10.dex */
    public static final class C33543a {
        private C33543a() {
        }

        public /* synthetic */ C33543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C39208h.C39209a c39209a = C39208h.f102952f;
        f91569e = c39209a.m13547d(":");
        f91570f = c39209a.m13547d(Header.RESPONSE_STATUS_UTF8);
        f91571g = c39209a.m13547d(Header.TARGET_METHOD_UTF8);
        f91572h = c39209a.m13547d(Header.TARGET_PATH_UTF8);
        f91573i = c39209a.m13547d(Header.TARGET_SCHEME_UTF8);
        f91574j = c39209a.m13547d(Header.TARGET_AUTHORITY_UTF8);
    }

    public C33542c(@NotNull C39208h name, @NotNull C39208h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f91575a = name;
        this.f91576b = value;
        this.f91577c = name.m13569C() + 32 + value.m13569C();
    }

    @NotNull
    /* renamed from: a */
    public final C39208h m23553a() {
        return this.f91575a;
    }

    @NotNull
    /* renamed from: b */
    public final C39208h m23552b() {
        return this.f91576b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33542c)) {
            return false;
        }
        C33542c c33542c = (C33542c) obj;
        if (Intrinsics.m17075f(this.f91575a, c33542c.f91575a) && Intrinsics.m17075f(this.f91576b, c33542c.f91576b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f91575a.hashCode() * 31) + this.f91576b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f91575a.m13566H() + ": " + this.f91576b.m13566H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C33542c(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.h$a r0 = okio.C39208h.f102952f
            okio.h r2 = r0.m13547d(r2)
            okio.h r3 = r0.m13547d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p705hf.C33542c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33542c(@NotNull C39208h name, @NotNull String value) {
        this(name, C39208h.f102952f.m13547d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}

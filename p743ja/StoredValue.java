package p743ja;

import com.learnings.abcenter.util.AbCenterConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import na.C38480a;
import na.C38484c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: ja.g */
/* loaded from: classes8.dex */
public abstract class StoredValue {

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$a */
    /* loaded from: classes8.dex */
    public static final class C37302a extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98476a;

        /* renamed from: b */
        private final boolean f98477b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37302a(@NotNull String name, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98476a = name;
            this.f98477b = z;
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98476a;
        }

        /* renamed from: d */
        public final boolean m18496d() {
            return this.f98477b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37302a)) {
                return false;
            }
            C37302a c37302a = (C37302a) obj;
            if (Intrinsics.m17075f(this.f98476a, c37302a.f98476a) && this.f98477b == c37302a.f98477b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f98476a.hashCode() * 31;
            boolean z = this.f98477b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "BooleanStoredValue(name=" + this.f98476a + ", value=" + this.f98477b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$b */
    /* loaded from: classes8.dex */
    public static final class C37303b extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98478a;

        /* renamed from: b */
        private final int f98479b;

        public /* synthetic */ C37303b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98478a;
        }

        /* renamed from: d */
        public final int m18495d() {
            return this.f98479b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37303b)) {
                return false;
            }
            C37303b c37303b = (C37303b) obj;
            if (Intrinsics.m17075f(this.f98478a, c37303b.f98478a) && C38480a.m14648f(this.f98479b, c37303b.f98479b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98478a.hashCode() * 31) + C38480a.m14646h(this.f98479b);
        }

        @NotNull
        public String toString() {
            return "ColorStoredValue(name=" + this.f98478a + ", value=" + ((Object) C38480a.m14644j(this.f98479b)) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C37303b(String name, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98478a = name;
            this.f98479b = i;
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$c */
    /* loaded from: classes8.dex */
    public static final class C37304c extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98480a;

        /* renamed from: b */
        private final double f98481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37304c(@NotNull String name, double d) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98480a = name;
            this.f98481b = d;
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98480a;
        }

        /* renamed from: d */
        public final double m18494d() {
            return this.f98481b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37304c)) {
                return false;
            }
            C37304c c37304c = (C37304c) obj;
            if (Intrinsics.m17075f(this.f98480a, c37304c.f98480a) && Double.compare(this.f98481b, c37304c.f98481b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98480a.hashCode() * 31) + Double.hashCode(this.f98481b);
        }

        @NotNull
        public String toString() {
            return "DoubleStoredValue(name=" + this.f98480a + ", value=" + this.f98481b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$d */
    /* loaded from: classes8.dex */
    public static final class C37305d extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98482a;

        /* renamed from: b */
        private final long f98483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37305d(@NotNull String name, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.f98482a = name;
            this.f98483b = j;
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98482a;
        }

        /* renamed from: d */
        public final long m18493d() {
            return this.f98483b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37305d)) {
                return false;
            }
            C37305d c37305d = (C37305d) obj;
            if (Intrinsics.m17075f(this.f98482a, c37305d.f98482a) && this.f98483b == c37305d.f98483b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98482a.hashCode() * 31) + Long.hashCode(this.f98483b);
        }

        @NotNull
        public String toString() {
            return "IntegerStoredValue(name=" + this.f98482a + ", value=" + this.f98483b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$e */
    /* loaded from: classes8.dex */
    public static final class C37306e extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98484a;
        @NotNull

        /* renamed from: b */
        private final String f98485b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37306e(@NotNull String name, @NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f98484a = name;
            this.f98485b = value;
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98484a;
        }

        @NotNull
        /* renamed from: d */
        public final String m18492d() {
            return this.f98485b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37306e)) {
                return false;
            }
            C37306e c37306e = (C37306e) obj;
            if (Intrinsics.m17075f(this.f98484a, c37306e.f98484a) && Intrinsics.m17075f(this.f98485b, c37306e.f98485b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98484a.hashCode() * 31) + this.f98485b.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringStoredValue(name=" + this.f98484a + ", value=" + this.f98485b + ')';
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$f */
    /* loaded from: classes8.dex */
    public enum EnumC37307f {
        STRING("string"),
        INTEGER("integer"),
        BOOLEAN("boolean"),
        NUMBER(AbCenterConstant.VALUE_TYPE_NUMBER),
        COLOR("color"),
        URL("url");
        
        @NotNull

        /* renamed from: c */
        public static final C37308a f98486c = new C37308a(null);
        @NotNull

        /* renamed from: b */
        private final String f98494b;

        /* compiled from: StoredValue.kt */
        @Metadata
        /* renamed from: ja.g$f$a */
        /* loaded from: classes8.dex */
        public static final class C37308a {
            private C37308a() {
            }

            public /* synthetic */ C37308a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* renamed from: a */
            public final EnumC37307f m18489a(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                EnumC37307f enumC37307f = EnumC37307f.STRING;
                if (!Intrinsics.m17075f(string, enumC37307f.f98494b)) {
                    EnumC37307f enumC37307f2 = EnumC37307f.INTEGER;
                    if (!Intrinsics.m17075f(string, enumC37307f2.f98494b)) {
                        EnumC37307f enumC37307f3 = EnumC37307f.BOOLEAN;
                        if (!Intrinsics.m17075f(string, enumC37307f3.f98494b)) {
                            EnumC37307f enumC37307f4 = EnumC37307f.NUMBER;
                            if (!Intrinsics.m17075f(string, enumC37307f4.f98494b)) {
                                EnumC37307f enumC37307f5 = EnumC37307f.COLOR;
                                if (!Intrinsics.m17075f(string, enumC37307f5.f98494b)) {
                                    EnumC37307f enumC37307f6 = EnumC37307f.URL;
                                    if (!Intrinsics.m17075f(string, enumC37307f6.f98494b)) {
                                        return null;
                                    }
                                    return enumC37307f6;
                                }
                                return enumC37307f5;
                            }
                            return enumC37307f4;
                        }
                        return enumC37307f3;
                    }
                    return enumC37307f2;
                }
                return enumC37307f;
            }

            @NotNull
            /* renamed from: b */
            public final String m18488b(@NotNull EnumC37307f obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f98494b;
            }
        }

        EnumC37307f(String str) {
            this.f98494b = str;
        }
    }

    /* compiled from: StoredValue.kt */
    @Metadata
    /* renamed from: ja.g$g */
    /* loaded from: classes8.dex */
    public static final class C37309g extends StoredValue {
        @NotNull

        /* renamed from: a */
        private final String f98495a;
        @NotNull

        /* renamed from: b */
        private final String f98496b;

        public /* synthetic */ C37309g(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        @Override // p743ja.StoredValue
        @NotNull
        /* renamed from: a */
        public String mo18487a() {
            return this.f98495a;
        }

        @NotNull
        /* renamed from: d */
        public final String m18486d() {
            return this.f98496b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37309g)) {
                return false;
            }
            C37309g c37309g = (C37309g) obj;
            if (Intrinsics.m17075f(this.f98495a, c37309g.f98495a) && C38484c.m14630d(this.f98496b, c37309g.f98496b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98495a.hashCode() * 31) + C38484c.m14629e(this.f98496b);
        }

        @NotNull
        public String toString() {
            return "UrlStoredValue(name=" + this.f98495a + ", value=" + ((Object) C38484c.m14628f(this.f98496b)) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C37309g(String name, String value) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f98495a = name;
            this.f98496b = value;
        }
    }

    private StoredValue() {
    }

    public /* synthetic */ StoredValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo18487a();

    @NotNull
    /* renamed from: b */
    public final EnumC37307f m18498b() {
        if (this instanceof C37306e) {
            return EnumC37307f.STRING;
        }
        if (this instanceof C37305d) {
            return EnumC37307f.INTEGER;
        }
        if (this instanceof C37302a) {
            return EnumC37307f.BOOLEAN;
        }
        if (this instanceof C37304c) {
            return EnumC37307f.NUMBER;
        }
        if (this instanceof C37303b) {
            return EnumC37307f.COLOR;
        }
        if (this instanceof C37309g) {
            return EnumC37307f.URL;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public final Object m18497c() {
        if (this instanceof C37306e) {
            return ((C37306e) this).m18492d();
        }
        if (this instanceof C37305d) {
            return Long.valueOf(((C37305d) this).m18493d());
        }
        if (this instanceof C37302a) {
            return Boolean.valueOf(((C37302a) this).m18496d());
        }
        if (this instanceof C37304c) {
            return Double.valueOf(((C37304c) this).m18494d());
        }
        if (this instanceof C37303b) {
            return C38480a.m14651c(((C37303b) this).m18495d());
        }
        if (this instanceof C37309g) {
            return C38484c.m14633a(((C37309g) this).m18486d());
        }
        throw new NoWhenBranchMatchedException();
    }
}

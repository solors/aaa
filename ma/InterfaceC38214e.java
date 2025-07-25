package ma;

import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Token.kt */
@Metadata
/* renamed from: ma.e */
/* loaded from: classes8.dex */
public interface InterfaceC38214e {

    /* compiled from: Token.kt */
    @Metadata
    /* renamed from: ma.e$a */
    /* loaded from: classes8.dex */
    public static final class C38215a implements InterfaceC38214e {
        @NotNull

        /* renamed from: a */
        private final String f101095a;

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$a$a */
        /* loaded from: classes8.dex */
        public static final class C38216a implements InterfaceC38214e {
            @NotNull

            /* renamed from: a */
            public static final C38216a f101096a = new C38216a();

            private C38216a() {
            }

            @NotNull
            public String toString() {
                return ",";
            }
        }

        public C38215a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f101095a = name;
        }

        @NotNull
        /* renamed from: a */
        public final String m15318a() {
            return this.f101095a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C38215a) && Intrinsics.m17075f(this.f101095a, ((C38215a) obj).f101095a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f101095a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Function(name=" + this.f101095a + ')';
        }
    }

    /* compiled from: Token.kt */
    @Metadata
    /* renamed from: ma.e$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC38223c extends InterfaceC38214e {

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$a */
        /* loaded from: classes8.dex */
        public interface InterfaceC38224a extends InterfaceC38223c {

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$a */
            /* loaded from: classes8.dex */
            public interface InterfaceC38225a extends InterfaceC38224a {

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$a$a */
                /* loaded from: classes8.dex */
                public static final class C38226a implements InterfaceC38225a {
                    @NotNull

                    /* renamed from: a */
                    public static final C38226a f101101a = new C38226a();

                    private C38226a() {
                    }

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$a$b */
                /* loaded from: classes8.dex */
                public static final class C38227b implements InterfaceC38225a {
                    @NotNull

                    /* renamed from: a */
                    public static final C38227b f101102a = new C38227b();

                    private C38227b() {
                    }

                    @NotNull
                    public String toString() {
                        return ">=";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$a$c */
                /* loaded from: classes8.dex */
                public static final class C38228c implements InterfaceC38225a {
                    @NotNull

                    /* renamed from: a */
                    public static final C38228c f101103a = new C38228c();

                    private C38228c() {
                    }

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$a$d */
                /* loaded from: classes8.dex */
                public static final class C38229d implements InterfaceC38225a {
                    @NotNull

                    /* renamed from: a */
                    public static final C38229d f101104a = new C38229d();

                    private C38229d() {
                    }

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$b */
            /* loaded from: classes8.dex */
            public interface InterfaceC38230b extends InterfaceC38224a {

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$b$a */
                /* loaded from: classes8.dex */
                public static final class C38231a implements InterfaceC38230b {
                    @NotNull

                    /* renamed from: a */
                    public static final C38231a f101105a = new C38231a();

                    private C38231a() {
                    }

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$b$b */
                /* loaded from: classes8.dex */
                public static final class C38232b implements InterfaceC38230b {
                    @NotNull

                    /* renamed from: a */
                    public static final C38232b f101106a = new C38232b();

                    private C38232b() {
                    }

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$c */
            /* loaded from: classes8.dex */
            public interface InterfaceC38233c extends InterfaceC38224a {

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$c$a */
                /* loaded from: classes8.dex */
                public static final class C38234a implements InterfaceC38233c {
                    @NotNull

                    /* renamed from: a */
                    public static final C38234a f101107a = new C38234a();

                    private C38234a() {
                    }

                    @NotNull
                    public String toString() {
                        return RemoteSettings.FORWARD_SLASH_STRING;
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$c$b */
                /* loaded from: classes8.dex */
                public static final class C38235b implements InterfaceC38233c {
                    @NotNull

                    /* renamed from: a */
                    public static final C38235b f101108a = new C38235b();

                    private C38235b() {
                    }

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$c$c */
                /* loaded from: classes8.dex */
                public static final class C38236c implements InterfaceC38233c {
                    @NotNull

                    /* renamed from: a */
                    public static final C38236c f101109a = new C38236c();

                    private C38236c() {
                    }

                    @NotNull
                    public String toString() {
                        return ProxyConfig.MATCH_ALL_SCHEMES;
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$d */
            /* loaded from: classes8.dex */
            public interface InterfaceC38237d extends InterfaceC38224a {

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$d$a */
                /* loaded from: classes8.dex */
                public static final class C38238a implements InterfaceC38237d {
                    @NotNull

                    /* renamed from: a */
                    public static final C38238a f101110a = new C38238a();

                    private C38238a() {
                    }

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$d$b */
                /* loaded from: classes8.dex */
                public static final class C38239b implements InterfaceC38237d {
                    @NotNull

                    /* renamed from: a */
                    public static final C38239b f101111a = new C38239b();

                    private C38239b() {
                    }

                    @NotNull
                    public String toString() {
                        return "||";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$e */
            /* loaded from: classes8.dex */
            public static final class C38240e implements InterfaceC38224a {
                @NotNull

                /* renamed from: a */
                public static final C38240e f101112a = new C38240e();

                private C38240e() {
                }

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$a$f */
            /* loaded from: classes8.dex */
            public interface InterfaceC38241f extends InterfaceC38224a {

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$f$a */
                /* loaded from: classes8.dex */
                public static final class C38242a implements InterfaceC38241f {
                    @NotNull

                    /* renamed from: a */
                    public static final C38242a f101113a = new C38242a();

                    private C38242a() {
                    }

                    @NotNull
                    public String toString() {
                        return "-";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata
                /* renamed from: ma.e$c$a$f$b */
                /* loaded from: classes8.dex */
                public static final class C38243b implements InterfaceC38241f {
                    @NotNull

                    /* renamed from: a */
                    public static final C38243b f101114a = new C38243b();

                    private C38243b() {
                    }

                    @NotNull
                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$b */
        /* loaded from: classes8.dex */
        public static final class C38244b implements InterfaceC38223c {
            @NotNull

            /* renamed from: a */
            public static final C38244b f101115a = new C38244b();

            private C38244b() {
            }

            @NotNull
            public String toString() {
                return ".";
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$c */
        /* loaded from: classes8.dex */
        public static final class C38245c implements InterfaceC38223c {
            @NotNull

            /* renamed from: a */
            public static final C38245c f101116a = new C38245c();

            private C38245c() {
            }

            @NotNull
            public String toString() {
                return ":";
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$d */
        /* loaded from: classes8.dex */
        public static final class C38246d implements InterfaceC38223c {
            @NotNull

            /* renamed from: a */
            public static final C38246d f101117a = new C38246d();

            private C38246d() {
            }

            @NotNull
            public String toString() {
                return "?";
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$e */
        /* loaded from: classes8.dex */
        public static final class C38247e implements InterfaceC38223c {
            @NotNull

            /* renamed from: a */
            public static final C38247e f101118a = new C38247e();

            private C38247e() {
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$f */
        /* loaded from: classes8.dex */
        public static final class C38248f implements InterfaceC38223c {
            @NotNull

            /* renamed from: a */
            public static final C38248f f101119a = new C38248f();

            private C38248f() {
            }

            @NotNull
            public String toString() {
                return "!:";
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$c$g */
        /* loaded from: classes8.dex */
        public interface InterfaceC38249g extends InterfaceC38223c {

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$g$a */
            /* loaded from: classes8.dex */
            public static final class C38250a implements InterfaceC38249g {
                @NotNull

                /* renamed from: a */
                public static final C38250a f101120a = new C38250a();

                private C38250a() {
                }

                @NotNull
                public String toString() {
                    return "-";
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$g$b */
            /* loaded from: classes8.dex */
            public static final class C38251b implements InterfaceC38249g {
                @NotNull

                /* renamed from: a */
                public static final C38251b f101121a = new C38251b();

                private C38251b() {
                }

                @NotNull
                public String toString() {
                    return "!";
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$c$g$c */
            /* loaded from: classes8.dex */
            public static final class C38252c implements InterfaceC38249g {
                @NotNull

                /* renamed from: a */
                public static final C38252c f101122a = new C38252c();

                private C38252c() {
                }

                @NotNull
                public String toString() {
                    return "+";
                }
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata
    /* renamed from: ma.e$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC38217b extends InterfaceC38214e {

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$b$b */
        /* loaded from: classes8.dex */
        public static final class C38222b implements InterfaceC38217b {
            @NotNull

            /* renamed from: a */
            private final String f101100a;

            private /* synthetic */ C38222b(String str) {
                this.f101100a = str;
            }

            /* renamed from: a */
            public static final /* synthetic */ C38222b m15299a(String str) {
                return new C38222b(str);
            }

            @NotNull
            /* renamed from: b */
            public static String m15298b(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return name;
            }

            /* renamed from: c */
            public static boolean m15297c(String str, Object obj) {
                if (!(obj instanceof C38222b) || !Intrinsics.m17075f(str, ((C38222b) obj).m15293g())) {
                    return false;
                }
                return true;
            }

            /* renamed from: d */
            public static final boolean m15296d(String str, String str2) {
                return Intrinsics.m17075f(str, str2);
            }

            /* renamed from: e */
            public static int m15295e(String str) {
                return str.hashCode();
            }

            /* renamed from: f */
            public static String m15294f(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m15297c(this.f101100a, obj);
            }

            /* renamed from: g */
            public final /* synthetic */ String m15293g() {
                return this.f101100a;
            }

            public int hashCode() {
                return m15295e(this.f101100a);
            }

            public String toString() {
                return m15294f(this.f101100a);
            }
        }

        /* compiled from: Token.kt */
        @Metadata
        /* renamed from: ma.e$b$a */
        /* loaded from: classes8.dex */
        public interface InterfaceC38218a extends InterfaceC38217b {

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$b$a$b */
            /* loaded from: classes8.dex */
            public static final class C38220b implements InterfaceC38218a {
                @NotNull

                /* renamed from: a */
                private final Number f101098a;

                private /* synthetic */ C38220b(Number number) {
                    this.f101098a = number;
                }

                /* renamed from: a */
                public static final /* synthetic */ C38220b m15311a(Number number) {
                    return new C38220b(number);
                }

                @NotNull
                /* renamed from: b */
                public static Number m15310b(@NotNull Number value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: c */
                public static boolean m15309c(Number number, Object obj) {
                    if (!(obj instanceof C38220b) || !Intrinsics.m17075f(number, ((C38220b) obj).m15306f())) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: d */
                public static int m15308d(Number number) {
                    return number.hashCode();
                }

                /* renamed from: e */
                public static String m15307e(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m15309c(this.f101098a, obj);
                }

                /* renamed from: f */
                public final /* synthetic */ Number m15306f() {
                    return this.f101098a;
                }

                public int hashCode() {
                    return m15308d(this.f101098a);
                }

                public String toString() {
                    return m15307e(this.f101098a);
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$b$a$c */
            /* loaded from: classes8.dex */
            public static final class C38221c implements InterfaceC38218a {
                @NotNull

                /* renamed from: a */
                private final String f101099a;

                private /* synthetic */ C38221c(String str) {
                    this.f101099a = str;
                }

                /* renamed from: a */
                public static final /* synthetic */ C38221c m15305a(String str) {
                    return new C38221c(str);
                }

                @NotNull
                /* renamed from: b */
                public static String m15304b(@NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: c */
                public static boolean m15303c(String str, Object obj) {
                    if (!(obj instanceof C38221c) || !Intrinsics.m17075f(str, ((C38221c) obj).m15300f())) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: d */
                public static int m15302d(String str) {
                    return str.hashCode();
                }

                /* renamed from: e */
                public static String m15301e(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m15303c(this.f101099a, obj);
                }

                /* renamed from: f */
                public final /* synthetic */ String m15300f() {
                    return this.f101099a;
                }

                public int hashCode() {
                    return m15302d(this.f101099a);
                }

                public String toString() {
                    return m15301e(this.f101099a);
                }
            }

            /* compiled from: Token.kt */
            @Metadata
            /* renamed from: ma.e$b$a$a */
            /* loaded from: classes8.dex */
            public static final class C38219a implements InterfaceC38218a {

                /* renamed from: a */
                private final boolean f101097a;

                private /* synthetic */ C38219a(boolean z) {
                    this.f101097a = z;
                }

                /* renamed from: a */
                public static final /* synthetic */ C38219a m15317a(boolean z) {
                    return new C38219a(z);
                }

                /* renamed from: c */
                public static boolean m15315c(boolean z, Object obj) {
                    if (!(obj instanceof C38219a) || z != ((C38219a) obj).m15312f()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: d */
                public static int m15314d(boolean z) {
                    if (z) {
                        return 1;
                    }
                    return z ? 1 : 0;
                }

                /* renamed from: e */
                public static String m15313e(boolean z) {
                    return "Bool(value=" + z + ')';
                }

                public boolean equals(Object obj) {
                    return m15315c(this.f101097a, obj);
                }

                /* renamed from: f */
                public final /* synthetic */ boolean m15312f() {
                    return this.f101097a;
                }

                public int hashCode() {
                    return m15314d(this.f101097a);
                }

                public String toString() {
                    return m15313e(this.f101097a);
                }

                /* renamed from: b */
                public static boolean m15316b(boolean z) {
                    return z;
                }
            }
        }
    }
}

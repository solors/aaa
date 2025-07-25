package sa;

import com.amazon.aps.shared.util.APSSharedUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sa.d */
/* loaded from: classes8.dex */
public final class ComparisonFailure extends AssertionError {
    @NotNull

    /* renamed from: d */
    private static final C39639a f104123d = new C39639a(null);
    @NotNull

    /* renamed from: b */
    private final String f104124b;
    @NotNull

    /* renamed from: c */
    private final String f104125c;

    /* compiled from: ComparisonFailure.kt */
    @Metadata
    /* renamed from: sa.d$a */
    /* loaded from: classes8.dex */
    private static final class C39639a {
        private C39639a() {
        }

        public /* synthetic */ C39639a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ComparisonFailure.kt */
    @Metadata
    /* renamed from: sa.d$b */
    /* loaded from: classes8.dex */
    private static final class C39640b {
        @NotNull

        /* renamed from: f */
        public static final C39641a f104126f = new C39641a(null);

        /* renamed from: a */
        private final int f104127a;
        @Nullable

        /* renamed from: b */
        private final String f104128b;
        @Nullable

        /* renamed from: c */
        private final String f104129c;

        /* renamed from: d */
        private int f104130d;

        /* renamed from: e */
        private int f104131e;

        /* compiled from: ComparisonFailure.kt */
        @Metadata
        /* renamed from: sa.d$b$a */
        /* loaded from: classes8.dex */
        public static final class C39641a {
            private C39641a() {
            }

            public /* synthetic */ C39641a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C39640b(int i, @Nullable String str, @Nullable String str2) {
            this.f104127a = i;
            this.f104128b = str;
            this.f104129c = str2;
        }

        /* renamed from: a */
        private final boolean m11991a() {
            return Intrinsics.m17075f(this.f104128b, this.f104129c);
        }

        /* renamed from: c */
        private final String m11989c(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            String substring = str.substring(this.f104130d, (str.length() - this.f104131e) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append(']');
            String sb3 = sb2.toString();
            if (this.f104130d > 0) {
                sb3 = m11988d() + sb3;
            }
            if (this.f104131e > 0) {
                return sb3 + m11987e();
            }
            return sb3;
        }

        /* renamed from: d */
        private final String m11988d() {
            String str;
            if (this.f104130d > this.f104127a) {
                str = APSSharedUtil.TRUNCATE_SEPARATOR;
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = this.f104128b;
            Intrinsics.m17074g(str2);
            String substring = str2.substring(Math.max(0, this.f104130d - this.f104127a), this.f104130d);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            return sb2.toString();
        }

        /* renamed from: e */
        private final String m11987e() {
            String str;
            String str2 = this.f104128b;
            Intrinsics.m17074g(str2);
            int min = Math.min((str2.length() - this.f104131e) + 1 + this.f104127a, this.f104128b.length());
            if ((this.f104128b.length() - this.f104131e) + 1 < this.f104128b.length() - this.f104127a) {
                str = APSSharedUtil.TRUNCATE_SEPARATOR;
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.f104128b;
            String substring = str3.substring((str3.length() - this.f104131e) + 1, min);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append(str);
            return sb2.toString();
        }

        /* renamed from: f */
        private final void m11986f() {
            this.f104130d = 0;
            String str = this.f104128b;
            Intrinsics.m17074g(str);
            int length = str.length();
            String str2 = this.f104129c;
            Intrinsics.m17074g(str2);
            int min = Math.min(length, str2.length());
            while (true) {
                int i = this.f104130d;
                if (i < min && this.f104128b.charAt(i) == this.f104129c.charAt(this.f104130d)) {
                    this.f104130d++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: g */
        private final void m11985g() {
            String str = this.f104128b;
            Intrinsics.m17074g(str);
            int length = str.length() - 1;
            String str2 = this.f104129c;
            Intrinsics.m17074g(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i = this.f104130d;
                if (length2 < i || length < i || this.f104128b.charAt(length) != this.f104129c.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.f104131e = this.f104128b.length() - length;
        }

        @NotNull
        /* renamed from: b */
        public final String m11990b(@Nullable String str) {
            if (this.f104128b != null && this.f104129c != null && !m11991a()) {
                m11986f();
                m11985g();
                String m11997o = C39638b.m11997o(str, m11989c(this.f104128b), m11989c(this.f104129c));
                Intrinsics.checkNotNullExpressionValue(m11997o, "format(message, expected, actual)");
                return m11997o;
            }
            String m11997o2 = C39638b.m11997o(str, this.f104128b, this.f104129c);
            Intrinsics.checkNotNullExpressionValue(m11997o2, "format(message, expected, actual)");
            return m11997o2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComparisonFailure(@Nullable String str, @NotNull String expected, @NotNull String actual) {
        super(str);
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f104124b = expected;
        this.f104125c = actual;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return new C39640b(20, this.f104124b, this.f104125c).m11990b(super.getMessage());
    }
}

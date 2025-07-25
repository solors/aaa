package ma;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import p759ka.C37442n;
import p759ka.EvaluableException;

@Metadata
/* renamed from: ma.a */
/* loaded from: classes8.dex */
public final class LiteralsEscaper {
    @NotNull

    /* renamed from: a */
    public static final LiteralsEscaper f101087a = new LiteralsEscaper();
    @NotNull

    /* renamed from: b */
    private static final String[] f101088b = {"'", "@{"};

    private LiteralsEscaper() {
    }

    /* renamed from: a */
    private final int m15344a(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && str.charAt(i2) == '\\') {
            i2++;
        }
        return i2 - i;
    }

    /* renamed from: b */
    private final String m15343b(String str, int i, String[] strArr) {
        if (i != str.length() && str.charAt(i) != ' ') {
            for (String str2 : strArr) {
                if (m15342c(str2, str, i)) {
                    return str2;
                }
            }
            throw new EvaluableException("Incorrect string escape", null, 2, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alone backslash at ");
        sb2.append(i - 1);
        throw new C37442n(sb2.toString(), null, 2, null);
    }

    /* renamed from: c */
    private final boolean m15342c(String str, String str2, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + i2;
            if (i3 >= str2.length() || str2.charAt(i3) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static /* synthetic */ String m15340e(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = f101088b;
        }
        return literalsEscaper.m15341d(str, strArr);
    }

    @NotNull
    /* renamed from: d */
    public final String m15341d(@NotNull String string, @NotNull String[] escapingLiterals) {
        boolean m16594Q;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(escapingLiterals, "escapingLiterals");
        m16594Q = C37690r.m16594Q(string, '\\', false, 2, null);
        if (!m16594Q) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length());
        int i = 0;
        while (i < string.length()) {
            if (string.charAt(i) != '\\') {
                sb2.append(string.charAt(i));
                i++;
            } else {
                int m15344a = m15344a(string, i);
                i += m15344a;
                int i2 = m15344a / 2;
                for (int i3 = 0; i3 < i2; i3++) {
                    sb2.append('\\');
                }
                boolean z = true;
                if (m15344a % 2 != 1) {
                    z = false;
                }
                if (z) {
                    String m15343b = m15343b(string, i, escapingLiterals);
                    sb2.append(m15343b);
                    i += m15343b.length();
                }
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "literalBuilder.toString()");
        return sb3;
    }
}

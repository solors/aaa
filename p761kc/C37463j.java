package p761kc;

import com.ironsource.C20517nb;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;

/* compiled from: HeaderValueWithParameters.kt */
@Metadata
/* renamed from: kc.j */
/* loaded from: classes9.dex */
public final class C37463j {
    @NotNull

    /* renamed from: a */
    private static final Set<Character> f98886a;

    static {
        Set<Character> m17119j;
        m17119j = C37572z0.m17119j('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', Character.valueOf(C20517nb.f52173T), '{', '}', ' ', '\t', '\n', '\r');
        f98886a = m17119j;
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m17960a(String str) {
        return m17958c(str);
    }

    /* renamed from: b */
    private static final boolean m17959b(String str) {
        char m16538h1;
        char m16536j1;
        int m16568d0;
        int m16578Y;
        if (str.length() >= 2) {
            m16538h1 = _Strings.m16538h1(str);
            if (m16538h1 == '\"') {
                m16536j1 = _Strings.m16536j1(str);
                if (m16536j1 == '\"') {
                    int i = 1;
                    do {
                        m16568d0 = C37690r.m16568d0(str, '\"', i, false, 4, null);
                        m16578Y = C37690r.m16578Y(str);
                        if (m16568d0 == m16578Y) {
                            break;
                        }
                        int i2 = 0;
                        for (int i3 = m16568d0 - 1; str.charAt(i3) == '\\'; i3--) {
                            i2++;
                        }
                        if (i2 % 2 == 0) {
                            return false;
                        }
                        i = m16568d0 + 1;
                    } while (i < str.length());
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m17958c(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (m17959b(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (f98886a.contains(Character.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: d */
    public static final String m17957d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        m17956e(str, sb2);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: e */
    private static final void m17956e(String str, StringBuilder sb2) {
        sb2.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                sb2.append("\\\\");
            } else if (charAt == '\n') {
                sb2.append("\\n");
            } else if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\t') {
                sb2.append("\\t");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(charAt);
            }
        }
        sb2.append("\"");
    }
}

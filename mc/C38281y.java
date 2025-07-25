package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: Text.kt */
@Metadata
/* renamed from: mc.y */
/* loaded from: classes9.dex */
public final class C38281y {
    @NotNull
    /* renamed from: a */
    public static final C38267h m15187a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new C38267h(str);
    }

    /* renamed from: b */
    private static final char m15186b(char c) {
        boolean z;
        boolean z2 = true;
        if ('A' <= c && c < '[') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (char) (c + ' ');
        }
        if (c < 0 || c >= 128) {
            z2 = false;
        }
        if (!z2) {
            return Character.toLowerCase(c);
        }
        return c;
    }

    @NotNull
    /* renamed from: c */
    public static final String m15185c(@NotNull String str) {
        int m16578Y;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                char charAt = str.charAt(i);
                if (m15186b(charAt) != charAt) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i);
        m16578Y = C37690r.m16578Y(str);
        if (i <= m16578Y) {
            while (true) {
                sb2.append(m15186b(str.charAt(i)));
                if (i == m16578Y) {
                    break;
                }
                i++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}

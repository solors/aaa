package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.CharsKt__CharJVMKt */
/* loaded from: classes7.dex */
public class CharJVM {
    /* renamed from: a */
    public static final int m16780a(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: b */
    public static boolean m16779b(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: c */
    public static String m16778c(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.m17073h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static int checkRadix(int i) {
        if (new PrimitiveRanges(2, 36).m16968i(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new PrimitiveRanges(2, 36));
    }

    @NotNull
    /* renamed from: d */
    public static String m16777d(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String m16776e = m16776e(c, locale);
        if (m16776e.length() > 1) {
            if (c != 329) {
                char charAt = m16776e.charAt(0);
                Intrinsics.m17073h(m16776e, "null cannot be cast to non-null type java.lang.String");
                String substring = m16776e.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Intrinsics.m17073h(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return m16776e;
        }
        String valueOf = String.valueOf(c);
        Intrinsics.m17073h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!Intrinsics.m17075f(m16776e, upperCase)) {
            return m16776e;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    @NotNull
    /* renamed from: e */
    public static final String m16776e(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.m17073h(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}

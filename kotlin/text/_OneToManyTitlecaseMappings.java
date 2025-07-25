package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.text.y */
/* loaded from: classes7.dex */
public final class _OneToManyTitlecaseMappings {
    @NotNull
    /* renamed from: a */
    public static final String m16514a(char c) {
        String valueOf = String.valueOf(c);
        Intrinsics.m17073h(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c != 329) {
                char charAt = upperCase.charAt(0);
                Intrinsics.m17073h(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Intrinsics.m17073h(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}

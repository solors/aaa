package io.appmetrica.analytics.coreutils.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    @NotNull
    public static final String replaceFirstCharWithTitleCase(@NotNull String str, @NotNull Locale locale) {
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(charAt) ? CharJVM.m16777d(charAt, locale) : String.valueOf(charAt)));
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        return str;
    }
}

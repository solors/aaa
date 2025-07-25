package com.yandex.mobile.ads.impl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vp0 {
    @NotNull
    /* renamed from: a */
    public static String m28246a(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb2.append('-');
            sb2.append(script);
        }
        if (country != null && country.length() != 0) {
            sb2.append('_');
            sb2.append(country);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}

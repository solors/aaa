package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.intl.Locale;
import androidx.compose.p015ui.text.intl.LocaleList;
import androidx.compose.p015ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: String.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.StringKt */
/* loaded from: classes.dex */
public final class StringKt {
    @NotNull
    private static final String stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    @NotNull
    public static final String capitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return stringDelegate.capitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    @NotNull
    public static final String decapitalize(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return stringDelegate.decapitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    @NotNull
    public static final String toLowerCase(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale$ui_text_release());
    }

    @NotNull
    public static final String toUpperCase(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale$ui_text_release());
    }

    @NotNull
    public static final String capitalize(@NotNull String str, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return capitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String decapitalize(@NotNull String str, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return decapitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String toLowerCase(@NotNull String str, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return toLowerCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String toUpperCase(@NotNull String str, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return toUpperCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }
}

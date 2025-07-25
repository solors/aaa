package androidx.compose.p015ui.text.platform;

import androidx.compose.p015ui.text.String;
import androidx.compose.p015ui.text.intl.AndroidLocale;
import androidx.compose.p015ui.text.intl.PlatformLocale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidStringDelegate.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.AndroidStringDelegate */
/* loaded from: classes.dex */
public final class AndroidStringDelegate implements String {
    @Override // androidx.compose.p015ui.text.String
    @NotNull
    public String capitalize(@NotNull String string, @NotNull PlatformLocale locale) {
        boolean z;
        String valueOf;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = string.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = CharJVM.m16777d(charAt, ((AndroidLocale) locale).getJavaLocale());
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = string.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return string;
    }

    @Override // androidx.compose.p015ui.text.String
    @NotNull
    public String decapitalize(@NotNull String string, @NotNull PlatformLocale locale) {
        boolean z;
        String m16778c;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            m16778c = CharJVM.m16778c(string.charAt(0), ((AndroidLocale) locale).getJavaLocale());
            sb2.append((Object) m16778c);
            String substring = string.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return string;
    }

    @Override // androidx.compose.p015ui.text.String
    @NotNull
    public String toLowerCase(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = string.toLowerCase(((AndroidLocale) locale).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.p015ui.text.String
    @NotNull
    public String toUpperCase(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = string.toUpperCase(((AndroidLocale) locale).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}

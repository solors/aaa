package androidx.compose.p015ui.text.intl;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.intl.AndroidLocale */
/* loaded from: classes.dex */
public final class AndroidLocale implements PlatformLocale {
    @NotNull
    private final Locale javaLocale;

    public AndroidLocale(@NotNull Locale javaLocale) {
        Intrinsics.checkNotNullParameter(javaLocale, "javaLocale");
        this.javaLocale = javaLocale;
    }

    @NotNull
    public final Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.p015ui.text.intl.PlatformLocale
    @NotNull
    public String getLanguage() {
        String language = this.javaLocale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "javaLocale.language");
        return language;
    }

    @Override // androidx.compose.p015ui.text.intl.PlatformLocale
    @NotNull
    public String getRegion() {
        String country = this.javaLocale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "javaLocale.country");
        return country;
    }

    @Override // androidx.compose.p015ui.text.intl.PlatformLocale
    @NotNull
    public String getScript() {
        String script = this.javaLocale.getScript();
        Intrinsics.checkNotNullExpressionValue(script, "javaLocale.script");
        return script;
    }

    @Override // androidx.compose.p015ui.text.intl.PlatformLocale
    @NotNull
    public String toLanguageTag() {
        String languageTag = this.javaLocale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}

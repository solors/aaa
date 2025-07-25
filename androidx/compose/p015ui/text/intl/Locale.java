package androidx.compose.p015ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Locale.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.intl.Locale */
/* loaded from: classes.dex */
public final class Locale {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final PlatformLocale platformLocale;

    /* compiled from: Locale.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.intl.Locale$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Locale getCurrent() {
            return new Locale(PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0));
        }
    }

    public Locale(@NotNull PlatformLocale platformLocale) {
        Intrinsics.checkNotNullParameter(platformLocale, "platformLocale");
        this.platformLocale = platformLocale;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.m17075f(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    @NotNull
    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    @NotNull
    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    @NotNull
    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    @NotNull
    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @NotNull
    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    @NotNull
    public String toString() {
        return toLanguageTag();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Locale(@NotNull String languageTag) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(languageTag));
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
    }
}

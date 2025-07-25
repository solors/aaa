package androidx.compose.p015ui.text.intl;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.intl.AndroidLocaleDelegateAPI23 */
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    @Override // androidx.compose.p015ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public List<PlatformLocale> getCurrent() {
        List<PlatformLocale> m17175e;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        m17175e = CollectionsJVM.m17175e(new AndroidLocale(locale));
        return m17175e;
    }

    @Override // androidx.compose.p015ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public PlatformLocale parseLanguageTag(@NotNull String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(forLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(forLanguageTag);
    }
}

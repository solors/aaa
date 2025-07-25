package androidx.compose.p015ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLocaleDelegate.android.kt */
@RequiresApi(api = 24)
@Metadata
/* renamed from: androidx.compose.ui.text.intl.AndroidLocaleDelegateAPI24 */
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    @Override // androidx.compose.p015ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public List<PlatformLocale> getCurrent() {
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        ArrayList arrayList = new ArrayList();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            Intrinsics.checkNotNullExpressionValue(locale, "localeList[i]");
            arrayList.add(new AndroidLocale(locale));
        }
        return arrayList;
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

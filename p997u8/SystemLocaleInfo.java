package p997u8;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: u8.b */
/* loaded from: classes7.dex */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // p997u8.LocaleInfo
    @NotNull
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        return language;
    }

    @Override // p997u8.LocaleInfo
    @NotNull
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id2, "getDefault().id");
        return id2;
    }
}

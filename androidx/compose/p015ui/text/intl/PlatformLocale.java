package androidx.compose.p015ui.text.intl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformLocale.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.intl.PlatformLocale */
/* loaded from: classes.dex */
public interface PlatformLocale {
    @NotNull
    String getLanguage();

    @NotNull
    String getRegion();

    @NotNull
    String getScript();

    @NotNull
    String toLanguageTag();
}

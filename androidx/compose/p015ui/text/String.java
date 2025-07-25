package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.intl.PlatformLocale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.text.PlatformStringDelegate */
/* loaded from: classes.dex */
public interface String {
    @NotNull
    java.lang.String capitalize(@NotNull java.lang.String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    java.lang.String decapitalize(@NotNull java.lang.String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    java.lang.String toLowerCase(@NotNull java.lang.String str, @NotNull PlatformLocale platformLocale);

    @NotNull
    java.lang.String toUpperCase(@NotNull java.lang.String str, @NotNull PlatformLocale platformLocale);
}

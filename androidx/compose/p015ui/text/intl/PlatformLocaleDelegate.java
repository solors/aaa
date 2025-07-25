package androidx.compose.p015ui.text.intl;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformLocale.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.intl.PlatformLocaleDelegate */
/* loaded from: classes.dex */
public interface PlatformLocaleDelegate {
    @NotNull
    List<PlatformLocale> getCurrent();

    @NotNull
    PlatformLocale parseLanguageTag(@NotNull String str);
}

package androidx.compose.p015ui.text.intl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformLocale.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.intl.PlatformLocaleKt */
/* loaded from: classes.dex */
public final class PlatformLocaleKt {
    @NotNull
    private static final PlatformLocaleDelegate platformLocaleDelegate = AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();

    @NotNull
    public static final PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return platformLocaleDelegate;
    }
}

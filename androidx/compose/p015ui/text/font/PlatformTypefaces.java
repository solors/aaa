package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatformTypefaces.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.PlatformTypefaces */
/* loaded from: classes.dex */
public interface PlatformTypefaces {
    @NotNull
    /* renamed from: createDefault-FO1MlWM  reason: not valid java name */
    Typeface mo109482createDefaultFO1MlWM(@NotNull FontWeight fontWeight, int i);

    @NotNull
    /* renamed from: createNamed-RetOiIg  reason: not valid java name */
    Typeface mo109483createNamedRetOiIg(@NotNull GenericFontFamily genericFontFamily, @NotNull FontWeight fontWeight, int i);

    @Nullable
    /* renamed from: optionalOnDeviceFontFamilyByName-RetOiIg  reason: not valid java name */
    Typeface mo109484optionalOnDeviceFontFamilyByNameRetOiIg(@NotNull String str, @NotNull FontWeight fontWeight, int i);
}

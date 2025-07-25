package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlatformTypefaces.kt */
@RequiresApi(28)
@Metadata
@VisibleForTesting
/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesApi28 */
/* loaded from: classes.dex */
public final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg  reason: not valid java name */
    private final Typeface m109488createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        Typeface create;
        Typeface create2;
        boolean z;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m109460equalsimpl0(i, companion.m109465getNormal_LCdwA()) && Intrinsics.m17075f(fontWeight, FontWeight.Companion.getNormal())) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                Typeface DEFAULT = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, fontWeight.getWeight(), FontStyle.m109460equalsimpl0(i, companion.m109464getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default  reason: not valid java name */
    static /* synthetic */ Typeface m109489createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m109488createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final Typeface m109490loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Typeface m109488createAndroidTypefaceApi28RetOiIg = m109488createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
        boolean m109460equalsimpl0 = FontStyle.m109460equalsimpl0(i, FontStyle.Companion.m109464getItalic_LCdwA());
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        if (Intrinsics.m17075f(m109488createAndroidTypefaceApi28RetOiIg, typefaceHelperMethodsApi28.create(DEFAULT, fontWeight.getWeight(), m109460equalsimpl0)) || Intrinsics.m17075f(m109488createAndroidTypefaceApi28RetOiIg, m109488createAndroidTypefaceApi28RetOiIg(null, fontWeight, i))) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return m109488createAndroidTypefaceApi28RetOiIg;
    }

    @Override // androidx.compose.p015ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo109482createDefaultFO1MlWM(@NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m109488createAndroidTypefaceApi28RetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.p015ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo109483createNamedRetOiIg(@NotNull GenericFontFamily name, @NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m109488createAndroidTypefaceApi28RetOiIg(name.getName(), fontWeight, i);
    }

    @Override // androidx.compose.p015ui.text.font.PlatformTypefaces
    @Nullable
    /* renamed from: optionalOnDeviceFontFamilyByName-RetOiIg */
    public Typeface mo109484optionalOnDeviceFontFamilyByNameRetOiIg(@NotNull String familyName, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        FontFamily.Companion companion = FontFamily.Companion;
        if (Intrinsics.m17075f(familyName, companion.getSansSerif().getName())) {
            return mo109483createNamedRetOiIg(companion.getSansSerif(), weight, i);
        }
        if (Intrinsics.m17075f(familyName, companion.getSerif().getName())) {
            return mo109483createNamedRetOiIg(companion.getSerif(), weight, i);
        }
        if (Intrinsics.m17075f(familyName, companion.getMonospace().getName())) {
            return mo109483createNamedRetOiIg(companion.getMonospace(), weight, i);
        }
        if (Intrinsics.m17075f(familyName, companion.getCursive().getName())) {
            return mo109483createNamedRetOiIg(companion.getCursive(), weight, i);
        }
        return m109490loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, i);
    }
}

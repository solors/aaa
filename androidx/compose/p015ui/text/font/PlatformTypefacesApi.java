package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p015ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PlatformTypefaces.kt */
@Metadata
@VisibleForTesting
/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesApi */
/* loaded from: classes.dex */
public final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg  reason: not valid java name */
    private final Typeface m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z;
        boolean z2 = false;
        if (FontStyle.m109460equalsimpl0(i, FontStyle.Companion.m109465getNormal_LCdwA()) && Intrinsics.m17075f(fontWeight, FontWeight.Companion.getNormal())) {
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
        int m109418getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m109418getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(m109418getAndroidTypefaceStyleFO1MlWM);
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, m109418getAndroidTypefaceStyleFO1MlWM);
        Intrinsics.checkNotNullExpressionValue(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default  reason: not valid java name */
    static /* synthetic */ Typeface m109486createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return platformTypefacesApi.m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final Typeface m109487loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
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
        Typeface m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg = m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        if (Intrinsics.m17075f(m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m109418getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || Intrinsics.m17075f(m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg, m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i))) {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        return m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    @Override // androidx.compose.p015ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createDefault-FO1MlWM */
    public Typeface mo109482createDefaultFO1MlWM(@NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i);
    }

    @Override // androidx.compose.p015ui.text.font.PlatformTypefaces
    @NotNull
    /* renamed from: createNamed-RetOiIg */
    public Typeface mo109483createNamedRetOiIg(@NotNull GenericFontFamily name, @NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m109487loadNamedFromTypefaceCacheOrNullRetOiIg = m109487loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(name.getName(), fontWeight), fontWeight, i);
        if (m109487loadNamedFromTypefaceCacheOrNullRetOiIg == null) {
            return m109485createAndroidTypefaceUsingTypefaceStyleRetOiIg(name.getName(), fontWeight, i);
        }
        return m109487loadNamedFromTypefaceCacheOrNullRetOiIg;
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
        return m109487loadNamedFromTypefaceCacheOrNullRetOiIg(familyName, weight, i);
    }
}

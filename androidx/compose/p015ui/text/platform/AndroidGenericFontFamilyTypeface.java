package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p015ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontStyle;
import androidx.compose.p015ui.text.font.FontWeight;
import androidx.compose.p015ui.text.font.GenericFontFamily;
import androidx.compose.p015ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGenericFontFamilyTypeface.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface */
/* loaded from: classes.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    @NotNull
    private final FontFamily fontFamily;
    @NotNull
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily fontFamily) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        Typeface create = Typeface.create(fontFamily.getName(), 0);
        Intrinsics.m17074g(create);
        this.nativeTypeface = create;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM  reason: not valid java name */
    private final Typeface m109564buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m109418getAndroidTypefaceStyleFO1MlWM(fontWeight, i));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m109460equalsimpl0(i, FontStyle.Companion.m109464getItalic_LCdwA()));
    }

    @Override // androidx.compose.p015ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p015ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo109563getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Typeface m109564buildStyledTypefaceFO1MlWM = m109564buildStyledTypefaceFO1MlWM(fontWeight, i);
        Intrinsics.checkNotNullExpressionValue(m109564buildStyledTypefaceFO1MlWM, "buildStyledTypeface(fontWeight, fontStyle)");
        return m109564buildStyledTypefaceFO1MlWM;
    }
}

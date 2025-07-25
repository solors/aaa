package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p015ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontStyle;
import androidx.compose.p015ui.text.font.FontWeight;
import androidx.compose.p015ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDefaultTypeface.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.AndroidDefaultTypeface */
/* loaded from: classes.dex */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    @NotNull
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    @Override // androidx.compose.p015ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p015ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U  reason: not valid java name */
    public Typeface mo109563getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (Build.VERSION.SDK_INT < 28) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m109418getAndroidTypefaceStyleFO1MlWM(fontWeight, i));
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…)\n            )\n        }");
            return defaultFromStyle;
        }
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        return typefaceHelperMethodsApi28.create(DEFAULT, fontWeight.getWeight(), FontStyle.m109460equalsimpl0(i, FontStyle.Companion.m109464getItalic_LCdwA()));
    }
}

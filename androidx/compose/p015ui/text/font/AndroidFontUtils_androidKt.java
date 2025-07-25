package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFontUtils.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontUtils_androidKt */
/* loaded from: classes.dex */
public final class AndroidFontUtils_androidKt {
    @NotNull
    public static final FontWeight getAndroidBold(@NotNull FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM  reason: not valid java name */
    public static final int m109418getAndroidTypefaceStyleFO1MlWM(@NotNull FontWeight fontWeight, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return getAndroidTypefaceStyle(z, FontStyle.m109460equalsimpl0(i, FontStyle.Companion.m109464getItalic_LCdwA()));
    }
}

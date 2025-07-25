package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeviceFontFamilyNameFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyNameFontKt */
/* loaded from: classes.dex */
public final class DeviceFontFamilyNameFontKt {
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-KH_DTmE  reason: not valid java name */
    public static final Font m109435FontKH_DTmE(@NotNull String familyName, @NotNull FontWeight weight, int i) {
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new DeviceFontFamilyNameFont(familyName, weight, i, null);
    }

    /* renamed from: Font-KH_DTmE$default  reason: not valid java name */
    public static /* synthetic */ Font m109436FontKH_DTmE$default(String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109435FontKH_DTmE(str, fontWeight, i);
    }
}

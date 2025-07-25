package androidx.compose.p015ui.text.font;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Font.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontKt */
/* loaded from: classes.dex */
public final class FontKt {
    @Stable
    /* renamed from: Font-RetOiIg  reason: not valid java name */
    public static final /* synthetic */ Font m109440FontRetOiIg(int i, FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new ResourceFont(i, weight, i2, FontLoadingStrategy.Companion.m109452getBlockingPKNRLFQ(), null);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m109441FontRetOiIg$default(int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        return m109440FontRetOiIg(i, fontWeight, i2);
    }

    @Stable
    @NotNull
    /* renamed from: Font-YpTlLL0  reason: not valid java name */
    public static final Font m109442FontYpTlLL0(int i, @NotNull FontWeight weight, int i2, int i3) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new ResourceFont(i, weight, i2, i3, null);
    }

    /* renamed from: Font-YpTlLL0$default  reason: not valid java name */
    public static /* synthetic */ Font m109443FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m109465getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m109452getBlockingPKNRLFQ();
        }
        return m109442FontYpTlLL0(i, fontWeight, i2, i3);
    }

    @Stable
    @NotNull
    public static final FontFamily toFontFamily(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "<this>");
        return FontFamilyKt.FontFamily(font);
    }
}

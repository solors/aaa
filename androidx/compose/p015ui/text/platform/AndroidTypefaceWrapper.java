package androidx.compose.p015ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p015ui.text.font.FontFamily;
import androidx.compose.p015ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTypefaceWrapper.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.platform.AndroidTypefaceWrapper */
/* loaded from: classes.dex */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    @Nullable
    private final FontFamily fontFamily;
    @NotNull
    private final Typeface typeface;

    public AndroidTypefaceWrapper(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    @Override // androidx.compose.p015ui.text.font.Typeface
    @Nullable
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.p015ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo109563getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return this.typeface;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }
}

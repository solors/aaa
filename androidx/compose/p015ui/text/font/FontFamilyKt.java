package androidx.compose.p015ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontFamily.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontFamilyKt */
/* loaded from: classes.dex */
public final class FontFamilyKt {
    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull List<? extends Font> fonts) {
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        return new FontListFontFamily(fonts);
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Font... fonts) {
        List m17399f;
        Intrinsics.checkNotNullParameter(fonts, "fonts");
        m17399f = _ArraysJvm.m17399f(fonts);
        return new FontListFontFamily(m17399f);
    }

    @Stable
    @NotNull
    public static final FontFamily FontFamily(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new LoadedFontFamily(typeface);
    }
}

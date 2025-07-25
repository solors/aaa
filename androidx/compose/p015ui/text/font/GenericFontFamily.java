package androidx.compose.p015ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontFamily.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.font.GenericFontFamily */
/* loaded from: classes.dex */
public final class GenericFontFamily extends SystemFontFamily {
    @NotNull
    private final String fontFamilyName;
    @NotNull
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericFontFamily(@NotNull String name, @NotNull String fontFamilyName) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        this.name = name;
        this.fontFamilyName = fontFamilyName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        return this.fontFamilyName;
    }
}

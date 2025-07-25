package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamily.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.LoadedFontFamily */
/* loaded from: classes.dex */
public final class LoadedFontFamily extends FontFamily {
    @NotNull
    private final Typeface typeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadedFontFamily(@NotNull Typeface typeface) {
        super(true, null);
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LoadedFontFamily) && Intrinsics.m17075f(this.typeface, ((LoadedFontFamily) obj).typeface)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}

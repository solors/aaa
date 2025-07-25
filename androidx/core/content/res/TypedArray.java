package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata
/* renamed from: androidx.core.content.res.TypedArrayApi26ImplKt */
/* loaded from: classes.dex */
final class TypedArray {
    @NotNull
    public static final TypedArray INSTANCE = new TypedArray();

    private TypedArray() {
    }

    @DoNotInline
    @NotNull
    public static final Typeface getFont(@NotNull android.content.res.TypedArray typedArray, @StyleableRes int i) {
        Typeface font;
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        font = typedArray.getFont(i);
        Intrinsics.m17074g(font);
        return font;
    }
}

package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFontUtils.android.kt */
@RequiresApi(28)
@Metadata
/* renamed from: androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 */
/* loaded from: classes.dex */
public final class TypefaceHelperMethodsApi28 {
    @NotNull
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @DoNotInline
    @RequiresApi(28)
    @NotNull
    public final Typeface create(@NotNull Typeface typeface, int i, boolean z) {
        Typeface create;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        create = Typeface.create(typeface, i, z);
        Intrinsics.checkNotNullExpressionValue(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}

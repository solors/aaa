package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.TypefaceResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamilyTypefaceAdapter.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontFamilyTypefaceAdapter */
/* loaded from: classes.dex */
public interface FontFamilyTypefaceAdapter {
    @Nullable
    TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function1<? super TypefaceResult.Immutable, Unit> function1, @NotNull Function1<? super TypefaceRequest, ? extends Object> function12);
}

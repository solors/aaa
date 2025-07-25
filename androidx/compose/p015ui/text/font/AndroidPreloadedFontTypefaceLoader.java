package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p015ui.text.font.AndroidFont;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidPreloadedFontTypefaceLoader */
/* loaded from: classes.dex */
public final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {
    @NotNull
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    @Override // androidx.compose.p015ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public Object awaitLoad(@NotNull Context context, @NotNull AndroidFont androidFont, @NotNull Continuation<?> continuation) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.p015ui.text.font.AndroidFont.TypefaceLoader
    @Nullable
    public Typeface loadBlocking(@NotNull Context context, @NotNull AndroidFont font) {
        AndroidPreloadedFont androidPreloadedFont;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidPreloadedFont) {
            androidPreloadedFont = (AndroidPreloadedFont) font;
        } else {
            androidPreloadedFont = null;
        }
        if (androidPreloadedFont == null) {
            return null;
        }
        return androidPreloadedFont.getTypefaceInternal();
    }
}

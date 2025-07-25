package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Font.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.PlatformFontLoader */
/* loaded from: classes.dex */
public interface PlatformFontLoader {
    @Nullable
    Object awaitLoad(@NotNull Font font, @NotNull Continuation<Object> continuation);

    @Nullable
    Object getCacheKey();

    @Nullable
    Object loadBlocking(@NotNull Font font);
}

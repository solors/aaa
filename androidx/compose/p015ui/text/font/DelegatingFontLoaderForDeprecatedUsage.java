package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.Font;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage */
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    @NotNull
    private final Object cacheKey;
    @NotNull
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(@NotNull Font.ResourceLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.loader = loader;
        this.cacheKey = new Object();
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font, @NotNull Continuation<Object> continuation) {
        return this.loader.load(font);
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @NotNull
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @NotNull
    public Object loadBlocking(@NotNull Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        return this.loader.load(font);
    }
}

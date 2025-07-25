package androidx.compose.p015ui.text.font;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontFamilyResolver.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverKt */
/* loaded from: classes.dex */
public final class FontFamilyResolverKt {
    @NotNull
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();
    @NotNull
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();

    @NotNull
    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }

    @NotNull
    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }

    public static /* synthetic */ void getGlobalAsyncTypefaceCache$annotations() {
    }
}

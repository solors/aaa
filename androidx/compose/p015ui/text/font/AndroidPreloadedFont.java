package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidPreloadedFont */
/* loaded from: classes.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public AndroidPreloadedFont() {
        super(FontLoadingStrategy.Companion.m109452getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, null);
    }

    @Nullable
    public abstract String getCacheKey();

    @Nullable
    public abstract Typeface getTypefaceInternal();
}

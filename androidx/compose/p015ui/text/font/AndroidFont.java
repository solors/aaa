package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFont.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFont */
/* loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    private final int loadingStrategy;
    @NotNull
    private final TypefaceLoader typefaceLoader;

    /* compiled from: AndroidFont.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.AndroidFont$TypefaceLoader */
    /* loaded from: classes.dex */
    public interface TypefaceLoader {
        @Nullable
        Object awaitLoad(@NotNull Context context, @NotNull AndroidFont androidFont, @NotNull Continuation<? super Typeface> continuation);

        @Nullable
        Typeface loadBlocking(@NotNull Context context, @NotNull AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader);
    }

    @Override // androidx.compose.p015ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ  reason: not valid java name */
    public final int mo109409getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    @NotNull
    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader) {
        this.loadingStrategy = i;
        this.typefaceLoader = typefaceLoader;
    }
}

package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p015ui.text.font.AndroidFont;
import androidx.compose.p015ui.text.font.FontLoadingStrategy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader */
/* loaded from: classes.dex */
public final class AndroidFontLoader implements PlatformFontLoader {
    @Nullable
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font, @NotNull Continuation<? super Typeface> continuation) {
        Object loadAsync;
        Object m6959e;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.awaitLoad(context, androidFont, continuation);
        } else if (font instanceof ResourceFont) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            loadAsync = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, continuation);
            m6959e = C42688d.m6959e();
            if (loadAsync == m6959e) {
                return loadAsync;
            }
            return (Typeface) loadAsync;
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.p015ui.text.font.PlatformFontLoader
    @Nullable
    public Typeface loadBlocking(@NotNull Font font) {
        Object m14549b;
        Typeface load;
        Typeface load2;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (font instanceof ResourceFont) {
            int mo109409getLoadingStrategyPKNRLFQ = font.mo109409getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m109447equalsimpl0(mo109409getLoadingStrategyPKNRLFQ, companion.m109452getBlockingPKNRLFQ())) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                load2 = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
                return load2;
            } else if (FontLoadingStrategy.m109447equalsimpl0(mo109409getLoadingStrategyPKNRLFQ, companion.m109453getOptionalLocalPKNRLFQ())) {
                try {
                    Result.C38506a c38506a = Result.f101870c;
                    Context context3 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context3, "context");
                    load = AndroidFontLoader_androidKt.load((ResourceFont) font, context3);
                    m14549b = Result.m14549b(load);
                } catch (Throwable th) {
                    Result.C38506a c38506a2 = Result.f101870c;
                    m14549b = Result.m14549b(C38508r.m14540a(th));
                }
                return Result.m14544g(m14549b) ? null : m14549b;
            } else if (FontLoadingStrategy.m109447equalsimpl0(mo109409getLoadingStrategyPKNRLFQ, companion.m109451getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m109449toStringimpl(font.mo109409getLoadingStrategyPKNRLFQ())));
            }
        }
        return null;
    }
}

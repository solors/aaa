package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContentAlpha.kt */
@Metadata
/* loaded from: classes.dex */
public final class ContentAlphaKt {
    @NotNull
    private static final ProvidableCompositionLocal<Float> LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default(null, ContentAlphaKt$LocalContentAlpha$1.INSTANCE, 1, null);

    @NotNull
    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}

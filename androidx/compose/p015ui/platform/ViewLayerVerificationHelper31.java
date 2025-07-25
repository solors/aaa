package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewLayer.android.kt */
@RequiresApi(31)
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewLayerVerificationHelper31 */
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper31 {
    @NotNull
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    @DoNotInline
    public final void setRenderEffect(@NotNull View view, @Nullable RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        view.setRenderEffect(renderEffect2);
    }
}

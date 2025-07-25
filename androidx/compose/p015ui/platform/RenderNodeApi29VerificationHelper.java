package androidx.compose.p015ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RenderNodeApi29.android.kt */
@RequiresApi(31)
@Metadata
/* renamed from: androidx.compose.ui.platform.RenderNodeApi29VerificationHelper */
/* loaded from: classes.dex */
final class RenderNodeApi29VerificationHelper {
    @NotNull
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    @DoNotInline
    public final void setRenderEffect(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        renderNode.setRenderEffect(renderEffect2);
    }
}

package androidx.compose.p015ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderNodeApi23.android.kt */
@RequiresApi(24)
@Metadata
/* renamed from: androidx.compose.ui.platform.RenderNodeVerificationHelper24 */
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper24 {
    @NotNull
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    @DoNotInline
    public final void discardDisplayList(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}

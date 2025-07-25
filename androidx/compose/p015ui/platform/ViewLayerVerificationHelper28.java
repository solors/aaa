package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewLayer.android.kt */
@RequiresApi(28)
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewLayerVerificationHelper28 */
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper28 {
    @NotNull
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    @DoNotInline
    public final void setOutlineAmbientShadowColor(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineAmbientShadowColor(i);
    }

    @DoNotInline
    public final void setOutlineSpotShadowColor(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineSpotShadowColor(i);
    }
}

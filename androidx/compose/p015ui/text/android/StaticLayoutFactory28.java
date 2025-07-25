package androidx.compose.p015ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticLayoutFactory.kt */
@RequiresApi(28)
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory28 */
/* loaded from: classes.dex */
final class StaticLayoutFactory28 {
    @NotNull
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    @DoNotInline
    public final void setUseLineSpacingFromFallbacks(@NotNull StaticLayout.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z);
    }
}

package androidx.compose.p015ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticLayoutFactory.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory26 */
/* loaded from: classes.dex */
final class StaticLayoutFactory26 {
    @NotNull
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    @DoNotInline
    public final void setJustificationMode(@NotNull StaticLayout.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setJustificationMode(i);
    }
}

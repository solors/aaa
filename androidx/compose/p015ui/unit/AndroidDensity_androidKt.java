package androidx.compose.p015ui.unit;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDensity.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.AndroidDensity_androidKt */
/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    @NotNull
    public static final Density Density(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return DensityKt.Density(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}

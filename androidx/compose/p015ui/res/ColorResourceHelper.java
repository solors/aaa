package androidx.compose.p015ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorResources.android.kt */
@RequiresApi(23)
@Metadata
/* renamed from: androidx.compose.ui.res.ColorResourceHelper */
/* loaded from: classes.dex */
final class ColorResourceHelper {
    @NotNull
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    @DoNotInline
    /* renamed from: getColor-WaAFU9c  reason: not valid java name */
    public final long m109263getColorWaAFU9c(@NotNull Context context, @ColorRes int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.Color(context.getResources().getColor(i, context.getTheme()));
    }
}

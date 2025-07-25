package androidx.compose.p015ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticLayoutFactory.kt */
@RequiresApi(23)
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory23 */
/* loaded from: classes.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.p015ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout create(@NotNull StaticLayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        obtain.setTextDirection(params.getTextDir());
        obtain.setAlignment(params.getAlignment());
        obtain.setMaxLines(params.getMaxLines());
        obtain.setEllipsize(params.getEllipsize());
        obtain.setEllipsizedWidth(params.getEllipsizedWidth());
        obtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        obtain.setIncludePad(params.getIncludePadding());
        obtain.setBreakStrategy(params.getBreakStrategy());
        obtain.setHyphenationFrequency(params.getHyphenationFrequency());
        obtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            StaticLayoutFactory26 staticLayoutFactory26 = StaticLayoutFactory26.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            staticLayoutFactory26.setJustificationMode(obtain, params.getJustificationMode());
        }
        if (i >= 28) {
            StaticLayoutFactory28 staticLayoutFactory28 = StaticLayoutFactory28.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(obtain, "this");
            staticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, params.getUseFallbackLineSpacing());
        }
        StaticLayout build = obtain.build();
        Intrinsics.checkNotNullExpressionValue(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}

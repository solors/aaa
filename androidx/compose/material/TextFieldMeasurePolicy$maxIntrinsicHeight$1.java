package androidx.compose.material;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextField.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$maxIntrinsicHeight$1 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
    public static final TextFieldMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new TextFieldMeasurePolicy$maxIntrinsicHeight$1();

    TextFieldMeasurePolicy$maxIntrinsicHeight$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Integer mo105910invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
        return invoke(intrinsicMeasurable, num.intValue());
    }

    @NotNull
    public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i));
    }
}

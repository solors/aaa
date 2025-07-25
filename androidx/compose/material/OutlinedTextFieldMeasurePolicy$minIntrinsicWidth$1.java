package androidx.compose.material;

import androidx.compose.p015ui.layout.IntrinsicMeasurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutlinedTextField.kt */
@Metadata
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {
    public static final OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 INSTANCE = new OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1();

    OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1() {
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
        return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i));
    }
}

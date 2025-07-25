package androidx.compose.p015ui.layout;

import be.C3396a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 */
/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    AlignmentLineKt$LastBaseline$1() {
        super(2, C3396a.class, "max", "max(II)I", 1);
    }

    @NotNull
    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Integer mo105910invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}

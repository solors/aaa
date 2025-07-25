package androidx.compose.p015ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$TextRangeSaver$2 extends Lambda implements Function1<Object, TextRange> {
    public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();

    SaversKt$TextRangeSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-VqIyPBM  reason: not valid java name */
    public final TextRange invoke(@NotNull Object it) {
        Integer num;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Integer num2 = null;
        if (obj != null) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        Intrinsics.m17074g(num);
        int intValue = num.intValue();
        Object obj2 = list.get(1);
        if (obj2 != null) {
            num2 = (Integer) obj2;
        }
        Intrinsics.m17074g(num2);
        return TextRange.m109370boximpl(TextRangeKt.TextRange(intValue, num2.intValue()));
    }
}

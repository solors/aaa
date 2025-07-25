package androidx.compose.p015ui.text;

import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.p015ui.unit.TextUnitKt;
import androidx.compose.p015ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {
    public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();

    SaversKt$TextUnitSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-XNhUCwk  reason: not valid java name */
    public final TextUnit invoke(@NotNull Object it) {
        Float f;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        TextUnitType textUnitType = null;
        if (obj != null) {
            f = (Float) obj;
        } else {
            f = null;
        }
        Intrinsics.m17074g(f);
        float floatValue = f.floatValue();
        Object obj2 = list.get(1);
        if (obj2 != null) {
            textUnitType = (TextUnitType) obj2;
        }
        Intrinsics.m17074g(textUnitType);
        return TextUnit.m109905boximpl(TextUnitKt.m109927TextUnitanM5pPY(floatValue, textUnitType.m109946unboximpl()));
    }
}

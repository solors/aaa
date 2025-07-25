package androidx.compose.p015ui.text;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    SaversKt$OffsetSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-x-9fifI  reason: not valid java name */
    public final Offset invoke(@NotNull Object it) {
        Float f;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m17075f(it, Boolean.FALSE)) {
            return Offset.m107280boximpl(Offset.Companion.m107306getUnspecifiedF1C5BW0());
        }
        List list = (List) it;
        Object obj = list.get(0);
        Float f2 = null;
        if (obj != null) {
            f = (Float) obj;
        } else {
            f = null;
        }
        Intrinsics.m17074g(f);
        float floatValue = f.floatValue();
        Object obj2 = list.get(1);
        if (obj2 != null) {
            f2 = (Float) obj2;
        }
        Intrinsics.m17074g(f2);
        return Offset.m107280boximpl(OffsetKt.Offset(floatValue, f2.floatValue()));
    }
}

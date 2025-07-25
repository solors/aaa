package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.BaselineShift;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1 */
/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$1 extends Lambda implements Function2<SaverScope, BaselineShift, Object> {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(SaverScope saverScope, BaselineShift baselineShift) {
        return m109337invoke8a2Sb4w(saverScope, baselineShift.m109597unboximpl());
    }

    @Nullable
    /* renamed from: invoke-8a2Sb4w  reason: not valid java name */
    public final Object m109337invoke8a2Sb4w(@NotNull SaverScope Saver, float f) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        return Float.valueOf(f);
    }
}

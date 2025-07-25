package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$2 extends Lambda implements Function1<Object, BaselineShift> {
    public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();

    SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-jTk7eUs  reason: not valid java name */
    public final BaselineShift invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BaselineShift.m109591boximpl(BaselineShift.m109592constructorimpl(((Float) it).floatValue()));
    }
}

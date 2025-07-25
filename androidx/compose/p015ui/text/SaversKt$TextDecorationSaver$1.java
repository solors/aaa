package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.TextDecoration;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1 */
/* loaded from: classes.dex */
final class SaversKt$TextDecorationSaver$1 extends Lambda implements Function2<SaverScope, TextDecoration, Object> {
    public static final SaversKt$TextDecorationSaver$1 INSTANCE = new SaversKt$TextDecorationSaver$1();

    SaversKt$TextDecorationSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull SaverScope Saver, @NotNull TextDecoration it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getMask());
    }
}

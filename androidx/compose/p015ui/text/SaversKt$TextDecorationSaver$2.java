package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$TextDecorationSaver$2 extends Lambda implements Function1<Object, TextDecoration> {
    public static final SaversKt$TextDecorationSaver$2 INSTANCE = new SaversKt$TextDecorationSaver$2();

    SaversKt$TextDecorationSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final TextDecoration invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextDecoration(((Integer) it).intValue());
    }
}

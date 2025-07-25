package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$LocaleSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$LocaleSaver$2 extends Lambda implements Function1<Object, Locale> {
    public static final SaversKt$LocaleSaver$2 INSTANCE = new SaversKt$LocaleSaver$2();

    SaversKt$LocaleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Locale invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Locale((String) it);
    }
}

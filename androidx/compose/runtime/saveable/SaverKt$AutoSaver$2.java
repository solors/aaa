package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Saver.kt */
@Metadata
/* loaded from: classes.dex */
final class SaverKt$AutoSaver$2 extends Lambda implements Function1<Object, Object> {
    public static final SaverKt$AutoSaver$2 INSTANCE = new SaverKt$AutoSaver$2();

    SaverKt$AutoSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}

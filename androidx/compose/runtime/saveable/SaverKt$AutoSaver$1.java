package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Saver.kt */
@Metadata
/* loaded from: classes.dex */
final class SaverKt$AutoSaver$1 extends Lambda implements Function2<SaverScope, Object, Object> {
    public static final SaverKt$AutoSaver$1 INSTANCE = new SaverKt$AutoSaver$1();

    SaverKt$AutoSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull SaverScope Saver, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        return obj;
    }
}

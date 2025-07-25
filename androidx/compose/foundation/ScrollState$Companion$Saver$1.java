package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, ScrollState, Integer> {
    public static final ScrollState$Companion$Saver$1 INSTANCE = new ScrollState$Companion$Saver$1();

    ScrollState$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Integer mo105910invoke(@NotNull SaverScope Saver, @NotNull ScrollState it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getValue());
    }
}

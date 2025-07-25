package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInsetsSize.kt */
@Metadata
/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsTopHeight$2 extends Lambda implements Function2<WindowInsets, Density, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsTopHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsTopHeight$2();

    WindowInsetsSizeKt$windowInsetsTopHeight$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Integer mo105910invoke(@NotNull WindowInsets $receiver, @NotNull Density it) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf($receiver.getTop(it));
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: WindowInsetsSize.kt */
@Metadata
/* loaded from: classes.dex */
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends Lambda implements InterfaceC45268n<WindowInsets, LayoutDirection, Density, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    @Override // p1076zd.InterfaceC45268n
    @NotNull
    public final Integer invoke(@NotNull WindowInsets $receiver, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        int right;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        if (layoutDirection == LayoutDirection.Ltr) {
            right = $receiver.getLeft(density, layoutDirection);
        } else {
            right = $receiver.getRight(density, layoutDirection);
        }
        return Integer.valueOf(right);
    }
}

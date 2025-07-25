package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.input.pointer.PointerType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$2 extends Lambda implements Function1<PointerInputChange, Boolean> {
    public static final ScrollableKt$pointerScrollable$2 INSTANCE = new ScrollableKt$pointerScrollable$2();

    ScrollableKt$pointerScrollable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull PointerInputChange down) {
        Intrinsics.checkNotNullParameter(down, "down");
        return Boolean.valueOf(!PointerType.m108964equalsimpl0(down.m108896getTypeT8wyACA(), PointerType.Companion.m108969getMouseT8wyACA()));
    }
}

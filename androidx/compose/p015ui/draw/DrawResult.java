package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.draw.DrawResult */
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;
    @NotNull
    private Function1<? super ContentDrawScope, Unit> block;

    public DrawResult(@NotNull Function1<? super ContentDrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @NotNull
    public final Function1<ContentDrawScope, Unit> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(@NotNull Function1<? super ContentDrawScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.block = function1;
    }
}

package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Vector.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VNode */
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    @Nullable
    private Functions<Unit> invalidateListener;

    private VNode() {
    }

    public /* synthetic */ VNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void draw(@NotNull DrawScope drawScope);

    @Nullable
    public Functions<Unit> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        Functions<Unit> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke();
        }
    }

    public void setInvalidateListener$ui_release(@Nullable Functions<Unit> functions) {
        this.invalidateListener = functions;
    }
}

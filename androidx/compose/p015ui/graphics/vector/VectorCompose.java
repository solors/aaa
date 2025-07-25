package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorApplier */
/* loaded from: classes.dex */
public final class VectorCompose extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorCompose(@NotNull VNode root) {
        super(root);
        Intrinsics.checkNotNullParameter(root, "root");
    }

    private final Vector asGroup(VNode vNode) {
        if (vNode instanceof Vector) {
            return (Vector) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        asGroup(getCurrent()).move(i, i2, i3);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        Vector asGroup = asGroup(getRoot());
        asGroup.remove(0, asGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        asGroup(getCurrent()).remove(i, i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        asGroup(getCurrent()).insertAt(i, instance);
    }
}

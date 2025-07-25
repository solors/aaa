package androidx.compose.p015ui.graphics.vector;

import ae.KMarkers;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageVector.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorGroup */
/* loaded from: classes.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, KMarkers {
    @NotNull
    private final List<VectorNode> children;
    @NotNull
    private final List<PathNode> clipPathData;
    @NotNull
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VectorGroup)) {
            return false;
        }
        VectorGroup vectorGroup = (VectorGroup) obj;
        if (!Intrinsics.m17075f(this.name, vectorGroup.name)) {
            return false;
        }
        if (this.rotation == vectorGroup.rotation) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.pivotX == vectorGroup.pivotX) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.pivotY == vectorGroup.pivotY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.scaleX == vectorGroup.scaleX) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.scaleY == vectorGroup.scaleY) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.translationX == vectorGroup.translationX) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.translationY == vectorGroup.translationY) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && Intrinsics.m17075f(this.clipPathData, vectorGroup.clipPathData) && Intrinsics.m17075f(this.children, vectorGroup.children)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final VectorNode get(int i) {
        return this.children.get(i);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }

    public /* synthetic */ VectorGroup(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? VectorKt.getEmptyPath() : list, (i & 512) != 0 ? C37563v.m17166m() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData, @NotNull List<? extends VectorNode> children) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.name = name;
        this.rotation = f;
        this.pivotX = f2;
        this.pivotY = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.clipPathData = clipPathData;
        this.children = children;
    }
}

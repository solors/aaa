package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Vector.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent */
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    @NotNull
    private final DrawCache cacheDrawScope;
    @NotNull
    private final Function1<DrawScope, Unit> drawVectorBlock;
    @NotNull
    private final SnapshotState intrinsicColorFilter$delegate;
    @NotNull
    private Functions<Unit> invalidateCallback;
    private boolean isDirty;
    private long previousDrawSize;
    @NotNull
    private final Vector root;
    private float viewportHeight;
    private float viewportWidth;

    public VectorComponent() {
        super(null);
        SnapshotState mutableStateOf$default;
        Vector vector = new Vector();
        vector.setPivotX(0.0f);
        vector.setPivotY(0.0f);
        vector.setInvalidateListener$ui_release(new VectorComponent$root$1$1(this));
        this.root = vector;
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.intrinsicColorFilter$delegate = mutableStateOf$default;
        this.previousDrawSize = Size.Companion.m107368getUnspecifiedNHjbRc();
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(@NotNull DrawScope drawScope, float f, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release();
        }
        if (this.isDirty || !Size.m107356equalsimpl0(this.previousDrawSize, drawScope.mo108021getSizeNHjbRc())) {
            this.root.setScaleX(Size.m107360getWidthimpl(drawScope.mo108021getSizeNHjbRc()) / this.viewportWidth);
            this.root.setScaleY(Size.m107357getHeightimpl(drawScope.mo108021getSizeNHjbRc()) / this.viewportHeight);
            this.cacheDrawScope.m108097drawCachedImageCJJARo(IntSizeKt.IntSize((int) Math.ceil(Size.m107360getWidthimpl(drawScope.mo108021getSizeNHjbRc())), (int) Math.ceil(Size.m107357getHeightimpl(drawScope.mo108021getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo108021getSizeNHjbRc();
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    @NotNull
    public final Functions<Unit> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    @NotNull
    public final String getName() {
        return this.root.getName();
    }

    @NotNull
    public final Vector getRoot() {
        return this.root;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@NotNull Functions<Unit> functions) {
        Intrinsics.checkNotNullParameter(functions, "<set-?>");
        this.invalidateCallback = functions;
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.root.setName(value);
    }

    public final void setViewportHeight(float f) {
        boolean z;
        if (this.viewportHeight == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.viewportHeight = f;
            doInvalidate();
        }
    }

    public final void setViewportWidth(float f) {
        boolean z;
        if (this.viewportWidth == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.viewportWidth = f;
            doInvalidate();
        }
    }

    @NotNull
    public String toString() {
        String str = "Params: \tname: " + getName() + "\n\tviewportWidth: " + this.viewportWidth + "\n\tviewportHeight: " + this.viewportHeight + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // androidx.compose.p015ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        draw(drawScope, 1.0f, null);
    }
}

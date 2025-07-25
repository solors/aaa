package androidx.compose.p015ui.geometry;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MutableRect.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.MutableRect */
/* loaded from: classes.dex */
public final class MutableRect {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m107278containsk4lQ0M(long j) {
        if (Offset.m107291getXimpl(j) >= this.left && Offset.m107291getXimpl(j) < this.right && Offset.m107292getYimpl(j) >= this.top && Offset.m107292getYimpl(j) < this.bottom) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m107279getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @Stable
    public final void intersect(float f, float f2, float f3, float f4) {
        this.left = Math.max(f, this.left);
        this.top = Math.max(f2, this.top);
        this.right = Math.min(f3, this.right);
        this.bottom = Math.min(f4, this.bottom);
    }

    public final boolean isEmpty() {
        if (this.left < this.right && this.top < this.bottom) {
            return false;
        }
        return true;
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + GeometryUtils.toStringAsFixed(this.left, 1) + ", " + GeometryUtils.toStringAsFixed(this.top, 1) + ", " + GeometryUtils.toStringAsFixed(this.right, 1) + ", " + GeometryUtils.toStringAsFixed(this.bottom, 1) + ')';
    }
}

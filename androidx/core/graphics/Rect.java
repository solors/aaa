package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.RectKt */
/* loaded from: classes.dex */
public final class Rect {
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final android.graphics.Rect and(@NotNull android.graphics.Rect rect, @NotNull android.graphics.Rect r) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.intersect(r);
        return rect2;
    }

    public static final int component1(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.left;
    }

    public static final int component2(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.top;
    }

    public static final int component3(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.right;
    }

    public static final int component4(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean contains(@NotNull android.graphics.Rect rect, @NotNull Point p) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return rect.contains(p.x, p.y);
    }

    @NotNull
    public static final Region minus(@NotNull android.graphics.Rect rect, @NotNull android.graphics.Rect r) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        Region region = new Region(rect);
        region.op(r, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    /* renamed from: or */
    public static final android.graphics.Rect m105056or(@NotNull android.graphics.Rect rect, @NotNull android.graphics.Rect r) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.union(r);
        return rect2;
    }

    @NotNull
    public static final android.graphics.Rect plus(@NotNull android.graphics.Rect rect, @NotNull android.graphics.Rect r) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.union(r);
        return rect2;
    }

    @NotNull
    public static final android.graphics.Rect times(@NotNull android.graphics.Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @NotNull
    public static final android.graphics.Rect toRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @NotNull
    public static final RectF toRectF(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect);
    }

    @NotNull
    public static final Region toRegion(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new Region(rect);
    }

    @NotNull
    public static final RectF transform(@NotNull RectF rectF, @NotNull Matrix m) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(m, "m");
        m.mapRect(rectF);
        return rectF;
    }

    @NotNull
    public static final Region xor(@NotNull android.graphics.Rect rect, @NotNull android.graphics.Rect r) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        Region region = new Region(rect);
        region.op(r, Region.Op.XOR);
        return region;
    }

    public static final float component1(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.bottom;
    }

    public static final boolean contains(@NotNull RectF rectF, @NotNull PointF p) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return rectF.contains(p.x, p.y);
    }

    @NotNull
    public static final Region toRegion(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF and(@NotNull RectF rectF, @NotNull RectF r) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.intersect(r);
        return rectF2;
    }

    @NotNull
    public static final Region minus(@NotNull RectF rectF, @NotNull RectF r) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        r.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    /* renamed from: or */
    public static final RectF m105055or(@NotNull RectF rectF, @NotNull RectF r) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r);
        return rectF2;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, @NotNull RectF r) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        RectF rectF2 = new RectF(rectF);
        rectF2.union(r);
        return rectF2;
    }

    @NotNull
    public static final Region xor(@NotNull RectF rectF, @NotNull RectF r) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        r.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @NotNull
    public static final android.graphics.Rect plus(@NotNull android.graphics.Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @NotNull
    public static final android.graphics.Rect plus(@NotNull android.graphics.Rect rect, @NotNull Point xy) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(xy.x, xy.y);
        return rect2;
    }

    @NotNull
    public static final android.graphics.Rect minus(@NotNull android.graphics.Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, @NotNull PointF xy) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(xy.x, xy.y);
        return rectF2;
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF, int i) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @NotNull
    public static final android.graphics.Rect minus(@NotNull android.graphics.Rect rect, @NotNull Point xy) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        rect2.offset(-xy.x, -xy.y);
        return rect2;
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF, @NotNull PointF xy) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(xy, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-xy.x, -xy.y);
        return rectF2;
    }
}

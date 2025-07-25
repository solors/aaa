package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.RegionKt */
/* loaded from: classes.dex */
public final class Region {
    @NotNull
    public static final android.graphics.Region and(@NotNull android.graphics.Region region, @NotNull Rect r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(@NotNull android.graphics.Region region, @NotNull Point p) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return region.contains(p.x, p.y);
    }

    public static final void forEach(@NotNull android.graphics.Region region, @NotNull Function1<? super Rect, Unit> action) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            }
            action.invoke(rect);
        }
    }

    @NotNull
    public static final Iterator<Rect> iterator(@NotNull android.graphics.Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        return new RegionKt$iterator$1(region);
    }

    @NotNull
    public static final android.graphics.Region minus(@NotNull android.graphics.Region region, @NotNull Rect r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region not(@NotNull android.graphics.Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    /* renamed from: or */
    public static final android.graphics.Region m105054or(@NotNull android.graphics.Region region, @NotNull Rect r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(r);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region plus(@NotNull android.graphics.Region region, @NotNull Rect r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.union(r);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region unaryMinus(@NotNull android.graphics.Region region) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        android.graphics.Region region2 = new android.graphics.Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region xor(@NotNull android.graphics.Region region, @NotNull Rect r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.XOR);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region and(@NotNull android.graphics.Region region, @NotNull android.graphics.Region r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.INTERSECT);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region minus(@NotNull android.graphics.Region region, @NotNull android.graphics.Region r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.DIFFERENCE);
        return region2;
    }

    @NotNull
    /* renamed from: or */
    public static final android.graphics.Region m105053or(@NotNull android.graphics.Region region, @NotNull android.graphics.Region r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.UNION);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region plus(@NotNull android.graphics.Region region, @NotNull android.graphics.Region r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.UNION);
        return region2;
    }

    @NotNull
    public static final android.graphics.Region xor(@NotNull android.graphics.Region region, @NotNull android.graphics.Region r) {
        Intrinsics.checkNotNullParameter(region, "<this>");
        Intrinsics.checkNotNullParameter(r, "r");
        android.graphics.Region region2 = new android.graphics.Region(region);
        region2.op(r, Region.Op.XOR);
        return region2;
    }
}

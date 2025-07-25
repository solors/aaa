package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.graphics.PathKt */
/* loaded from: classes.dex */
public final class Path {
    @RequiresApi(19)
    @NotNull
    public static final android.graphics.Path and(@NotNull android.graphics.Path path, @NotNull android.graphics.Path p) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path();
        path2.op(path, p, Path.Op.INTERSECT);
        return path2;
    }

    @RequiresApi(26)
    @NotNull
    public static final Iterable<PathSegment> flatten(@NotNull android.graphics.Path path, float f) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f);
        Intrinsics.checkNotNullExpressionValue(flatten, "flatten(this, error)");
        return flatten;
    }

    public static /* synthetic */ Iterable flatten$default(android.graphics.Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    @RequiresApi(19)
    @NotNull
    public static final android.graphics.Path minus(@NotNull android.graphics.Path path, @NotNull android.graphics.Path p) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, Path.Op.DIFFERENCE);
        return path2;
    }

    @RequiresApi(19)
    @NotNull
    /* renamed from: or */
    public static final android.graphics.Path m105057or(@NotNull android.graphics.Path path, @NotNull android.graphics.Path p) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    @NotNull
    public static final android.graphics.Path plus(@NotNull android.graphics.Path path, @NotNull android.graphics.Path p) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, Path.Op.UNION);
        return path2;
    }

    @RequiresApi(19)
    @NotNull
    public static final android.graphics.Path xor(@NotNull android.graphics.Path path, @NotNull android.graphics.Path p) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        android.graphics.Path path2 = new android.graphics.Path(path);
        path2.op(p, Path.Op.XOR);
        return path2;
    }
}

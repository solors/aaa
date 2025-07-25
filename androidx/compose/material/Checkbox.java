package androidx.compose.material;

import androidx.compose.p015ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p015ui.graphics.AndroidPath_androidKt;
import androidx.compose.p015ui.graphics.Path;
import androidx.compose.p015ui.graphics.PathMeasure;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
@Metadata
/* renamed from: androidx.compose.material.CheckDrawingCache */
/* loaded from: classes.dex */
public final class Checkbox {
    @NotNull
    private final Path checkPath;
    @NotNull
    private final PathMeasure pathMeasure;
    @NotNull
    private final Path pathToDraw;

    public Checkbox() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final Path getCheckPath() {
        return this.checkPath;
    }

    @NotNull
    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    @NotNull
    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public Checkbox(@NotNull Path checkPath, @NotNull PathMeasure pathMeasure, @NotNull Path pathToDraw) {
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.checkPath = checkPath;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = pathToDraw;
    }

    public /* synthetic */ Checkbox(Path path, PathMeasure pathMeasure, Path path2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}

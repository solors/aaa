package androidx.compose.p015ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidPathMeasure.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidPathMeasure */
/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {
    @NotNull
    private final PathMeasure internalPathMeasure;

    public AndroidPathMeasure(@NotNull PathMeasure internalPathMeasure) {
        Intrinsics.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.internalPathMeasure = internalPathMeasure;
    }

    @Override // androidx.compose.p015ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.p015ui.graphics.PathMeasure
    public boolean getSegment(float f, float f2, @NotNull Path destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) destination).getInternalPath(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p015ui.graphics.PathMeasure
    public void setPath(@Nullable Path path, boolean z) {
        Path path2;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path != null) {
            if (path instanceof AndroidPath) {
                path2 = ((AndroidPath) path).getInternalPath();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path2 = null;
        }
        pathMeasure.setPath(path2, z);
    }
}

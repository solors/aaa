package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathMeasure.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.PathMeasure */
/* loaded from: classes.dex */
public interface PathMeasure {

    /* compiled from: PathMeasure.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PathMeasure$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                z = true;
            }
            return pathMeasure.getSegment(f, f2, path, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
    }

    float getLength();

    boolean getSegment(float f, float f2, @NotNull Path path, boolean z);

    void setPath(@Nullable Path path, boolean z);
}

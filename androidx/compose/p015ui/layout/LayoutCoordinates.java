package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Rect;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutCoordinates.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutCoordinates */
/* loaded from: classes.dex */
public interface LayoutCoordinates {

    /* compiled from: LayoutCoordinates.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.LayoutCoordinates$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    int get(@NotNull AlignmentLine alignmentLine);

    @Nullable
    LayoutCoordinates getParentCoordinates();

    @Nullable
    LayoutCoordinates getParentLayoutCoordinates();

    @NotNull
    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo109022getSizeYbymL2g();

    boolean isAttached();

    @NotNull
    Rect localBoundingBoxOf(@NotNull LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A  reason: not valid java name */
    long mo109023localPositionOfR5De75A(@NotNull LayoutCoordinates layoutCoordinates, long j);

    /* renamed from: localToRoot-MK-Hz9U  reason: not valid java name */
    long mo109024localToRootMKHz9U(long j);

    /* renamed from: localToWindow-MK-Hz9U  reason: not valid java name */
    long mo109025localToWindowMKHz9U(long j);

    /* renamed from: windowToLocal-MK-Hz9U  reason: not valid java name */
    long mo109026windowToLocalMKHz9U(long j);
}

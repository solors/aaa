package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyMeasuredItem.kt */
@Metadata
/* loaded from: classes.dex */
public final class LazyGridPlaceableWrapper {
    private final long offset;
    @Nullable
    private final Object parentData;
    @NotNull
    private final Placeable placeable;

    public /* synthetic */ LazyGridPlaceableWrapper(long j, Placeable placeable, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, placeable, obj);
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m106495getOffsetnOccac() {
        return this.offset;
    }

    @Nullable
    public final Object getParentData() {
        return this.parentData;
    }

    @NotNull
    public final Placeable getPlaceable() {
        return this.placeable;
    }

    private LazyGridPlaceableWrapper(long j, Placeable placeable, Object obj) {
        this.offset = j;
        this.placeable = placeable;
        this.parentData = obj;
    }
}

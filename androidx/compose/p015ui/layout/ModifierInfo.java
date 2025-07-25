package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.layout.ModifierInfo */
/* loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;
    @NotNull
    private final LayoutCoordinates coordinates;
    @Nullable
    private final Object extra;
    @NotNull
    private final Modifier modifier;

    public ModifierInfo(@NotNull Modifier modifier, @NotNull LayoutCoordinates coordinates, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.modifier = modifier;
        this.coordinates = coordinates;
        this.extra = obj;
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final Object getExtra() {
        return this.extra;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i & 4) != 0 ? null : obj);
    }
}

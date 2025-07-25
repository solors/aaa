package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnPlacedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnPlacedModifierImpl */
/* loaded from: classes.dex */
final class OnPlacedModifierImpl extends InspectorValueInfo implements OnPlacedModifier {
    @NotNull
    private final Function1<LayoutCoordinates, Unit> callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedModifierImpl(@NotNull Function1<? super LayoutCoordinates, Unit> callback, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.callback = callback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPlacedModifierImpl)) {
            return false;
        }
        return Intrinsics.m17075f(this.callback, ((OnPlacedModifierImpl) obj).callback);
    }

    @NotNull
    public final Function1<LayoutCoordinates, Unit> getCallback() {
        return this.callback;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(coordinates);
    }
}

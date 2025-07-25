package androidx.compose.foundation.relocation;

import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.OnPlacedModifier;
import androidx.compose.p015ui.modifier.ModifierLocalConsumer;
import androidx.compose.p015ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewChildModifier */
/* loaded from: classes.dex */
public abstract class BringIntoView implements ModifierLocalConsumer, OnPlacedModifier {
    @NotNull
    private final BringIntoViewParent defaultParent;
    @Nullable
    private LayoutCoordinates layoutCoordinates;
    @Nullable
    private BringIntoViewParent localParent;

    public BringIntoView(@NotNull BringIntoViewParent defaultParent) {
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
        this.defaultParent = defaultParent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final BringIntoViewParent getParent() {
        BringIntoViewParent bringIntoViewParent = this.localParent;
        if (bringIntoViewParent == null) {
            return this.defaultParent;
        }
        return bringIntoViewParent;
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.localParent = (BringIntoViewParent) scope.getCurrent(BringIntoViewKt.getModifierLocalBringIntoViewParent());
    }

    @Override // androidx.compose.p015ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
    }
}

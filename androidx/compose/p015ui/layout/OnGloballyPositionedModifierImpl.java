package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifierImpl */
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierImpl extends InspectorValueInfo implements OnGloballyPositionedModifier {
    @NotNull
    private final Function1<LayoutCoordinates, Unit> callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedModifierImpl(@NotNull Function1<? super LayoutCoordinates, Unit> callback, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.callback = callback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedModifierImpl)) {
            return false;
        }
        return Intrinsics.m17075f(this.callback, ((OnGloballyPositionedModifierImpl) obj).callback);
    }

    @NotNull
    public final Function1<LayoutCoordinates, Unit> getCallback() {
        return this.callback;
    }

    public int hashCode() {
        return this.callback.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.callback.invoke(coordinates);
    }
}

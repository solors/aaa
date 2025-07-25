package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnSizeChangedModifier */
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    @NotNull
    private final Function1<IntSize, Unit> onSizeChanged;
    private long previousSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(@NotNull Function1<? super IntSize, Unit> onSizeChanged, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.onSizeChanged = onSizeChanged;
        this.previousSize = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return Intrinsics.m17075f(this.onSizeChanged, ((OnSizeChangedModifier) obj).onSizeChanged);
    }

    @NotNull
    public final Function1<IntSize, Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // androidx.compose.p015ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo106147onRemeasuredozmzZPI(long j) {
        if (!IntSize.m109892equalsimpl0(this.previousSize, j)) {
            this.onSizeChanged.invoke(IntSize.m109886boximpl(j));
            this.previousSize = j;
        }
    }
}

package androidx.compose.p015ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InspectableValue.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.InspectorValueInfo */
/* loaded from: classes.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    @Nullable
    private InspectorInfo _values;
    @NotNull
    private final Function1<InspectorInfo, Unit> info;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectorValueInfo(@NotNull Function1<? super InspectorInfo, Unit> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    @NotNull
    public Sequence<ValueElement> getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    @Nullable
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.p015ui.platform.InspectableValue
    @Nullable
    public Object getValueOverride() {
        return getValues().getValue();
    }
}

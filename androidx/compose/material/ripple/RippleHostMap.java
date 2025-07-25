package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleContainer.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class RippleHostMap {
    @NotNull
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();
    @NotNull
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    @Nullable
    public final RippleHostView get(@NotNull AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void remove(@NotNull AndroidRippleIndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.indicationToHostMap.get(indicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void set(@NotNull AndroidRippleIndicationInstance indicationInstance, @NotNull RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }

    @Nullable
    public final AndroidRippleIndicationInstance get(@NotNull RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return this.hostToIndicationMap.get(rippleHostView);
    }
}

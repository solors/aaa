package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.CustomAccessibilityAction */
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    @NotNull
    private final Functions<Boolean> action;
    @NotNull
    private final String label;

    public CustomAccessibilityAction(@NotNull String label, @NotNull Functions<Boolean> action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.label = label;
        this.action = action;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        if (Intrinsics.m17075f(this.label, customAccessibilityAction.label) && Intrinsics.m17075f(this.action, customAccessibilityAction.action)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Functions<Boolean> getAction() {
        return this.action;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}

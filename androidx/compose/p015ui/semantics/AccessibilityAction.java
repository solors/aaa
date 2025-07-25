package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38498g;

/* compiled from: SemanticsProperties.kt */
@StabilityInferred(parameters = 1)
@Metadata
/* renamed from: androidx.compose.ui.semantics.AccessibilityAction */
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends InterfaceC38498g<? extends Boolean>> {
    public static final int $stable = 0;
    @Nullable
    private final T action;
    @Nullable
    private final String label;

    public AccessibilityAction(@Nullable String str, @Nullable T t) {
        this.label = str;
        this.action = t;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (Intrinsics.m17075f(this.label, accessibilityAction.label) && Intrinsics.m17075f(this.action, accessibilityAction.action)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final T getAction() {
        return this.action;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i;
        String str = this.label;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.action;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}

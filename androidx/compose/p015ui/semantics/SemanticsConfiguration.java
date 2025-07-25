package androidx.compose.p015ui.semantics;

import ae.KMarkers;
import androidx.compose.p015ui.platform.JvmActuals_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38498g;

/* compiled from: SemanticsConfiguration.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsConfiguration */
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, KMarkers {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    @NotNull
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final void collapsePeer$ui_release(@NotNull SemanticsConfiguration peer) {
        Intrinsics.checkNotNullParameter(peer, "peer");
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : peer.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.props.containsKey(key)) {
                this.props.put(key, value);
            } else if (value instanceof AccessibilityAction) {
                Object obj = this.props.get(key);
                if (obj != null) {
                    AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                    Map<SemanticsPropertyKey<?>, Object> map = this.props;
                    String label = accessibilityAction.getLabel();
                    if (label == null) {
                        label = ((AccessibilityAction) value).getLabel();
                    }
                    InterfaceC38498g action = accessibilityAction.getAction();
                    if (action == null) {
                        action = ((AccessibilityAction) value).getAction();
                    }
                    map.put(key, new AccessibilityAction(label, action));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                }
            } else {
                continue;
            }
        }
    }

    public final <T> boolean contains(@NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.props.containsKey(key);
    }

    @NotNull
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.putAll(this.props);
        return semanticsConfiguration;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        if (Intrinsics.m17075f(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics) {
            return true;
        }
        return false;
    }

    public final <T> T get(@NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.props.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(@NotNull SemanticsPropertyKey<T> key, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.props.get(key);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    @Nullable
    public final <T> T getOrElseNullable(@NotNull SemanticsPropertyKey<T> key, @NotNull Functions<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.props.get(key);
        if (t == null) {
            return defaultValue.invoke();
        }
        return t;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        return this.props.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@NotNull SemanticsConfiguration child) {
        Intrinsics.checkNotNullParameter(child, "child");
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : child.props.entrySet()) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Object merge = key.merge(this.props.get(key), entry.getValue());
            if (merge != null) {
                this.props.put(key, merge);
            }
        }
    }

    @Override // androidx.compose.p015ui.semantics.SemanticsPropertyReceiver
    public <T> void set(@NotNull SemanticsPropertyKey<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.props.put(key, t);
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<SemanticsPropertyKey<?>, Object> entry : this.props.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(entry.getKey().getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb2) + " }";
    }
}

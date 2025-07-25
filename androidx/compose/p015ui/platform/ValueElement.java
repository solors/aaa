package androidx.compose.p015ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InspectableValue.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.ValueElement */
/* loaded from: classes.dex */
public final class ValueElement {
    public static final int $stable = 8;
    @NotNull
    private final String name;
    @Nullable
    private final Object value;

    public ValueElement(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = valueElement.name;
        }
        if ((i & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final Object component2() {
        return this.value;
    }

    @NotNull
    public final ValueElement copy(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ValueElement(name, obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        if (Intrinsics.m17075f(this.name, valueElement.name) && Intrinsics.m17075f(this.value, valueElement.value)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        Object obj = this.value;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}

package androidx.compose.p015ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InspectableValue.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.InspectorInfo */
/* loaded from: classes.dex */
public final class InspectorInfo {
    public static final int $stable = 8;
    @Nullable
    private String name;
    @NotNull
    private final ValueElementSequence properties = new ValueElementSequence();
    @Nullable
    private Object value;

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
    }
}

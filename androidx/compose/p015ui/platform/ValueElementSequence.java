package androidx.compose.p015ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InspectableValue.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.platform.ValueElementSequence */
/* loaded from: classes.dex */
public final class ValueElementSequence implements Sequence<ValueElement> {
    public static final int $stable = 8;
    @NotNull
    private final List<ValueElement> elements = new ArrayList();

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(@NotNull String name, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.elements.add(new ValueElement(name, obj));
    }
}

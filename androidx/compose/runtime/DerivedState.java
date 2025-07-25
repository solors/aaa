package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateObject;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DerivedState.kt */
@Metadata
/* loaded from: classes.dex */
public interface DerivedState<T> extends State<T> {
    T getCurrentValue();

    @NotNull
    Set<StateObject> getDependencies();
}

package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateRegistryOwner.kt */
@Metadata
/* loaded from: classes2.dex */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    @NotNull
    SavedStateRegistry getSavedStateRegistry();
}

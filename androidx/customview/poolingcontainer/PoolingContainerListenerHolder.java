package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PoolingContainer.kt */
@Metadata
/* loaded from: classes.dex */
public final class PoolingContainerListenerHolder {
    @NotNull
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(@NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        int m17164o;
        for (m17164o = C37563v.m17164o(this.listeners); -1 < m17164o; m17164o--) {
            this.listeners.get(m17164o).onRelease();
        }
    }

    public final void removeListener(@NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }
}

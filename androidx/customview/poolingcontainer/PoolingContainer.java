package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PoolingContainer.kt */
@Metadata
/* loaded from: classes.dex */
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = C1731R.C1732id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = C1731R.C1732id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@NotNull View view, @NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).addListener(listener);
    }

    public static final void callPoolingContainerOnRelease(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (View view2 : ViewKt.getAllViews(view)) {
            getPoolingContainerListenerHolder(view2).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        for (View view : androidx.core.view.ViewGroup.getChildren(viewGroup)) {
            getPoolingContainerListenerHolder(view).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder == null) {
            PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
            view.setTag(i, poolingContainerListenerHolder2);
            return poolingContainerListenerHolder2;
        }
        return poolingContainerListenerHolder;
    }

    public static final boolean isPoolingContainer(@NotNull View view) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (ViewParent viewParent : ViewKt.getAncestors(view)) {
            if ((viewParent instanceof View) && isPoolingContainer((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@NotNull View view, @NotNull PoolingContainerListener listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(listener);
    }

    public static final void setPoolingContainer(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z));
    }
}

package androidx.customview.poolingcontainer;

import androidx.annotation.UiThread;
import kotlin.Metadata;

/* compiled from: PoolingContainer.kt */
@Metadata
/* loaded from: classes.dex */
public interface PoolingContainerListener {
    @UiThread
    void onRelease();
}

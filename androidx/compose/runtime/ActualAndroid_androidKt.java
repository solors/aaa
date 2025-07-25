package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: ActualAndroid.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActualAndroid_androidKt {
    @NotNull
    private static final InterfaceC38501j DefaultMonotonicFrameClock$delegate;
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.INSTANCE);
        DefaultMonotonicFrameClock$delegate = m14554a;
    }

    @NotNull
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, @NotNull SnapshotMutationPolicy<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        return new ParcelableSnapshotMutableState(t, policy);
    }

    @NotNull
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}

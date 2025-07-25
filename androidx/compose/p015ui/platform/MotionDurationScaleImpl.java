package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.MotionDurationScale;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowRecomposer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.MotionDurationScaleImpl */
/* loaded from: classes.dex */
public final class MotionDurationScaleImpl implements MotionDurationScale {
    @NotNull
    private final SnapshotState scaleFactor$delegate;

    public MotionDurationScaleImpl() {
        SnapshotState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.scaleFactor$delegate = mutableStateOf$default;
    }

    @Override // androidx.compose.p015ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, function2);
    }

    @Override // androidx.compose.p015ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) MotionDurationScale.DefaultImpls.get(this, interfaceC37576b);
    }

    @Override // androidx.compose.p015ui.MotionDurationScale
    public float getScaleFactor() {
        return ((Number) this.scaleFactor$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.p015ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return MotionDurationScale.DefaultImpls.minusKey(this, interfaceC37576b);
    }

    @Override // androidx.compose.p015ui.MotionDurationScale, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
    }

    public void setScaleFactor(float f) {
        this.scaleFactor$delegate.setValue(Float.valueOf(f));
    }
}

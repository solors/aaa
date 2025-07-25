package androidx.compose.p015ui.platform;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInfo.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.WindowInfoImpl */
/* loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    @NotNull
    private final SnapshotState<Boolean> _isWindowFocused;

    public WindowInfoImpl() {
        SnapshotState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this._isWindowFocused = mutableStateOf$default;
    }

    @Override // androidx.compose.p015ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    public void setWindowFocused(boolean z) {
        this._isWindowFocused.setValue(Boolean.valueOf(z));
    }
}

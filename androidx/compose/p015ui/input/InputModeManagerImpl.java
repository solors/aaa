package androidx.compose.p015ui.input;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputModeManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.InputModeManagerImpl */
/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    @NotNull
    private final SnapshotState inputMode$delegate;
    @NotNull
    private final Function1<InputMode, Boolean> onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    @Override // androidx.compose.p015ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo108160getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m108157unboximpl();
    }

    @Override // androidx.compose.p015ui.input.InputModeManager
    @ExperimentalComposeUiApi
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo108161requestInputModeiuPiT84(int i) {
        return this.onRequestInputModeChange.invoke(InputMode.m108151boximpl(i)).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84  reason: not valid java name */
    public void m108162setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m108151boximpl(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InputModeManagerImpl(int i, Function1<? super InputMode, Boolean> function1) {
        SnapshotState mutableStateOf$default;
        this.onRequestInputModeChange = function1;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m108151boximpl(i), null, 2, null);
        this.inputMode$delegate = mutableStateOf$default;
    }
}

package androidx.compose.p015ui.focus;

import kotlin.Metadata;

/* compiled from: FocusManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusManager */
/* loaded from: classes.dex */
public interface FocusManager {

    /* compiled from: FocusManager.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusManager$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            focusManager.clearFocus(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }

    void clearFocus(boolean z);

    /* renamed from: moveFocus-3ESFkO8  reason: not valid java name */
    boolean mo107241moveFocus3ESFkO8(int i);
}

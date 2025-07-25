package androidx.compose.p015ui.hapticfeedback;

import android.view.View;
import androidx.compose.p015ui.hapticfeedback.HapticFeedbackType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformHapticFeedback.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.hapticfeedback.PlatformHapticFeedback */
/* loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    @NotNull
    private final View view;

    public PlatformHapticFeedback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.p015ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo108139performHapticFeedbackCdsT49E(int i) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m108143equalsimpl0(i, companion.m108147getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m108143equalsimpl0(i, companion.m108148getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}

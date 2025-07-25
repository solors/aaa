package androidx.compose.p015ui.hapticfeedback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformHapticFeedback.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType */
/* loaded from: classes.dex */
public final class PlatformHapticFeedbackType {
    @NotNull
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();
    private static final int LongPress = HapticFeedbackType.m108141constructorimpl(0);
    private static final int TextHandleMove = HapticFeedbackType.m108141constructorimpl(9);

    private PlatformHapticFeedbackType() {
    }

    /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
    public final int m108149getLongPress5zf0vsI() {
        return LongPress;
    }

    /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
    public final int m108150getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}

package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.PointerEvent;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidScrollable.android.kt */
@Metadata
/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {
    @NotNull
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE  reason: not valid java name */
    public long mo106144calculateMouseWheelScroll8xgXZGE(@NotNull Density calculateMouseWheelScroll, @NotNull PointerEvent event, long j) {
        Intrinsics.checkNotNullParameter(calculateMouseWheelScroll, "$this$calculateMouseWheelScroll");
        Intrinsics.checkNotNullParameter(event, "event");
        List<PointerInputChange> changes = event.getChanges();
        Offset m107280boximpl = Offset.m107280boximpl(Offset.Companion.m107307getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m107280boximpl = Offset.m107280boximpl(Offset.m107296plusMKHz9U(m107280boximpl.m107301unboximpl(), changes.get(i).m108895getScrollDeltaF1C5BW0()));
        }
        return Offset.m107298timestuRUvjQ(m107280boximpl.m107301unboximpl(), -calculateMouseWheelScroll.mo106214toPx0680j_4(C1059Dp.m109734constructorimpl(64)));
    }
}

package androidx.compose.p015ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: SuspendingPointerInputFilter.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException */
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 0;

    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}

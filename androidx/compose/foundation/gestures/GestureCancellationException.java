package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: ForEachGesture.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 0;

    public GestureCancellationException() {
        this(null, 1, null);
    }

    public GestureCancellationException(@Nullable String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

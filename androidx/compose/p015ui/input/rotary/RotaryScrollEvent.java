package androidx.compose.p015ui.input.rotary;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.input.focus.FocusAwareEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RotaryScrollEvent.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.input.rotary.RotaryScrollEvent */
/* loaded from: classes.dex */
public final class RotaryScrollEvent implements FocusAwareEvent {
    public static final int $stable = 0;
    private final float horizontalScrollPixels;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    public RotaryScrollEvent(float f, float f2, long j) {
        this.verticalScrollPixels = f;
        this.horizontalScrollPixels = f2;
        this.uptimeMillis = j;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        if (rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || rotaryScrollEvent.uptimeMillis != this.uptimeMillis) {
            return false;
        }
        return true;
    }

    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public int hashCode() {
        return ((((0 + Float.hashCode(this.verticalScrollPixels)) * 31) + Float.hashCode(this.horizontalScrollPixels)) * 31) + Long.hashCode(this.uptimeMillis);
    }

    @NotNull
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.verticalScrollPixels + ",horizontalScrollPixels=" + this.horizontalScrollPixels + ",uptimeMillis=" + this.uptimeMillis + ')';
    }
}

package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Immutable
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.HistoricalChange */
/* loaded from: classes.dex */
public final class HistoricalChange {
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m108825getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @NotNull
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m107299toStringimpl(this.position)) + ')';
    }

    private HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
    }
}

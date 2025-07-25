package androidx.compose.p015ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PointerEvent.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.ConsumedData */
/* loaded from: classes.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private boolean downChange;
    private boolean positionChange;

    public ConsumedData() {
        this(false, false, 3, null);
    }

    public final boolean getDownChange() {
        return this.downChange;
    }

    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void setDownChange(boolean z) {
        this.downChange = z;
    }

    public final void setPositionChange(boolean z) {
        this.positionChange = z;
    }

    public ConsumedData(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ void getDownChange$annotations() {
    }

    public static /* synthetic */ void getPositionChange$annotations() {
    }
}

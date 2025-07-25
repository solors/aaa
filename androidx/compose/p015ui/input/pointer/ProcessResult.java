package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.ProcessResult */
/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ProcessResult m108975boximpl(int i) {
        return new ProcessResult(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108977equalsimpl(int i, Object obj) {
        if (!(obj instanceof ProcessResult) || i != ((ProcessResult) obj).m108983unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108978equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: getAnyMovementConsumed-impl  reason: not valid java name */
    public static final boolean m108979getAnyMovementConsumedimpl(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl  reason: not valid java name */
    public static final boolean m108980getDispatchedToAPointerInputModifierimpl(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108981hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108982toStringimpl(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m108977equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108981hashCodeimpl(this.value);
    }

    public String toString() {
        return m108982toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108983unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108976constructorimpl(int i) {
        return i;
    }
}

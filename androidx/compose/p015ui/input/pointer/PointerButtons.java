package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerButtons */
/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerButtons m108830boximpl(int i) {
        return new PointerButtons(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108832equalsimpl(int i, Object obj) {
        if (!(obj instanceof PointerButtons) || i != ((PointerButtons) obj).m108836unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108833equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108834hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108835toStringimpl(int i) {
        return "PointerButtons(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m108832equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m108834hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m108835toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108836unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108831constructorimpl(int i) {
        return i;
    }
}

package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerKeyboardModifiers */
/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m108954boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108956equalsimpl(int i, Object obj) {
        if (!(obj instanceof PointerKeyboardModifiers) || i != ((PointerKeyboardModifiers) obj).m108960unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108957equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108958hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108959toStringimpl(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m108956equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m108958hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m108959toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108960unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m108955constructorimpl(int i) {
        return i;
    }
}

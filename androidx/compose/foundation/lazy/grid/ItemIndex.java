package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: ItemIndex.kt */
@Metadata
/* loaded from: classes.dex */
public final class ItemIndex {
    private final int value;

    private /* synthetic */ ItemIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ItemIndex m106462boximpl(int i) {
        return new ItemIndex(i);
    }

    /* renamed from: compareTo-YGsSkvE  reason: not valid java name */
    public static final int m106463compareToYGsSkvE(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-VZbfaAc  reason: not valid java name */
    public static final int m106465decVZbfaAc(int i) {
        return m106464constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106466equalsimpl(int i, Object obj) {
        if (!(obj instanceof ItemIndex) || i != ((ItemIndex) obj).m106474unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106467equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106468hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-VZbfaAc  reason: not valid java name */
    public static final int m106469incVZbfaAc(int i) {
        return m106464constructorimpl(i + 1);
    }

    /* renamed from: minus-41DfMLM  reason: not valid java name */
    public static final int m106470minus41DfMLM(int i, int i2) {
        return m106464constructorimpl(i - i2);
    }

    /* renamed from: minus-AoD1bsw  reason: not valid java name */
    public static final int m106471minusAoD1bsw(int i, int i2) {
        return m106464constructorimpl(i - i2);
    }

    /* renamed from: plus-AoD1bsw  reason: not valid java name */
    public static final int m106472plusAoD1bsw(int i, int i2) {
        return m106464constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106473toStringimpl(int i) {
        return "ItemIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m106466equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m106468hashCodeimpl(this.value);
    }

    public String toString() {
        return m106473toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106474unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m106464constructorimpl(int i) {
        return i;
    }
}

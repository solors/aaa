package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: ItemIndex.kt */
@Metadata
/* loaded from: classes.dex */
public final class LineIndex {
    private final int value;

    private /* synthetic */ LineIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineIndex m106514boximpl(int i) {
        return new LineIndex(i);
    }

    /* renamed from: compareTo-bKFJvoY  reason: not valid java name */
    public static final int m106515compareTobKFJvoY(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-hA7yfN8  reason: not valid java name */
    public static final int m106517dechA7yfN8(int i) {
        return m106516constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106518equalsimpl(int i, Object obj) {
        if (!(obj instanceof LineIndex) || i != ((LineIndex) obj).m106526unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106519equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106520hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-hA7yfN8  reason: not valid java name */
    public static final int m106521inchA7yfN8(int i) {
        return m106516constructorimpl(i + 1);
    }

    /* renamed from: minus--_Ze7BM  reason: not valid java name */
    public static final int m106522minus_Ze7BM(int i, int i2) {
        return m106516constructorimpl(i - i2);
    }

    /* renamed from: minus-fVkYB0M  reason: not valid java name */
    public static final int m106523minusfVkYB0M(int i, int i2) {
        return m106516constructorimpl(i - i2);
    }

    /* renamed from: plus--_Ze7BM  reason: not valid java name */
    public static final int m106524plus_Ze7BM(int i, int i2) {
        return m106516constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106525toStringimpl(int i) {
        return "LineIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m106518equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m106520hashCodeimpl(this.value);
    }

    public String toString() {
        return m106525toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106526unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m106516constructorimpl(int i) {
        return i;
    }
}

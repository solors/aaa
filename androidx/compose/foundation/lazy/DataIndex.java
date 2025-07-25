package androidx.compose.foundation.lazy;

import kotlin.Metadata;

/* compiled from: DataIndex.kt */
@Metadata
/* loaded from: classes.dex */
public final class DataIndex {
    private final int value;

    private /* synthetic */ DataIndex(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DataIndex m106406boximpl(int i) {
        return new DataIndex(i);
    }

    /* renamed from: compareTo-ZjPyQlc  reason: not valid java name */
    public static final int m106407compareToZjPyQlc(int i, int i2) {
        return i - i2;
    }

    /* renamed from: dec-jQJCoq8  reason: not valid java name */
    public static final int m106409decjQJCoq8(int i) {
        return m106408constructorimpl(i - 1);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m106410equalsimpl(int i, Object obj) {
        if (!(obj instanceof DataIndex) || i != ((DataIndex) obj).m106418unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m106411equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m106412hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: inc-jQJCoq8  reason: not valid java name */
    public static final int m106413incjQJCoq8(int i) {
        return m106408constructorimpl(i + 1);
    }

    /* renamed from: minus-PBKCTt8  reason: not valid java name */
    public static final int m106414minusPBKCTt8(int i, int i2) {
        return m106408constructorimpl(i - i2);
    }

    /* renamed from: minus-yUvdeeg  reason: not valid java name */
    public static final int m106415minusyUvdeeg(int i, int i2) {
        return m106408constructorimpl(i - i2);
    }

    /* renamed from: plus-PBKCTt8  reason: not valid java name */
    public static final int m106416plusPBKCTt8(int i, int i2) {
        return m106408constructorimpl(i + i2);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m106417toStringimpl(int i) {
        return "DataIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m106410equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m106412hashCodeimpl(this.value);
    }

    public String toString() {
        return m106417toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m106418unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m106408constructorimpl(int i) {
        return i;
    }
}

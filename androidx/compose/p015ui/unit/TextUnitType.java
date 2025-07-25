package androidx.compose.p015ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextUnit.kt */
@Metadata
/* renamed from: androidx.compose.ui.unit.TextUnitType */
/* loaded from: classes.dex */
public final class TextUnitType {
    private final long type;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m109941constructorimpl(0);

    /* renamed from: Sp */
    private static final long f512Sp = m109941constructorimpl(4294967296L);

    /* renamed from: Em */
    private static final long f511Em = m109941constructorimpl(8589934592L);

    /* compiled from: TextUnit.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.unit.TextUnitType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEm-UIouoOA  reason: not valid java name */
        public final long m109947getEmUIouoOA() {
            return TextUnitType.f511Em;
        }

        /* renamed from: getSp-UIouoOA  reason: not valid java name */
        public final long m109948getSpUIouoOA() {
            return TextUnitType.f512Sp;
        }

        /* renamed from: getUnspecified-UIouoOA  reason: not valid java name */
        public final long m109949getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }
    }

    private /* synthetic */ TextUnitType(long j) {
        this.type = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnitType m109940boximpl(long j) {
        return new TextUnitType(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109942equalsimpl(long j, Object obj) {
        if (!(obj instanceof TextUnitType) || j != ((TextUnitType) obj).m109946unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109943equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109944hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109945toStringimpl(long j) {
        if (m109943equalsimpl0(j, Unspecified)) {
            return "Unspecified";
        }
        if (m109943equalsimpl0(j, f512Sp)) {
            return "Sp";
        }
        if (m109943equalsimpl0(j, f511Em)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109942equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m109944hashCodeimpl(this.type);
    }

    @NotNull
    public String toString() {
        return m109945toStringimpl(this.type);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m109946unboximpl() {
        return this.type;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m109941constructorimpl(long j) {
        return j;
    }
}

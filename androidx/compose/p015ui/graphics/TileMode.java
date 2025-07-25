package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TileMode.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.TileMode */
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m107845constructorimpl(0);
    private static final int Repeated = m107845constructorimpl(1);
    private static final int Mirror = m107845constructorimpl(2);
    private static final int Decal = m107845constructorimpl(3);

    /* compiled from: TileMode.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.TileMode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClamp-3opZhB0  reason: not valid java name */
        public final int m107851getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0  reason: not valid java name */
        public final int m107852getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0  reason: not valid java name */
        public final int m107853getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0  reason: not valid java name */
        public final int m107854getRepeated3opZhB0() {
            return TileMode.Repeated;
        }
    }

    private /* synthetic */ TileMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TileMode m107844boximpl(int i) {
        return new TileMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107846equalsimpl(int i, Object obj) {
        if (!(obj instanceof TileMode) || i != ((TileMode) obj).m107850unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107847equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107848hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107849toStringimpl(int i) {
        if (m107847equalsimpl0(i, Clamp)) {
            return "Clamp";
        }
        if (m107847equalsimpl0(i, Repeated)) {
            return "Repeated";
        }
        if (m107847equalsimpl0(i, Mirror)) {
            return "Mirror";
        }
        if (m107847equalsimpl0(i, Decal)) {
            return "Decal";
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m107846equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107848hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m107849toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107850unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m107845constructorimpl(int i) {
        return i;
    }
}

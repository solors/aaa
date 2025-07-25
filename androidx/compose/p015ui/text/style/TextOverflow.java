package androidx.compose.p015ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextOverflow.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextOverflow */
/* loaded from: classes.dex */
public final class TextOverflow {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m109666constructorimpl(1);
    private static final int Ellipsis = m109666constructorimpl(2);
    private static final int Visible = m109666constructorimpl(3);

    private /* synthetic */ TextOverflow(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextOverflow m109665boximpl(int i) {
        return new TextOverflow(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109667equalsimpl(int i, Object obj) {
        if (!(obj instanceof TextOverflow) || i != ((TextOverflow) obj).m109671unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109668equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109669hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109670toStringimpl(int i) {
        if (m109668equalsimpl0(i, Clip)) {
            return "Clip";
        }
        if (m109668equalsimpl0(i, Ellipsis)) {
            return "Ellipsis";
        }
        if (m109668equalsimpl0(i, Visible)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109667equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109669hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109670toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109671unboximpl() {
        return this.value;
    }

    /* compiled from: TextOverflow.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextOverflow$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClip-gIe3tQ8  reason: not valid java name */
        public final int m109675getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8  reason: not valid java name */
        public final int m109676getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8  reason: not valid java name */
        public final int m109677getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m109672getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m109673getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m109674getVisiblegIe3tQ8$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109666constructorimpl(int i) {
        return i;
    }
}

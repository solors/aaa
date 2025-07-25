package androidx.compose.p015ui.input.pointer;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerType */
/* loaded from: classes.dex */
public final class PointerType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m108962constructorimpl(0);
    private static final int Touch = m108962constructorimpl(1);
    private static final int Mouse = m108962constructorimpl(2);
    private static final int Stylus = m108962constructorimpl(3);
    private static final int Eraser = m108962constructorimpl(4);

    /* compiled from: PointerEvent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getEraser-T8wyACA  reason: not valid java name */
        public final int m108968getEraserT8wyACA() {
            return PointerType.Eraser;
        }

        /* renamed from: getMouse-T8wyACA  reason: not valid java name */
        public final int m108969getMouseT8wyACA() {
            return PointerType.Mouse;
        }

        /* renamed from: getStylus-T8wyACA  reason: not valid java name */
        public final int m108970getStylusT8wyACA() {
            return PointerType.Stylus;
        }

        /* renamed from: getTouch-T8wyACA  reason: not valid java name */
        public final int m108971getTouchT8wyACA() {
            return PointerType.Touch;
        }

        /* renamed from: getUnknown-T8wyACA  reason: not valid java name */
        public final int m108972getUnknownT8wyACA() {
            return PointerType.Unknown;
        }
    }

    private /* synthetic */ PointerType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PointerType m108961boximpl(int i) {
        return new PointerType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108963equalsimpl(int i, Object obj) {
        if (!(obj instanceof PointerType) || i != ((PointerType) obj).m108967unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108964equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108965hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108966toStringimpl(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                    return "Eraser";
                }
                return "Stylus";
            }
            return "Mouse";
        }
        return "Touch";
    }

    public boolean equals(Object obj) {
        return m108963equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m108965hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m108966toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m108967unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m108962constructorimpl(int i) {
        return i;
    }
}

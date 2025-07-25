package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Strings.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m107056constructorimpl(0);
    private static final int CloseDrawer = m107056constructorimpl(1);
    private static final int CloseSheet = m107056constructorimpl(2);
    private static final int DefaultErrorMessage = m107056constructorimpl(3);
    private static final int ExposedDropdownMenu = m107056constructorimpl(4);
    private static final int SliderRangeStart = m107056constructorimpl(5);
    private static final int SliderRangeEnd = m107056constructorimpl(6);

    /* compiled from: Strings.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCloseDrawer-UdPEhr4  reason: not valid java name */
        public final int m107062getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4  reason: not valid java name */
        public final int m107063getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4  reason: not valid java name */
        public final int m107064getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4  reason: not valid java name */
        public final int m107065getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4  reason: not valid java name */
        public final int m107066getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4  reason: not valid java name */
        public final int m107067getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4  reason: not valid java name */
        public final int m107068getSliderRangeStartUdPEhr4() {
            return Strings.SliderRangeStart;
        }
    }

    private /* synthetic */ Strings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Strings m107055boximpl(int i) {
        return new Strings(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m107057equalsimpl(int i, Object obj) {
        if (!(obj instanceof Strings) || i != ((Strings) obj).m107061unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m107058equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m107059hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m107060toStringimpl(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m107057equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m107059hashCodeimpl(this.value);
    }

    public String toString() {
        return m107060toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m107061unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m107056constructorimpl(int i) {
        return i;
    }
}

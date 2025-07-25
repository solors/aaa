package androidx.compose.p015ui.semantics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsProperties.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.semantics.Role */
/* loaded from: classes.dex */
public final class Role {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Button = m109274constructorimpl(0);
    private static final int Checkbox = m109274constructorimpl(1);
    private static final int Switch = m109274constructorimpl(2);
    private static final int RadioButton = m109274constructorimpl(3);
    private static final int Tab = m109274constructorimpl(4);
    private static final int Image = m109274constructorimpl(5);

    /* compiled from: SemanticsProperties.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.Role$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButton-o7Vup1c  reason: not valid java name */
        public final int m109280getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c  reason: not valid java name */
        public final int m109281getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getImage-o7Vup1c  reason: not valid java name */
        public final int m109282getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c  reason: not valid java name */
        public final int m109283getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c  reason: not valid java name */
        public final int m109284getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c  reason: not valid java name */
        public final int m109285getTabo7Vup1c() {
            return Role.Tab;
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Role m109273boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109275equalsimpl(int i, Object obj) {
        if (!(obj instanceof Role) || i != ((Role) obj).m109279unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109276equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109277hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109278toStringimpl(int i) {
        if (m109276equalsimpl0(i, Button)) {
            return "Button";
        }
        if (m109276equalsimpl0(i, Checkbox)) {
            return "Checkbox";
        }
        if (m109276equalsimpl0(i, Switch)) {
            return "Switch";
        }
        if (m109276equalsimpl0(i, RadioButton)) {
            return "RadioButton";
        }
        if (m109276equalsimpl0(i, Tab)) {
            return "Tab";
        }
        if (m109276equalsimpl0(i, Image)) {
            return Constants.IMAGE;
        }
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public boolean equals(Object obj) {
        return m109275equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109277hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109278toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109279unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m109274constructorimpl(int i) {
        return i;
    }
}

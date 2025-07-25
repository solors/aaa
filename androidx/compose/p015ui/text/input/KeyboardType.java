package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyboardType.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.KeyboardType */
/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Text = m109539constructorimpl(1);
    private static final int Ascii = m109539constructorimpl(2);
    private static final int Number = m109539constructorimpl(3);
    private static final int Phone = m109539constructorimpl(4);
    private static final int Uri = m109539constructorimpl(5);
    private static final int Email = m109539constructorimpl(6);
    private static final int Password = m109539constructorimpl(7);
    private static final int NumberPassword = m109539constructorimpl(8);
    private static final int Decimal = m109539constructorimpl(9);

    /* compiled from: KeyboardType.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.KeyboardType$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE  reason: not valid java name */
        public final int m109545getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE  reason: not valid java name */
        public final int m109546getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE  reason: not valid java name */
        public final int m109547getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE  reason: not valid java name */
        public final int m109548getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE  reason: not valid java name */
        public final int m109549getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE  reason: not valid java name */
        public final int m109550getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE  reason: not valid java name */
        public final int m109551getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE  reason: not valid java name */
        public final int m109552getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE  reason: not valid java name */
        public final int m109553getUriPjHm6EE() {
            return KeyboardType.Uri;
        }
    }

    private /* synthetic */ KeyboardType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardType m109538boximpl(int i) {
        return new KeyboardType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109540equalsimpl(int i, Object obj) {
        if (!(obj instanceof KeyboardType) || i != ((KeyboardType) obj).m109544unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109541equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109542hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109543toStringimpl(int i) {
        if (m109541equalsimpl0(i, Text)) {
            return "Text";
        }
        if (m109541equalsimpl0(i, Ascii)) {
            return "Ascii";
        }
        if (m109541equalsimpl0(i, Number)) {
            return "Number";
        }
        if (m109541equalsimpl0(i, Phone)) {
            return "Phone";
        }
        if (m109541equalsimpl0(i, Uri)) {
            return "Uri";
        }
        if (m109541equalsimpl0(i, Email)) {
            return "Email";
        }
        if (m109541equalsimpl0(i, Password)) {
            return "Password";
        }
        if (m109541equalsimpl0(i, NumberPassword)) {
            return "NumberPassword";
        }
        if (m109541equalsimpl0(i, Decimal)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109540equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109542hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109543toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109544unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109539constructorimpl(int i) {
        return i;
    }
}

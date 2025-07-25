package androidx.compose.p015ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontStyle.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontStyle */
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m109458constructorimpl(0);
    private static final int Italic = m109458constructorimpl(1);

    /* compiled from: FontStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.FontStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA  reason: not valid java name */
        public final int m109464getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA  reason: not valid java name */
        public final int m109465getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        @NotNull
        public final List<FontStyle> values() {
            List<FontStyle> m17163p;
            m17163p = C37563v.m17163p(FontStyle.m109457boximpl(m109465getNormal_LCdwA()), FontStyle.m109457boximpl(m109464getItalic_LCdwA()));
            return m17163p;
        }
    }

    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ FontStyle m109457boximpl(int i) {
        return new FontStyle(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109459equalsimpl(int i, Object obj) {
        if (!(obj instanceof FontStyle) || i != ((FontStyle) obj).m109463unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109460equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109461hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109462toStringimpl(int i) {
        if (m109460equalsimpl0(i, Normal)) {
            return "Normal";
        }
        if (m109460equalsimpl0(i, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109459equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m109461hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109462toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109463unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109458constructorimpl(int i) {
        return i;
    }
}

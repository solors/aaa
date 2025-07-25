package androidx.compose.p015ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextDirection.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextDirection */
/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m109649constructorimpl(1);
    private static final int Rtl = m109649constructorimpl(2);
    private static final int Content = m109649constructorimpl(3);
    private static final int ContentOrLtr = m109649constructorimpl(4);
    private static final int ContentOrRtl = m109649constructorimpl(5);

    /* compiled from: TextDirection.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextDirection$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getContent-s_7X-co  reason: not valid java name */
        public final int m109655getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co  reason: not valid java name */
        public final int m109656getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co  reason: not valid java name */
        public final int m109657getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co  reason: not valid java name */
        public final int m109658getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co  reason: not valid java name */
        public final int m109659getRtls_7Xco() {
            return TextDirection.Rtl;
        }
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextDirection m109648boximpl(int i) {
        return new TextDirection(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109650equalsimpl(int i, Object obj) {
        if (!(obj instanceof TextDirection) || i != ((TextDirection) obj).m109654unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109651equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109652hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109653toStringimpl(int i) {
        if (m109651equalsimpl0(i, Ltr)) {
            return "Ltr";
        }
        if (m109651equalsimpl0(i, Rtl)) {
            return "Rtl";
        }
        if (m109651equalsimpl0(i, Content)) {
            return "Content";
        }
        if (m109651equalsimpl0(i, ContentOrLtr)) {
            return "ContentOrLtr";
        }
        if (m109651equalsimpl0(i, ContentOrRtl)) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109650equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109652hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109653toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109654unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109649constructorimpl(int i) {
        return i;
    }
}

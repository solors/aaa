package androidx.compose.p015ui.text.style;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextAlign.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextAlign */
/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Left = m109636constructorimpl(1);
    private static final int Right = m109636constructorimpl(2);
    private static final int Center = m109636constructorimpl(3);
    private static final int Justify = m109636constructorimpl(4);
    private static final int Start = m109636constructorimpl(5);
    private static final int End = m109636constructorimpl(6);

    /* compiled from: TextAlign.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextAlign$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk  reason: not valid java name */
        public final int m109642getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk  reason: not valid java name */
        public final int m109643getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk  reason: not valid java name */
        public final int m109644getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk  reason: not valid java name */
        public final int m109645getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk  reason: not valid java name */
        public final int m109646getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk  reason: not valid java name */
        public final int m109647getStarte0LSkKk() {
            return TextAlign.Start;
        }

        @NotNull
        public final List<TextAlign> values() {
            List<TextAlign> m17163p;
            m17163p = C37563v.m17163p(TextAlign.m109635boximpl(m109645getLefte0LSkKk()), TextAlign.m109635boximpl(m109646getRighte0LSkKk()), TextAlign.m109635boximpl(m109642getCentere0LSkKk()), TextAlign.m109635boximpl(m109644getJustifye0LSkKk()), TextAlign.m109635boximpl(m109647getStarte0LSkKk()), TextAlign.m109635boximpl(m109643getEnde0LSkKk()));
            return m17163p;
        }
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextAlign m109635boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109637equalsimpl(int i, Object obj) {
        if (!(obj instanceof TextAlign) || i != ((TextAlign) obj).m109641unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109638equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109639hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109640toStringimpl(int i) {
        if (m109638equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m109638equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m109638equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m109638equalsimpl0(i, Justify)) {
            return "Justify";
        }
        if (m109638equalsimpl0(i, Start)) {
            return "Start";
        }
        if (m109638equalsimpl0(i, End)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109637equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109639hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109640toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109641unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109636constructorimpl(int i) {
        return i;
    }
}

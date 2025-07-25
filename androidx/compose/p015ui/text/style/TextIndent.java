package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.p015ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextIndent.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextIndent */
/* loaded from: classes.dex */
public final class TextIndent {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    public /* synthetic */ TextIndent(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-NB67dxo$default  reason: not valid java name */
    public static /* synthetic */ TextIndent m109661copyNB67dxo$default(TextIndent textIndent, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textIndent.firstLine;
        }
        if ((i & 2) != 0) {
            j2 = textIndent.restLine;
        }
        return textIndent.m109662copyNB67dxo(j, j2);
    }

    @NotNull
    /* renamed from: copy-NB67dxo  reason: not valid java name */
    public final TextIndent m109662copyNB67dxo(long j, long j2) {
        return new TextIndent(j, j2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        if (TextUnit.m109912equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m109912equalsimpl0(this.restLine, textIndent.restLine)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFirstLine-XSAIIZE  reason: not valid java name */
    public final long m109663getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE  reason: not valid java name */
    public final long m109664getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m109916hashCodeimpl(this.firstLine) * 31) + TextUnit.m109916hashCodeimpl(this.restLine);
    }

    @NotNull
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m109922toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m109922toStringimpl(this.restLine)) + ')';
    }

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public /* synthetic */ TextIndent(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TextUnitKt.getSp(0) : j, (i & 2) != 0 ? TextUnitKt.getSp(0) : j2, null);
    }

    /* compiled from: TextIndent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextIndent$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextIndent getNone() {
            return TextIndent.None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}

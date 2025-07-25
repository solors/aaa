package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldValue.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextFieldValue */
/* loaded from: classes.dex */
public final class TextFieldValue {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);
    @NotNull
    private final AnnotatedString annotatedString;
    @Nullable
    private final TextRange composition;
    private final long selection;

    /* compiled from: TextFieldValue.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m109554copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m109556copy3r_uNRQ(annotatedString, j, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m109556copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long j, @Nullable TextRange textRange) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        return new TextFieldValue(annotatedString, j, textRange, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (TextRange.m109375equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.m17075f(this.composition, textFieldValue.composition) && Intrinsics.m17075f(this.annotatedString, textFieldValue.annotatedString)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA  reason: not valid java name */
    public final TextRange m109558getCompositionMzsxiRA() {
        return this.composition;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m109559getSelectiond9O1mEE() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.annotatedString.hashCode() * 31) + TextRange.m109383hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        if (textRange != null) {
            i = TextRange.m109383hashCodeimpl(textRange.m109386unboximpl());
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m109385toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ  reason: not valid java name */
    public final TextFieldValue m109557copy3r_uNRQ(@NotNull String text, long j, @Nullable TextRange textRange) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), j, textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m109388constrain8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m109370boximpl(TextRangeKt.m109388constrain8ffj60Q(textRange.m109386unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default  reason: not valid java name */
    public static /* synthetic */ TextFieldValue m109555copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m109557copy3r_uNRQ(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? TextRange.Companion.m109387getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Companion.m109387getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j, textRange, (DefaultConstructorMarker) null);
    }
}

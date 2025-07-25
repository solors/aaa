package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VisualTransformation.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TransformedText */
/* loaded from: classes.dex */
public final class TransformedText {
    @NotNull
    private final OffsetMapping offsetMapping;
    @NotNull
    private final AnnotatedString text;

    public TransformedText(@NotNull AnnotatedString text, @NotNull OffsetMapping offsetMapping) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        this.text = text;
        this.offsetMapping = offsetMapping;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        if (Intrinsics.m17075f(this.text, transformedText.text) && Intrinsics.m17075f(this.offsetMapping, transformedText.offsetMapping)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
    }

    @NotNull
    public String toString() {
        return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
    }
}

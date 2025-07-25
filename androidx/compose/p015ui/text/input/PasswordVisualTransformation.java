package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VisualTransformation.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.PasswordVisualTransformation */
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    private final char mask;

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString text) {
        String m16632E;
        Intrinsics.checkNotNullParameter(text, "text");
        m16632E = StringsJVM.m16632E(String.valueOf(this.mask), text.getText().length());
        return new TransformedText(new AnnotatedString(m16632E, null, null, 6, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    public /* synthetic */ PasswordVisualTransformation(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }
}

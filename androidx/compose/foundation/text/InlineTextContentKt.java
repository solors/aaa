package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InlineTextContent.kt */
@Metadata
/* loaded from: classes.dex */
public final class InlineTextContentKt {
    @NotNull
    public static final String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";
    @NotNull
    private static final String REPLACEMENT_CHAR = "�";

    public static final void appendInlineContent(@NotNull AnnotatedString.Builder builder, @NotNull String id2, @NotNull String alternateText) {
        boolean z;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(alternateText, "alternateText");
        if (alternateText.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            builder.pushStringAnnotation(INLINE_CONTENT_TAG, id2);
            builder.append(alternateText);
            builder.pop();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = REPLACEMENT_CHAR;
        }
        appendInlineContent(builder, str, str2);
    }
}

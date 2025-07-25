package androidx.compose.p015ui.text;

import kotlin.Metadata;

/* compiled from: ParagraphIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.ParagraphIntrinsics */
/* loaded from: classes.dex */
public interface ParagraphIntrinsics {
    default boolean getHasStaleResolvedFonts() {
        return false;
    }

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();
}

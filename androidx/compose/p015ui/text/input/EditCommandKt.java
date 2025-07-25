package androidx.compose.p015ui.text.input;

import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.EditCommandKt */
/* loaded from: classes.dex */
public final class EditCommandKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char c, char c2) {
        if (Character.isHighSurrogate(c) && Character.isLowSurrogate(c2)) {
            return true;
        }
        return false;
    }
}

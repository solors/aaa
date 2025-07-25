package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClipboardManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ClipboardManager */
/* loaded from: classes.dex */
public interface ClipboardManager {
    @Nullable
    AnnotatedString getText();

    void setText(@NotNull AnnotatedString annotatedString);
}

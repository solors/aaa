package androidx.compose.p015ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import androidx.compose.p015ui.text.AnnotatedString;
import androidx.webkit.internal.AssetHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidClipboardManager */
/* loaded from: classes.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    @NotNull
    private final ClipboardManager clipboardManager;

    public AndroidClipboardManager(@NotNull ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.clipboardManager = clipboardManager;
    }

    @Override // androidx.compose.p015ui.platform.ClipboardManager
    @Nullable
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(charSequence);
    }

    public final boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(AssetHelper.DEFAULT_MIME_TYPE);
        }
        return false;
    }

    @Override // androidx.compose.p015ui.platform.ClipboardManager
    public void setText(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidClipboardManager(@org.jetbrains.annotations.NotNull android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            if (r2 == 0) goto L13
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        L13:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }
}

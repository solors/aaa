package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldKeyInput.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo  reason: not valid java name */
    public static final boolean m106652isTypedEventZmokQxo(@NotNull KeyEvent isTypedEvent) {
        Intrinsics.checkNotNullParameter(isTypedEvent, "$this$isTypedEvent");
        if (isTypedEvent.getAction() == 0 && isTypedEvent.getUnicodeChar() != 0) {
            return true;
        }
        return false;
    }
}

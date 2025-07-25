package androidx.compose.p015ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyEvent.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.key.KeyEvent_androidKt */
/* loaded from: classes.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo  reason: not valid java name */
    public static final long m108761getKeyZmokQxo(@NotNull KeyEvent key) {
        Intrinsics.checkNotNullParameter(key, "$this$key");
        return Key_androidKt.Key(key.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo  reason: not valid java name */
    public static final int m108762getTypeZmokQxo(@NotNull KeyEvent type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            if (action != 1) {
                return KeyEventType.Companion.m108760getUnknownCS__XNY();
            }
            return KeyEventType.Companion.m108759getKeyUpCS__XNY();
        }
        return KeyEventType.Companion.m108758getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo  reason: not valid java name */
    public static final int m108763getUtf16CodePointZmokQxo(@NotNull KeyEvent utf16CodePoint) {
        Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m108764isAltPressedZmokQxo(@NotNull KeyEvent isAltPressed) {
        Intrinsics.checkNotNullParameter(isAltPressed, "$this$isAltPressed");
        return isAltPressed.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m108765isCtrlPressedZmokQxo(@NotNull KeyEvent isCtrlPressed) {
        Intrinsics.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m108766isMetaPressedZmokQxo(@NotNull KeyEvent isMetaPressed) {
        Intrinsics.checkNotNullParameter(isMetaPressed, "$this$isMetaPressed");
        return isMetaPressed.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m108767isShiftPressedZmokQxo(@NotNull KeyEvent isShiftPressed) {
        Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}

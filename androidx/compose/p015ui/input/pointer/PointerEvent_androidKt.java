package androidx.compose.p015ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerEvent_androidKt */
/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    /* renamed from: getAreAnyPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108858getAreAnyPressedaHzCxE(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E  reason: not valid java name */
    public static final int m108859indexOfFirstPressedaHzCxE(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = (i & (-97)) | ((i & 96) >>> 5); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E  reason: not valid java name */
    public static final int m108860indexOfLastPressedaHzCxE(int i) {
        int i2 = -1;
        for (int i3 = (i & (-97)) | ((i & 96) >>> 5); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108861isAltGraphPressed5xRPYO0(int i) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108862isAltPressed5xRPYO0(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isBackPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108863isBackPressedaHzCxE(int i) {
        if ((i & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isCapsLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m108864isCapsLockOn5xRPYO0(int i) {
        if ((i & 1048576) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isCtrlPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108865isCtrlPressed5xRPYO0(int i) {
        if ((i & 4096) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isForwardPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108866isForwardPressedaHzCxE(int i) {
        if ((i & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isFunctionPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108867isFunctionPressed5xRPYO0(int i) {
        if ((i & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isMetaPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108868isMetaPressed5xRPYO0(int i) {
        if ((i & 65536) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isNumLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m108869isNumLockOn5xRPYO0(int i) {
        if ((i & 2097152) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isPressed-bNIWhpI  reason: not valid java name */
    public static final boolean m108870isPressedbNIWhpI(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    if ((i & (1 << (i2 + 2))) != 0) {
                        return true;
                    }
                } else if ((i & (1 << i2)) != 0) {
                    return true;
                }
                return false;
            }
            return m108873isSecondaryPressedaHzCxE(i);
        }
        return m108871isPrimaryPressedaHzCxE(i);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108871isPrimaryPressedaHzCxE(int i) {
        if ((i & 33) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isScrollLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m108872isScrollLockOn5xRPYO0(int i) {
        if ((i & 4194304) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108873isSecondaryPressedaHzCxE(int i) {
        if ((i & 66) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isShiftPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108874isShiftPressed5xRPYO0(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isSymPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m108875isSymPressed5xRPYO0(int i) {
        if ((i & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m108876isTertiaryPressedaHzCxE(int i) {
        if ((i & 4) != 0) {
            return true;
        }
        return false;
    }
}

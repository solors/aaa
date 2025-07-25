package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.p015ui.unit.DpKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewConfiguration.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewConfiguration */
/* loaded from: classes.dex */
public interface ViewConfiguration {

    /* compiled from: ViewConfiguration.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.ViewConfiguration$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
        public static long m109262getMinimumTouchTargetSizeMYxV2XQ(@NotNull ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo109149getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo109149getMinimumTouchTargetSizeMYxV2XQ() {
        float f = 48;
        return DpKt.m109756DpSizeYgX7TsA(C1059Dp.m109734constructorimpl(f), C1059Dp.m109734constructorimpl(f));
    }

    float getTouchSlop();
}

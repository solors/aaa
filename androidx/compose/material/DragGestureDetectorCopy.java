package androidx.compose.material;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p015ui.input.pointer.PointerEvent;
import androidx.compose.p015ui.input.pointer.PointerEventKt;
import androidx.compose.p015ui.input.pointer.PointerEventPass;
import androidx.compose.p015ui.input.pointer.PointerId;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.input.pointer.PointerType;
import androidx.compose.p015ui.platform.ViewConfiguration;
import androidx.compose.p015ui.unit.C1059Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.material.DragGestureDetectorCopyKt */
/* loaded from: classes.dex */
public final class DragGestureDetectorCopy {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m109734constructorimpl = C1059Dp.m109734constructorimpl((float) 0.125d);
        mouseSlop = m109734constructorimpl;
        float m109734constructorimpl2 = C1059Dp.m109734constructorimpl(18);
        defaultTouchSlop = m109734constructorimpl2;
        mouseToTouchSlopRatio = m109734constructorimpl / m109734constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011b -> B:57:0x0167). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015a -> B:53:0x015d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0181 -> B:57:0x0167). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m106916awaitHorizontalPointerSlopOrCancellationgDDlDlE(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.p015ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopy.m106916awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM  reason: not valid java name */
    private static final Object m106917awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m106918isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m106919pointerSlopE8SPZFQ = m106919pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        do {
            float f = 0.0f;
            while (true) {
                InlineMarker.m17016c(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.m17016c(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m108880equalsimpl0(pointerInputChange.m108892getIdJ3iCeTQ(), j2)) {
                            break;
                        }
                        i2++;
                    } else {
                        pointerInputChange = null;
                        break;
                    }
                }
                Intrinsics.m17074g(pointerInputChange);
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2.isConsumed()) {
                    return null;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            pointerInputChange3 = changes2.get(i3);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i3++;
                        } else {
                            pointerInputChange3 = null;
                            break;
                        }
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        return null;
                    }
                    j2 = pointerInputChange4.m108892getIdJ3iCeTQ();
                } else {
                    f += function1.invoke(Offset.m107280boximpl(pointerInputChange2.m108893getPositionF1C5BW0())).floatValue() - function1.invoke(Offset.m107280boximpl(pointerInputChange2.m108894getPreviousPositionF1C5BW0())).floatValue();
                    if (Math.abs(f) < m106919pointerSlopE8SPZFQ) {
                        PointerEventPass pointerEventPass = PointerEventPass.Final;
                        InlineMarker.m17016c(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                        InlineMarker.m17016c(1);
                        if (pointerInputChange2.isConsumed()) {
                            return null;
                        }
                    } else {
                        function2.mo105910invoke(pointerInputChange2, Float.valueOf(f - (Math.signum(f) * m106919pointerSlopE8SPZFQ)));
                    }
                }
            }
        } while (!pointerInputChange2.isConsumed());
        return pointerInputChange2;
    }

    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    private static final boolean m106918isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                pointerInputChange = changes.get(i);
                if (PointerId.m108880equalsimpl0(pointerInputChange.m108892getIdJ3iCeTQ(), j)) {
                    break;
                }
                i++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ  reason: not valid java name */
    public static final float m106919pointerSlopE8SPZFQ(@NotNull ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        if (PointerType.m108964equalsimpl0(i, PointerType.Companion.m108969getMouseT8wyACA())) {
            return pointerSlop.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return pointerSlop.getTouchSlop();
    }
}

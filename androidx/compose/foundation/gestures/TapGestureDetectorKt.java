package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p015ui.input.pointer.PointerEventPass;
import androidx.compose.p015ui.input.pointer.PointerInputChange;
import androidx.compose.p015ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.C37785p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import sd.C42688d;

/* compiled from: TapGestureDetector.kt */
@Metadata
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    @NotNull
    private static final InterfaceC45268n<TapGestureDetector, Offset, Continuation<? super Unit>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    @Nullable
    public static final Object awaitFirstDown(@NotNull AwaitPointerEventScope awaitPointerEventScope, boolean z, @NotNull Continuation<? super PointerInputChange> continuation) {
        return awaitFirstDownOnPass(awaitPointerEventScope, PointerEventPass.Main, z, continuation);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitFirstDownOnPass(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.input.pointer.AwaitPointerEventScope r9, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.input.pointer.PointerEventPass r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.p015ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.p015ui.input.pointer.AwaitPointerEventScope) r11
            p804nd.C38508r.m14539b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            p804nd.C38508r.m14539b(r12)
        L41:
            r0.L$0 = r9
            r0.L$1 = r10
            r0.Z$0 = r11
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.p015ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5c:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p015ui.input.pointer.PointerInputChange) r7
            if (r11 == 0) goto L6b
            boolean r7 = androidx.compose.p015ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L6f
        L6b:
            boolean r7 = androidx.compose.p015ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L6f:
            if (r7 != 0) goto L73
            r2 = r5
            goto L77
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r2 = r3
        L77:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDownOnPass(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation<? super PointerInputChange> continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[EDGE_INSN: B:32:0x007a->B:27:0x007a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.p015ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.p015ui.input.pointer.AwaitPointerEventScope) r8
            p804nd.C38508r.m14539b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p804nd.C38508r.m14539b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.p015ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.p015ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p015ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p015ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            kotlin.Unit r8 = kotlin.Unit.f99208a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object detectTapAndPress(@NotNull PointerInputScope pointerInputScope, @NotNull InterfaceC45268n<? super TapGestureDetector, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> interfaceC45268n, @Nullable Function1<? super Offset, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object forEachGesture = ForEachGesture.forEachGesture(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(pointerInputScope), interfaceC45268n, function1, null), continuation);
        m6959e = C42688d.m6959e();
        if (forEachGesture == m6959e) {
            return forEachGesture;
        }
        return Unit.f99208a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, InterfaceC45268n interfaceC45268n, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC45268n = NoPressGesture;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, interfaceC45268n, function1, continuation);
    }

    @Nullable
    public static final Object detectTapGestures(@NotNull PointerInputScope pointerInputScope, @Nullable Function1<? super Offset, Unit> function1, @Nullable Function1<? super Offset, Unit> function12, @NotNull InterfaceC45268n<? super TapGestureDetector, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> interfaceC45268n, @Nullable Function1<? super Offset, Unit> function13, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m16125g = C37785p0.m16125g(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, interfaceC45268n, function12, function1, function13, null), continuation);
        m6959e = C42688d.m6959e();
        if (m16125g == m6959e) {
            return m16125g;
        }
        return Unit.f99208a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, InterfaceC45268n interfaceC45268n, Function1 function13, Continuation continuation, int i, Object obj) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        if ((i & 1) != 0) {
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i & 2) != 0) {
            function15 = null;
        } else {
            function15 = function12;
        }
        if ((i & 4) != 0) {
            interfaceC45268n = NoPressGesture;
        }
        InterfaceC45268n interfaceC45268n2 = interfaceC45268n;
        if ((i & 8) != 0) {
            function16 = null;
        } else {
            function16 = function13;
        }
        return detectTapGestures(pointerInputScope, function14, function15, interfaceC45268n2, function16, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00bb -> B:48:0x00be). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object waitForUpOrCancellation(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.input.pointer.AwaitPointerEventScope r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p015ui.input.pointer.PointerInputChange> r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d):java.lang.Object");
    }
}

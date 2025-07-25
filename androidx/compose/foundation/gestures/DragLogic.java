package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
public final class DragLogic {
    @NotNull
    private final SnapshotState<DragInteraction.Start> dragStartInteraction;
    @Nullable
    private final MutableInteractionSource interactionSource;
    @NotNull
    private final InterfaceC45268n<CoroutineScope, Offset, Continuation<? super Unit>, Object> onDragStarted;
    @NotNull
    private final InterfaceC45268n<CoroutineScope, Float, Continuation<? super Unit>, Object> onDragStopped;

    /* JADX WARN: Multi-variable type inference failed */
    public DragLogic(@NotNull InterfaceC45268n<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull InterfaceC45268n<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, @NotNull SnapshotState<DragInteraction.Start> dragStartInteraction, @Nullable MutableInteractionSource mutableInteractionSource) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.onDragStarted = onDragStarted;
        this.onDragStopped = onDragStopped;
        this.dragStartInteraction = dragStartInteraction;
        this.interactionSource = mutableInteractionSource;
    }

    @NotNull
    public final SnapshotState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    @Nullable
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final InterfaceC45268n<CoroutineScope, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    @NotNull
    public final InterfaceC45268n<CoroutineScope, Float, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragCancel(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p804nd.C38508r.m14539b(r9)
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.o0 r8 = (kotlinx.coroutines.CoroutineScope) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            p804nd.C38508r.m14539b(r9)
            goto L65
        L41:
            p804nd.C38508r.m14539b(r9)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r9 = r7.dragStartInteraction
            java.lang.Object r9 = r9.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r9 = (androidx.compose.foundation.interaction.DragInteraction.Start) r9
            if (r9 == 0) goto L6b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r7.interactionSource
            if (r2 == 0) goto L64
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r2.emit(r6, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r2 = r7
        L65:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r9 = r2.dragStartInteraction
            r9.setValue(r5)
            goto L6c
        L6b:
            r2 = r7
        L6c:
            zd.n<kotlinx.coroutines.o0, java.lang.Float, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r9 = r2.onDragStopped
            r2 = 0
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.boxing.m17098c(r2)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r9.invoke(r8, r2, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            kotlin.Unit r8 = kotlin.Unit.f99208a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragCancel(kotlinx.coroutines.o0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStart(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStarted r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStart(kotlinx.coroutines.o0, androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processDragStop(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.DragEvent.DragStopped r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p804nd.C38508r.m14539b(r11)
            goto L8e
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStopped r9 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.o0 r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            p804nd.C38508r.m14539b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L6e
        L48:
            p804nd.C38508r.m14539b(r11)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r8.dragStartInteraction
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = (androidx.compose.foundation.interaction.DragInteraction.Start) r11
            if (r11 == 0) goto L74
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L6d
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L6d
            return r1
        L6d:
            r2 = r8
        L6e:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r2.dragStartInteraction
            r11.setValue(r5)
            goto L75
        L74:
            r2 = r8
        L75:
            zd.n<kotlinx.coroutines.o0, java.lang.Float, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r11 = r2.onDragStopped
            float r10 = r10.getVelocity()
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.boxing.m17098c(r10)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L8e
            return r1
        L8e:
            kotlin.Unit r9 = kotlin.Unit.f99208a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStop(kotlinx.coroutines.o0, androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.d):java.lang.Object");
    }
}

package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragGestureDetectorCopy.kt */
@DebugMetadata(m17095c = "androidx.compose.material.DragGestureDetectorCopyKt", m17094f = "DragGestureDetectorCopy.kt", m17093l = {123, 161}, m17092m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
@Metadata
/* renamed from: androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 */
/* loaded from: classes.dex */
public final class C0704x2966ccbb extends AbstractC37589d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0704x2966ccbb(Continuation<? super C0704x2966ccbb> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopy.m106916awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}

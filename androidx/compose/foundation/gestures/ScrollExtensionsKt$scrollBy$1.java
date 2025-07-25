package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollExtensions.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m17094f = "ScrollExtensions.kt", m17093l = {61}, m17092m = "scrollBy")
@Metadata
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$scrollBy$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollExtensionsKt$scrollBy$1(Continuation<? super ScrollExtensionsKt$scrollBy$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensions.scrollBy(null, 0.0f, this);
    }
}

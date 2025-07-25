package androidx.compose.foundation.lazy;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyListState.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", m17094f = "LazyListState.kt", m17093l = {TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME}, m17092m = "waitForFirstLayout")
@Metadata
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, Continuation<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> continuation) {
        super(continuation);
        this.this$0 = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitForFirstLayout(this);
    }
}

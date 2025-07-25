package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37605k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: ScrollExtensions.kt */
@DebugMetadata(m17095c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m17094f = "ScrollExtensions.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class ScrollExtensionsKt$scrollBy$2 extends AbstractC37596l implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C37605k0 $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(C37605k0 c37605k0, float f, Continuation<? super ScrollExtensionsKt$scrollBy$2> continuation) {
        super(2, continuation);
        this.$consumed = c37605k0;
        this.$value = f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, continuation);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ScrollExtensionsKt$scrollBy$2) create(scrollScope, continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            this.$consumed.f99323b = ((ScrollScope) this.L$0).scrollBy(this.$value);
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

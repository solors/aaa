package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37595k;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.AbstractC37648j;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: View.kt */
@DebugMetadata(m17095c = "androidx.core.view.ViewKt$allViews$1", m17094f = "View.kt", m17093l = {414, 416}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class ViewKt$allViews$1 extends AbstractC37595k implements Function2<AbstractC37648j<? super View>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation<? super ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, continuation);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        AbstractC37648j abstractC37648j;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C38508r.m14539b(obj);
                    return Unit.f99208a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC37648j = (AbstractC37648j) this.L$0;
            C38508r.m14539b(obj);
        } else {
            C38508r.m14539b(obj);
            abstractC37648j = (AbstractC37648j) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC37648j;
            this.label = 1;
            if (abstractC37648j.mo16877a(view, this) == m6959e) {
                return m6959e;
            }
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            Sequence<View> descendants = ViewGroup.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (abstractC37648j.m16875d(descendants, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull AbstractC37648j<? super View> abstractC37648j, @Nullable Continuation<? super Unit> continuation) {
        return ((ViewKt$allViews$1) create(abstractC37648j, continuation)).invokeSuspend(Unit.f99208a);
    }
}

package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [X] */
/* compiled from: Transformations.kt */
@Metadata
/* loaded from: classes.dex */
final class Transformations$map$1<X> extends Lambda implements Function1<X, Unit> {
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1<X, Y> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$map$1(MediatorLiveData<Y> mediatorLiveData, Function1<X, Y> function1) {
        super(1);
        this.$result = mediatorLiveData;
        this.$transform = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((Transformations$map$1<X>) obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        this.$result.setValue(this.$transform.invoke(x));
    }
}

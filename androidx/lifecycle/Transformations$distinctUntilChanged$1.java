package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [X] */
/* compiled from: Transformations.kt */
@Metadata
/* loaded from: classes.dex */
final class Transformations$distinctUntilChanged$1<X> extends Lambda implements Function1<X, Unit> {
    final /* synthetic */ Ref $firstTime;
    final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, Ref ref) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = ref;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((Transformations$distinctUntilChanged$1<X>) obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        X value = this.$outputLiveData.getValue();
        if (this.$firstTime.f99319b || ((value == null && x != null) || !(value == null || Intrinsics.m17075f(value, x)))) {
            this.$firstTime.f99319b = false;
            this.$outputLiveData.setValue(x);
        }
    }
}

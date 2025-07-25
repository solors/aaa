package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Transformations.kt */
@Metadata
/* loaded from: classes.dex */
final class Transformations$switchMap$2$onChanged$1 extends Lambda implements Function1 {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m109991invoke(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: collision with other method in class */
    public final void m109991invoke(Object obj) {
        this.$result.setValue(obj);
    }
}

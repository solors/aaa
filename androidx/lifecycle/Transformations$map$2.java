package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transformations.kt */
@Metadata
/* loaded from: classes.dex */
public final class Transformations$map$2 extends Lambda implements Function1 {
    final /* synthetic */ Function $mapFunction;
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$map$2(MediatorLiveData mediatorLiveData, Function function) {
        super(1);
        this.$result = mediatorLiveData;
        this.$mapFunction = function;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m109990invoke(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: collision with other method in class */
    public final void m109990invoke(Object obj) {
        this.$result.setValue(this.$mapFunction.apply(obj));
    }
}

package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [X] */
/* compiled from: Transformations.kt */
@Metadata
/* loaded from: classes.dex */
final class Transformations$switchMap$1<X> extends Lambda implements Function1<X, Unit> {
    final /* synthetic */ C37609n0<LiveData<Y>> $liveData;
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1<X, LiveData<Y>> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [Y] */
    /* compiled from: Transformations.kt */
    @Metadata
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1 */
    /* loaded from: classes.dex */
    public static final class C19971<Y> extends Lambda implements Function1<Y, Unit> {
        final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C19971(MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$result = mediatorLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C19971<Y>) obj);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Y y) {
            this.$result.setValue(y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(Function1<X, LiveData<Y>> function1, C37609n0<LiveData<Y>> c37609n0, MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$transform = function1;
        this.$liveData = c37609n0;
        this.$result = mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((Transformations$switchMap$1<X>) obj);
        return Unit.f99208a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, T, java.lang.Object] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        ?? r4 = (LiveData) this.$transform.invoke(x);
        T t = this.$liveData.f99327b;
        if (t != r4) {
            if (t != 0) {
                MediatorLiveData<Y> mediatorLiveData = this.$result;
                Intrinsics.m17074g(t);
                mediatorLiveData.removeSource((LiveData) t);
            }
            this.$liveData.f99327b = r4;
            if (r4 != 0) {
                MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                Intrinsics.m17074g(r4);
                mediatorLiveData2.addSource(r4, new Transformations$sam$androidx_lifecycle_Observer$0(new C19971(this.$result)));
            }
        }
    }
}

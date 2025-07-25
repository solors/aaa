package p674fe;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C37739j;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674fe.C33120h;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata
/* renamed from: fe.k */
/* loaded from: classes7.dex */
final /* synthetic */ class Channels {

    /* compiled from: Channels.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m17094f = "Channels.kt", m17093l = {39}, m17092m = "invokeSuspend")
    @Metadata
    /* renamed from: fe.k$a */
    /* loaded from: classes7.dex */
    static final class C33126a extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super C33120h<? extends Unit>>, Object> {

        /* renamed from: l */
        int f90490l;

        /* renamed from: m */
        private /* synthetic */ Object f90491m;

        /* renamed from: n */
        final /* synthetic */ InterfaceC33136u<E> f90492n;

        /* renamed from: o */
        final /* synthetic */ E f90493o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33126a(InterfaceC33136u<? super E> interfaceC33136u, E e, Continuation<? super C33126a> continuation) {
            super(2, continuation);
            this.f90492n = interfaceC33136u;
            this.f90493o = e;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C33126a c33126a = new C33126a(this.f90492n, this.f90493o, continuation);
            c33126a.f90491m = obj;
            return c33126a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super C33120h<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super C33120h<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            Object m14549b;
            Object m24677a;
            m6959e = C42688d.m6959e();
            int i = this.f90490l;
            try {
                if (i != 0) {
                    if (i == 1) {
                        C38508r.m14539b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C38508r.m14539b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f90491m;
                    InterfaceC33136u<E> interfaceC33136u = this.f90492n;
                    E e = this.f90493o;
                    Result.C38506a c38506a = Result.f101870c;
                    this.f90490l = 1;
                    if (interfaceC33136u.mo24644F(e, this) == m6959e) {
                        return m6959e;
                    }
                }
                m14549b = Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14543h(m14549b)) {
                m24677a = C33120h.f90484b.m24675c(Unit.f99208a);
            } else {
                m24677a = C33120h.f90484b.m24677a(Result.m14546e(m14549b));
            }
            return C33120h.m24687b(m24677a);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super C33120h<Unit>> continuation) {
            return ((C33126a) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final <E> Object m24661a(@NotNull InterfaceC33136u<? super E> interfaceC33136u, E e) {
        Object m16312b;
        Object mo24641p = interfaceC33136u.mo24641p(e);
        if (mo24641p instanceof C33120h.C33123c) {
            m16312b = C37739j.m16312b(null, new C33126a(interfaceC33136u, e, null), 1, null);
            return ((C33120h) m16312b).m24678k();
        }
        Unit unit = (Unit) mo24641p;
        return C33120h.f90484b.m24675c(Unit.f99208a);
    }
}

package p777le;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.C37819y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: le.a */
/* loaded from: classes8.dex */
public final class OnTimeout {

    /* renamed from: a */
    private final long f100911a;

    /* compiled from: Runnable.kt */
    @Metadata
    /* renamed from: le.a$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC38163a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InterfaceC38175k f100912b;

        /* renamed from: c */
        final /* synthetic */ OnTimeout f100913c;

        public RunnableC38163a(InterfaceC38175k interfaceC38175k, OnTimeout onTimeout) {
            this.f100912b = interfaceC38175k;
            this.f100913c = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f100912b.mo15496f(this.f100913c, Unit.f99208a);
        }
    }

    /* compiled from: OnTimeout.kt */
    @Metadata
    /* renamed from: le.a$b */
    /* loaded from: classes8.dex */
    /* synthetic */ class C38164b extends FunctionReferenceImpl implements InterfaceC45268n<OnTimeout, InterfaceC38175k<?>, Object, Unit> {

        /* renamed from: c */
        public static final C38164b f100914c = new C38164b();

        C38164b() {
            super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m15533a(@NotNull OnTimeout onTimeout, @NotNull InterfaceC38175k<?> interfaceC38175k, @Nullable Object obj) {
            onTimeout.m15534c(interfaceC38175k, obj);
        }

        @Override // p1076zd.InterfaceC45268n
        public /* bridge */ /* synthetic */ Unit invoke(OnTimeout onTimeout, InterfaceC38175k<?> interfaceC38175k, Object obj) {
            m15533a(onTimeout, interfaceC38175k, obj);
            return Unit.f99208a;
        }
    }

    public OnTimeout(long j) {
        this.f100911a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m15534c(InterfaceC38175k<?> interfaceC38175k, Object obj) {
        if (this.f100911a <= 0) {
            interfaceC38175k.mo15498d(Unit.f99208a);
            return;
        }
        RunnableC38163a runnableC38163a = new RunnableC38163a(interfaceC38175k, this);
        Intrinsics.m17073h(interfaceC38175k, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C38172j c38172j = (C38172j) interfaceC38175k;
        CoroutineContext context = interfaceC38175k.getContext();
        interfaceC38175k.mo15497e(C37819y0.m16067b(context).invokeOnTimeout(this.f100911a, runnableC38163a, context));
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC38167e m15535b() {
        C38164b c38164b = C38164b.f100914c;
        Intrinsics.m17073h(c38164b, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C38168f(this, (InterfaceC45268n) TypeIntrinsics.m17006e(c38164b, 3), null, 4, null);
    }
}

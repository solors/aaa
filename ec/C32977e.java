package ec;

import ec.DefaultRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1060yb.HttpClientConfig;
import p849qc.KtorSimpleLoggerJvm;
import p852qf.InterfaceC39416a;

/* compiled from: DefaultRequest.kt */
@Metadata
/* renamed from: ec.e */
/* loaded from: classes9.dex */
public final class C32977e {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC39416a f89875a = KtorSimpleLoggerJvm.m12789a("io.ktor.client.plugins.DefaultRequest");

    /* compiled from: DefaultRequest.kt */
    @Metadata
    /* renamed from: ec.e$a */
    /* loaded from: classes9.dex */
    static final class C32978a extends Lambda implements Function1<DefaultRequest.C32974a, Unit> {

        /* renamed from: g */
        final /* synthetic */ Function1<DefaultRequest.C32974a, Unit> f89876g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C32978a(Function1<? super DefaultRequest.C32974a, Unit> function1) {
            super(1);
            this.f89876g = function1;
        }

        /* renamed from: a */
        public final void m25339a(@NotNull DefaultRequest.C32974a install) {
            Intrinsics.checkNotNullParameter(install, "$this$install");
            this.f89876g.invoke(install);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultRequest.C32974a c32974a) {
            m25339a(c32974a);
            return Unit.f99208a;
        }
    }

    /* renamed from: b */
    public static final void m25340b(@NotNull HttpClientConfig<?> httpClientConfig, @NotNull Function1<? super DefaultRequest.C32974a, Unit> block) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.m945g(DefaultRequest.f89866b, new C32978a(block));
    }
}

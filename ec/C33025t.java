package ec;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37726f2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.InterfaceC37708b2;
import kotlinx.coroutines.InterfaceC37731g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p849qc.KtorSimpleLoggerJvm;
import p852qf.InterfaceC39416a;

/* compiled from: HttpRequestLifecycle.kt */
@Metadata
/* renamed from: ec.t */
/* loaded from: classes9.dex */
public final class C33025t {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC39416a f90012a = KtorSimpleLoggerJvm.m12789a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpRequestLifecycle.kt */
    @Metadata
    /* renamed from: ec.t$a */
    /* loaded from: classes9.dex */
    public static final class C33026a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC37731g1 f90013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33026a(InterfaceC37731g1 interfaceC37731g1) {
            super(1);
            this.f90013g = interfaceC37731g1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.f90013g.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpRequestLifecycle.kt */
    @Metadata
    /* renamed from: ec.t$b */
    /* loaded from: classes9.dex */
    public static final class C33027b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        final /* synthetic */ CompletableJob f90014g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33027b(CompletableJob completableJob) {
            super(1);
            this.f90014g = completableJob;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            if (th != null) {
                InterfaceC39416a interfaceC39416a = C33025t.f90012a;
                interfaceC39416a.mo12256a("Cancelling request because engine Job failed with error: " + th);
                C37726f2.m16366d(this.f90014g, "Engine failed", th);
                return;
            }
            C33025t.f90012a.mo12256a("Cancelling request because engine Job completed");
            this.f90014g.complete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m25256c(CompletableJob completableJob, InterfaceC37708b2 interfaceC37708b2) {
        completableJob.mo16119k(new C33026a(interfaceC37708b2.mo16119k(new C33027b(completableJob))));
    }
}

package p1003v;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45292c0;
import p1077ze.InterfaceC45299e;
import p1077ze.InterfaceC45301f;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: Calls.kt */
@Metadata
/* renamed from: v.k */
/* loaded from: classes2.dex */
final class C44479k implements InterfaceC45301f, Function1<Throwable, Unit> {
    @NotNull

    /* renamed from: b */
    private final InterfaceC45299e f116749b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC37780o<C45292c0> f116750c;

    /* JADX WARN: Multi-variable type inference failed */
    public C44479k(@NotNull InterfaceC45299e interfaceC45299e, @NotNull InterfaceC37780o<? super C45292c0> interfaceC37780o) {
        this.f116749b = interfaceC45299e;
        this.f116750c = interfaceC37780o;
    }

    /* renamed from: a */
    public void m2808a(@Nullable Throwable th) {
        try {
            this.f116749b.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        m2808a(th);
        return Unit.f99208a;
    }

    @Override // p1077ze.InterfaceC45301f
    public void onFailure(@NotNull InterfaceC45299e interfaceC45299e, @NotNull IOException iOException) {
        if (!interfaceC45299e.isCanceled()) {
            InterfaceC37780o<C45292c0> interfaceC37780o = this.f116750c;
            Result.C38506a c38506a = Result.f101870c;
            interfaceC37780o.resumeWith(Result.m14549b(C38508r.m14540a(iOException)));
        }
    }

    @Override // p1077ze.InterfaceC45301f
    public void onResponse(@NotNull InterfaceC45299e interfaceC45299e, @NotNull C45292c0 c45292c0) {
        this.f116750c.resumeWith(Result.m14549b(c45292c0));
    }
}

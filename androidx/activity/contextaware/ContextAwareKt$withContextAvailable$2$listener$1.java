package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37780o;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: ContextAware.kt */
@Metadata
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC37780o<R> $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC37780o<R> interfaceC37780o, Function1<Context, R> function1) {
        this.$co = interfaceC37780o;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(@NotNull Context context) {
        Object m14549b;
        Intrinsics.checkNotNullParameter(context, "context");
        Continuation continuation = this.$co;
        Function1<Context, R> function1 = this.$onContextAvailable;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(function1.invoke(context));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        continuation.resumeWith(m14549b);
    }
}

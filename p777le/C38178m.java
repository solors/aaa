package p777le;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC37780o;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: SelectOld.kt */
@Metadata
/* renamed from: le.m */
/* loaded from: classes8.dex */
public final class C38178m {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> void m15482c(InterfaceC37780o<? super T> interfaceC37780o, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) interfaceC37780o.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            interfaceC37780o.mo15169D(coroutineDispatcher, t);
        } else {
            interfaceC37780o.resumeWith(Result.m14549b(t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m15481d(InterfaceC37780o<?> interfaceC37780o, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) interfaceC37780o.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            interfaceC37780o.mo15163j(coroutineDispatcher, th);
            return;
        }
        Result.C38506a c38506a = Result.f101870c;
        interfaceC37780o.resumeWith(Result.m14549b(C38508r.m14540a(th)));
    }
}

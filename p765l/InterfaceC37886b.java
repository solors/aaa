package p765l;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p837q.AbstractC39308j;
import p837q.C39305i;
import p853r.C39424i;

/* compiled from: Interceptor.kt */
@Metadata
/* renamed from: l.b */
/* loaded from: classes2.dex */
public interface InterfaceC37886b {

    /* compiled from: Interceptor.kt */
    @Metadata
    /* renamed from: l.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC37887a {
        @NotNull
        C39305i getRequest();

        @NotNull
        C39424i getSize();
    }

    @Nullable
    /* renamed from: a */
    Object mo15849a(@NotNull InterfaceC37887a interfaceC37887a, @NotNull Continuation<? super AbstractC39308j> continuation);
}

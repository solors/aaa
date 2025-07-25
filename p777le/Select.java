package p777le;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: le.c */
/* loaded from: classes8.dex */
public interface Select<R> {
    /* renamed from: b */
    void mo15524b(@NotNull InterfaceC38167e interfaceC38167e, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);

    /* renamed from: c */
    <Q> void mo15523c(@NotNull InterfaceC38169g<? extends Q> interfaceC38169g, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);
}

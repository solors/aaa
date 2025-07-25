package p777le;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnTimeout.kt */
@Metadata
/* renamed from: le.b */
/* loaded from: classes8.dex */
public final class C38165b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <R> void m15532a(@NotNull Select<? super R> select, long j, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        select.mo15524b(new OnTimeout(j).m15535b(), function1);
    }
}

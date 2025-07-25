package p804nd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;
import sd.C42688d;

/* compiled from: DeepRecursive.kt */
@Metadata
/* renamed from: nd.b */
/* loaded from: classes5.dex */
public final class C38490b {
    @NotNull

    /* renamed from: a */
    private static final Object f101848a;

    static {
        Object m6959e;
        Result.C38506a c38506a = Result.f101870c;
        m6959e = C42688d.m6959e();
        f101848a = Result.m14549b(m6959e);
    }

    /* renamed from: b */
    public static final <T, R> R m14611b(@NotNull DeepRecursive<T, R> deepRecursive, T t) {
        Intrinsics.checkNotNullParameter(deepRecursive, "<this>");
        return (R) new C38493d(deepRecursive.m14619a(), t).m14592b();
    }
}

package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: URLProtocol.kt */
@Metadata
/* renamed from: kc.m0 */
/* loaded from: classes9.dex */
public final class C37472m0 {
    /* renamed from: a */
    public static final boolean m17932a(@NotNull URLProtocol uRLProtocol) {
        Intrinsics.checkNotNullParameter(uRLProtocol, "<this>");
        if (!Intrinsics.m17075f(uRLProtocol.m17936d(), "https") && !Intrinsics.m17075f(uRLProtocol.m17936d(), "wss")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m17931b(@NotNull URLProtocol uRLProtocol) {
        Intrinsics.checkNotNullParameter(uRLProtocol, "<this>");
        if (!Intrinsics.m17075f(uRLProtocol.m17936d(), "ws") && !Intrinsics.m17075f(uRLProtocol.m17936d(), "wss")) {
            return false;
        }
        return true;
    }
}

package p675ff;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ff.f */
/* loaded from: classes10.dex */
public final class HttpMethod {
    @NotNull

    /* renamed from: a */
    public static final HttpMethod f90510a = new HttpMethod();

    private HttpMethod() {
    }

    /* renamed from: b */
    public static final boolean m24623b(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.m17075f(method, "GET") && !Intrinsics.m17075f(method, "HEAD")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m24620e(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.m17075f(method, "POST") && !Intrinsics.m17075f(method, "PUT") && !Intrinsics.m17075f(method, "PATCH") && !Intrinsics.m17075f(method, "PROPPATCH") && !Intrinsics.m17075f(method, "REPORT")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m24624a(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.m17075f(method, "POST") && !Intrinsics.m17075f(method, "PATCH") && !Intrinsics.m17075f(method, "PUT") && !Intrinsics.m17075f(method, "DELETE") && !Intrinsics.m17075f(method, "MOVE")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m24622c(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.m17075f(method, "PROPFIND");
    }

    /* renamed from: d */
    public final boolean m24621d(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.m17075f(method, "PROPFIND");
    }
}

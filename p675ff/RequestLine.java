package p675ff;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1077ze.C45275a0;
import p1077ze.HttpUrl;

@Metadata
/* renamed from: ff.i */
/* loaded from: classes10.dex */
public final class RequestLine {
    @NotNull

    /* renamed from: a */
    public static final RequestLine f90523a = new RequestLine();

    private RequestLine() {
    }

    /* renamed from: b */
    private final boolean m24609b(C45275a0 c45275a0, Proxy.Type type) {
        if (!c45275a0.m489g() && type == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public final String m24610a(@NotNull C45275a0 request, @NotNull Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m488h());
        sb2.append(' ');
        RequestLine requestLine = f90523a;
        if (requestLine.m24609b(request, proxyType)) {
            sb2.append(request.m486j());
        } else {
            sb2.append(requestLine.m24608c(request.m486j()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @NotNull
    /* renamed from: c */
    public final String m24608c(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String m175d = url.m175d();
        String m173f = url.m173f();
        if (m173f != null) {
            return m175d + '?' + ((Object) m173f);
        }
        return m175d;
    }
}

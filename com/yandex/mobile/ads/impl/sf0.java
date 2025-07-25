package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sf0 extends AbstractC31047oj {
    @Nullable

    /* renamed from: a */
    private final SSLSocketFactory f85219a;
    @NotNull

    /* renamed from: b */
    private final oa1 f85220b;

    public sf0(@Nullable n32 n32Var, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f85219a = sSLSocketFactory;
        this.f85220b = new oa1(n32Var);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31047oj
    @NotNull
    /* renamed from: a */
    public final jf0 mo27164a(@NotNull ml1<?> request, @NotNull Map<String, String> additionalHeaders) throws IOException, C30313fh {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(additionalHeaders, "additionalHeaders");
        int m31945j = request.m31945j();
        int i = ka1.f81354c;
        ja1 m32611a = ka1.m32611a(m31945j, m31945j, this.f85219a);
        nl1 request2 = this.f85220b.m31121a(request, additionalHeaders);
        Intrinsics.checkNotNullParameter(request2, "request");
        int i2 = 0;
        mm1 response = new qj1(m32611a, request2, false).m30307b();
        int m31926d = response.m31926d();
        TreeMap requestHeaders = response.m31923g().m26276c();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : requestHeaders.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                arrayList.add(new tc0(str, str2));
            }
        }
        InputStream inputStream = null;
        if (request.m31948f() != 4 && ((100 > m31926d || m31926d >= 200) && m31926d != 204 && m31926d != 304)) {
            qm1 m31930a = response.m31930a();
            if (m31930a != null) {
                i2 = (int) m31930a.mo28297a();
            }
            Intrinsics.checkNotNullParameter(response, "response");
            qm1 m31930a2 = response.m31930a();
            if (m31930a2 != null) {
                inputStream = m31930a2.mo28295c().inputStream();
            }
            return new jf0(m31926d, arrayList, i2, inputStream);
        }
        return new jf0(m31926d, arrayList, -1, null);
    }
}

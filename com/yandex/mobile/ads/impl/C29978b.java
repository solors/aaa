package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.yandex.mobile.ads.impl.b */
/* loaded from: classes8.dex */
public final class C29978b implements InterfaceC29905a {
    @NotNull

    /* renamed from: a */
    private final p32 f76978a;

    public C29978b(@NotNull p32 urlUtils) {
        Intrinsics.checkNotNullParameter(urlUtils, "urlUtils");
        this.f76978a = urlUtils;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29905a
    /* renamed from: a */
    public final boolean mo35725a(@Nullable String str) {
        Object m14549b;
        this.f76978a.getClass();
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(Uri.parse(str).getPathSegments());
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        String str2 = null;
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        List list = (List) m14549b;
        if (list != null && !list.isEmpty()) {
            str2 = (String) list.get(0);
        }
        return Intrinsics.m17075f("appcry", str2);
    }
}

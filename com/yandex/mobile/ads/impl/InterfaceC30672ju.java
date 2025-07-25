package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.ju */
/* loaded from: classes8.dex */
public interface InterfaceC30672ju extends InterfaceC30417gu {

    /* renamed from: com.yandex.mobile.ads.impl.ju$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30673a {
        /* renamed from: a */
        InterfaceC30672ju mo28285a();
    }

    /* renamed from: a */
    long mo27541a(C30976nu c30976nu) throws IOException;

    /* renamed from: a */
    void mo28290a(y12 y12Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @Nullable
    Uri getUri();
}

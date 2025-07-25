package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.serverapi.InterfaceC15397d;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.network.S */
/* loaded from: classes4.dex */
public final class C14684S {

    /* renamed from: a */
    public HashMap f27819a;

    public C14684S(InneractiveAdRequest inneractiveAdRequest, InterfaceC15397d interfaceC15397d) {
    }

    /* renamed from: a */
    public final void m77721a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f27819a.put(str, str2);
        }
    }
}

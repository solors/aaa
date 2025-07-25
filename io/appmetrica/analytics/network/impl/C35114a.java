package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.network.impl.a */
/* loaded from: classes9.dex */
public final class C35114a extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ HttpsURLConnection f95819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35114a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f95819a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f95819a.getInputStream();
    }
}

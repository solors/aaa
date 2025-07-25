package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Functions;

/* renamed from: io.appmetrica.analytics.billingv6.impl.h */
/* loaded from: classes9.dex */
public final class C33697h extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C33700k f92291a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f92292b;

    /* renamed from: c */
    public final /* synthetic */ List f92293c;

    public C33697h(C33700k c33700k, BillingResult billingResult, List list) {
        this.f92291a = c33700k;
        this.f92292b = billingResult;
        this.f92293c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C33700k c33700k = this.f92291a;
        BillingResult billingResult = this.f92292b;
        List list = this.f92293c;
        c33700k.getClass();
        if (billingResult.getResponseCode() == 0 && !list.isEmpty()) {
            UtilsProvider utilsProvider = c33700k.f92300c;
            Functions functions = c33700k.f92301d;
            List list2 = c33700k.f92302e;
            C33696g c33696g = c33700k.f92303f;
            C33707r c33707r = new C33707r(utilsProvider, functions, list2, list, c33696g);
            c33696g.f92290c.add(c33707r);
            c33700k.f92300c.getUiExecutor().execute(new C33699j(c33700k, c33707r));
        }
        C33700k c33700k2 = this.f92291a;
        c33700k2.f92303f.m22815a(c33700k2);
    }
}

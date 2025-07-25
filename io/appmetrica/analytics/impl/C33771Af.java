package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.Af */
/* loaded from: classes9.dex */
public final class C33771Af implements InterfaceC34061Ma {

    /* renamed from: a */
    public final InstallReferrerClient f92569a;

    /* renamed from: b */
    public final ICommonExecutor f92570b;

    public C33771Af(@NonNull Context context, @NonNull ICommonExecutor iCommonExecutor) throws Throwable {
        this(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34061Ma
    /* renamed from: a */
    public final void mo22428a(@NonNull InterfaceC34018Kf interfaceC34018Kf) throws Throwable {
        this.f92569a.startConnection(new C35041yf(this, interfaceC34018Kf));
    }

    public C33771Af(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f92569a = installReferrerClient;
        this.f92570b = iCommonExecutor;
    }
}

package com.moloco.sdk.internal;

import android.net.Uri;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25432i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.g */
/* loaded from: classes7.dex */
public final class C23979g implements InterfaceC23978f {
    @NotNull

    /* renamed from: a */
    public final InterfaceC25432i f62057a;

    public C23979g(@NotNull InterfaceC25432i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f62057a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.InterfaceC23978f
    /* renamed from: a */
    public void mo47246a(@NotNull String burl) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        try {
            Uri parse = Uri.parse(burl);
            InterfaceC25432i interfaceC25432i = this.f62057a;
            String uri = parse.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "preparedUrl.toString()");
            interfaceC25432i.mo44572a(uri);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e.toString(), null, false, 12, null);
        }
    }
}

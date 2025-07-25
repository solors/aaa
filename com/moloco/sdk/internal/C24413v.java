package com.moloco.sdk.internal;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.internal.utils.C24412c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25432i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@VisibleForTesting
/* renamed from: com.moloco.sdk.internal.v */
/* loaded from: classes7.dex */
public final class C24413v implements InterfaceC24408u {
    @NotNull

    /* renamed from: a */
    public final InterfaceC25432i f63141a;

    public C24413v(@NotNull InterfaceC25432i persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f63141a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.InterfaceC24408u
    /* renamed from: a */
    public boolean mo46477a(@NotNull String url, long j, @Nullable C24229q c24229q) {
        InterfaceC24576c m46751b;
        Intrinsics.checkNotNullParameter(url, "url");
        if (c24229q != null) {
            try {
                m46751b = c24229q.m46751b();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            m46751b = null;
        }
        Uri build = Uri.parse(m46476b(url, j, m46751b)).buildUpon().build();
        InterfaceC25432i interfaceC25432i = this.f63141a;
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "preparedUrl.toString()");
        interfaceC25432i.mo44572a(uri);
        return true;
    }

    /* renamed from: b */
    public final String m46476b(String str, long j, InterfaceC24576c interfaceC24576c) {
        String m46480c;
        if (interfaceC24576c != null && (m46480c = C24412c.m46480c(str, interfaceC24576c.mo46097a())) != null) {
            str = m46480c;
        }
        return C24412c.m46481b(str, j);
    }
}

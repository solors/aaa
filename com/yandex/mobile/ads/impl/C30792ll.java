package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;
import p1046xd.IOStreams;

/* renamed from: com.yandex.mobile.ads.impl.ll */
/* loaded from: classes8.dex */
public class C30792ll implements InterfaceC30120cu {

    /* renamed from: a */
    private final Context f81846a;

    public C30792ll(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81846a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30120cu
    @NotNull
    /* renamed from: a */
    public byte[][] mo27436a() {
        try {
            InputStream openRawResource = this.f81846a.getResources().openRawResource(C29880R.raw.monetization_ads_bundled_cert);
            Intrinsics.m17074g(openRawResource);
            byte[] m1221c = IOStreams.m1221c(openRawResource);
            Closeable.m1220a(openRawResource, null);
            return new byte[][]{m1221c};
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create cert", e);
        }
    }
}

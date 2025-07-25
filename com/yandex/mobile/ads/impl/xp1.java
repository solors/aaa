package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1046xd.Closeable;
import p1046xd.IOStreams;

/* loaded from: classes8.dex */
public final class xp1 extends C30792ll {

    /* renamed from: b */
    private final Context f87774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87774b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.C30792ll, com.yandex.mobile.ads.impl.InterfaceC30120cu
    @NotNull
    /* renamed from: a */
    public final byte[][] mo27436a() {
        Object[] m17404D;
        try {
            InputStream openRawResource = this.f87774b.getResources().openRawResource(C29880R.raw.monetization_ads_sdkinternalca);
            Intrinsics.m17074g(openRawResource);
            byte[] m1221c = IOStreams.m1221c(openRawResource);
            Closeable.m1220a(openRawResource, null);
            m17404D = _ArraysJvm.m17404D(super.mo27436a(), new byte[][]{m1221c});
            return (byte[][]) m17404D;
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create cert", e);
        }
    }
}

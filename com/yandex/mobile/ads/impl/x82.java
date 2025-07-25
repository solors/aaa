package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.yandex.mobile.ads.impl.f92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class x82 {

    /* renamed from: a */
    private final Context f87595a;
    @NotNull

    /* renamed from: b */
    private final ra2 f87596b;
    @NotNull

    /* renamed from: c */
    private final wa2 f87597c;

    public x82(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87595a = context.getApplicationContext();
        this.f87596b = new ra2();
        this.f87597c = new wa2();
    }

    /* renamed from: a */
    public final void m27625a(@NotNull List<String> rawUrls, @Nullable Map<String, String> macros) {
        int m17154x;
        boolean z;
        Intrinsics.checkNotNullParameter(rawUrls, "rawUrls");
        m17154x = C37566w.m17154x(rawUrls, 10);
        ArrayList trackingUrls = new ArrayList(m17154x);
        for (String url : rawUrls) {
            if (macros != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f87596b.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String str = url;
                for (Map.Entry<String, String> entry : macros.entrySet()) {
                    str = StringsJVM.m16628I(str, entry.getKey(), entry.getValue(), false, 4, null);
                }
                url = str;
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
            trackingUrls.add(url);
        }
        this.f87597c.getClass();
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        ArrayList arrayList = new ArrayList();
        Iterator it = trackingUrls.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!Intrinsics.m17075f((String) next, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f92.C30301a c30301a = f92.f79017c;
            Context applicationContext = this.f87595a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            c30301a.m34188a(applicationContext).m34189a((String) it2.next());
        }
    }
}

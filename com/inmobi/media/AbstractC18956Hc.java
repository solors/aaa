package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38513v;

/* renamed from: com.inmobi.media.Hc */
/* loaded from: classes6.dex */
public abstract class AbstractC18956Hc {
    /* renamed from: a */
    public static boolean m61043a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        boolean z;
        Map m17279o;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Tuples m14532a = C38513v.m14532a("source", source);
        if (renderProcessGoneDetail != null) {
            z = renderProcessGoneDetail.didCrash();
        } else {
            z = false;
        }
        m17279o = C37559r0.m17279o(m14532a, C38513v.m14532a("isCrashed", Boolean.valueOf(z)));
        C19262eb c19262eb = C19262eb.f48183a;
        C19262eb.m60370b("WebViewRenderProcessGoneEvent", m17279o, EnumC19332jb.f48415a);
        view.destroy();
        return true;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.yl1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ta1 {

    /* renamed from: a */
    private final Context f85560a;
    @NotNull

    /* renamed from: b */
    private final va1 f85561b;
    @NotNull

    /* renamed from: c */
    private final yl1 f85562c;
    @NotNull

    /* renamed from: d */
    private final as1 f85563d;

    public ta1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85560a = context.getApplicationContext();
        this.f85561b = wa1.m27997a(context);
        int i = yl1.f88258c;
        this.f85562c = yl1.C31906a.m26857a();
        int i2 = as1.f76895l;
        this.f85563d = as1.C29962a.m35776a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.ta1$a */
    /* loaded from: classes8.dex */
    public final class C31433a implements om1.InterfaceC31054b<String>, om1.InterfaceC31053a {
        @NotNull

        /* renamed from: a */
        private final String f85564a;
        @NotNull

        /* renamed from: b */
        private final p52 f85565b;

        /* renamed from: c */
        final /* synthetic */ ta1 f85566c;

        public C31433a(ta1 ta1Var, @NotNull String omSdkControllerUrl, @NotNull p52 listener) {
            Intrinsics.checkNotNullParameter(omSdkControllerUrl, "omSdkControllerUrl");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f85566c = ta1Var;
            this.f85564a = omSdkControllerUrl;
            this.f85565b = listener;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@NotNull yc2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f85565b.mo28830b();
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
        /* renamed from: a */
        public final void mo28555a(String str) {
            String response = str;
            Intrinsics.checkNotNullParameter(response, "response");
            this.f85566c.f85561b.m28379a(response);
            this.f85566c.f85561b.m28377b(this.f85564a);
            this.f85565b.mo28830b();
        }
    }

    /* renamed from: a */
    public final void m29246a() {
        yl1 yl1Var = this.f85562c;
        Context appContext = this.f85560a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        yl1Var.getClass();
        yl1.m26862a(appContext, "om_sdk_js_request_tag");
    }

    /* renamed from: a */
    public final void m29245a(@NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        as1 as1Var = this.f85563d;
        Context appContext = this.f85560a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        yp1 m35796a = as1Var.m35796a(appContext);
        String m26792E = m35796a != null ? m35796a.m26792E() : null;
        String m28378b = this.f85561b.m28378b();
        if (m26792E != null && m26792E.length() > 0 && !Intrinsics.m17075f(m26792E, m28378b)) {
            C31433a c31433a = new C31433a(this, m26792E, listener);
            fy1 request = new fy1(m26792E, c31433a, c31433a);
            request.m31954b((Object) "om_sdk_js_request_tag");
            yl1 yl1Var = this.f85562c;
            Context context = this.f85560a;
            Intrinsics.checkNotNullExpressionValue(context, "appContext");
            synchronized (yl1Var) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(request, "request");
                m91.m32067a(context).m35826a(request);
            }
            return;
        }
        ua1.m28839a(ua1.this);
    }
}

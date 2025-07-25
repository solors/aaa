package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.fl1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bu */
/* loaded from: classes8.dex */
public final class C30046bu implements gz1 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31608us f77401a;
    @NotNull

    /* renamed from: b */
    private final C30537i8 f77402b;
    @NotNull

    /* renamed from: c */
    private final Handler f77403c;

    /* renamed from: com.yandex.mobile.ads.impl.bu$a */
    /* loaded from: classes8.dex */
    public final class C30047a implements InterfaceC31679vs {
        public C30047a() {
            C30046bu.this = r1;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31679vs
        public final void onLeftApplication() {
            C30046bu.this.f77402b.mo28535a(19, null);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31679vs
        public final void onReturnedToApplication() {
            C30046bu.this.f77402b.mo28535a(20, null);
        }
    }

    public C30046bu(@NotNull InterfaceC31608us customClickHandler, @NotNull C30537i8 resultReceiver, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(customClickHandler, "customClickHandler");
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f77401a = customClickHandler;
        this.f77402b = resultReceiver;
        this.f77403c = handler;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    /* renamed from: a */
    public final void mo31254a(@NotNull kl1 reporter, @NotNull final String targetUrl) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", "custom");
        fl1.EnumC30324b enumC30324b = fl1.EnumC30324b.f79139c;
        reporter.mo26082a(hashMap);
        this.f77403c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.gl2
            {
                C30046bu.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30046bu.m35440a(C30046bu.this, targetUrl);
            }
        });
    }

    /* renamed from: a */
    public static final void m35440a(C30046bu this$0, String targetUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(targetUrl, "$targetUrl");
        this$0.f77401a.mo25940a(targetUrl, new C30047a());
    }
}

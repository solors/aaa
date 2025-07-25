package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.sg0;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class ng0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30944a f82771a;
    @NotNull

    /* renamed from: b */
    private final wg0 f82772b;
    @NotNull

    /* renamed from: c */
    private final sg0 f82773c;

    /* renamed from: com.yandex.mobile.ads.impl.ng0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30944a {
        /* renamed from: a */
        boolean mo27472a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ng0$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30945b {
        /* renamed from: a */
        void mo27693a(@Nullable Bitmap bitmap);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ng0$c */
    /* loaded from: classes8.dex */
    public static final class C30946c implements sg0.InterfaceC31359d {

        /* renamed from: b */
        final /* synthetic */ String f82775b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC30945b f82776c;

        C30946c(String str, InterfaceC30945b interfaceC30945b) {
            this.f82775b = str;
            this.f82776c = interfaceC30945b;
        }

        @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
        /* renamed from: a */
        public final void mo29243a(@Nullable yc2 yc2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.sg0.InterfaceC31359d
        /* renamed from: a */
        public final void mo29321a(@Nullable sg0.C31358c c31358c, boolean z) {
            Map<String, Bitmap> m17291g;
            Bitmap m29608b = c31358c.m29608b();
            if (m29608b != null) {
                ng0 ng0Var = ng0.this;
                String str = this.f82775b;
                InterfaceC30945b interfaceC30945b = this.f82776c;
                wg0 wg0Var = ng0Var.f82772b;
                m17291g = MapsJVM.m17291g(C38513v.m14532a(str, m29608b));
                wg0Var.mo27907a(m17291g);
                interfaceC30945b.mo27693a(m29608b);
            }
        }
    }

    public /* synthetic */ ng0(Context context, InterfaceC30944a interfaceC30944a, wg0 wg0Var) {
        this(context, interfaceC30944a, wg0Var, n91.f82636c.m31632a(context).m31635b());
    }

    /* renamed from: a */
    public final void m31517a(@NotNull bh0 imageValue, @NotNull InterfaceC30945b listener) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Bitmap mo27906b = this.f82772b.mo27906b(imageValue);
        if (mo27906b != null) {
            listener.mo27693a(mo27906b);
            return;
        }
        listener.mo27693a(this.f82772b.mo27909a(imageValue));
        if (this.f82771a.mo27472a()) {
            String m35470f = imageValue.m35470f();
            int m35475a = imageValue.m35475a();
            this.f82773c.m29624a(m35470f, new C30946c(m35470f, listener), imageValue.m35469g(), m35475a);
        }
    }

    public ng0(@NotNull Context context, @NotNull InterfaceC30944a configuration, @NotNull wg0 imageProvider, @NotNull sg0 imageLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f82771a = configuration;
        this.f82772b = imageProvider;
        this.f82773c = imageLoader;
    }
}

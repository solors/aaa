package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.ads.C29551o0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.omsdk.d */
/* loaded from: classes7.dex */
public final class OMTracker implements WebViewObserver {
    @NotNull
    public static final C29384a Companion = new C29384a(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    @Nullable
    private AdSession adSession;
    private final boolean enabled;
    private boolean started;

    /* compiled from: OMTracker.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.omsdk.d$b */
    /* loaded from: classes7.dex */
    public static final class C29385b {
        @NotNull
        public final OMTracker make(boolean z) {
            return new OMTracker(z, null);
        }
    }

    public /* synthetic */ OMTracker(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    @Override // com.vungle.ads.internal.omsdk.WebViewObserver
    public void onPageFinished(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.started && this.adSession == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(C29551o0.OMSDK_PARTNER_NAME, C29551o0.VERSION_NAME), webView, null, null));
            this.adSession = createAdSession;
            if (createAdSession != null) {
                createAdSession.registerAdView(webView);
            }
            AdSession adSession = this.adSession;
            if (adSession != null) {
                adSession.start();
            }
        }
    }

    public final void start() {
        if (this.enabled && Omid.isActive()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j;
        AdSession adSession;
        if (this.started && (adSession = this.adSession) != null) {
            if (adSession != null) {
                adSession.finish();
            }
            j = DESTROY_DELAY_MS;
        } else {
            j = 0;
        }
        this.started = false;
        this.adSession = null;
        return j;
    }

    private OMTracker(boolean z) {
        this.enabled = z;
    }

    /* compiled from: OMTracker.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.omsdk.d$a */
    /* loaded from: classes7.dex */
    public static final class C29384a {
        private C29384a() {
        }

        public /* synthetic */ C29384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return OMTracker.DESTROY_DELAY_MS;
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }
}

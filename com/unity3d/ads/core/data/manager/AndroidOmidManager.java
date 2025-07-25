package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.Omid;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidOmidManager.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Omid.activate(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdEvents createAdEvents(@NotNull AdSession adSession) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        Intrinsics.checkNotNullExpressionValue(createAdEvents, "createAdEvents(adSession)");
        return createAdEvents;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSession createAdSession(@NotNull AdSessionConfiguration adSessionConfiguration, @NotNull AdSessionContext context) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, context);
        Intrinsics.checkNotNullExpressionValue(createAdSession, "createAdSession(adSessionConfiguration, context)");
        return createAdSession;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionConfiguration createAdSessionConfiguration(@NotNull CreativeType creativeType, @NotNull ImpressionType impressionType, @NotNull Owner owner, @NotNull Owner mediaEventsOwner, boolean z) {
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, mediaEventsOwner, z);
        Intrinsics.checkNotNullExpressionValue(createAdSessionConfiguration, "createAdSessionConfigura…VerificationScripts\n    )");
        return createAdSessionConfiguration;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionContext createHtmlAdSessionContext(@Nullable Partner partner, @Nullable WebView webView, @Nullable String str, @Nullable String str2) {
        AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionConte…customReferenceData\n    )");
        return createHtmlAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public AdSessionContext createJavaScriptAdSessionContext(@Nullable Partner partner, @Nullable WebView webView, @Nullable String str, @Nullable String str2) {
        AdSessionContext createJavascriptAdSessionContext = AdSessionContext.createJavascriptAdSessionContext(partner, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(createJavascriptAdSessionContext, "createJavascriptAdSessio…customReferenceData\n    )");
        return createJavascriptAdSessionContext;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public String getVersion() {
        String version = Omid.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion()");
        return version;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return Omid.isActive();
    }
}

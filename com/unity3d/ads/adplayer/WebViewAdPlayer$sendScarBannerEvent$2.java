package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WebViewAdPlayer$sendScarBannerEvent$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ BannerBridge.BannerEvent $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendScarBannerEvent$2(BannerBridge.BannerEvent bannerEvent) {
        super(0);
        this.$event = bannerEvent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnScarBannerEvent(this.$event);
    }
}

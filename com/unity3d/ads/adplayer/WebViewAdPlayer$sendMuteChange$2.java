package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendMuteChange$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ boolean $isMuted;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendMuteChange$2(boolean z) {
        super(0);
        this.$isMuted = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnMuteChangeEvent(this.$isMuted);
    }
}

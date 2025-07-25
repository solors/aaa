package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendVolumeChange$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ double $volume;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendVolumeChange$2(double d) {
        super(0);
        this.$volume = d;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnVolumeChangeEvent(this.$volume);
    }
}

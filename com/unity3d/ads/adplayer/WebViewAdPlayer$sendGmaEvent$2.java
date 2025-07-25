package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.scar.adapter.common.GMAEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendGmaEvent$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ GMAEvent $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendGmaEvent$2(GMAEvent gMAEvent) {
        super(0);
        this.$event = gMAEvent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnGmaEvent(this.$event);
    }
}

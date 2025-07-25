package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendVisibilityChange$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ boolean $isVisible;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendVisibilityChange$2(boolean z) {
        super(0);
        this.$isVisible = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnVisibilityChangeEvent(this.$isVisible);
    }
}

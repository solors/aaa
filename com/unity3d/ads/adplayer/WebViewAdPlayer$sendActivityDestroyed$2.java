package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendActivityDestroyed$2 extends Lambda implements Functions<WebViewEvent> {
    public static final WebViewAdPlayer$sendActivityDestroyed$2 INSTANCE = new WebViewAdPlayer$sendActivityDestroyed$2();

    WebViewAdPlayer$sendActivityDestroyed$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        return new OnActivityDestroyedEvent();
    }
}

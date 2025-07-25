package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$onBroadcastEvent$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ String $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$onBroadcastEvent$2(String str) {
        super(0);
        this.$event = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        JSONObject jSONObject = new JSONObject(this.$event);
        String eventType = jSONObject.getString("eventType");
        String optString = jSONObject.optString("data");
        Intrinsics.checkNotNullExpressionValue(eventType, "eventType");
        return new OnBroadcastEvent(eventType, optString);
    }
}

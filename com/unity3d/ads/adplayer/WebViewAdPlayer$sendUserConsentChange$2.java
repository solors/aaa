package com.unity3d.ads.adplayer;

import android.util.Base64;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewAdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
final class WebViewAdPlayer$sendUserConsentChange$2 extends Lambda implements Functions<WebViewEvent> {
    final /* synthetic */ byte[] $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendUserConsentChange$2(byte[] bArr) {
        super(0);
        this.$value = bArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final WebViewEvent invoke() {
        String encodeToString = Base64.encodeToString(this.$value, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(value, Base64.NO_WRAP)");
        return new OnUserConsentChangeEvent(encodeToString);
    }
}

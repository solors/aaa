package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* compiled from: AndroidSendWebViewClientErrorDiagnostics.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(@NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(@NotNull List<WebViewClientError> errors) {
        boolean z;
        Map map;
        Map m17279o;
        Intrinsics.checkNotNullParameter(errors, "errors");
        for (WebViewClientError webViewClientError : errors) {
            String url = webViewClientError.getUrl();
            if (url != null && url.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                map = MapsJVM.m17291g(C38513v.m14532a("webview_url", webViewClientError.getUrl()));
            } else {
                map = null;
            }
            Map map2 = map;
            m17279o = C37559r0.m17279o(C38513v.m14532a("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                m17279o.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, map2, m17279o, null, 18, null);
        }
    }
}

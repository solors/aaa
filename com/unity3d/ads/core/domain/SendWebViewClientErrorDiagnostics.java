package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SendWebViewClientErrorDiagnostics.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SendWebViewClientErrorDiagnostics {
    void invoke(@NotNull List<WebViewClientError> list);
}

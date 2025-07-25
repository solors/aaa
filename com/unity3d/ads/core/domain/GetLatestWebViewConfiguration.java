package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetLatestWebViewConfiguration.kt */
@Metadata
/* loaded from: classes7.dex */
public final class GetLatestWebViewConfiguration {
    @NotNull
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(@NotNull WebviewConfigurationDataSource webviewConfigurationDataSource) {
        Intrinsics.checkNotNullParameter(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.Integer r10, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.WebViewConfiguration> r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke(java.lang.String, java.lang.Integer, java.util.List, kotlin.coroutines.d):java.lang.Object");
    }
}

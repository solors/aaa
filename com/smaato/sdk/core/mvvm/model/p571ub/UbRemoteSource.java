package com.smaato.sdk.core.mvvm.model.p571ub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.mvvm.model.AdResponse;
import com.smaato.sdk.core.mvvm.model.AdResponseParser;
import com.smaato.sdk.core.p568ad.AdFormat;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.mvvm.model.ub.UbRemoteSource */
/* loaded from: classes7.dex */
public interface UbRemoteSource {
    boolean isUbRequest(String str, String str2);

    AdResponse loadAd(@NonNull String str, @Nullable String str2) throws IOException;

    void setAdResponseParsers(@NonNull Map<AdFormat, AdResponseParser> map);
}

package com.p551my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.my.target.mediation.AdNetworkLoader */
/* loaded from: classes7.dex */
public interface AdNetworkLoader {

    /* renamed from: com.my.target.mediation.AdNetworkLoader$AdParamsListener */
    /* loaded from: classes7.dex */
    public interface AdParamsListener {
        void onLoad(@NonNull AdNetworkLoader adNetworkLoader, @NonNull Map<String, String> map, @Nullable String str);
    }

    void loadParams(@NonNull String str, @NonNull Context context);

    void setAdParamsListener(@Nullable AdParamsListener adParamsListener);
}

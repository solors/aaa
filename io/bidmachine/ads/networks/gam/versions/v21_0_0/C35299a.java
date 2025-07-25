package io.bidmachine.ads.networks.gam.versions.v21_0_0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import java.util.Map;

/* renamed from: io.bidmachine.ads.networks.gam.versions.v21_0_0.a */
/* loaded from: classes9.dex */
class C35299a {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static AdManagerAdRequest m20574a(@NonNull GAMLoader gAMLoader, @NonNull GAMUnitData gAMUnitData) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = gAMLoader.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : gAMUnitData.getCustomTargeting().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting2(key, value);
            }
        }
        return builder.build();
    }
}

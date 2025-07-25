package io.bidmachine.ads.networks.gam;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class GAMUnitDataFactory {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static GAMUnitData create(@NonNull String str, @NonNull JSONObject jSONObject) {
        try {
            return create(str, Utils.toMap(jSONObject));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    static GAMUnitData create(@NonNull String str, @NonNull Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        String str2 = map.get("score");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = map.get("price");
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return create(str, str2, str3, map);
    }

    @NonNull
    static GAMUnitData create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull Map<String, String> map) {
        return new GAMUnitData(str, Float.parseFloat(str2), Float.parseFloat(str3), map);
    }
}

package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class GAMTypeConfigFactory {
    @NonNull
    private static final String KEY_AD_UNIT_ID = "ad_unit_id";
    @NonNull
    private static final String KEY_CACHE_SIZE = "cache_size";
    @NonNull
    private static final String KEY_FORMAT = "format";
    @NonNull
    private static final String KEY_UNITS = "units";

    @Nullable
    public static GAMTypeConfig create(@NonNull JSONObject jSONObject) {
        try {
            AdsFormat byRemoteName = AdsFormat.byRemoteName(jSONObject.getString(KEY_FORMAT));
            if (byRemoteName == null) {
                return null;
            }
            String string = jSONObject.getString(KEY_AD_UNIT_ID);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_UNITS);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(GAMUnitDataFactory.create(string, jSONArray.getJSONObject(i)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new GAMTypeConfig(byRemoteName, arrayList, jSONObject.optInt(KEY_CACHE_SIZE, 2));
        } catch (Throwable unused) {
            return null;
        }
    }
}

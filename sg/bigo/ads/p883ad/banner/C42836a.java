package sg.bigo.ads.p883ad.banner;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.AdSize;

/* renamed from: sg.bigo.ads.ad.banner.a */
/* loaded from: classes10.dex */
public final class C42836a {
    @NonNull
    /* renamed from: a */
    public static JSONArray m6518a(@NonNull List<AdSize> list) {
        JSONArray jSONArray = new JSONArray();
        for (AdSize adSize : list) {
            if (adSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, adSize.getWidth());
                    jSONObject.put("h", adSize.getHeight());
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}

package net.pubnative.lite.sdk.models;

import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AtomConfig extends JsonModel {
    @BindField
    public List<AdData> app_level;

    public AtomConfig() {
    }

    public Boolean isAtomEnabled() {
        AdData adData;
        boolean z;
        List<AdData> list = this.app_level;
        if (list != null && !list.isEmpty()) {
            Iterator<AdData> it = this.app_level.iterator();
            while (true) {
                if (it.hasNext()) {
                    adData = it.next();
                    if (adData.type.equals("custom_cta")) {
                        break;
                    }
                } else {
                    adData = null;
                    break;
                }
            }
            if (adData != null && adData.getBooleanField("boolean").booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public AtomConfig(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}

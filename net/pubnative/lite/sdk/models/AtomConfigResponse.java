package net.pubnative.lite.sdk.models;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AtomConfigResponse extends JsonModel {
    @BindField
    public AtomConfig configs;
    @BindField
    public String error_message;
    @BindField
    public String status;

    /* loaded from: classes10.dex */
    public interface Status {
        public static final String ERROR = "error";

        /* renamed from: OK */
        public static final String f101922OK = "ok";
    }

    public AtomConfigResponse() {
    }

    public AtomConfigResponse(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}

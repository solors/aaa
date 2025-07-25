package net.pubnative.lite.sdk.models;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AdResponse extends JsonModel {
    @BindField
    public List<C38595Ad> ads;
    @BindField
    public String error_message;
    @BindField
    public List<AdExt> ext;
    @BindField
    public String status;

    /* loaded from: classes10.dex */
    public interface Status {
        public static final String ERROR = "error";

        /* renamed from: OK */
        public static final String f101921OK = "ok";
    }

    public AdResponse() {
    }

    public AdResponse(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}

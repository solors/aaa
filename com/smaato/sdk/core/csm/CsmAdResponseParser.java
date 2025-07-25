package com.smaato.sdk.core.csm;

import androidx.annotation.NonNull;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.meevii.adsdk.common.BidderConstants;
import com.smaato.sdk.core.csm.CsmAdResponse;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CsmAdResponseParser {
    @NonNull
    private final Logger logger;

    /* loaded from: classes7.dex */
    public static class ParsingException extends Exception {
        public ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }

    public CsmAdResponseParser(@NonNull Logger logger) {
        this.logger = (Logger) Objects.requireNonNull(logger);
    }

    @NonNull
    private List<Network> parseNetworks(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("name");
            int i2 = jSONObject.getInt("priority");
            int i3 = jSONObject.getInt("width");
            int i4 = jSONObject.getInt("height");
            String string2 = jSONObject.getString("impression");
            String string3 = jSONObject.getString("clickurl");
            String optString = jSONObject.optString(BidderConstants.ADUNITID);
            String optString2 = jSONObject.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            arrayList.add(Network.builder().setName(string).setPriority(i2).setWidth(i3).setHeight(i4).setImpression(string2).setClickUrl(string3).setAdUnitId(optString).setClassName(optString2).setCustomData(jSONObject.optString("customdata")).build());
        }
        return arrayList;
    }

    @NonNull
    public CsmAdResponse parseResponse(@NonNull String str) throws ParsingException {
        CsmAdResponse.Builder builder = CsmAdResponse.builder();
        try {
            JSONObject jSONObject = new JSONObject(str);
            List<Network> parseNetworks = parseNetworks(jSONObject.getJSONArray("networks"));
            builder.setNetworks(parseNetworks).setSessionId(jSONObject.getString("sessionid")).setPassback(jSONObject.getString("passback"));
            return builder.build();
        } catch (NumberFormatException e) {
            e = e;
            String format = String.format("Invalid JSON content: %s", str);
            this.logger.error(LogDomain.AD, e, format, new Object[0]);
            throw new ParsingException(format, e);
        } catch (JSONException e2) {
            e = e2;
            String format2 = String.format("Invalid JSON content: %s", str);
            this.logger.error(LogDomain.AD, e, format2, new Object[0]);
            throw new ParsingException(format2, e);
        } catch (Exception e3) {
            this.logger.error(LogDomain.AD, e3, "Cannot build CsmAdResponse due to validation error", new Object[0]);
            throw new ParsingException("Cannot build CsmAdResponse due to validation error", e3);
        }
    }
}

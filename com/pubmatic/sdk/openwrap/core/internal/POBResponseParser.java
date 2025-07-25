package com.pubmatic.sdk.openwrap.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.openwrap.core.POBBid;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBResponseParser implements POBResponseParsing<POBBid> {
    @Nullable

    /* renamed from: a */
    private POBResponseParsing.POBResponseParserListener<POBBid> f70686a;

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing
    public void parse(@Nullable JSONObject jSONObject) {
        POBLog.debug("POBResponseParser", "response :%s", jSONObject);
        if (jSONObject != null) {
            POBAdResponse.Builder builder = new POBAdResponse.Builder(jSONObject);
            POBResponseParsing.POBResponseParserListener<POBBid> pOBResponseParserListener = this.f70686a;
            if (pOBResponseParserListener != null) {
                pOBResponseParserListener.parserOnSuccess(builder.build());
                return;
            }
            return;
        }
        POBLog.error("POBResponseParser", "Listener not set to respond back for invalid input", new Object[0]);
        POBResponseParsing.POBResponseParserListener<POBBid> pOBResponseParserListener2 = this.f70686a;
        if (pOBResponseParserListener2 != null) {
            pOBResponseParserListener2.parserOnError(new POBError(1007, "Listener not set to respond back for invalid input"));
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBResponseParsing
    public void setListener(@NonNull POBResponseParsing.POBResponseParserListener<POBBid> pOBResponseParserListener) {
        this.f70686a = pOBResponseParserListener;
    }
}

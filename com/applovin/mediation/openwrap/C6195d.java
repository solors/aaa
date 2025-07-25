package com.applovin.mediation.openwrap;

import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import java.util.Map;

/* renamed from: com.applovin.mediation.openwrap.d */
/* loaded from: classes2.dex */
public class C6195d {
    /* renamed from: a */
    public static MaxAdapterError m92226a(POBError pOBError) {
        MaxAdapterError maxAdapterError;
        int errorCode = pOBError.getErrorCode();
        if (errorCode == 1011) {
            maxAdapterError = MaxAdapterError.AD_EXPIRED;
        } else if (errorCode != 2002) {
            switch (errorCode) {
                case 1001:
                    maxAdapterError = MaxAdapterError.BAD_REQUEST;
                    break;
                case 1002:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                case 1003:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 1004:
                    maxAdapterError = MaxAdapterError.SERVER_ERROR;
                    break;
                case 1005:
                    maxAdapterError = MaxAdapterError.TIMEOUT;
                    break;
                default:
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.AD_NOT_READY;
        }
        return new MaxAdapterError(maxAdapterError, pOBError.getErrorCode(), pOBError.getErrorMessage());
    }

    /* renamed from: a */
    public static void m92225a(POBImpression pOBImpression, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters != null) {
            Object obj = localExtraParameters.get(ALPubMaticOpenWrapConstants.PMZONE_ID);
            if (obj instanceof String) {
                pOBImpression.setPMZoneId((String) obj);
            }
            Object obj2 = localExtraParameters.get(ALPubMaticOpenWrapConstants.TEST_CREATIVE_ID);
            if (obj2 instanceof String) {
                pOBImpression.setTestCreativeId((String) obj2);
            }
        }
        pOBImpression.setGpid(maxAdapterResponseParameters.getAdUnitId());
    }

    /* renamed from: a */
    public static void m92224a(POBRequest pOBRequest, Map<String, Object> map) {
        Object obj = map.get(ALPubMaticOpenWrapConstants.ENABLE_TEST_MODE_KEY);
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            pOBRequest.enableTestMode(booleanValue);
            pOBRequest.enableReturnAllBidStatus(booleanValue);
        }
        Object obj2 = map.get(ALPubMaticOpenWrapConstants.SERVER_URL_KEY);
        if (obj2 instanceof String) {
            pOBRequest.setAdServerUrl((String) obj2);
        }
        Object obj3 = map.get(ALPubMaticOpenWrapConstants.ENABLE_RESPONSE_DEBUGGING_KEY);
        if (obj3 instanceof Boolean) {
            pOBRequest.enableDebugState(((Boolean) obj3).booleanValue());
        }
        Object obj4 = map.get(ALPubMaticOpenWrapConstants.VERSION_ID_KEY);
        if (obj4 instanceof Integer) {
            pOBRequest.setVersionId(Integer.valueOf(((Integer) obj4).intValue()));
        }
        Object obj5 = map.get(ALPubMaticOpenWrapConstants.NETWORK_TIMEOUT_KEY);
        if (obj5 instanceof Integer) {
            pOBRequest.setNetworkTimeout(((Integer) obj5).intValue());
        }
    }
}

package com.mbridge.msdk.newreward.function.common;

import com.mbridge.msdk.newreward.function.p485c.p487b.CampaignRequestError;
import com.mbridge.msdk.tracker.network.AbstractC22898ad;

/* loaded from: classes6.dex */
public class VolleyErrorUtils {
    public static CampaignRequestError parseVolleyError(AbstractC22898ad abstractC22898ad) {
        CampaignRequestError campaignRequestError = new CampaignRequestError(0);
        campaignRequestError.m50539b("Network unknown error");
        if (abstractC22898ad == null) {
            return campaignRequestError;
        }
        int mo49368a = abstractC22898ad.mo49368a();
        if (mo49368a == 1) {
            abstractC22898ad.m49520a("Network error,please check state code " + abstractC22898ad.m49519b());
            campaignRequestError = new CampaignRequestError(1);
        } else if (mo49368a == 7) {
            abstractC22898ad.m49520a("The server returns an exception state code " + abstractC22898ad.m49519b());
            campaignRequestError = new CampaignRequestError(2);
        } else if (mo49368a == 2) {
            abstractC22898ad.m49520a("unSupportEncodingException");
            campaignRequestError = new CampaignRequestError(8);
        } else if (mo49368a == 8) {
            abstractC22898ad.m49520a("Network error,timeout exception");
            campaignRequestError = new CampaignRequestError(4);
        } else if (mo49368a == 3) {
            abstractC22898ad.m49520a("Network error,I/O exception");
            campaignRequestError = new CampaignRequestError(3);
        } else if (mo49368a == 4) {
            abstractC22898ad.m49522a(880041);
            abstractC22898ad.m49520a("Network error,UnknownHostException");
            campaignRequestError = new CampaignRequestError(5);
        } else if (mo49368a == 6) {
            abstractC22898ad.m49520a("Network error,I/O exception response null");
            campaignRequestError = new CampaignRequestError(7);
        } else if (mo49368a == 5) {
            abstractC22898ad.m49520a("Network error,I/O exception");
            campaignRequestError = new CampaignRequestError(6);
        } else if (mo49368a == 0) {
            abstractC22898ad.m49520a("Network error,I/O exception");
            campaignRequestError = new CampaignRequestError(0);
        } else if (mo49368a == 9) {
            abstractC22898ad.m49520a("Network unknown error");
            campaignRequestError = new CampaignRequestError(1);
        }
        campaignRequestError.m50542a(abstractC22898ad);
        campaignRequestError.m50539b(abstractC22898ad.getMessage());
        return campaignRequestError;
    }
}

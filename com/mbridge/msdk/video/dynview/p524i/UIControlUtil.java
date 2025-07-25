package com.mbridge.msdk.video.dynview.p524i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameDiTool;

/* renamed from: com.mbridge.msdk.video.dynview.i.a */
/* loaded from: classes6.dex */
public final class UIControlUtil {
    /* renamed from: a */
    public static String m48941a(Context context, int i) {
        String str = i == 1 ? "_por" : "_land";
        String m51862t = SameDiTool.m51862t(context);
        if (m51862t.startsWith("zh")) {
            return (m51862t.contains("TW") || m51862t.contains("HK")) ? "mbridge_reward_two_title_zh_trad" : "mbridge_reward_two_title_zh";
        } else if (m51862t.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        } else if (m51862t.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        } else if (m51862t.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        } else if (m51862t.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        } else if (m51862t.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        } else if (m51862t.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        } else {
            return "mbridge_reward_two_title_en" + str;
        }
    }

    /* renamed from: a */
    public static boolean m48939a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter("alecfc");
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                return queryParameter.equals("1");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m48938a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* renamed from: a */
    public static int m48940a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
            int m52522f = campaignEx.getRewardTemplateMode().m52522f();
            if (m52522f == 302 || m52522f == 802 || m52522f == 902) {
                return -3;
            }
            if (m52522f == 904) {
                return !m48939a(campaignEx.getRewardTemplateMode().m52523e()) ? -1 : -3;
            }
        }
        return 100;
    }
}

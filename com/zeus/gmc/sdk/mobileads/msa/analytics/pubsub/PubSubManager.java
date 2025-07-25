package com.zeus.gmc.sdk.mobileads.msa.analytics.pubsub;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p559g.C26549l;
import com.zeus.gmc.sdk.mobileads.msa.analytics.experience.DataManager;
import com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnntnannta.C32813atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntntntanaan.C32817atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32819atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class PubSubManager {
    private static final String atnaaata = "Y29tLm1pdWkubXNhLmdsb2JhbA==";
    private static final List<String> atnananannnt;
    private static boolean atnannttnnata = false;
    private static final List<String> atnntnaa;
    private static final String atnntnannta = "PubSubManager";
    private static final String atntaanaa = "eGlhb21pLWFkcw==";
    private static final String atntntntanaan = "MGY2NTc1ZTFkNjY2Mzk5OWI3NjZhNWM1MjdlYzUwNGNhNzFmZGQ3YQ==";
    private static PubSubTrack atnttttt;
    private static ConcurrentHashMap<String, String> atntatt = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> atnattat = new ConcurrentHashMap<>();

    static {
        atntatt.put("systemadsolution_push", "push_log");
        atntatt.put("systemadsolution_pushstaging", "push_log_staging");
        atntatt.put("systemadsolution_aduniversal", "lock_screen_log");
        atntatt.put("systemadsolution_aduniversalstaging", "lock_screen_log_staging");
        atntatt.put("systemadsolution_splash", "splash_log");
        atntatt.put("systemadsolution_splashstaging", "splash_log_staging");
        atntatt.put("systemadsolution_sdkdiagnosislog", "diagnosis_log");
        atntatt.put("systemadsolution_preinstall", "analytics_log");
        atntatt.put("systemadsolution_preinstallstaging", "analytics_log_staging");
        atntatt.put("systemadsolution_globalnative", "event_log");
        atntatt.put("systemadsolution_globalnativestaging", "event_log_staging");
        atntatt.put("systemadsolution_traditionalPreReport", "traditional_pre_report");
        atntatt.put("systemadsolution_traditionalPreReport_staging", "traditional_pre_report_staging");
        atntatt.put("miglobaladsdk_commonapp", "mediation_log");
        atntatt.put("miglobaladsdk_commonappstaging", "mediation_log_staging");
        ArrayList arrayList = new ArrayList();
        atnananannnt = arrayList;
        arrayList.add("VIEW");
        arrayList.add("CLICK");
        arrayList.add("START");
        arrayList.add("FIRSTQUARTILE");
        arrayList.add("MIDPOINT");
        arrayList.add("THIRDQUARTILE");
        arrayList.add("REWARDED_CALL");
        arrayList.add("VIDEO_START");
        arrayList.add("VIDEO_FINISH");
        arrayList.add("NOTIFICATION_RECEIVE");
        arrayList.add("ACTIVECARD_SHOW");
        arrayList.add("ACTIVECARD_ACTIVE_CLICK");
        atnntnaa = new ArrayList();
        atnannttnnata = false;
    }

    private PubSubManager() {
    }

    private static int atnntnannta(int i) {
        if (i >= 900) {
            return 900;
        }
        return Math.max(i, 1);
    }

    public static void init(Context context) {
        if (context == null || atnttttt != null) {
            return;
        }
        try {
            atnttttt = PubSubTrack.createInstance(context, new Configuration.Builder().setProjectId(C32817atnntnannta.atnntnannta(atntaanaa)).setPrivateKeyId(C32817atnntnannta.atnntnannta(atntntntanaan)).setInternational(true).setNeedGzipAndEncrypt(true).build());
            atnttttt.setUploadInterval(C32813atnntnannta.atnntnannta(context).atnntnannta());
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "init error:", e);
        }
    }

    public static void sendMessage(Context context, String str, String str2, String str3) {
        String atnntnannta2;
        try {
            if (atnannttnnata) {
                List<String> list = atnntnaa;
                if (!list.isEmpty() && !list.contains(str3) && !atnananannnt.contains(str3)) {
                    C32821atntntntanaan.atnntnannta(atnntnannta, " invalid event：" + str3);
                    return;
                }
            }
            if (!DataManager.getUserExperienceFlag(context) && !atnananannnt.contains(str3)) {
                C32821atntntntanaan.atnntnannta(atnntnannta, "user_experienceFlag == false");
                return;
            }
            if (atnttttt == null) {
                init(context);
            }
            String str4 = atntatt.get(str);
            String atntaanaa2 = C32819atnntnannta.atntaanaa();
            if (TextUtils.isEmpty(str4)) {
                atnntnannta2 = atnattat.get(str);
                if (TextUtils.isEmpty(atnntnannta2)) {
                    C32821atntntntanaan.atntntntanaan(atnntnannta, "configKey = " + str + " no matched topicName!!!");
                    return;
                }
            } else {
                atnntnannta2 = atnntnannta(str4, atntaanaa2);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("country", C32819atnntnannta.atntaanaa());
            atnttttt.publish(atnntnannta2, str2, hashMap);
            C32821atntntntanaan.atntaanaa(atnntnannta, "〓topic =【" + atnntnannta2 + "】event =【" + str3 + "】");
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "sendMessage error:", e);
        }
    }

    public static void setCTARnable(Context context, boolean z) {
        PubSubTrack.setAccessNetworkEnable(context, z);
    }

    public static void setTopicMap(Map<String, String> map) {
        atnattat.clear();
        atnattat.putAll(map);
    }

    public static void setUploadInterval(Context context, int i) {
        if (context == null) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "context is null");
            return;
        }
        C32813atnntnannta.atnntnannta(context).atnntnannta(atnntnannta(i));
        PubSubTrack pubSubTrack = atnttttt;
        if (pubSubTrack != null) {
            pubSubTrack.setUploadInterval(C32813atnntnannta.atnntnannta(context).atnntnannta());
            C32821atntntntanaan.atnntnannta(atnntnannta, "pubsub_interval =【" + C32813atnntnannta.atnntnannta(context).atnntnannta() + "】");
        }
    }

    private static String atnntnannta(String str, String str2) {
        if (str == null || TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.endsWith("_staging")) {
            return str;
        }
        if ("IN".equalsIgnoreCase(str2)) {
            return str + "_IN";
        } else if (C26549l.f69548b.equalsIgnoreCase(str2)) {
            return str + "_RU";
        } else {
            return str + "_OTHER";
        }
    }

    public static void init(Context context, @NonNull List<String> list) {
        if (context == null) {
            return;
        }
        if (C32817atnntnannta.atnntnannta(atnaaata).equals(context.getPackageName())) {
            List<String> list2 = atnntnaa;
            list2.clear();
            list2.addAll(list);
            atnannttnnata = true;
            if (atnttttt != null) {
                return;
            }
            try {
                atnttttt = PubSubTrack.createInstance(context, new Configuration.Builder().setProjectId(C32817atnntnannta.atnntnannta(atntaanaa)).setPrivateKeyId(C32817atnntnannta.atnntnannta(atntntntanaan)).setInternational(true).setNeedGzipAndEncrypt(true).build());
                atnttttt.setUploadInterval(C32813atnntnannta.atnntnannta(context).atnntnannta());
                return;
            } catch (Exception e) {
                C32821atntntntanaan.atntntntanaan(atnntnannta, "init error:", e);
                return;
            }
        }
        throw new RuntimeException("This method is not supported!");
    }
}

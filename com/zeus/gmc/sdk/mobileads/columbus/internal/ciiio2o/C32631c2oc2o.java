package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.common.AdNetType;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32445c22o22co22i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32462ciiio2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccoio.C32562coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.C32633cco22;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2o */
/* loaded from: classes8.dex */
public class C32631c2oc2o {
    private static final String c2oc2i = "redownload_requests_set";
    private static final String c2oc2o = "net_state";
    private static final String cco22 = "ad_id";
    private static C32445c22o22co22i cicc2iiccc = null;
    private static final int cicic = 5;
    private static final String cii2c2 = "ad_pass_back";
    private static final String ciii2coi2 = "tack_status";
    private static final String cioccoiococ = "url";
    private static final String coi222o222 = "redownload_requests";
    private static final String coiic = "big_resource";
    private static Object ccoc2oic = new Object();
    private static Map<String, Integer> coiio2 = new ConcurrentHashMap();
    private static final String coo2iico = "ReDownloadRequestCache";
    private static AbstractRunnableC32566c2oc2o c2oicci2 = new C32632coo2iico(coo2iico, "re-invoking resource download failed!");

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2o$coo2iico */
    /* loaded from: classes8.dex */
    class C32632coo2iico extends AbstractRunnableC32566c2oc2o {
        C32632coo2iico(String str, String str2) {
            super(str, str2);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() {
            int i;
            if (!C32562coo2iico.c2oc2i(GlobalHolder.getApplicationContext())) {
                MLog.m25883w(C32631c2oc2o.coo2iico, "sTask, network is unreachable");
                return;
            }
            MLog.m25892d(C32631c2oc2o.coo2iico, "starting to invoke the redownload task!");
            Set<String> coo2iico = C32631c2oc2o.coo2iico();
            if (coo2iico != null && !coo2iico.isEmpty()) {
                Context applicationContext = GlobalHolder.getApplicationContext();
                MLog.m25892d(C32631c2oc2o.coo2iico, "the size of redownload request is " + coo2iico.size());
                for (String str : coo2iico) {
                    MLog.m25892d(C32631c2oc2o.coo2iico, "re-invoke download resource!" + str);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            C32633cco22.C32636cioccoiococ coi222o222 = C32631c2oc2o.coi222o222(new JSONObject(str));
                            if (coi222o222 != null) {
                                Integer num = (Integer) C32631c2oc2o.coiio2.get(str);
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    i = 0;
                                }
                                MLog.m25892d(C32631c2oc2o.coo2iico, "the count of redownload[" + str + "] is " + i);
                                int i2 = i + 1;
                                if (i2 > 5) {
                                    MLog.m25892d(C32631c2oc2o.coo2iico, "the count of re-download the request[" + str + "] is more than 5 !");
                                    C32631c2oc2o.coiio2.remove(str);
                                } else if (C32562coo2iico.coo2iico(applicationContext, coi222o222.coi222o222)) {
                                    MLog.m25892d(C32631c2oc2o.coo2iico, "download the request[" + str + "] async!");
                                    C32633cco22.coo2iico(applicationContext).coo2iico(coi222o222);
                                    C32631c2oc2o.coiio2.put(str, Integer.valueOf(i2));
                                } else {
                                    C32631c2oc2o.coo2iico(coi222o222);
                                }
                            }
                        } catch (Exception e) {
                            MLog.m25888e(C32631c2oc2o.coo2iico, "re-invoking download resource failed![" + str + C21114v8.C21123i.f54139e, e);
                        }
                    }
                }
                return;
            }
            MLog.m25892d(C32631c2oc2o.coo2iico, "there are not resources which need to be re-downloaded!");
        }
    }

    private C32631c2oc2o() {
    }

    public static void c2oc2i() {
        C32465cioc2.cioccoiococ.execute(c2oicci2);
    }

    private static void c2oc2o() {
        if (cicc2iiccc == null) {
            cicc2iiccc = new C32445c22o22co22i(coi222o222);
        }
    }

    private static Set<String> cioccoiococ() {
        Set<String> coo2iico2;
        c2oc2o();
        synchronized (ccoc2oic) {
            coo2iico2 = cicc2iiccc.coo2iico(c2oc2i, (Set<String>) null);
            if (coo2iico2 != null) {
                cicc2iiccc.coi222o222(c2oc2i);
            }
        }
        return coo2iico2;
    }

    static /* synthetic */ Set coo2iico() {
        return cioccoiococ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c2oc2i(C32633cco22.C32636cioccoiococ c32636cioccoiococ) {
        if (c32636cioccoiococ == null) {
            return;
        }
        try {
            synchronized (coiio2) {
                JSONObject coi222o2222 = coi222o222(c32636cioccoiococ);
                if (coi222o2222 == null) {
                    return;
                }
                String jSONObject = coi222o2222.toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    coiio2.remove(jSONObject);
                }
            }
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "clearing the count of re-download failed!", e);
        }
    }

    private static JSONObject coi222o222(C32633cco22.C32636cioccoiococ c32636cioccoiococ) {
        if (c32636cioccoiococ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", c32636cioccoiococ.coo2iico);
                jSONObject.put(cco22, c32636cioccoiococ.c2oc2i);
                jSONObject.put(cii2c2, c32636cioccoiococ.c2oc2o);
                jSONObject.put(coiic, c32636cioccoiococ.ciii2coi2);
                jSONObject.put(c2oc2o, AdNetType.NETWORK_WIFI.value());
                jSONObject.put(ciii2coi2, c32636cioccoiococ.cii2c2);
                return jSONObject;
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "converting the request to a json failed!", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void coo2iico(C32633cco22.C32636cioccoiococ c32636cioccoiococ) {
        if (c32636cioccoiococ == null) {
            return;
        }
        try {
            c2oc2o();
            synchronized (ccoc2oic) {
                Set<String> coo2iico2 = C32462ciiio2o.coo2iico(cicc2iiccc, c2oc2i, null);
                JSONObject coi222o2222 = coi222o222(c32636cioccoiococ);
                if (coi222o2222 != null) {
                    coo2iico2.add(coi222o2222.toString());
                    cicc2iiccc.coi222o222(c2oc2i, coo2iico2);
                }
            }
            MLog.m25892d(coo2iico, "add the request[" + c32636cioccoiococ.toString() + "] to the re-download cache pool!");
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "adding to the cache failed!", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C32633cco22.C32636cioccoiococ coi222o222(JSONObject jSONObject) {
        if (jSONObject == null) {
            MLog.m25892d(coo2iico, "the jsonObjcet which would be converted to request is null!");
            return null;
        }
        String optString = jSONObject.optString("url", null);
        long optLong = jSONObject.optLong(cco22, -1L);
        int optInt = jSONObject.optInt(c2oc2o, AdNetType.NETWORK_WIFI.value());
        String optString2 = jSONObject.optString(cii2c2, null);
        boolean optBoolean = jSONObject.optBoolean(coiic);
        boolean optBoolean2 = jSONObject.optBoolean(ciii2coi2);
        if (TextUtils.isEmpty(optString)) {
            MLog.m25889e(coo2iico, "converting the json to a request failed!could not get the url!");
            return null;
        }
        C32633cco22.C32636cioccoiococ coo2iico2 = C32633cco22.C32636cioccoiococ.coo2iico(optString, optInt, optLong, optString2);
        coo2iico2.cii2c2 = optBoolean2;
        coo2iico2.ciii2coi2 = optBoolean;
        MLog.m25889e(coo2iico, "converting the json to a request successed!");
        return coo2iico2;
    }
}

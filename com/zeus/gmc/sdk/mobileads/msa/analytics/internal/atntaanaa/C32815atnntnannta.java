package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.AnalyticsUtilHelper;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntaanaa.atnntnannta */
/* loaded from: classes8.dex */
public class C32815atnntnannta {
    private static final String atnntnannta = "AdEventServer";
    private static final String atntntntanaan = "TRIGGER_FAIED";
    private Map<String, Object> atnaaata;
    private String atntaanaa;
    private AnalyticsUtilHelper atntatt;

    public C32815atnntnannta(String str, Map<String, Object> map, AnalyticsUtilHelper analyticsUtilHelper) {
        this.atntaanaa = str;
        if (map != null) {
            this.atntatt = analyticsUtilHelper;
            this.atnaaata = new HashMap(map);
        }
    }

    private void atnntnannta(String str) {
        try {
            Map<String, Object> map = this.atnaaata;
            if (map != null && !map.isEmpty() && this.atntatt != null) {
                if (C32821atntntntanaan.atntntntanaan()) {
                    C32821atntntntanaan.atntntntanaan(atnntnannta, "failedReason: " + str);
                }
                this.atnaaata.put(C32805atnntnannta.atntaanaa, atntntntanaan);
                this.atnaaata.put("e", atntntntanaan);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("urlType", (String) this.atnaaata.get(C32805atnntnannta.atntaanaa));
                jSONObject.put("url", this.atntaanaa);
                jSONObject.put("failedReason", str);
                this.atnaaata.put("ext_param", jSONObject.toString());
                this.atntatt.trackAction(this.atnaaata);
                return;
            }
            C32821atntntntanaan.atnntnannta(atnntnannta, "This event 【TRIGGER_FAIED】 ban report！failedReason: ", str);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "TRIGGER_FAIED failed. ", e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public boolean atnntnannta() {
        Throwable th;
        URL url;
        int i;
        int i2;
        int responseCode;
        String str = this.atntaanaa;
        ?? r7 = 0;
        C32821atntntntanaan.atnntnannta(atnntnannta, "〓START〓 ", str);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    url = new URL(str);
                    i = 0;
                    i2 = 0;
                } catch (ProtocolException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                }
                while (i < 5) {
                    if (i2 / 100 == 3) {
                        i++;
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField.startsWith("http")) {
                            url = new URL(headerField);
                        } else {
                            url = new URL(url.getProtocol() + "://" + url.getHost() + headerField);
                        }
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(r7);
                        httpURLConnection2.setRequestMethod("GET");
                        httpURLConnection2.setConnectTimeout(10000);
                        httpURLConnection2.setReadTimeout(10000);
                        responseCode = httpURLConnection2.getResponseCode();
                        if (C32821atntntntanaan.atntntntanaan()) {
                            String[] strArr = new String[4];
                            strArr[r7] = "redirect count: ";
                            strArr[1] = "" + i;
                            strArr[2] = " request url is : ";
                            strArr[3] = url.toString();
                            C32821atntntntanaan.atnntnannta(atnntnannta, strArr);
                            C32821atntntntanaan.atnntnannta(atnntnannta, "Ad url response code is " + responseCode);
                        }
                    } catch (ProtocolException e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection2;
                        if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("200 OK")) {
                            C32821atntntntanaan.atnntnannta(atnntnannta, "response code is 200, bug status line is invalid.");
                            atnntnannta(e.getMessage());
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                    return false;
                                } catch (Exception e4) {
                                    C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e4);
                                    atnntnannta(e4.getMessage());
                                    return false;
                                }
                            }
                            return false;
                        }
                        atnntnannta(e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return false;
                        }
                        return false;
                    } catch (Exception e5) {
                        e = e5;
                        httpURLConnection = httpURLConnection2;
                        C32821atntntntanaan.atnntnannta(atnntnannta, "http get failed. ", e);
                        atnntnannta(e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return false;
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e6) {
                                C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e6);
                                atnntnannta(e6.getMessage());
                            }
                        }
                        throw th;
                    }
                    if (responseCode / 100 != 4 && responseCode / 100 != 5) {
                        if (responseCode / 100 != 3) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (Exception e7) {
                                C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e7);
                                atnntnannta(e7.getMessage());
                            }
                            return true;
                        } else if (responseCode / 100 != 3) {
                            httpURLConnection2.disconnect();
                            return false;
                        } else {
                            r7 = 0;
                            i2 = responseCode;
                            httpURLConnection = httpURLConnection2;
                        }
                    }
                    atnntnannta("Ad url response code is " + responseCode);
                    try {
                        httpURLConnection2.disconnect();
                        return false;
                    } catch (Exception e8) {
                        C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e8);
                        atnntnannta(e8.getMessage());
                        return false;
                    }
                }
                C32821atntntntanaan.atnntnannta(atnntnannta, "redirectCount >= 5, return false");
                atnntnannta("redirectCount >= 5, return false");
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e9) {
                        C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e9);
                        atnntnannta(e9.getMessage());
                    }
                }
                return r7;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e10) {
            C32821atntntntanaan.atntntntanaan(atnntnannta, "conn.disconnect failed. ", e10);
            atnntnannta(e10.getMessage());
            return false;
        }
    }
}

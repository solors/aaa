package com.amazon.device.ads;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DTBMetricReport {
    private static final String ADAPTER_VERSION = "adapter_version";
    private static final String ADSERVER = "mediation";
    private static final String APP_NAME = "app_id";
    private static final String CONNECTION = "connection";
    private static final String LATENCY = "latency";
    private static final String LOG_TAG = "DTBMetricReport";
    private static final String PROJECT = "project";
    private static final String PROJECT_NAME = "aps_mobile";
    private static final String SDK = "sdk";
    private static final String TIME = "time";
    private static final String TYPE = "type";
    private BidWrapper bidWrapper;
    private int latency;
    private JSONObject propertiesMap;
    private String type;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class BidWrapper {
        String bidId;
        String hostname;

        BidWrapper(String str, String str2) {
            this.bidId = str;
            this.hostname = str2;
        }
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper, int i) {
        this.bidWrapper = bidWrapper;
        this.latency = i;
        setStandardProperties(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BidWrapper addBid(String str, String str2) {
        return new BidWrapper(str, str2);
    }

    private void addExtraProperties(Map<String, Object> map) {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Integer) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Long) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Boolean) {
                    this.propertiesMap.put(str, obj);
                }
            }
        } catch (JSONException e) {
            String str2 = LOG_TAG;
            DtbLog.error(str2, "Invalid JSON conversion:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithBidIdAndType(BidWrapper bidWrapper, String str) {
        return new DTBMetricReport(str, bidWrapper);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithBidTypeLatency(BidWrapper bidWrapper, String str, int i) {
        return new DTBMetricReport(str, bidWrapper, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map) {
        return new DTBMetricReport(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[Catch: JSONException -> 0x00bc, TRY_ENTER, TryCatch #3 {JSONException -> 0x00bc, blocks: (B:3:0x000b, B:5:0x0032, B:6:0x0039, B:19:0x006f, B:20:0x0076, B:27:0x0097, B:29:0x00a0, B:30:0x00a7, B:23:0x0089), top: B:43:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: JSONException -> 0x00bc, TryCatch #3 {JSONException -> 0x00bc, blocks: (B:3:0x000b, B:5:0x0032, B:6:0x0039, B:19:0x006f, B:20:0x0076, B:27:0x0097, B:29:0x00a0, B:30:0x00a7, B:23:0x0089), top: B:43:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[Catch: JSONException -> 0x00bc, TryCatch #3 {JSONException -> 0x00bc, blocks: (B:3:0x000b, B:5:0x0032, B:6:0x0039, B:19:0x006f, B:20:0x0076, B:27:0x0097, B:29:0x00a0, B:30:0x00a7, B:23:0x0089), top: B:43:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setStandardProperties(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "getVersion"
            r5.type = r6
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.propertiesMap = r1
            java.lang.String r2 = "type"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> Lbc
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "9.10.3"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lbc
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r1 = "app_id"
            java.lang.String r2 = com.amazon.device.ads.AdRegistration.getAppKey()     // Catch: org.json.JSONException -> Lbc
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lbc
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r1 = "project"
            java.lang.String r2 = "aps_mobile"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lbc
            int r6 = r5.latency     // Catch: org.json.JSONException -> Lbc
            if (r6 <= 0) goto L39
            org.json.JSONObject r1 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r2 = "latency"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> Lbc
        L39:
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: org.json.JSONException -> Lbc
            r1 = 0
            java.lang.String r2 = "com.amazon.admob_adapter.APSAdMobAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L55
            java.lang.String r3 = "admob"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L56
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Exception -> L56
            boolean r4 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L6d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L56
            r1 = r2
            goto L6d
        L55:
            r3 = r1
        L56:
            java.lang.String r2 = "com.amazon.mopub_adapter.APSMopubAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "mopub"
            java.lang.reflect.Method r6 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L6d
            java.lang.Object r6 = r6.invoke(r1, r1)     // Catch: java.lang.Exception -> L6d
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L6d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L6d
            r1 = r6
        L6d:
            if (r3 == 0) goto L76
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r0 = "mediation"
            r6.put(r0, r3)     // Catch: org.json.JSONException -> Lbc
        L76:
            com.amazon.device.ads.DtbDeviceData.getDeviceDataInstance()     // Catch: org.json.JSONException -> Lbc
            java.lang.String r6 = com.amazon.device.ads.DtbDeviceData.getConnectionType()     // Catch: org.json.JSONException -> Lbc
            java.lang.String r0 = "Wifi"
            boolean r0 = r6.equals(r0)     // Catch: org.json.JSONException -> Lbc
            if (r0 == 0) goto L89
            java.lang.String r6 = "wifi"
            goto L97
        L89:
            java.lang.String r0 = "0"
            boolean r6 = r6.equals(r0)     // Catch: org.json.JSONException -> Lbc
            if (r6 == 0) goto L95
            java.lang.String r6 = "unknown"
            goto L97
        L95:
            java.lang.String r6 = "cellular"
        L97:
            org.json.JSONObject r0 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r2 = "connection"
            r0.put(r2, r6)     // Catch: org.json.JSONException -> Lbc
            if (r1 == 0) goto La7
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r0 = "adapter_version"
            r6.put(r0, r1)     // Catch: org.json.JSONException -> Lbc
        La7:
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lbc
            java.lang.String r0 = "time"
            java.util.Date r1 = new java.util.Date     // Catch: org.json.JSONException -> Lbc
            r1.<init>()     // Catch: org.json.JSONException -> Lbc
            long r1 = r1.getTime()     // Catch: org.json.JSONException -> Lbc
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r6.put(r0, r1)     // Catch: org.json.JSONException -> Lbc
            goto Ld7
        Lbc:
            r6 = move-exception
            java.lang.String r0 = com.amazon.device.ads.DTBMetricReport.LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON conversion error:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.amazon.device.ads.DtbLog.warn(r0, r6)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricReport.setStandardProperties(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getBidId() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.bidId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getHostname() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.hostname;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toEncodedString() throws UnsupportedEncodingException {
        return URLEncoder.encode(this.propertiesMap.toString(), "UTF-8");
    }

    public String toString() {
        return this.propertiesMap.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        return new DTBMetricReport(str, map, bidWrapper);
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper) {
        this.latency = -1;
        this.bidWrapper = bidWrapper;
        setStandardProperties(str);
    }

    private DTBMetricReport(String str, Map<String, Object> map) {
        this.latency = -1;
        setStandardProperties(str);
        addExtraProperties(map);
    }

    private DTBMetricReport(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        this(str, map);
        this.bidWrapper = bidWrapper;
    }
}

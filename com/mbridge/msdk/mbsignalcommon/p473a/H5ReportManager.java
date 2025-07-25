package com.mbridge.msdk.mbsignalcommon.p473a;

import android.content.Context;
import android.util.Base64;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.VideoReportDataDao;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.a.a */
/* loaded from: classes6.dex */
public class H5ReportManager {

    /* renamed from: c */
    private static final String f57617c = "a";

    /* renamed from: a */
    int f57618a = 0;

    /* renamed from: b */
    int f57619b = 1;

    /* compiled from: H5ReportManager.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a */
    /* loaded from: classes6.dex */
    private static final class C22200a {

        /* renamed from: a */
        private static H5ReportManager f57620a = new H5ReportManager();
    }

    /* renamed from: a */
    public static H5ReportManager m51174a() {
        return C22200a.f57620a;
    }

    /* renamed from: a */
    public final void m51172a(Object obj, String str, JSONArray jSONArray, int i) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        int i2;
        try {
            if (jSONArray == null) {
                m51173a(this.f57619b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                m51173a(this.f57619b, "called reporter failed, params empty", obj);
                return;
            }
            int i3 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i2 = length - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    JSONObject optJSONObject12 = jSONArray.optJSONObject(i3);
                    if (optJSONObject12 != null) {
                        stringBuffer.append(optJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(optJSONObject12.opt("value"));
                        stringBuffer.append(C21114v8.C21123i.f54135c);
                    }
                    i3++;
                }
                JSONObject optJSONObject13 = jSONArray.optJSONObject(i2);
                if (optJSONObject13 != null) {
                    stringBuffer.append(optJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(optJSONObject13.opt("value"));
                }
                C22011d.m52050a().m52029c(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String str2 = "";
                String string = (length <= 0 || (optJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : optJSONObject11.getString("value");
                int i4 = -1;
                int i5 = (length <= 1 || (optJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : optJSONObject10.getInt("value");
                int i6 = (length <= 2 || (optJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : optJSONObject9.getInt("value");
                int i7 = (length <= 3 || (optJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : optJSONObject8.getInt("value");
                int i8 = (length <= 4 || (optJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : optJSONObject7.getInt("value");
                String string2 = (length <= 5 || (optJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : optJSONObject6.getString("value");
                String string3 = (length <= 6 || (optJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : optJSONObject5.getString("value");
                int i9 = (length <= 7 || (optJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : optJSONObject4.getInt("value");
                String string4 = (length <= 8 || (optJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : optJSONObject3.getString("value");
                if (length > 9 && (optJSONObject2 = jSONArray.optJSONObject(9)) != null) {
                    i4 = optJSONObject2.getInt("value");
                }
                int i10 = i4;
                if (length > 10 && (optJSONObject = jSONArray.optJSONObject(10)) != null) {
                    str2 = optJSONObject.getString("value");
                }
                String str3 = str2;
                Context m52792c = MBSDKContext.m52746m().m52792c();
                if (m52792c != null) {
                    VideoReportDataDao.m52545a(CommonSDKDBHelper.m52593a(m52792c)).m52544a(new VideoReportData(string, i5, i6, i7, i8, string2, string3, i9, string4, i10, str3));
                }
            }
            m51173a(this.f57618a, "called reporter success", obj);
        } catch (Throwable th) {
            SameLogTool.m51827a(f57617c, th.getMessage());
            m51173a(this.f57619b, "exception: " + th.getMessage(), obj);
        }
    }

    /* renamed from: a */
    private void m51173a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C26559a.f69635d, i);
            jSONObject.put("message", str);
            WindVaneCallJs.m51063a().m51060a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            SameLogTool.m51827a(f57617c, e.getMessage());
        } catch (Throwable th) {
            SameLogTool.m51827a(f57617c, th.getMessage());
        }
    }
}

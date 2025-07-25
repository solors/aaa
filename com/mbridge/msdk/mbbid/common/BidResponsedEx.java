package com.mbridge.msdk.mbbid.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class BidResponsedEx extends BidResponsed {
    public static final String KEY_CID = "cid";
    public static final String KEY_MACORS = "macors";
    public static final String TAG = "BidResponsedEx";
    private String cid;

    public static BidResponsedEx parseBidResponsedEx(JSONObject jSONObject, String str) {
        BidResponsedEx bidResponsedEx;
        BidResponsedEx bidResponsedEx2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            bidResponsedEx = new BidResponsedEx();
        } catch (Throwable th) {
            th = th;
        }
        try {
            bidResponsedEx.setBidId(jSONObject.optString("bid"));
            bidResponsedEx.setCur(jSONObject.optString(BidResponsed.KEY_CUR));
            bidResponsedEx.setPrice(jSONObject.optString("price"));
            bidResponsedEx.setCid(jSONObject.optString("cid"));
            bidResponsedEx.setBidToken(jSONObject.optString("token"));
            JSONObject optJSONObject = jSONObject.optJSONObject(KEY_MACORS);
            String optString = jSONObject.optString("ln");
            String optString2 = jSONObject.optString(BidResponsed.KEY_WN);
            if (optJSONObject != null && optJSONObject.length() > 0) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = optJSONObject.getString(next);
                    optString = replaceUrl(optString, next, string);
                    optString2 = replaceUrl(optString2, next, string);
                }
            }
            bidResponsedEx.setLn(optString);
            bidResponsedEx.setWn(optString2);
            return bidResponsedEx;
        } catch (Throwable th2) {
            th = th2;
            bidResponsedEx2 = bidResponsedEx;
            SameLogTool.m51824b(TAG, th.getMessage());
            return bidResponsedEx2;
        }
    }

    private static String replaceUrl(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return str.replaceAll("\\{" + str2 + "\\}", str3);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setLn(String str) {
        this.f57393ln = str;
    }

    public void setWn(String str) {
        this.f57394wn = str;
    }

    public static String decodePrice(String str) {
        return str;
    }
}

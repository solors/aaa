package com.learnings.abcenter.util;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.p552ot.pubsub.p553a.C26484a;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AbCenterUtil {
    private static Gson sGson;

    public static String base64Encode(String str) {
        try {
            return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean contains(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        Locale locale = Locale.US;
        return str.toLowerCase(locale).contains(str2.toLowerCase(locale));
    }

    public static boolean equals(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equalsIgnoreCase(str2);
        }
        return false;
    }

    public static String getCountry(Context context) {
        String stringValue = AbCenterSharedUtil.getStringValue(context, AbCenterConstant.SP_KEY_COUNTRY);
        if (!TextUtils.isEmpty(stringValue)) {
            return stringValue;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                stringValue = telephonyManager.getSimCountryIso();
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(stringValue)) {
            stringValue = Locale.getDefault().getCountry();
        }
        if (TextUtils.isEmpty(stringValue)) {
            return "unset";
        }
        String upperCase = stringValue.toUpperCase();
        AbCenterSharedUtil.setStringValue(context, AbCenterConstant.SP_KEY_COUNTRY, upperCase);
        return upperCase;
    }

    public static String getGroupId(Context context) {
        long j;
        String stringValue = AbCenterSharedUtil.getStringValue(context, AbCenterConstant.SP_KEY_GROUP_ID);
        if (!TextUtils.isEmpty(stringValue)) {
            return stringValue;
        }
        try {
            j = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Throwable unused) {
            j = -1;
        }
        if (j > 0) {
            String string = Settings.System.getString(context.getContentResolver(), C26484a.f69184A);
            ArrayList<String> arrayList = new ArrayList<String>() { // from class: com.learnings.abcenter.util.AbCenterUtil.1
                {
                    add("9774d56d682e549c");
                    add("0123456789abcdef");
                }
            };
            if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                stringValue = md5(string + j);
            }
        }
        if (TextUtils.isEmpty(stringValue)) {
            stringValue = UUID.randomUUID().toString();
        }
        AbCenterSharedUtil.setStringValue(context, AbCenterConstant.SP_KEY_GROUP_ID, stringValue);
        return stringValue;
    }

    public static Gson getGson() {
        if (sGson == null) {
            sGson = new GsonBuilder().registerTypeAdapter(Double.class, new JsonSerializer() { // from class: com.learnings.abcenter.util.a
                @Override // com.google.gson.JsonSerializer
                public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
                    JsonElement lambda$getGson$0;
                    lambda$getGson$0 = AbCenterUtil.lambda$getGson$0((Double) obj, type, jsonSerializationContext);
                    return lambda$getGson$0;
                }
            }).create();
        }
        return sGson;
    }

    public static List<String> getListFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<String> list = (List) getGson().fromJson(str, new TypeToken<List<String>>() { // from class: com.learnings.abcenter.util.AbCenterUtil.2
            }.getType());
            if (list != null) {
                if (!list.isEmpty()) {
                    return list;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashMap<String, String> getMapFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (HashMap) getGson().fromJson(str, new TypeToken<HashMap<String, String>>() { // from class: com.learnings.abcenter.util.AbCenterUtil.3
            }.getType());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "null";
        }
    }

    public static boolean isInvalidString(String str) {
        if (!TextUtils.isEmpty(str) && !equals(str, "unset")) {
            return false;
        }
        return true;
    }

    public static boolean isListContains(List<String> list, List<String> list2) {
        if (list == null) {
            return false;
        }
        if (list2 != null && !list2.isEmpty()) {
            for (String str : list2) {
                if (!list.contains(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isListMixed(List<String> list, List<String> list2) {
        if (!CheckUtil.isListNullOrEmpty(list) && !CheckUtil.isListNullOrEmpty(list2)) {
            for (String str : list2) {
                if (list.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Integer> jsonArrayToIntegerList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.isNull(i)) {
                arrayList.add(null);
            } else {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i)));
            }
        }
        return arrayList;
    }

    public static List<String> jsonArrayToStringList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.isNull(i)) {
                arrayList.add(null);
            } else {
                arrayList.add(jSONArray.optString(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JsonElement lambda$getGson$0(Double d, Type type, JsonSerializationContext jsonSerializationContext) {
        if (d.doubleValue() == d.longValue()) {
            return new JsonPrimitive(Long.valueOf(d.longValue()));
        }
        return new JsonPrimitive(d);
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String optString(JSONObject jSONObject, String str) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static void setCountry(Context context, String str) {
        AbCenterSharedUtil.setStringValue(context, AbCenterConstant.SP_KEY_COUNTRY, str);
    }

    public static void setGroupId(Context context, String str) {
        AbCenterSharedUtil.setStringValue(context, AbCenterConstant.SP_KEY_GROUP_ID, str);
    }

    public static String toJsonString(Object obj) {
        try {
            return getGson().toJson(obj);
        } catch (Throwable unused) {
            return "null";
        }
    }

    public static String toString(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable unused) {
            return "null";
        }
    }

    public static String versionName2VersionNum(String str) {
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            if (str2.length() == 3) {
                sb2.append(str2);
            } else if (str2.length() == 2) {
                sb2.append("0");
                sb2.append(str2);
            } else if (str2.length() == 1) {
                sb2.append("00");
                sb2.append(str2);
            }
        }
        for (int length = split.length; length < 5; length++) {
            sb2.append("000");
        }
        return sb2.toString();
    }

    public static boolean contains(List<String> list, String str) {
        if (CheckUtil.isListNullOrEmpty(list)) {
            return false;
        }
        for (String str2 : list) {
            if (equals(str2, str)) {
                return true;
            }
        }
        return false;
    }
}

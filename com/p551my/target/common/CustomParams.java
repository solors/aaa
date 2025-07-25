package com.p551my.target.common;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25651b0;
import com.p551my.target.AbstractC25846ja;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.common.CustomParams */
/* loaded from: classes7.dex */
public final class CustomParams {
    @Nullable
    private volatile String[] customUserIds;
    @Nullable
    private volatile String[] emails;
    @Nullable
    private volatile String[] icqIds;
    @Nullable
    private volatile String[] okIds;
    @Nullable
    private volatile String[] vkIds;
    @NonNull
    private final Map<String, String> paramsMap = new HashMap();
    @NonNull
    private final Map<String, String> customParamsMap = new HashMap();

    /* renamed from: com.my.target.common.CustomParams$Gender */
    /* loaded from: classes7.dex */
    public interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    private synchronized void addCustomParam(@NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.customParamsMap.remove(str);
        } else {
            this.customParamsMap.put(str, str2);
        }
    }

    private boolean addParam(@NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            if (str2 == null) {
                return removeParam(str);
            }
            this.paramsMap.put(str, str2);
            return true;
        }
    }

    @Nullable
    private String getParam(@NonNull String str) {
        String str2;
        synchronized (this) {
            str2 = this.paramsMap.get(str);
        }
        return str2;
    }

    private boolean removeParam(@NonNull String str) {
        synchronized (this) {
            if (this.paramsMap.containsKey(str)) {
                this.paramsMap.remove(str);
                return true;
            }
            return false;
        }
    }

    public int getAge() {
        String param = getParam("ea");
        if (param == null) {
            return 0;
        }
        try {
            return Integer.parseInt(param);
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Nullable
    public String getCustomParam(@NonNull String str) {
        return getParam(str);
    }

    @Nullable
    public String getCustomUserId() {
        String[] strArr = this.customUserIds;
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    @Nullable
    public String[] getCustomUserIds() {
        String[] strArr = this.customUserIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getEmail() {
        String[] strArr = this.emails;
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    @Nullable
    public String[] getEmails() {
        String[] strArr = this.emails;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public int getGender() {
        String param = getParam("eg");
        if (param == null) {
            return -1;
        }
        try {
            return Integer.parseInt(param);
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Nullable
    public String getIcqId() {
        String[] strArr = this.icqIds;
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    @Nullable
    public String[] getIcqIds() {
        String[] strArr = this.icqIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getLang() {
        return getParam("lang");
    }

    @Nullable
    public String getMrgsAppId() {
        return getParam("mrgs_app_id");
    }

    @Nullable
    public String getMrgsId() {
        return getParam("mrgs_device_id");
    }

    @Nullable
    public String getMrgsUserId() {
        return getParam("mrgs_user_id");
    }

    @Nullable
    public String getOkId() {
        String[] strArr = this.okIds;
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    @Nullable
    public String[] getOkIds() {
        String[] strArr = this.okIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Nullable
    public String getVKId() {
        String[] strArr = this.vkIds;
        if (strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        return null;
    }

    @Nullable
    public String[] getVKIds() {
        String[] strArr = this.vkIds;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void putCustomDataToMap(@NonNull Map<String, String> map) {
        map.putAll(this.customParamsMap);
    }

    public void putDataTo(@NonNull Map<String, String> map) {
        synchronized (this) {
            map.putAll(this.paramsMap);
        }
    }

    public void setAge(int i) {
        if (i >= 0) {
            AbstractC25846ja.m43680a("CustomParams: Age param set to " + i);
            addParam("ea", String.valueOf(i));
            return;
        }
        AbstractC25846ja.m43680a("CustomParams: Age param removed");
        removeParam("ea");
    }

    public void setCustomParam(@NonNull String str, @Nullable String str2) {
        addParam(str, str2);
        addCustomParam(str, str2);
    }

    public void setCustomUserId(@Nullable String str) {
        if (str == null) {
            this.customUserIds = null;
        } else {
            this.customUserIds = new String[]{str};
        }
        addParam("custom_user_id", str);
    }

    public void setCustomUserIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.customUserIds = null;
            removeParam("custom_user_id");
            return;
        }
        this.customUserIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("custom_user_id", AbstractC25651b0.m44194a(strArr));
    }

    public void setEmail(@Nullable String str) {
        if (str == null) {
            this.emails = null;
        } else {
            this.emails = new String[]{str};
        }
        addParam("email", str);
    }

    public void setEmails(@Nullable String[] strArr) {
        if (strArr == null) {
            this.emails = null;
            removeParam("email");
            return;
        }
        this.emails = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("email", AbstractC25651b0.m44194a(strArr));
    }

    public void setGender(int i) {
        if (i != 0 && i != 1 && i != 2) {
            removeParam("eg");
            AbstractC25846ja.m43680a("CustomParams: Gender param removed");
            return;
        }
        AbstractC25846ja.m43680a("CustomParams: Gender param is set to " + i);
        addParam("eg", String.valueOf(i));
    }

    public void setIcqId(@Nullable String str) {
        if (str == null) {
            this.icqIds = null;
        } else {
            this.icqIds = new String[]{str};
        }
        addParam("icq_id", str);
    }

    public void setIcqIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.icqIds = null;
            removeParam("icq_id");
            return;
        }
        this.icqIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("icq_id", AbstractC25651b0.m44194a(strArr));
    }

    public void setLang(@Nullable String str) {
        addParam("lang", str);
    }

    public void setMrgsAppId(@Nullable String str) {
        addParam("mrgs_app_id", str);
    }

    public void setMrgsId(@Nullable String str) {
        addParam("mrgs_device_id", str);
    }

    public void setMrgsUserId(@Nullable String str) {
        addParam("mrgs_user_id", str);
    }

    public void setOkId(@Nullable String str) {
        if (str == null) {
            this.okIds = null;
        } else {
            this.okIds = new String[]{str};
        }
        addParam("ok_id", str);
    }

    public void setOkIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.okIds = null;
            removeParam("ok_id");
            return;
        }
        this.okIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("ok_id", AbstractC25651b0.m44194a(strArr));
    }

    public void setVKId(@Nullable String str) {
        if (str == null) {
            this.vkIds = null;
        } else {
            this.vkIds = new String[]{str};
        }
        addParam("vk_id", str);
    }

    public void setVKIds(@Nullable String[] strArr) {
        if (strArr == null) {
            this.vkIds = null;
            removeParam("vk_id");
            return;
        }
        this.vkIds = (String[]) Arrays.copyOf(strArr, strArr.length);
        addParam("vk_id", AbstractC25651b0.m44194a(strArr));
    }
}

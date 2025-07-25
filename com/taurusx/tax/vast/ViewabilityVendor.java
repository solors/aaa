package com.taurusx.tax.vast;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.taurusx.tax.log.LogUtil;
import java.io.Serializable;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ViewabilityVendor implements Serializable {

    /* renamed from: a */
    public final String f74393a;

    /* renamed from: b */
    public final URL f74394b;

    /* renamed from: c */
    public final String f74395c;

    /* renamed from: d */
    public String f74396d;

    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        public String f74397a = CampaignEx.KEY_OMID;

        /* renamed from: b */
        public String f74398b;

        /* renamed from: c */
        public String f74399c;

        /* renamed from: d */
        public String f74400d;

        /* renamed from: e */
        public String f74401e;

        public Builder(String str) {
            this.f74399c = str;
        }

        public ViewabilityVendor build() {
            try {
                return new ViewabilityVendor(this);
            } catch (Exception e) {
                LogUtil.m37900v("taurusx", "Warning: " + e.getLocalizedMessage());
                return null;
            }
        }

        public Builder withApiFramework(String str) {
            this.f74397a = str;
            return this;
        }

        public Builder withVendorKey(String str) {
            this.f74398b = str;
            return this;
        }

        public Builder withVerificationNotExecuted(String str) {
            this.f74401e = str;
            return this;
        }

        public Builder withVerificationParameters(String str) {
            this.f74400d = str;
            return this;
        }
    }

    public ViewabilityVendor(Builder builder) throws Exception {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(builder.f74397a) && !TextUtils.isEmpty(builder.f74399c)) {
            this.f74393a = builder.f74398b;
            this.f74394b = new URL(builder.f74399c);
            this.f74395c = builder.f74400d;
            this.f74396d = builder.f74401e;
            return;
        }
        throw new InvalidParameterException("ViewabilityVendor cannot be created.");
    }

    public static Set<ViewabilityVendor> createFromJsonArray(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Builder builder = new Builder(optJSONObject.optString("javascriptResourceUrl"));
                builder.withApiFramework(optJSONObject.optString("apiFramework", "")).withVendorKey(optJSONObject.optString(POBNativeConstants.NATIVE_VENDOR_KEY, "")).withVerificationParameters(optJSONObject.optString("verificationParameters", ""));
                ViewabilityVendor build = builder.build();
                if (build != null) {
                    hashSet.add(build);
                }
            }
        }
        return hashSet;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewabilityVendor)) {
            return false;
        }
        ViewabilityVendor viewabilityVendor = (ViewabilityVendor) obj;
        if (!Objects.equals(this.f74393a, viewabilityVendor.f74393a) || !Objects.equals(this.f74394b, viewabilityVendor.f74394b) || !Objects.equals(this.f74395c, viewabilityVendor.f74395c)) {
            return false;
        }
        return Objects.equals(this.f74396d, viewabilityVendor.f74396d);
    }

    public URL getJavascriptResourceUrl() {
        return this.f74394b;
    }

    public String getVendorKey() {
        return this.f74393a;
    }

    public String getVerificationNotExecuted() {
        return this.f74396d;
    }

    public String getVerificationParameters() {
        return this.f74395c;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f74393a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.f74394b.hashCode()) * 31;
        String str2 = this.f74395c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str3 = this.f74396d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return this.f74393a + "\n" + this.f74394b + "\n" + this.f74395c + "\n";
    }
}

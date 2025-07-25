package com.appsflyer.internal;

import android.util.Base64;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class AFd1jSDK {
    @NotNull
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    @NotNull
    final String AFInAppEventParameterName;
    @NotNull
    public final String AFInAppEventType;
    int AFKeystoreWrapper;
    @NotNull
    public final String values;

    public AFd1jSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.values = str3;
        this.AFKeystoreWrapper = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1jSDK)) {
            return false;
        }
        AFd1jSDK aFd1jSDK = (AFd1jSDK) obj;
        if (Intrinsics.m17075f(this.AFInAppEventType, aFd1jSDK.AFInAppEventType) && Intrinsics.m17075f(this.AFInAppEventParameterName, aFd1jSDK.AFInAppEventParameterName) && Intrinsics.m17075f(this.values, aFd1jSDK.values) && this.AFKeystoreWrapper == aFd1jSDK.AFKeystoreWrapper) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.AFInAppEventType.hashCode() * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.values.hashCode()) * 31) + Integer.hashCode(this.AFKeystoreWrapper);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFd1jSDK(valueOf=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public final JSONObject values() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.AFInAppEventParameterName);
        jSONObject.put("st", this.values);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }

    public /* synthetic */ AFd1jSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFInAppEventType(String str, String str2) {
            CharSequence m16571b1;
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            m16571b1 = C37690r.m16571b1(substring);
            String obj = m16571b1.toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }

        @Nullable
        public static AFd1jSDK values(@NotNull String str) {
            List<String> m16611C0;
            boolean m16624M;
            boolean m16624M2;
            boolean m16624M3;
            boolean m16624M4;
            CharSequence m16571b1;
            Intrinsics.checkNotNullParameter(str, "");
            m16611C0 = C37690r.m16611C0(str, new String[]{"\n"}, false, 0, 6, null);
            if (m16611C0.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            for (String str5 : m16611C0) {
                m16624M = StringsJVM.m16624M(str5, "label=", false, 2, null);
                if (!m16624M) {
                    m16624M2 = StringsJVM.m16624M(str5, "hashName=", false, 2, null);
                    if (!m16624M2) {
                        m16624M3 = StringsJVM.m16624M(str5, "stackTrace=", false, 2, null);
                        if (!m16624M3) {
                            m16624M4 = StringsJVM.m16624M(str5, "c=", false, 2, null);
                            if (!m16624M4) {
                                break;
                            }
                            String substring = str5.substring(2);
                            Intrinsics.checkNotNullExpressionValue(substring, "");
                            m16571b1 = C37690r.m16571b1(substring);
                            num = Integer.valueOf(Integer.parseInt(m16571b1.toString()));
                        } else {
                            str4 = AFInAppEventType(str5, "stackTrace=");
                        }
                    } else {
                        str3 = AFInAppEventType(str5, "hashName=");
                    }
                } else {
                    str2 = AFInAppEventType(str5, "label=");
                }
            }
            if (values(num, str2, str3, str4)) {
                return null;
            }
            Intrinsics.m17074g(str2);
            Intrinsics.m17074g(str3);
            Intrinsics.m17074g(str4);
            Intrinsics.m17074g(num);
            return new AFd1jSDK(str2, str3, str4, num.intValue());
        }

        private static boolean values(Integer num, String... strArr) {
            boolean z = num == null;
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (!z) {
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                }
                z = true;
            }
            return z;
        }
    }
}

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AFe1jSDK<Body> implements ResponseNetwork<Body> {
    @NonNull
    public final AFe1mSDK AFInAppEventParameterName;
    @NonNull
    private final Body AFInAppEventType;
    final int AFKeystoreWrapper;
    @NonNull
    final Map<String, List<String>> valueOf;
    final boolean values;

    public AFe1jSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFe1mSDK aFe1mSDK) {
        this.AFInAppEventType = body;
        this.AFKeystoreWrapper = i;
        this.values = z;
        this.valueOf = new HashMap(map);
        this.AFInAppEventParameterName = aFe1mSDK;
    }

    @Nullable
    public final String AFInAppEventParameterName(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it = headerField.iterator();
            StringBuilder sb2 = new StringBuilder(it.next());
            while (it.hasNext()) {
                sb2.append(", ");
                sb2.append(it.next());
            }
            return sb2.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1jSDK aFe1jSDK = (AFe1jSDK) obj;
        if (this.AFKeystoreWrapper != aFe1jSDK.AFKeystoreWrapper || this.values != aFe1jSDK.values || !this.AFInAppEventType.equals(aFe1jSDK.AFInAppEventType) || !this.valueOf.equals(aFe1jSDK.valueOf)) {
            return false;
        }
        return this.AFInAppEventParameterName.equals(aFe1jSDK.AFInAppEventParameterName);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @Nullable
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.valueOf.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.valueOf.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFKeystoreWrapper;
    }

    public int hashCode() {
        return (((((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper) * 31) + (this.values ? 1 : 0)) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.values;
    }
}

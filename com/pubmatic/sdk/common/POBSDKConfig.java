package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBApplicationInfo;
import com.pubmatic.sdk.common.models.POBDSAComplianceStatus;
import com.pubmatic.sdk.common.models.POBExternalUserId;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.models.POBUserInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBSDKConfig {
    @Nullable

    /* renamed from: d */
    private Boolean f70028d;
    @Nullable

    /* renamed from: e */
    private POBLocation f70029e;
    @Nullable

    /* renamed from: h */
    private POBUserInfo f70032h;
    @Nullable

    /* renamed from: i */
    private POBApplicationInfo f70033i;

    /* renamed from: a */
    private boolean f70025a = true;

    /* renamed from: b */
    private long f70026b = 600000;

    /* renamed from: c */
    private boolean f70027c = false;

    /* renamed from: f */
    private boolean f70030f = true;

    /* renamed from: g */
    private boolean f70031g = true;
    @NonNull

    /* renamed from: k */
    private POBDSAComplianceStatus f70035k = POBDSAComplianceStatus.NOT_REQUIRED;
    @NonNull

    /* renamed from: j */
    private final Map<String, List<POBExternalUserId>> f70034j = Collections.synchronizedMap(new HashMap());

    public void addExternalUserId(@NonNull POBExternalUserId pOBExternalUserId) {
        boolean z;
        if (pOBExternalUserId != null && !POBUtils.isNullOrEmpty(pOBExternalUserId.getId()) && !POBUtils.isNullOrEmpty(pOBExternalUserId.getSource())) {
            String source = pOBExternalUserId.getSource();
            if (!this.f70034j.containsKey(source)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(pOBExternalUserId);
                this.f70034j.put(source, arrayList);
                return;
            }
            List<POBExternalUserId> list = this.f70034j.get(source);
            if (list != null) {
                Iterator<POBExternalUserId> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        POBExternalUserId next = it.next();
                        if (next != null && next.getId().equals(pOBExternalUserId.getId())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(pOBExternalUserId);
                    this.f70034j.put(source, list);
                    return;
                }
                POBLog.warn("POBSDKConfig", "%s with duplicate %s not allowed", "External User Id", "partner Id");
                return;
            }
            return;
        }
        POBLog.warn("POBSDKConfig", "%s is null or required fields are not available", "External User Id");
    }

    public void allowAdvertisingId(boolean z) {
        this.f70031g = z;
    }

    public void allowLocationAccess(boolean z) {
        this.f70025a = z;
    }

    @Nullable
    public POBApplicationInfo getApplicationInfo() {
        return this.f70033i;
    }

    @NonNull
    public POBDSAComplianceStatus getDsaComplianceStatus() {
        return this.f70035k;
    }

    @NonNull
    public Map<String, List<POBExternalUserId>> getExternalUserIds() {
        return this.f70034j;
    }

    @Nullable
    public POBLocation getLocation() {
        return this.f70029e;
    }

    public long getLocationDetectionDurationInMillis() {
        return this.f70026b;
    }

    @Nullable
    public <T> T getMeasurementProvider(@NonNull String str) {
        try {
            return (T) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            POBLog.error(POBOMSDKUtil.TAG, "%s", e.getMessage());
            return null;
        }
    }

    @Nullable
    public POBUserInfo getUserInfo() {
        return this.f70032h;
    }

    public boolean isAllowAdvertisingId() {
        return this.f70031g;
    }

    @Nullable
    public Boolean isCoppa() {
        return this.f70028d;
    }

    public boolean isLocationAccessAllowed() {
        return this.f70025a;
    }

    public boolean isRequestSecureCreative() {
        return this.f70030f;
    }

    public boolean isUseInternalBrowser() {
        return this.f70027c;
    }

    public void removeAllExternalUserIds() {
        this.f70034j.clear();
    }

    public void removeExternalUserIds(@NonNull String str) {
        if (str != null) {
            this.f70034j.remove(str);
        }
    }

    public void setApplicationInfo(@Nullable POBApplicationInfo pOBApplicationInfo) {
        this.f70033i = pOBApplicationInfo;
    }

    public void setCoppa(boolean z) {
        this.f70028d = Boolean.valueOf(z);
    }

    public void setDSAComplianceStatus(@NonNull POBDSAComplianceStatus pOBDSAComplianceStatus) {
        if (pOBDSAComplianceStatus != null) {
            this.f70035k = pOBDSAComplianceStatus;
        } else {
            POBLog.warn("POBSDKConfig", "%s is null or required fields are not available", "DSA Transparency Info");
        }
    }

    public void setLocation(@Nullable POBLocation pOBLocation) {
        this.f70029e = pOBLocation;
    }

    public void setLocationDetectionDurationInMillis(long j) {
        this.f70026b = j;
    }

    public void setRequestSecureCreative(boolean z) {
        this.f70030f = z;
    }

    public void setUseInternalBrowser(boolean z) {
        this.f70027c = z;
    }

    public void setUserInfo(@Nullable POBUserInfo pOBUserInfo) {
        this.f70032h = pOBUserInfo;
    }
}

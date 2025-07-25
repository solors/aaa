package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBUserInfo {

    /* renamed from: a */
    private int f70180a;
    @Nullable

    /* renamed from: b */
    private Gender f70181b;
    @Nullable

    /* renamed from: c */
    private String f70182c;
    @Nullable

    /* renamed from: d */
    private String f70183d;
    @Nullable

    /* renamed from: e */
    private String f70184e;
    @Nullable

    /* renamed from: f */
    private String f70185f;
    @Nullable

    /* renamed from: g */
    private String f70186g;
    @NonNull

    /* renamed from: h */
    private final Map<String, POBDataProvider> f70187h = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes7.dex */
    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");
        

        /* renamed from: b */
        private final String f70189b;

        Gender(String str) {
            this.f70189b = str;
        }

        public String getValue() {
            return this.f70189b;
        }
    }

    public void addDataProvider(@NonNull POBDataProvider pOBDataProvider) {
        if (pOBDataProvider != null && !POBUtils.isNullOrEmpty(pOBDataProvider.getName()) && !pOBDataProvider.getSegments().isEmpty()) {
            String name = pOBDataProvider.getName();
            if (!this.f70187h.containsKey(name)) {
                this.f70187h.put(name, pOBDataProvider);
                return;
            } else {
                POBLog.warn("POBUserInfo", "%s with duplicate %s not allowed", "Data Provider", "provider name");
                return;
            }
        }
        POBLog.warn("POBUserInfo", "%s is null or required fields are not available", "Data Provider");
    }

    public int getBirthYear() {
        return this.f70180a;
    }

    @Nullable
    public String getCity() {
        return this.f70182c;
    }

    @Nullable
    public POBDataProvider getDataProvider(@NonNull String str) {
        return this.f70187h.get(str);
    }

    @NonNull
    public List<POBDataProvider> getDataProviders() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, POBDataProvider> entry : this.f70187h.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    @Nullable
    public Gender getGender() {
        return this.f70181b;
    }

    @Nullable
    public String getKeywords() {
        return this.f70186g;
    }

    @Nullable
    public String getMetro() {
        return this.f70183d;
    }

    @Nullable
    public String getRegion() {
        return this.f70185f;
    }

    @Nullable
    public String getZip() {
        return this.f70184e;
    }

    public void removeAllDataProviders() {
        this.f70187h.clear();
    }

    @Nullable
    public POBDataProvider removeDataProvider(@NonNull String str) {
        return this.f70187h.remove(str);
    }

    public void setBirthYear(int i) {
        if (i > 0) {
            this.f70180a = i;
        }
    }

    public void setCity(@NonNull String str) {
        this.f70182c = str;
    }

    public void setGender(@NonNull Gender gender) {
        this.f70181b = gender;
    }

    public void setKeywords(String str) {
        this.f70186g = str;
    }

    public void setMetro(@NonNull String str) {
        this.f70183d = str;
    }

    public void setRegion(@NonNull String str) {
        this.f70185f = str;
    }

    public void setZip(@NonNull String str) {
        this.f70184e = str;
    }
}

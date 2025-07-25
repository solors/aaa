package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBDataProvider {
    @Nullable

    /* renamed from: a */
    private final String f70132a;
    @NonNull

    /* renamed from: b */
    private final String f70133b;

    /* renamed from: c */
    private int f70134c;
    @NonNull

    /* renamed from: d */
    private final Map<String, POBSegment> f70135d;
    @Nullable

    /* renamed from: e */
    private JSONObject f70136e;

    public POBDataProvider(@NonNull String str) {
        this(str, null);
    }

    public void addSegment(@NonNull POBSegment pOBSegment) {
        if (pOBSegment != null && !POBUtils.isNullOrEmpty(pOBSegment.getSegId())) {
            String segId = pOBSegment.getSegId();
            if (!this.f70135d.containsKey(segId)) {
                this.f70135d.put(segId, pOBSegment);
                return;
            } else {
                POBLog.warn("POBDataProvider", "%s with duplicate %s not allowed", "segments", "id");
                return;
            }
        }
        POBLog.warn("POBDataProvider", "%s is null or required fields are not available", "segments");
    }

    @Nullable
    public JSONObject getExt() {
        return this.f70136e;
    }

    @Nullable
    public String getId() {
        return this.f70132a;
    }

    @NonNull
    public String getName() {
        return this.f70133b;
    }

    public int getSegTax() {
        return this.f70134c;
    }

    @Nullable
    public POBSegment getSegment(@NonNull String str) {
        return this.f70135d.get(str);
    }

    @NonNull
    public Map<String, POBSegment> getSegments() {
        return this.f70135d;
    }

    public void removeAllSegments() {
        this.f70135d.clear();
    }

    @Nullable
    public POBSegment removeSegment(@NonNull String str) {
        return this.f70135d.remove(str);
    }

    public void setExt(@NonNull JSONObject jSONObject) {
        this.f70136e = jSONObject;
    }

    public void setSegTax(int i) {
        this.f70134c = i;
    }

    public POBDataProvider(@NonNull String str, @Nullable String str2) {
        this.f70132a = str2;
        this.f70133b = str;
        this.f70134c = 0;
        this.f70135d = Collections.synchronizedMap(new HashMap());
    }
}

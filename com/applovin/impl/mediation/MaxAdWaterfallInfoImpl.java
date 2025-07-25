package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC4391fe;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes2.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a */
    private final AbstractC4391fe f7950a;

    /* renamed from: b */
    private final String f7951b;

    /* renamed from: c */
    private final String f7952c;

    /* renamed from: d */
    private final List f7953d;

    /* renamed from: e */
    private final long f7954e;

    /* renamed from: f */
    private final List f7955f;

    /* renamed from: g */
    private final String f7956g;

    public MaxAdWaterfallInfoImpl(AbstractC4391fe abstractC4391fe, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(abstractC4391fe, abstractC4391fe.m99219V(), abstractC4391fe.m99218W(), j, list, abstractC4391fe.m99220U(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f7954e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f7950a;
    }

    public String getMCode() {
        return this.f7956g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f7951b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f7953d;
    }

    public List<String> getPostbackUrls() {
        return this.f7955f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f7952c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f7951b + ", testName=" + this.f7952c + ", networkResponses=" + this.f7953d + ", latencyMillis=" + this.f7954e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable AbstractC4391fe abstractC4391fe, String str, String str2, long j, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f7950a = abstractC4391fe;
        this.f7951b = str;
        this.f7952c = str2;
        this.f7953d = list;
        this.f7954e = j;
        this.f7955f = list2;
        this.f7956g = str3;
    }
}

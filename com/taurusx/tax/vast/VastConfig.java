package com.taurusx.tax.vast;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class VastConfig implements Serializable {

    /* renamed from: A */
    public VideoViewabilityTracker f74304A;

    /* renamed from: p */
    public String f74320p;

    /* renamed from: q */
    public String f74321q;

    /* renamed from: r */
    public String f74322r;

    /* renamed from: s */
    public String f74323s;

    /* renamed from: u */
    public VastIconConfig f74325u;

    /* renamed from: v */
    public int f74326v;

    /* renamed from: w */
    public int f74327w;

    /* renamed from: x */
    public String f74328x;

    /* renamed from: y */
    public String f74329y;

    /* renamed from: z */
    public String f74330z;

    /* renamed from: a */
    public ArrayList<VastTracker> f74305a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<VastFractionalProgressTracker> f74306b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<VastAbsoluteProgressTracker> f74307c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<VastTracker> f74308d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<VastTracker> f74309e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<VastTracker> f74310f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<VastTracker> f74311g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f74312h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<VastFractionalProgressTracker> f74313i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<VastFractionalProgressTracker> f74314j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<VastFractionalProgressTracker> f74315k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<VastTracker> f74316l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<VastTracker> f74317m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<VastTracker> f74318n = new ArrayList<>();

    /* renamed from: o */
    public Set<ViewabilityVendor> f74319o = new HashSet();

    /* renamed from: t */
    public Set<VastCompanionAdConfig> f74324t = new HashSet();

    public void addAbsoluteTrackers(List<VastAbsoluteProgressTracker> list) {
        this.f74307c.addAll(list);
    }

    public void addClickTrackers(List<VastTracker> list) {
        this.f74317m.addAll(list);
    }

    public void addCloseTrackers(List<VastTracker> list) {
        this.f74311g.addAll(list);
    }

    public void addCompleteTrackers(List<VastTracker> list) {
        this.f74310f.addAll(list);
    }

    public void addErrorTrackers(List<VastTracker> list) {
        this.f74318n.addAll(list);
    }

    public void addFirstQuartileTrackers(List<VastFractionalProgressTracker> list) {
        this.f74313i.addAll(list);
    }

    public void addFractionalTrackers(List<VastFractionalProgressTracker> list) {
        this.f74306b.addAll(list);
    }

    public void addImpressionTrackers(List<VastTracker> list) {
        this.f74305a.addAll(list);
    }

    public void addMidPointTrackers(List<VastFractionalProgressTracker> list) {
        this.f74314j.addAll(list);
    }

    public void addPauseTrackers(List<VastTracker> list) {
        this.f74308d.addAll(list);
    }

    public void addResumeTrackers(List<VastTracker> list) {
        this.f74309e.addAll(list);
    }

    public void addSkipTrackers(List<VastTracker> list) {
        this.f74316l.addAll(list);
    }

    public void addStartTrackers(List<String> list) {
        this.f74312h.addAll(list);
    }

    public void addThirdQuartileTrackers(List<VastFractionalProgressTracker> list) {
        this.f74315k.addAll(list);
    }

    public void addVastCompanionAdConfig(VastCompanionAdConfig vastCompanionAdConfig) {
        this.f74324t.add(vastCompanionAdConfig);
    }

    public void addVastCompanionAdConfigs(Set<VastCompanionAdConfig> set) {
        for (VastCompanionAdConfig vastCompanionAdConfig : set) {
            addVastCompanionAdConfig(vastCompanionAdConfig);
        }
    }

    public void addViewabilityVendors(Set<ViewabilityVendor> set) {
        this.f74319o.addAll(set);
    }

    public ArrayList<VastAbsoluteProgressTracker> getAbsoluteTrackers() {
        return this.f74307c;
    }

    public String getClickThroughUrl() {
        return this.f74320p;
    }

    public ArrayList<VastTracker> getClickTrackers() {
        return this.f74317m;
    }

    public ArrayList<VastTracker> getCloseTrackers() {
        return this.f74311g;
    }

    public ArrayList<VastTracker> getCompleteTrackers() {
        return this.f74310f;
    }

    public String getCustomCloseIconUrl() {
        return this.f74330z;
    }

    public String getCustomCtaText() {
        return this.f74328x;
    }

    public String getCustomSkipText() {
        return this.f74329y;
    }

    public String getDiskMediaFileUrl() {
        return this.f74322r;
    }

    public ArrayList<VastTracker> getErrorTrackers() {
        return this.f74318n;
    }

    public ArrayList<VastFractionalProgressTracker> getFirstQuartileTrackers() {
        return this.f74313i;
    }

    public ArrayList<VastFractionalProgressTracker> getFractionalTrackers() {
        return this.f74306b;
    }

    public ArrayList<VastTracker> getImpressionTrackers() {
        return this.f74305a;
    }

    public ArrayList<VastFractionalProgressTracker> getMidPointTrackers() {
        return this.f74314j;
    }

    public String getNetworkMediaFileUrl() {
        return this.f74321q;
    }

    public ArrayList<VastTracker> getPauseTrackers() {
        return this.f74308d;
    }

    public ArrayList<VastTracker> getResumeTrackers() {
        return this.f74309e;
    }

    public String getSkipOffset() {
        return this.f74323s;
    }

    public ArrayList<VastTracker> getSkipTrackers() {
        return this.f74316l;
    }

    public ArrayList<String> getStartTrackers() {
        return this.f74312h;
    }

    public ArrayList<VastFractionalProgressTracker> getThirdQuartileTrackers() {
        return this.f74315k;
    }

    public Set<VastCompanionAdConfig> getVastCompanionAdConfigs() {
        return this.f74324t;
    }

    public VastIconConfig getVastIconConfig() {
        return this.f74325u;
    }

    public int getVideoHeight() {
        return this.f74327w;
    }

    public VideoViewabilityTracker getVideoViewabilityTracker() {
        return this.f74304A;
    }

    public int getVideoWidth() {
        return this.f74326v;
    }

    public Set<ViewabilityVendor> getViewabilityVendors() {
        return this.f74319o;
    }

    public boolean hasCompanionAd() {
        if (this.f74324t != null) {
            return true;
        }
        return false;
    }

    public void setClickThroughUrl(String str) {
        this.f74320p = str;
    }

    public void setCustomCloseIconUrl(String str) {
        this.f74330z = str;
    }

    public void setCustomCtaText(String str) {
        this.f74328x = str;
    }

    public void setCustomSkipText(String str) {
        this.f74329y = str;
    }

    public void setDiskMediaFileUrl(String str) {
        this.f74322r = str;
    }

    public void setNetworkMediaFileUrl(String str) {
        this.f74321q = str;
    }

    public void setPauseTrackers(ArrayList<VastTracker> arrayList) {
        this.f74308d = this.f74308d;
    }

    public void setSkipOffset(String str) {
        this.f74323s = str;
    }

    public void setVastIconConfig(VastIconConfig vastIconConfig) {
        this.f74325u = vastIconConfig;
    }

    public void setVideoHeight(int i) {
        this.f74327w = i;
    }

    public void setVideoViewabilityTracker(VideoViewabilityTracker videoViewabilityTracker) {
        this.f74304A = videoViewabilityTracker;
    }

    public void setVideoWidth(int i) {
        this.f74326v = i;
    }

    public String toJsonString() {
        return new Gson().toJson(this);
    }
}

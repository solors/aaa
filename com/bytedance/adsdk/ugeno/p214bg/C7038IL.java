package com.bytedance.adsdk.ugeno.p214bg;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.IL */
/* loaded from: classes3.dex */
public class C7038IL {

    /* renamed from: IL */
    private long f15076IL;

    /* renamed from: Kg */
    private JSONObject f15077Kg;

    /* renamed from: bX */
    private int f15078bX;

    /* renamed from: bg */
    private Map<String, TreeMap<Float, String>> f15079bg;
    private String eqN;

    /* renamed from: iR */
    private String f15080iR;
    private String ldr;

    /* renamed from: zx */
    private long f15081zx;

    /* renamed from: IL */
    public Map<String, TreeMap<Float, String>> m90218IL() {
        return this.f15079bg;
    }

    /* renamed from: bX */
    public long m90215bX() {
        return this.f15076IL;
    }

    /* renamed from: bg */
    public JSONObject m90213bg() {
        return this.f15077Kg;
    }

    public int eqN() {
        return this.f15078bX;
    }

    /* renamed from: iR */
    public String m90207iR() {
        return this.f15080iR;
    }

    public long ldr() {
        return this.f15081zx;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.f15079bg + ", mDuration=" + this.f15076IL + ", mPlayCount=" + this.f15078bX + ", mPlayDirection=" + this.eqN + ", mDelay=" + this.f15081zx + ", mTransformOrigin='" + this.ldr + "', mTimingFunction='" + this.f15080iR + "'}";
    }

    /* renamed from: zx */
    public String m90206zx() {
        return this.eqN;
    }

    /* renamed from: IL */
    public void m90217IL(long j) {
        this.f15081zx = j;
    }

    /* renamed from: bX */
    public void m90214bX(String str) {
        this.f15080iR = str;
    }

    /* renamed from: bg */
    public void m90208bg(JSONObject jSONObject) {
        this.f15077Kg = jSONObject;
    }

    /* renamed from: IL */
    public void m90216IL(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public void m90209bg(Map<String, TreeMap<Float, String>> map) {
        this.f15079bg = map;
    }

    /* renamed from: bg */
    public void m90211bg(long j) {
        this.f15076IL = j;
    }

    /* renamed from: bg */
    public void m90212bg(int i) {
        this.f15078bX = i;
    }

    /* renamed from: bg */
    public void m90210bg(String str) {
        this.eqN = str;
    }
}

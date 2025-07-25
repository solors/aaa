package com.bytedance.sdk.openadsdk.api.reward;

/* loaded from: classes3.dex */
public class PAGRewardItem {

    /* renamed from: IL */
    private final String f17751IL;

    /* renamed from: bg */
    private final int f17752bg;

    public PAGRewardItem(int i, String str) {
        this.f17752bg = i;
        this.f17751IL = str;
    }

    public int getRewardAmount() {
        return this.f17752bg;
    }

    public String getRewardName() {
        return this.f17751IL;
    }
}

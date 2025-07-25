package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.utils.tuV */
/* loaded from: classes3.dex */
public class C9563tuV {
    /* renamed from: bg */
    public static void m82391bg(C7268eqN c7268eqN, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        c7268eqN.m89391bg(str, hashMap);
    }
}

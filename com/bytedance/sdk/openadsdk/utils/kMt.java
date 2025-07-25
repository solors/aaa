package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;

/* loaded from: classes3.dex */
public class kMt {

    /* renamed from: bg */
    public static boolean f21324bg = m82406bg();

    /* renamed from: bg */
    private static boolean m82406bg() {
        SharedPreferences sharedPreferences;
        try {
            if (C8838VzQ.m84740bg() != null && (sharedPreferences = C8838VzQ.m84740bg().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
        }
        return true;
    }

    /* renamed from: bg */
    public static void m82405bg(int i) {
        try {
            SharedPreferences.Editor edit = C8838VzQ.m84740bg().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i);
            edit.apply();
        } catch (Throwable th) {
            C7741PX.m87880IL(th.getMessage());
        }
    }
}

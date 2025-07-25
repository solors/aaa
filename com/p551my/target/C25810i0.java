package com.p551my.target;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.p551my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.i0 */
/* loaded from: classes7.dex */
public class C25810i0 extends AbstractC26021q1 {
    /* renamed from: a */
    public synchronized Map m43774a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return hashMap;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int intExtra3 = registerReceiver.getIntExtra("status", 1);
        if (intExtra >= 0 && intExtra2 > 0) {
            hashMap.put("bl", String.valueOf((intExtra * 100) / intExtra2));
        }
        hashMap.put(CmcdConfiguration.KEY_BUFFER_STARVATION, String.valueOf(intExtra3));
        return hashMap;
    }
}

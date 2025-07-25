package com.mbridge.msdk.newreward.function.command.receiver.tagreceiver;

import android.text.TextUtils;
import com.mbridge.apt_anotation.ReceiverAction;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.receiver.Receiver;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;
import java.io.File;
import java.util.Map;

@ReceiverAction(m53541id = "SharePreReceiver", type = Receiver.class)
/* loaded from: classes6.dex */
public class SharePreReceiver implements Receiver {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.Receiver
    /* renamed from: a */
    public final void mo50370a(Object obj) {
        int i;
        String str;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.get("resource_type") instanceof Integer) {
                i = ((Integer) map.get("resource_type")).intValue();
            } else {
                i = -1;
            }
            if (2 != i) {
                return;
            }
            if (map.get("metrics_config_path") instanceof String) {
                str = (String) map.get("metrics_config_path");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                try {
                    String m50258a = MBridgeCommonUtils.m50258a(new File(str));
                    if (!TextUtils.isEmpty(m50258a)) {
                        MBridgeSharedPreferenceModel.getInstance().putString(MBridgeConstans.SP_DYNAMIC_METRICS_REPORT, m50258a);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

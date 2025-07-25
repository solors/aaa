package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.command.C22352e;
import com.mbridge.msdk.newreward.function.command.receiver.Receiver;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.Map;

/* renamed from: com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.b */
/* loaded from: classes6.dex */
public final class CreateObjectReceiver implements Receiver {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.Receiver
    /* renamed from: a */
    public final void mo50370a(Object obj) {
        char c;
        try {
            Map map = (Map) obj;
            C22352e c22352e = (C22352e) map.get("result");
            Map map2 = (Map) map.get("obj_map");
            String str = (String) map.get("type");
            int hashCode = str.hashCode();
            if (hashCode == -2057274110) {
                if (str.equals("bridge_ids")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != -1019779949) {
                if (hashCode == 95346201 && str.equals("daily")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("offset")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                if (m50407a("daily", c22352e, map2)) {
                    return;
                }
                MBridgeDailyPlayModel mBridgeDailyPlayModel = new MBridgeDailyPlayModel(((Integer) map.get("mb_ad_type")).intValue(), (String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                map2.put("daily", mBridgeDailyPlayModel);
                c22352e.m50442a(mBridgeDailyPlayModel);
            } else if (c != 1) {
                if (c == 2 && !m50407a("bridge_ids", c22352e, map2)) {
                    MBridgeIds mBridgeIds = new MBridgeIds((String) map.get("mb_ad_pid"), (String) map.get("mb_ad_unit_id"));
                    map2.put("bridge_ids", mBridgeIds);
                    c22352e.m50442a(mBridgeIds);
                }
            } else if (m50407a("offset", c22352e, map2)) {
            } else {
                MBridgeOffsetManager mBridgeOffsetManager = new MBridgeOffsetManager();
                map2.put("offset", mBridgeOffsetManager);
                c22352e.m50442a(mBridgeOffsetManager);
            }
        } catch (Exception e) {
            SameLogTool.m51823b("CreateObjectReceiver", "action", e);
        }
    }

    /* renamed from: a */
    private boolean m50407a(String str, C22352e c22352e, Map map) {
        if (map.get(str) != null) {
            c22352e.m50442a(map.get(str));
            return true;
        }
        return false;
    }
}

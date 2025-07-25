package com.mbridge.msdk.newreward.function.command.receiver.concretereceiver;

import com.mbridge.msdk.foundation.p431c.MBFailureReason;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.command.C22351b;
import com.mbridge.msdk.newreward.function.command.receiver.AsyReceiver;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import com.mbridge.msdk.newreward.function.p491d.CampaignTableListener;
import com.mbridge.msdk.newreward.function.p491d.MBridgeDatabaseModel;
import com.mbridge.msdk.newreward.p477a.p479b.IReqCallBack;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.g */
/* loaded from: classes6.dex */
public final class RestoreFromDBReceiver implements AsyReceiver {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.AsyReceiver
    /* renamed from: a */
    public final void mo50378a(C22351b c22351b, final IReqCallBack iReqCallBack) {
        try {
            Map map = (Map) c22351b.m50476b();
            int intValue = ((Integer) map.get("mb_ad_type")).intValue();
            String str = (String) map.get("mb_ad_pid");
            String str2 = (String) map.get("mb_ad_unit_id");
            MBridgeDatabaseModel.m50350a().m50349b().m50363a(intValue, str, str2, ((Boolean) map.get("mb_ad_is_header_bidding")).booleanValue(), MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, str2), 1), new CampaignTableListener() { // from class: com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.g.1
                @Override // com.mbridge.msdk.newreward.function.p491d.CampaignTableListener
                /* renamed from: a */
                public final void mo50327a(List<MBridgeCampaigns> list) {
                    try {
                        IReqCallBack iReqCallBack2 = iReqCallBack;
                        if (iReqCallBack2 != null) {
                            iReqCallBack2.reqSuccessful(list);
                        }
                    } catch (Exception e) {
                        SameLogTool.m51823b("RestoreFromDBReceiver", "action", e);
                    }
                }

                @Override // com.mbridge.msdk.newreward.function.p491d.CampaignTableListener
                /* renamed from: a */
                public final void mo50328a() {
                    try {
                        IReqCallBack iReqCallBack2 = iReqCallBack;
                        if (iReqCallBack2 != null) {
                            iReqCallBack2.reqFailed(new MBFailureReason(880040, "no cached campaign in db"));
                        }
                    } catch (Exception e) {
                        SameLogTool.m51823b("RestoreFromDBReceiver", "action", e);
                    }
                }
            });
        } catch (Exception e) {
            SameLogTool.m51823b("RestoreFromDBReceiver", "action", e);
        }
    }
}

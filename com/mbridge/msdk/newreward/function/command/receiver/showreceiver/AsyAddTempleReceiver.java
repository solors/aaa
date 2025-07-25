package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.C22351b;
import com.mbridge.msdk.newreward.function.command.receiver.AsyReceiver;
import com.mbridge.msdk.newreward.p477a.p479b.IReqCallBack;
import com.mbridge.msdk.newreward.player.view.moreoffer.TemplateMoreOffer;
import java.util.Map;

/* renamed from: com.mbridge.msdk.newreward.function.command.receiver.showreceiver.d */
/* loaded from: classes6.dex */
public final class AsyAddTempleReceiver implements AsyReceiver {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.AsyReceiver
    /* renamed from: a */
    public final void mo50378a(C22351b c22351b, IReqCallBack iReqCallBack) {
        if (c22351b != null) {
            try {
                if (c22351b.m50476b() instanceof Map) {
                    Map map = (Map) c22351b.m50476b();
                    int intValue = ((Integer) map.get("add_temple")).intValue();
                    ViewGroup viewGroup = (ViewGroup) map.get("parent_temple");
                    int intValue2 = ((Integer) map.get("more_offer_type")).intValue();
                    if (intValue == 295) {
                        new TemplateMoreOffer(viewGroup.getContext(), iReqCallBack, intValue2).show(viewGroup);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }
}

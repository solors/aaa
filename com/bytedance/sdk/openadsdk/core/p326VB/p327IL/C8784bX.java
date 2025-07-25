package com.bytedance.sdk.openadsdk.core.p326VB.p327IL;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p207WR.p209bX.AbstractC7010bg;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.IL.bX */
/* loaded from: classes3.dex */
public class C8784bX extends AbstractC7010bg {
    public C8784bX(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p207WR.p209bX.AbstractC7010bg
    /* renamed from: iR */
    public String mo84932iR(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -282781070:
                if (str.equals("unmuted")) {
                    c = 0;
                    break;
                }
                break;
            case -191501435:
                if (str.equals("feedback")) {
                    c = 1;
                    break;
                }
                break;
            case 3327403:
                if (str.equals("logo")) {
                    c = 2;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 3;
                    break;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "tt_reward_full_unmute";
            case 1:
                return "tt_reward_full_feedback";
            case 2:
                return "tt_ad_logo";
            case 3:
                return "tt_close_btn";
            case 4:
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}

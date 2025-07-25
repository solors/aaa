package com.mbridge.msdk.newreward.function.command.receiver.showreceiver;

import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.command.receiver.Receiver;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import java.util.Map;

/* renamed from: com.mbridge.msdk.newreward.function.command.receiver.showreceiver.a */
/* loaded from: classes6.dex */
public final class ActivityLifecycleReceiver implements Receiver {
    @Override // com.mbridge.msdk.newreward.function.command.receiver.Receiver
    /* renamed from: a */
    public final void mo50370a(Object obj) {
        ViewGroup viewGroup;
        try {
            Map map = (Map) obj;
            String str = (String) map.get("life_cycle");
            if (map.get("parent_temple") instanceof ViewGroup) {
                viewGroup = (ViewGroup) map.get("parent_temple");
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof IBaseView) {
                        ((IBaseView) childAt).onActivityLifeCycleCallback(str);
                    }
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}

package com.meevii.abtest.business;

import android.os.Bundle;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.learnings.abcenter.util.AbCenterUtil;
import com.meevii.abtest.model.AbEvent;
import com.meevii.abtest.model.AbInitParams;
import com.meevii.abtest.util.Constant;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes6.dex */
public class AbEventManager {
    private static final List<AbEvent> eventList = new ArrayList();

    private static void dealSendEventTask() {
        RelyTaskManager.get().dealTask(Constant.TASK_KEY_SDK_SEND_FOREGROUND_EVENT, new Runnable() { // from class: com.meevii.abtest.business.g
            @Override // java.lang.Runnable
            public final void run() {
                AbEventManager.lambda$dealSendEventTask$0();
            }
        });
    }

    public static /* synthetic */ void lambda$dealSendEventTask$0() {
        for (AbEvent abEvent : eventList) {
            abEvent.send();
        }
        eventList.clear();
    }

    public static void sendDyeingEvent(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("dyeing_tag", str);
        bundle.putString("dyeing_param", str2);
        eventList.add(new AbEvent("learnings_abtest_dyeing", bundle));
        dealSendEventTask();
    }

    public static void sendInitEvent(AbInitParams abInitParams, String str, String str2, long j, AbUserTagData abUserTagData) {
        String str3;
        Bundle bundle = new Bundle();
        if (abInitParams.isDyeing()) {
            str3 = "yes";
        } else {
            str3 = SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO;
        }
        bundle.putString("dyeing_mode", str3);
        bundle.putString("latest_tag", str);
        bundle.putString("latest_alltag", str2);
        bundle.putString("app_version", AbCenterUtil.getVersionName(abInitParams.getContext()));
        bundle.putString("ab_version_code", String.valueOf(j));
        bundle.putString("user_info", abUserTagData.toJson(abInitParams.getContext()));
        eventList.add(new AbEvent("learnings_abtest_init", bundle));
        dealSendEventTask();
    }
}

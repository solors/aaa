package com.meevii.soniclib.largepush;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meevii.adsdk.common.SharedProxy;
import com.meevii.push.normalfloat.FullScreenIntentManager;
import com.unity3d.player.UnityPlayer;
import java.lang.reflect.Type;
import java.util.List;
import p039c4.LearningsGRT;
import p1007v3.AnalyzeManager;
import p636d7.PushLogUtil;
import p755k6.PushSdk;
import p785m5.MeeviiAd;

/* loaded from: classes5.dex */
public class LargePushManager {
    private static final String LARGE_LOCAL_PUSH_DATA_KEY = "zen_word_large_local_push_data_key";
    private static final String LARGE_PUSH_AB_TEST_KEY = "zen_word_abtest_large_push_key";
    private static final int LARGE_PUSH_AB_TEST_VALUE = 2;
    private static final String LARGE_REMOTE_PUSH_DATA_KEY = "zen_word_large_remote_push_data_key";
    private static final String SHARED_FILE_NAME = "zen_word_abtest_shared_file_name";
    private static final Gson sGson = new Gson();
    private static final Type sLargePushListType = new C23348a().getType();

    /* renamed from: com.meevii.soniclib.largepush.LargePushManager$a */
    /* loaded from: classes5.dex */
    class C23348a extends TypeToken<List<LargePushData>> {
        C23348a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LargePushData getLargeLocalPushData(Context context, String str, String str2) {
        String string = SharedProxy.getSharedProxy(context, SHARED_FILE_NAME).getString(LARGE_LOCAL_PUSH_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            List<LargePushData> list = (List) sGson.fromJson(string, sLargePushListType);
            if (list != null && !list.isEmpty()) {
                for (LargePushData largePushData : list) {
                    if (TextUtils.equals(str, largePushData.getPushId()) && TextUtils.equals(str2, largePushData.getContentId())) {
                        return largePushData;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LargePushData getLargeRemotePushData(Context context) {
        String string = SharedProxy.getSharedProxy(context, SHARED_FILE_NAME).getString(LARGE_REMOTE_PUSH_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (LargePushData) sGson.fromJson(string, (Class<Object>) LargePushData.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void init() {
        MeeviiAd.m15425c(LargePushActivity.class);
        AnalyzeManager.m2735f(LargePushActivity.class);
        PushSdk.m18198d(LargePushActivity.class);
        LearningsGRT.m103666a(LargePushActivity.class);
        FullScreenIntentManager.get().setIntentProvider(new LargePushIntentProvider());
    }

    public static void initLargeLocalPushData(String str) {
        SharedProxy sharedProxy = SharedProxy.getSharedProxy(UnityPlayer.currentActivity, SHARED_FILE_NAME);
        if (TextUtils.isEmpty(str)) {
            PushLogUtil.m25698a("initLargeLocalPushData：remove data");
            sharedProxy.remove(LARGE_LOCAL_PUSH_DATA_KEY);
            return;
        }
        PushLogUtil.m25698a("initLargeLocalPushData：" + str);
        sharedProxy.setString(LARGE_LOCAL_PUSH_DATA_KEY, str);
    }

    public static void initLargePushTest(int i) {
        PushLogUtil.m25698a("initLargePushTest：" + i);
        SharedProxy sharedProxy = SharedProxy.getSharedProxy(UnityPlayer.currentActivity, SHARED_FILE_NAME);
        if (2 != i) {
            sharedProxy.remove(LARGE_PUSH_AB_TEST_KEY);
        } else {
            sharedProxy.setInt(LARGE_PUSH_AB_TEST_KEY, i);
        }
    }

    public static void initLargeRemotePushData(String str) {
        SharedProxy sharedProxy = SharedProxy.getSharedProxy(UnityPlayer.currentActivity, SHARED_FILE_NAME);
        if (TextUtils.isEmpty(str)) {
            PushLogUtil.m25698a("initLargeRemotePushData：remove data");
            sharedProxy.remove(LARGE_REMOTE_PUSH_DATA_KEY);
            return;
        }
        PushLogUtil.m25698a("initLargeRemotePushData：" + str);
        sharedProxy.setString(LARGE_REMOTE_PUSH_DATA_KEY, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isLargePushTest(Context context) {
        if (SharedProxy.getSharedProxy(context, SHARED_FILE_NAME).getInt(LARGE_PUSH_AB_TEST_KEY, 0) != 2) {
            return false;
        }
        return true;
    }
}

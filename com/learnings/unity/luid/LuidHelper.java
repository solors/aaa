package com.learnings.unity.luid;

import android.content.Context;
import android.util.Log;
import com.learnings.luid.LUIDGenerator;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes6.dex */
public class LuidHelper {
    private static final String LISTENER_FUNC_NAME = "OnGenerate";
    private static LUIDGenerator _generator;
    private static boolean _isDebug;
    private static String _listenerObjectName;

    /* renamed from: com.learnings.unity.luid.LuidHelper$a */
    /* loaded from: classes6.dex */
    static class C21458a implements LUIDGenerator.ICallback {
        C21458a() {
        }

        @Override // com.learnings.luid.LUIDGenerator.ICallback
        public void onLUIDGenerated(String str) {
            if (str == null) {
                str = "";
            }
            LuidHelper.SendUnity(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SendUnity(String str) {
        String str2 = _listenerObjectName;
        if (str2 != null) {
            UnityPlayer.UnitySendMessage(str2, LISTENER_FUNC_NAME, str);
        }
    }

    public static void generate(String str) {
        _listenerObjectName = str;
        _generator.asynGenerator(new C21458a());
    }

    public static String getUuid() {
        Log.i("LearningsLuid", "can not get uuid because of sdk version.");
        return "";
    }

    public static void init(Context context, boolean z, String str) {
        _isDebug = z;
        _generator = new LUIDGenerator.Builder().setContext(context).setDebug(z).setUuid(str).build();
    }
}

package com.amazon.device.ads;

import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class MraidCommand {
    static HashMap<String, Class> commandRepository = new HashMap<>();

    public static Class<MraidCommand> findMraidCommandByName(String str) {
        return commandRepository.get(str);
    }

    public static Map<String, String> parseQueryString(String str) {
        String[] split = str.split(C21114v8.C21123i.f54135c);
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && indexOf < str2.length() - 1) {
                hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void registerCommand(String str, Class cls) {
        commandRepository.put(str, cls);
    }

    public abstract String getName();

    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
    }
}

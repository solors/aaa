package net.pubnative.lite.sdk.mraid.internal;

import com.ironsource.C21114v8;
import com.ironsource.sdk.controller.InterfaceC20844f;
import com.maticoo.sdk.mraid.Consts;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class MRAIDParser {
    private static final String TAG = "MRAIDParser";

    private boolean checkParamsForCommand(String str, Map<String, String> map) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1886160473:
                if (str.equals("playVideo")) {
                    c = 0;
                    break;
                }
                break;
            case -733616544:
                if (str.equals(Consts.CommandCreateCalendarEvent)) {
                    c = 1;
                    break;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    c = 2;
                    break;
                }
                break;
            case 133423073:
                if (str.equals("setOrientationProperties")) {
                    c = 3;
                    break;
                }
                break;
            case 459238621:
                if (str.equals("storePicture")) {
                    c = 4;
                    break;
                }
                break;
            case 624734601:
                if (str.equals(Consts.CommandSetResizeProperties)) {
                    c = 5;
                    break;
                }
                break;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
                return map.containsKey("url");
            case 1:
                return map.containsKey("eventJSON");
            case 3:
                if (!map.containsKey(Consts.OrientationPpropertiesAllowOrientationChange) || !map.containsKey(Consts.OrientationPpropertiesForceOrientation)) {
                    return false;
                }
                return true;
            case 5:
                if (!map.containsKey("width") || !map.containsKey("height") || !map.containsKey(Consts.ResizePropertiesOffsetX) || !map.containsKey(Consts.ResizePropertiesOffsetY) || !map.containsKey(Consts.ResizePropertiesCustomClosePosition) || !map.containsKey(Consts.ResizePropertiesAllowOffscreen)) {
                    return false;
                }
                return true;
            case 6:
                return map.containsKey("useCustomClose");
            default:
                return true;
        }
    }

    private boolean isValidCommand(String str) {
        return Arrays.asList("close", Consts.CommandCreateCalendarEvent, "expand", "open", "playVideo", "resize", "setOrientationProperties", Consts.CommandSetResizeProperties, "storePicture", "useCustomClose").contains(str);
    }

    public Map<String, String> parseCommandUrl(String str) {
        String[] split;
        MRAIDLog.m14285d(TAG, "parseCommandUrl " + str);
        String substring = str.substring(8);
        HashMap hashMap = new HashMap();
        int indexOf = substring.indexOf(63);
        if (indexOf != -1) {
            String substring2 = substring.substring(0, indexOf);
            for (String str2 : substring.substring(indexOf + 1).split(C21114v8.C21123i.f54135c)) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            substring = substring2;
        }
        if (!isValidCommand(substring)) {
            MRAIDLog.m14278w("command " + substring + " is unknown");
            return null;
        } else if (!checkParamsForCommand(substring, hashMap)) {
            MRAIDLog.m14278w("command URL " + str + " is missing parameters");
            return null;
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(InterfaceC20844f.C20847b.f53074g, substring);
            hashMap2.putAll(hashMap);
            return hashMap2;
        }
    }
}

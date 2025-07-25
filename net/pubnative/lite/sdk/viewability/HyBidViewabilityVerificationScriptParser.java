package net.pubnative.lite.sdk.viewability;

import android.text.TextUtils;
import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class HyBidViewabilityVerificationScriptParser {
    private static final String KEY_HASH = "#";
    private static final String KEY_VIEWABILITY = "viewability";
    private static final Pattern PATTERN_SRC_VALUE = Pattern.compile("src=\"(.*?)\"");
    private static final Pattern PATTERN_VENDORKEY_VALUE = Pattern.compile("vk=(.*?);");
    private static final String RESPONSE_KEY_CONFIG = "config";
    private static final String TAG = "HyBidViewabilityVerificationScriptParser";

    public static VerificationScriptResource parseViewabilityObjectfromAdObject(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return null;
        }
        try {
            str = jSONObject.getString("config");
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Matcher matcher = PATTERN_SRC_VALUE.matcher(str);
            matcher.find(0);
            String group = matcher.group(1);
            if (TextUtils.isEmpty(group)) {
                return null;
            }
            String[] split = group.split(KEY_HASH, 2);
            URL url = new URL(split[0]);
            String str2 = split[1];
            Matcher matcher2 = PATTERN_VENDORKEY_VALUE.matcher(str2);
            matcher2.find(0);
            return VerificationScriptResource.createVerificationScriptResourceWithParameters(matcher2.group(1), url, str2);
        } catch (Exception e) {
            String str3 = TAG;
            Logger.m14229d(str3, " Exception: " + e.getMessage());
            return null;
        }
    }
}

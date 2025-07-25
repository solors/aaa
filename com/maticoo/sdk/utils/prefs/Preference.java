package com.maticoo.sdk.utils.prefs;

import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.model.Configurations;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class Preference {
    public static PreferenceProperty<String> GAID = new PreferenceProperty<>(KeyConstants.RequestBody.KEY_GAID, "");
    public static PreferenceProperty<String> UID = new PreferenceProperty<>(KeyConstants.RequestBody.KEY_UID, "");
    public static PreferenceProperty<String> APP_SET_ID = new PreferenceProperty<>(KeyConstants.RequestBody.APP_SET_ID, "");
    public static PreferenceProperty<String> AndroidId = new PreferenceProperty<>("Maticoo_Android_Id", "");
    public static PreferenceProperty<Long> FLT = new PreferenceProperty<>(KeyConstants.RequestBody.KEY_FLT, 0L);
    public static PreferenceProperty<String> APP_KEY = new PreferenceProperty<>(KeyConstants.KEY_APP_KEY, "");
    public static PreferenceProperty<Configurations> CONFIGURATION = new PreferenceProperty<>(KeyConstants.KEY_CONFIGURATION, Configurations.class);
    public static PreferenceProperty<Boolean> PRIVACY_GDPR_CONSENT = new PreferenceProperty<>("zmaticoo.privacy_gdpr_consent", Boolean.TRUE);
    public static PreferenceProperty<Boolean> PRIVACY_NOT_TRACK_STATUS = new PreferenceProperty<>("zmaticoo.privacy_not_track_status", Boolean.FALSE);
    public static PreferenceProperty<Map<String, Object>> CUSTOM_DATA = new PreferenceProperty<>("zmaticoo.custom_user_data", new HashMap());
    public static PreferenceProperty<String> USER_AGENT = new PreferenceProperty<>("zmaticoo.user_agent", "");
    public static PreferenceProperty<Integer> CURRENT_FAIL_REQUEST_AD_TIMES = new PreferenceProperty<>("zmaticoo.current_fail_request_ad_times", 0);
    public static PreferenceProperty<Long> LAST_UPDATE_FAIL_REQUEST_AD = new PreferenceProperty<>("zmaticoo.last_update_fail_request_ad", 0L);
}

package com.learnings.unity.abtest;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterSharedUtil;
import com.learnings.abcenter.util.AbCenterUtil;
import com.meevii.abtest.util.Constant;
import com.meevii.abtest.util.IOUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class AbTestDataMerge {
    private static final String MERGE_FLAG_KEY = "unity_abtest_data_merge";
    private static final String TAG = "AbTestDataMerge";

    AbTestDataMerge() {
    }

    public static void mergeData(String str) {
        try {
            LogUtil.m53621i(TAG, "start merge data");
            if (AbCenterSharedUtil.getIntValue(UnityUtil.getContext(), MERGE_FLAG_KEY, 0) > 0) {
                LogUtil.m53621i(TAG, "has merged data, just return");
            } else if (TextUtils.isEmpty(str)) {
                LogUtil.m53621i(TAG, "dataJson is empty or null, just return");
            } else {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("groupId");
                if (!TextUtils.isEmpty(optString)) {
                    AbCenterUtil.setGroupId(UnityUtil.getContext(), optString);
                    LogUtil.m53621i(TAG, "merge groupId：" + optString);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("abTestTagConf");
                JSONArray optJSONArray = jSONObject.optJSONArray("emptyTestTagConf");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                if (optJSONObject != null && optJSONArray != null && optJSONObject2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("abTestTagConf", optJSONObject);
                    jSONObject2.put("emptyTestTagConf", optJSONArray);
                    jSONObject2.put("data", optJSONObject2);
                    String jSONObject3 = jSONObject2.toString();
                    IOUtil.saveAbTestDataToDisk(UnityUtil.getContext(), jSONObject3, Constant.DISK_CACHE_FILE_NAME_PARAM_SET);
                    LogUtil.m53621i(TAG, "merge data：" + jSONObject3);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("stainTags");
                if (optJSONArray2 != null) {
                    AbCenterSharedUtil.setStringValue(UnityUtil.getContext(), Constant.SP_KEY_DYEING_TAG, optJSONArray2.toString());
                    LogUtil.m53621i(TAG, "merge dyeing tag：" + optJSONArray2);
                }
                AbCenterSharedUtil.setIntValue(UnityUtil.getContext(), MERGE_FLAG_KEY, 1);
                LogUtil.m53621i(TAG, "merge success");
            }
        } catch (Exception e) {
            LogUtil.m53621i(TAG, "merge fail: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

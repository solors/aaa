package com.meevii.abtest.util;

import android.content.Context;
import com.learnings.abcenter.util.AbCenterConstant;
import com.learnings.abcenter.util.AbCenterSharedUtil;
import com.learnings.abcenter.util.AbCenterUtil;
import com.meevii.abtest.business.AbTagManager;
import com.meevii.abtest.util.AbDataUtil;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public class AbDataUtil {
    public static void clearData(Context context) {
        try {
            AbTestLog.log("删除历史数据");
            AbTagManager.get().clearAllTag();
            AbTestLog.log("删除内存中allTag");
            TreeSet treeSet = new TreeSet();
            treeSet.add(AbCenterConstant.SP_KEY_GROUP_ID);
            treeSet.add(AbCenterConstant.SP_KEY_COUNTRY);
            treeSet.add(Constant.SP_KEY_CONFIG_VERSION_CODE);
            AbCenterSharedUtil.clear(context, treeSet);
            AbTestLog.log("删除SharedPreference中除了groupId、country、V5ConfigVersionCode以外的数据");
            IOUtil.delete(context, Constant.DISK_CACHE_FILE_NAME_PARAM_SET);
            AbTestLog.log("删除V5历史参数集");
        } catch (Throwable unused) {
        }
    }

    public static void setGroupIdAndCountry(final Context context, String str, String str2) {
        AbCenterUtil.setGroupId(context, str);
        AbCenterUtil.setCountry(context, str2);
        AbTestLog.log("设置groupId: " + AbCenterUtil.getGroupId(context));
        AbTestLog.log("设置country: " + AbCenterUtil.getCountry(context));
        AbThreadUtil.runOnSingleThread(new Runnable() { // from class: l5.a
            @Override // java.lang.Runnable
            public final void run() {
                AbDataUtil.clearData(context);
            }
        });
    }
}

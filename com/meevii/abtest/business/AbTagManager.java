package com.meevii.abtest.business;

import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterUtil;
import com.meevii.abtest.model.AbInitParams;
import com.meevii.abtest.util.AbTestLog;
import com.meevii.abtest.util.AbThreadUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes6.dex */
public class AbTagManager {
    private AbInitParams mAbInitParams;
    private final Set<String> mAllTagSet;
    private final Map<String, String> mKeyTagMap;
    private final Map<String, String> mLastDyeingKeyTagMap;

    /* loaded from: classes6.dex */
    public static final class Holder {
        private static final AbTagManager instance = new AbTagManager();

        private Holder() {
        }
    }

    public static AbTagManager get() {
        return Holder.instance;
    }

    public /* synthetic */ void lambda$cacheDyeingTag$0(String str) {
        if (!this.mAbInitParams.isDyeing()) {
            return;
        }
        String tagFromParamsKey = AbDataManager.get().getTagFromParamsKey(str);
        if (TextUtils.isEmpty(tagFromParamsKey)) {
            return;
        }
        this.mKeyTagMap.put(str, tagFromParamsKey);
        if (AbTestLog.isShowLog()) {
            AbTestLog.log("手动染色模式下取参数，key: " + str + " , tag: " + tagFromParamsKey);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("当前已缓存tag: ");
            sb2.append(AbCenterUtil.toJsonString(this.mKeyTagMap));
            AbTestLog.log(sb2.toString());
        }
    }

    public /* synthetic */ void lambda$cacheDyeingTag$1(Map map) {
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                cacheDyeingTag(str);
            }
        }
    }

    public void addTag(String str) {
        this.mAllTagSet.add(str);
    }

    public void addTags(Collection<String> collection) {
        this.mAllTagSet.addAll(collection);
    }

    public void cacheDyeingTag(final String str) {
        AbThreadUtil.runOnUiThread(new Runnable() { // from class: com.meevii.abtest.business.h
            {
                AbTagManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbTagManager.this.lambda$cacheDyeingTag$0(str);
            }
        });
    }

    public void cacheLastDyeingTag(String str, String str2) {
        this.mLastDyeingKeyTagMap.put(str, str2);
    }

    public void clearAllTag() {
        this.mAllTagSet.clear();
    }

    public Set<String> getAllTag() {
        return this.mAllTagSet;
    }

    public String getCacheDyeingTag(String str) {
        return this.mKeyTagMap.get(str);
    }

    public String getLastDyeingTag(String str) {
        return this.mLastDyeingKeyTagMap.get(str);
    }

    public void init(AbInitParams abInitParams) {
        this.mAbInitParams = abInitParams;
    }

    private AbTagManager() {
        this.mAllTagSet = new ConcurrentSkipListSet();
        this.mKeyTagMap = new ConcurrentHashMap();
        this.mLastDyeingKeyTagMap = new ConcurrentHashMap();
    }

    public void cacheDyeingTag(final Map<String, Object> map) {
        AbThreadUtil.runOnUiThread(new Runnable() { // from class: com.meevii.abtest.business.i
            {
                AbTagManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbTagManager.this.lambda$cacheDyeingTag$1(map);
            }
        });
    }
}

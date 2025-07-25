package com.zeus.gmc.sdk.mobileads.msa.analytics.actions.base;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.analytics.util.C32821atntntntanaan;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class Action {
    protected static final String ACTION = "_action_";
    protected static final String CATEGORY = "_category_";
    protected static final String EVENT_ID = "_event_id_";
    protected static final String LABEL = "_label_";
    private static final String TAG = "Action";
    protected static final String VALUE = "_value_";
    private static Set<String> sKeywords;
    private JSONObject mContent = new JSONObject();
    private JSONObject mExtra = new JSONObject();
    protected Map<String, Object> mMap = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        sKeywords = hashSet;
        hashSet.add("_event_id_");
        sKeywords.add("_category_");
        sKeywords.add("_action_");
        sKeywords.add(LABEL);
        sKeywords.add(VALUE);
    }

    void addContent(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, i);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(TAG, "addContent int value e", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Action addEventId(String str) {
        addContent("_event_id_", str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addExtra(String str, String str2) {
        try {
            this.mExtra.put(str, str2);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(TAG, "addExtra e", e);
        }
    }

    public Action addParam(String str, JSONObject jSONObject) {
        addContent(str, jSONObject);
        this.mMap.put(str, jSONObject);
        return this;
    }

    final JSONObject getContent() {
        return this.mContent;
    }

    final JSONObject getExtra() {
        return this.mExtra;
    }

    public Map<String, Object> getMap() {
        return this.mMap;
    }

    public Action addParam(String str, int i) {
        addContent(str, i);
        this.mMap.put(str, Integer.valueOf(i));
        return this;
    }

    void addContent(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, j);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(TAG, "addContent long value e", e);
        }
    }

    public Action addParam(String str, long j) {
        addContent(str, j);
        this.mMap.put(str, Long.valueOf(j));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addContent(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, obj);
        } catch (Exception e) {
            C32821atntntntanaan.atntntntanaan(TAG, "addContent Object value e", e);
        }
    }

    public Action addParam(String str, String str2) {
        addContent(str, str2);
        this.mMap.put(str, str2);
        return this;
    }

    public Action addParam(String str, Boolean bool) {
        addContent(str, bool);
        this.mMap.put(str, bool);
        return this;
    }

    void addContent(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                try {
                    this.mContent.put(obj, jSONObject.get(obj));
                } catch (Exception e) {
                    C32821atntntntanaan.atntntntanaan(TAG, "addContent e", e);
                }
            }
        }
    }
}

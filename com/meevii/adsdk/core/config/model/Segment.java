package com.meevii.adsdk.core.config.model;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Segment {
    private int key;
    private String segmentMsg;
    private List<Integer> value;

    public static Segment getFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Segment segment = new Segment();
            segment.setKey(jSONObject.optInt("key"));
            if (segment.getKey() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            segment.setValue(arrayList);
            JSONArray optJSONArray = jSONObject.optJSONArray("value");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return segment;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getKey() {
        return this.key;
    }

    public String getSegmentMsg() {
        if (TextUtils.isEmpty(this.segmentMsg)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.key);
            sb2.append(":");
            for (int i = 0; i < this.value.size(); i++) {
                if (i > 0) {
                    sb2.append(",");
                }
                sb2.append(this.value.get(i));
            }
            this.segmentMsg = sb2.toString();
        }
        return this.segmentMsg;
    }

    public List<Integer> getValue() {
        return this.value;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public void setValue(List<Integer> list) {
        this.value = list;
    }

    public Pair<Integer, List<Integer>> toPair() {
        return new Pair<>(Integer.valueOf(this.key), this.value);
    }
}

package com.learnings.abcenter.model.p402v6;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.learnings.abcenter.model.v6.AbKeepHitExp */
/* loaded from: classes6.dex */
public class AbKeepHitExp {
    private Map<String, Integer> hitGroupData;

    /* renamed from: id */
    private String f54850id;
    private int index;
    private boolean isDyeing;

    private Map<String, Integer> getHitGroupData() {
        if (this.hitGroupData == null) {
            this.hitGroupData = new HashMap();
        }
        return this.hitGroupData;
    }

    public void addHitGroupData(String str, int i) {
        getHitGroupData().put(str, Integer.valueOf(i));
    }

    public boolean containsTag(String str) {
        return getHitGroupData().containsKey(str);
    }

    public int getHitGroupIndex(String str) {
        return getHitGroupData().get(str).intValue();
    }

    public String getId() {
        return this.f54850id;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isDyeing() {
        return this.isDyeing;
    }

    public void setDyeing(boolean z) {
        this.isDyeing = z;
    }

    public void setId(String str) {
        this.f54850id = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }
}

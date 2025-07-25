package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FilterWord {

    /* renamed from: IL */
    private String f17173IL;

    /* renamed from: bX */
    private boolean f17174bX;

    /* renamed from: bg */
    private String f17175bg;
    private List<FilterWord> eqN;

    public FilterWord(String str, String str2) {
        this.f17175bg = str;
        this.f17173IL = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.eqN == null) {
            this.eqN = new ArrayList();
        }
        this.eqN.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof FilterWord) {
            FilterWord filterWord = (FilterWord) obj;
            if (filterWord.getId().equals(getId()) && filterWord.getName().equals(getName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String getId() {
        return this.f17175bg;
    }

    public boolean getIsSelected() {
        return this.f17174bX;
    }

    public String getName() {
        return this.f17173IL;
    }

    public List<FilterWord> getOptions() {
        return this.eqN;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.eqN;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.f17175bg) && !TextUtils.isEmpty(this.f17173IL)) {
            return true;
        }
        return false;
    }

    public void setId(String str) {
        this.f17175bg = str;
    }

    public void setIsSelected(boolean z) {
        this.f17174bX = z;
    }

    public void setName(String str) {
        this.f17173IL = str;
    }

    public FilterWord() {
    }
}

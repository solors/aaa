package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MetaData {

    /* renamed from: a */
    private String f51673a;

    /* renamed from: b */
    private List<String> f51674b;

    /* renamed from: c */
    private List<MetaDataValueTypes> f51675c;

    /* loaded from: classes6.dex */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f51673a = str;
        this.f51674b = list;
        this.f51675c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f51675c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.f51673a;
    }

    public List<String> getMetaDataValue() {
        return this.f51674b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f51675c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f51673a = str;
        this.f51674b = list;
        this.f51675c = list2;
    }
}

package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.kj */
/* loaded from: classes6.dex */
public class C20209kj {
    /* renamed from: a */
    public static Map<String, Object> m57644a(Object[][] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
            }
        }
        return hashMap;
    }
}

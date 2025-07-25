package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class BarcodeValue {

    /* renamed from: a */
    private final Map<Integer, Integer> f44609a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer m65718a(int i) {
        return this.f44609a.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int[] m65717b() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f44609a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.toIntArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m65716c(int i) {
        Integer num = this.f44609a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f44609a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}

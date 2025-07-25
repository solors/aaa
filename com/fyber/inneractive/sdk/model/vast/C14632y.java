package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.y */
/* loaded from: classes4.dex */
public final class C14632y implements Comparable {

    /* renamed from: a */
    public final Integer[] f27763a;

    /* renamed from: b */
    public final String f27764b;

    public C14632y(String str) {
        this.f27763a = new Integer[0];
        if (!TextUtils.isEmpty(str) && str.matches("^[0-9.]+$")) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : str.split("\\.")) {
                arrayList.add(Integer.valueOf(AbstractC15471s.m76461a(str2, 0)));
            }
            this.f27763a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
            this.f27764b = str;
            return;
        }
        throw new C14631x();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C14632y c14632y) {
        int i;
        int i2;
        if (c14632y == null) {
            return 1;
        }
        int max = Math.max(this.f27763a.length, c14632y.f27763a.length);
        for (int i3 = 0; i3 < max; i3++) {
            Integer[] numArr = this.f27763a;
            if (numArr.length > i3) {
                i = numArr[i3].intValue();
            } else {
                i = 0;
            }
            Integer[] numArr2 = c14632y.f27763a;
            if (numArr2.length > i3) {
                i2 = numArr2[i3].intValue();
            } else {
                i2 = 0;
            }
            if (i > i2) {
                return 1;
            }
            if (i2 > i) {
                return -1;
            }
        }
        return 0;
    }

    public final String toString() {
        return this.f27764b;
    }
}

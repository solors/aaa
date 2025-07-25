package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C14625r;
import com.fyber.inneractive.sdk.model.vast.EnumC14627t;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.g */
/* loaded from: classes4.dex */
public final class C14547g implements Comparator {

    /* renamed from: a */
    public final int f27567a;

    /* renamed from: b */
    public final int f27568b;

    /* renamed from: c */
    public final int f27569c;

    public C14547g(int i, int i2, int i3) {
        this.f27567a = i;
        this.f27568b = i2;
        this.f27569c = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        Integer num;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        C14625r c14625r = (C14625r) obj;
        C14625r c14625r2 = (C14625r) obj2;
        int i = -1;
        if (TextUtils.equals("VPAID", c14625r2.f27756f)) {
            return -1;
        }
        if (!TextUtils.equals("VPAID", c14625r.f27756f)) {
            Integer num2 = c14625r.f27755e;
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
            }
            Integer num3 = c14625r2.f27755e;
            if (num3 == null) {
                intValue2 = 0;
            } else {
                intValue2 = num3.intValue();
            }
            int i2 = this.f27567a;
            if (intValue2 > i2 && intValue <= i2) {
                return -1;
            }
            if (intValue <= i2 || intValue2 > i2) {
                EnumC14627t m77748a = EnumC14627t.m77748a(c14625r2.f27754d);
                EnumC14627t enumC14627t = EnumC14627t.MEDIA_TYPE_MP4;
                if (m77748a == enumC14627t) {
                    num = 3;
                } else if (m77748a == EnumC14627t.MEDIA_TYPE_3GPP) {
                    num = 2;
                } else if (m77748a == EnumC14627t.MEDIA_TYPE_WEBM) {
                    num = 1;
                } else {
                    num = -1;
                }
                EnumC14627t m77748a2 = EnumC14627t.m77748a(c14625r.f27754d);
                if (m77748a2 == enumC14627t) {
                    i = 3;
                } else if (m77748a2 == EnumC14627t.MEDIA_TYPE_3GPP) {
                    i = 2;
                } else if (m77748a2 == EnumC14627t.MEDIA_TYPE_WEBM) {
                    i = 1;
                }
                int compareTo = num.compareTo(i);
                if (compareTo != 0) {
                    return compareTo;
                }
                if (intValue >= intValue2) {
                    if (intValue > intValue2) {
                        return -1;
                    }
                    Integer num4 = c14625r.f27752b;
                    if (num4 == null) {
                        intValue3 = 0;
                    } else {
                        intValue3 = num4.intValue();
                    }
                    Integer num5 = c14625r.f27753c;
                    if (num5 == null) {
                        intValue4 = 0;
                    } else {
                        intValue4 = num5.intValue();
                    }
                    Integer num6 = c14625r2.f27752b;
                    if (num6 == null) {
                        intValue5 = 0;
                    } else {
                        intValue5 = num6.intValue();
                    }
                    Integer num7 = c14625r2.f27753c;
                    if (num7 == null) {
                        intValue6 = 0;
                    } else {
                        intValue6 = num7.intValue();
                    }
                    int i3 = intValue3 * intValue4;
                    int i4 = intValue5 * intValue6;
                    int i5 = this.f27568b * this.f27569c;
                    int abs = Math.abs(i3 - i5);
                    int abs2 = Math.abs(i4 - i5);
                    if (abs < abs2) {
                        return -1;
                    }
                    if (abs <= abs2) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}

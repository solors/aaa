package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* renamed from: com.applovin.impl.we */
/* loaded from: classes2.dex */
public class C5775we {

    /* renamed from: a */
    private EnumC5776a f11736a;

    /* renamed from: b */
    private String f11737b;

    /* renamed from: com.applovin.impl.we$a */
    /* loaded from: classes2.dex */
    public enum EnumC5776a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private C5775we(EnumC5776a enumC5776a, String str) {
        this.f11736a = enumC5776a;
        this.f11737b = str;
    }

    /* renamed from: a */
    public EnumC5776a m93531a() {
        return this.f11736a;
    }

    /* renamed from: b */
    public String m93527b() {
        return this.f11737b;
    }

    /* renamed from: a */
    public static C5775we m93530a(AbstractC4391fe abstractC4391fe) {
        String m99223R = abstractC4391fe.m99223R();
        if (TextUtils.isEmpty(m99223R)) {
            return null;
        }
        return new C5775we(EnumC5776a.AD, m99223R);
    }

    /* renamed from: a */
    public static C5775we m93529a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new C5775we(EnumC5776a.AD_FORMAT, label);
    }

    /* renamed from: a */
    public static C5775we m93528a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new C5775we(EnumC5776a.AD_UNIT_ID, str);
    }
}

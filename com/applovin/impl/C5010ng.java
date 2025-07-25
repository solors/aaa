package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.ng */
/* loaded from: classes2.dex */
public class C5010ng {

    /* renamed from: a */
    private final View f8582a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f8583b;

    /* renamed from: c */
    private final String f8584c;

    public C5010ng(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8582a = view;
        this.f8583b = friendlyObstructionPurpose;
        this.f8584c = str;
    }

    /* renamed from: a */
    public String m96975a() {
        return this.f8584c;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m96974b() {
        return this.f8583b;
    }

    /* renamed from: c */
    public View m96973c() {
        return this.f8582a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5010ng c5010ng = (C5010ng) obj;
        View view = this.f8582a;
        if (view == null ? c5010ng.f8582a != null : !view.equals(c5010ng.f8582a)) {
            return false;
        }
        if (this.f8583b != c5010ng.f8583b) {
            return false;
        }
        String str = this.f8584c;
        String str2 = c5010ng.f8584c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        View view = this.f8582a;
        int i3 = 0;
        if (view != null) {
            i = view.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f8583b;
        if (friendlyObstructionPurpose != null) {
            i2 = friendlyObstructionPurpose.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.f8584c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }
}

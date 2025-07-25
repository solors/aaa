package com.taurusx.tax.p583c.p584a.p585d;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p584a.C28265a;
import java.util.List;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.a.d.d */
/* loaded from: classes7.dex */
public class C28274d {

    /* renamed from: a */
    public C28275e f73445a;

    /* renamed from: b */
    public C28272b f73446b;

    /* renamed from: c */
    public String f73447c;

    /* renamed from: d */
    public String f73448d;

    public C28274d() {
        C28162a.m38504a(new byte[]{119, 43, 87, 51, 70, 25, 83, 50}, new byte[]{50, 93});
    }

    /* renamed from: a */
    public long m38335a(String str) {
        SQLiteDatabase writableDatabase = this.f73445a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C28162a.f73047a.m23824a(new byte[]{102, 28, 102, 4, 119}, new byte[]{3, 106}), str);
        return writableDatabase.insert(this.f73447c, null, contentValues);
    }

    /* renamed from: a */
    public int m38333a(List<C28265a.C28268c> list) {
        SQLiteDatabase writableDatabase = this.f73445a.getWritableDatabase();
        int size = list.size();
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{66, -40, 121, -111, 84, -1, 61, -103}, new byte[]{29, -79}));
        StringBuilder sb3 = new StringBuilder((size * 2) - 1);
        sb3.append(stringFogImpl.m23824a(new byte[]{-85}, new byte[]{-108, -69}));
        for (int i = 1; i < size; i++) {
            sb3.append(C28162a.f73047a.m23824a(new byte[]{-5, 115}, new byte[]{-41, 76}));
        }
        sb2.append(sb3.toString());
        sb2.append(C28162a.f73047a.m23824a(new byte[]{-119}, new byte[]{-96, -12}));
        String sb4 = sb2.toString();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = String.valueOf(list.get(i2).f73438a);
        }
        return writableDatabase.delete(this.f73447c, sb4, strArr);
    }

    /* renamed from: a */
    public long m38334a(String str, String str2) {
        SQLiteDatabase writableDatabase = this.f73446b.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        contentValues.put(stringFogImpl.m23824a(new byte[]{81, 122, 81, 98, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{52, 12}), str);
        contentValues.put(stringFogImpl.m23824a(new byte[]{86, -103, 79, -107}, new byte[]{34, -16}), Long.valueOf(System.currentTimeMillis()));
        contentValues.put(stringFogImpl.m23824a(new byte[]{-68, -84, -76, -84}, new byte[]{-35, -56}), str2);
        return writableDatabase.insert(this.f73448d, null, contentValues);
    }
}

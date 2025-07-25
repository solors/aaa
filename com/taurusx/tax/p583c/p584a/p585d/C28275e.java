package com.taurusx.tax.p583c.p584a.p585d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.a.d.e */
/* loaded from: classes7.dex */
public class C28275e extends SQLiteOpenHelper {
    public C28275e(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static String m38332a() {
        return C28162a.f73047a.m23824a(new byte[]{-31, 24, -32, 11, -32, 10, -19, 87, -15, 27}, new byte[]{-107, 121});
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{-87, -84, -81, -65, -66, -69, -54, -86, -85, -68, -90, -69, -54}, new byte[]{-22, -2}));
        sb2.append(C28273c.m38336a());
        sb2.append(stringFogImpl.m23824a(new byte[]{53, 109}, new byte[]{21, 69}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-14, 26, -55}, new byte[]{-83, 115}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-85, -4, -59, -31, -50, -14, -50, -25, -85, -27, -39, -4, -58, -12, -39, -20, -85, -2, -50, -20, -89}, new byte[]{-117, -75}));
        sb2.append(stringFogImpl.m23824a(new byte[]{105, -115, 105, -107, 120}, new byte[]{12, -5}));
        sb2.append(stringFogImpl.m23824a(new byte[]{36, 121, 65, 117, 80, 4}, new byte[]{4, 45}));
        sQLiteDatabase.execSQL(sb2.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

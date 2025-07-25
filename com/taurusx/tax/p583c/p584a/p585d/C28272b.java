package com.taurusx.tax.p583c.p584a.p585d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.a.d.b */
/* loaded from: classes7.dex */
public class C28272b extends SQLiteOpenHelper {
    public C28272b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{115, -83, 117, -66, 100, -70, 16, -85, 113, -67, 124, -70, 16}, new byte[]{48, -1}));
        sb2.append(C28271a.m38337a());
        sb2.append(stringFogImpl.m23824a(new byte[]{77, 33}, new byte[]{109, 9}));
        sb2.append(stringFogImpl.m23824a(new byte[]{85, 2, 110}, new byte[]{10, 107}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-96, -48, -50, -51, -59, -34, -59, -53, -96, -55, -46, -48, -51, -40, -46, -64, -96, -46, -59, -64, -84}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -103}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-33, 20, -58, 24}, new byte[]{-85, 125}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-60, -94, -95, -82, -80, -38, -60}, new byte[]{-28, -10}));
        sb2.append(stringFogImpl.m23824a(new byte[]{116, 62, 124, 62}, new byte[]{21, 90}));
        sb2.append(stringFogImpl.m23824a(new byte[]{123, 24, 30, 20, 15, 96, 123}, new byte[]{91, 76}));
        sb2.append(stringFogImpl.m23824a(new byte[]{38, -99, 38, -123, 55}, new byte[]{67, -21}));
        sb2.append(stringFogImpl.m23824a(new byte[]{-64, -3, -91, -15, -76, UnsignedBytes.MAX_POWER_OF_TWO}, new byte[]{-32, -87}));
        sQLiteDatabase.execSQL(sb2.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

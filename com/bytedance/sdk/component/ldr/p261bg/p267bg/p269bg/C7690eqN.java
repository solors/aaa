package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.ldr.C7722ldr;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7685bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7686eqN;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7687iR;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7688ldr;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.eqN */
/* loaded from: classes3.dex */
public class C7690eqN extends SQLiteOpenHelper {

    /* renamed from: bg */
    final Context f16824bg;

    public C7690eqN(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f16824bg = context;
    }

    /* renamed from: IL */
    private void m88036IL(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> m88035bX = m88035bX(sQLiteDatabase);
        if (m88035bX != null && m88035bX.size() > 0) {
            Iterator<String> it = m88035bX.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }
    }

    /* renamed from: bX */
    private ArrayList<String> m88035bX(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: bg */
    private void m88034bg(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C7685bg.m88062IL(C7659Kg.m88154iR().eqN().mo83376IL()));
        sQLiteDatabase.execSQL(C7686eqN.m88051bX(C7659Kg.m88154iR().eqN().mo83374bg()));
        sQLiteDatabase.execSQL(C7687iR.m88047bX(C7659Kg.m88154iR().eqN().eqN()));
        sQLiteDatabase.execSQL(C7688ldr.m88040bg(C7659Kg.m88154iR().eqN().mo83372zx()));
        sQLiteDatabase.execSQL(C7722ldr.m87939IL());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            m88034bg(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                m88036IL(sQLiteDatabase);
                m88034bg(sQLiteDatabase);
                return;
            }
            m88034bg(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}

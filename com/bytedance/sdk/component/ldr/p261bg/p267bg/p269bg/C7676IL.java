package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7662bg;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.IL */
/* loaded from: classes3.dex */
public class C7676IL {

    /* renamed from: IL */
    private Context f16810IL;

    /* renamed from: bg */
    private C7678IL f16811bg;

    /* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.IL$bg */
    /* loaded from: classes3.dex */
    private class C7679bg extends AbstractCursor {
        private C7679bg() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7676IL(Context context) {
        try {
            this.f16810IL = context.getApplicationContext();
            if (this.f16811bg == null) {
                this.f16811bg = new C7678IL();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public C7678IL mo88070bg() {
        return this.f16811bg;
    }

    /* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.IL$IL */
    /* loaded from: classes3.dex */
    public class C7678IL {

        /* renamed from: IL */
        private volatile SQLiteDatabase f16812IL = null;

        public C7678IL() {
        }

        /* renamed from: IL */
        private boolean m88084IL() {
            SQLiteDatabase sQLiteDatabase = this.f16812IL;
            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                return true;
            }
            return false;
        }

        /* renamed from: bg */
        private void m88083bg() {
            try {
                if (this.f16812IL != null && this.f16812IL.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.f16812IL == null || !this.f16812IL.isOpen()) {
                        this.f16812IL = C7659Kg.m88154iR().eqN().mo83373bg(C7659Kg.m88154iR().ldr());
                        this.f16812IL.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                if (m88084IL()) {
                    throw th;
                }
            }
        }

        /* renamed from: bg */
        public void m88082bg(String str) throws SQLException {
            try {
                m88083bg();
                this.f16812IL.execSQL(str);
            } catch (Throwable th) {
                if (m88084IL()) {
                    throw th;
                }
            }
        }

        /* renamed from: bg */
        public Cursor m88077bg(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                m88083bg();
                return this.f16812IL.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                C7679bg c7679bg = new C7679bg();
                if (m88084IL()) {
                    throw th;
                }
                return c7679bg;
            }
        }

        /* renamed from: bg */
        public int m88081bg(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                m88083bg();
                return this.f16812IL.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (m88084IL()) {
                    throw e;
                }
                return 0;
            }
        }

        /* renamed from: bg */
        public long m88080bg(String str, String str2, ContentValues contentValues) {
            try {
                m88083bg();
                return this.f16812IL.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (m88084IL()) {
                    throw e;
                }
                return -1L;
            }
        }

        /* renamed from: bg */
        public synchronized void m88079bg(String str, String str2, List<InterfaceC7706bg> list) {
            JSONObject mo87978iR;
            try {
                m88083bg();
                this.f16812IL.beginTransaction();
                ContentValues contentValues = new ContentValues();
                for (int i = 0; i < list.size(); i++) {
                    InterfaceC7706bg interfaceC7706bg = list.get(i);
                    if (interfaceC7706bg != null && (mo87978iR = interfaceC7706bg.mo87978iR()) != null) {
                        contentValues.put("id", interfaceC7706bg.mo87989bX());
                        String mo83369IL = C7659Kg.m88154iR().m88153vb().mo83369IL(mo87978iR.toString());
                        if (!TextUtils.isEmpty(mo83369IL)) {
                            contentValues.put("value", mo83369IL);
                            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                            contentValues.put(C26484a.f69196M, (Integer) 0);
                            contentValues.put("encrypt", (Integer) 1);
                            if (C7662bg.eqN() && interfaceC7706bg.mo87979eo() > 0 && (interfaceC7706bg.eqN() == 0 || interfaceC7706bg.eqN() == 3)) {
                                contentValues.put(AppsFlyerProperties.CHANNEL, Integer.valueOf(interfaceC7706bg.mo87979eo()));
                            }
                            this.f16812IL.insert(str, str2, contentValues);
                        }
                        contentValues.clear();
                    }
                }
                this.f16812IL.setTransactionSuccessful();
                list.size();
                if (this.f16812IL != null) {
                    this.f16812IL.endTransaction();
                }
            } catch (Exception e) {
                list.size();
                if (!m88084IL()) {
                    if (this.f16812IL != null) {
                        this.f16812IL.endTransaction();
                    }
                } else {
                    throw e;
                }
            }
        }

        /* renamed from: bg */
        public int m88078bg(String str, String str2, String[] strArr) {
            try {
                m88083bg();
                return this.f16812IL.delete(str, str2, strArr);
            } catch (Exception e) {
                if (m88084IL()) {
                    throw e;
                }
                return 0;
            }
        }
    }
}

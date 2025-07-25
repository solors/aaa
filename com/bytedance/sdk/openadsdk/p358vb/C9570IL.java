package com.bytedance.sdk.openadsdk.p358vb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.bytedance.sdk.openadsdk.p358vb.p359IL.C9575bg;
import com.bytedance.sdk.openadsdk.p358vb.p360bX.C9577bg;
import com.bytedance.sdk.openadsdk.p358vb.p361bg.C9578VB;
import com.maticoo.sdk.MaticooAdsConstant;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.vb.IL */
/* loaded from: classes3.dex */
public class C9570IL {
    private static Context eqN;

    /* renamed from: zx */
    private static final long f21339zx = System.currentTimeMillis();

    /* renamed from: IL */
    private C9577bg f21340IL;

    /* renamed from: bX */
    private Boolean f21343bX;

    /* renamed from: bg */
    private InterfaceC9576bX f21344bg;
    private int ldr = 0;

    /* renamed from: iR */
    private final ArrayList<InterfaceC9583zx> f21345iR = new ArrayList<>();

    /* renamed from: Kg */
    private Runnable f21341Kg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.2
        @Override // java.lang.Runnable
        public void run() {
            C9570IL c9570il = C9570IL.this;
            c9570il.f21343bX = Boolean.valueOf(c9570il.f21344bg.isMonitorOpen());
            if (!C9570IL.this.f21343bX.booleanValue()) {
                return;
            }
            C9570IL c9570il2 = C9570IL.this;
            c9570il2.m82371bg(c9570il2.f21345iR);
            C9570IL.this.f21345iR.clear();
        }
    };

    /* renamed from: WR */
    private Runnable f21342WR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            int i;
            String str2;
            String str3;
            RunnableC95744 runnableC95744 = this;
            String str4 = "is_init";
            try {
                SQLiteDatabase m82344IL = C9578VB.m82344IL();
                if (m82344IL != null) {
                    String[] strArr = {"_id", "sdk_version", KeyConstants.RequestBody.KEY_SCENE, "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", MaticooAdsConstant.KEY_AD_MEDIATION, "is_init", "extra"};
                    try {
                        String str5 = "extra";
                        String[] strArr2 = {String.valueOf(C9570IL.f21339zx)};
                        int max = Math.max(10, C9570IL.this.f21344bg.getOnceLogCount());
                        if (max > 100) {
                            i = 10;
                        } else {
                            i = max;
                        }
                        Cursor query = m82344IL.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, String.valueOf(i));
                        if (query != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            while (query.moveToNext()) {
                                int i2 = i;
                                try {
                                    C9575bg c9575bg = new C9575bg();
                                    if (query.getColumnIndex("_id") >= 0) {
                                        str2 = str4;
                                        long j = query.getLong(query.getColumnIndex("_id"));
                                        c9575bg.m82353bg(j);
                                        arrayList2.add(String.valueOf(j));
                                    } else {
                                        str2 = str4;
                                    }
                                    if (query.getColumnIndex("sdk_version") >= 0) {
                                        c9575bg.m82352bg(query.getString(query.getColumnIndex("sdk_version")));
                                    }
                                    if (query.getColumnIndex(KeyConstants.RequestBody.KEY_SCENE) >= 0) {
                                        c9575bg.m82364IL(query.getString(query.getColumnIndex(KeyConstants.RequestBody.KEY_SCENE)));
                                    }
                                    if (query.getColumnIndex("start_count") >= 0) {
                                        c9575bg.m82354bg(query.getInt(query.getColumnIndex("start_count")));
                                    }
                                    if (query.getColumnIndex("success_count") >= 0) {
                                        c9575bg.m82366IL(query.getInt(query.getColumnIndex("success_count")));
                                    }
                                    if (query.getColumnIndex("fail_count") >= 0) {
                                        c9575bg.m82357bX(query.getInt(query.getColumnIndex("fail_count")));
                                    }
                                    if (query.getColumnIndex("rit") >= 0) {
                                        c9575bg.m82356bX(query.getString(query.getColumnIndex("rit")));
                                    }
                                    if (query.getColumnIndex("tag") >= 0) {
                                        c9575bg.eqN(query.getString(query.getColumnIndex("tag")));
                                    }
                                    if (query.getColumnIndex("label") >= 0) {
                                        c9575bg.m82347zx(query.getString(query.getColumnIndex("label")));
                                    }
                                    if (query.getColumnIndex(MaticooAdsConstant.KEY_AD_MEDIATION) >= 0) {
                                        c9575bg.ldr(query.getString(query.getColumnIndex(MaticooAdsConstant.KEY_AD_MEDIATION)));
                                    }
                                    String str6 = str2;
                                    if (query.getColumnIndex(str6) >= 0) {
                                        c9575bg.eqN(query.getInt(query.getColumnIndex(str6)));
                                    }
                                    String str7 = str5;
                                    if (query.getColumnIndex(str7) >= 0) {
                                        str3 = str6;
                                        c9575bg.m82349iR(query.getString(query.getColumnIndex(str7)));
                                    } else {
                                        str3 = str6;
                                    }
                                    arrayList.add(c9575bg);
                                    runnableC95744 = this;
                                    str5 = str7;
                                    i = i2;
                                    str4 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    str = "BusMonitorCenter";
                                    Log.e(str, th.getMessage());
                                }
                            }
                            int i3 = i;
                            query.close();
                            str = "BusMonitorCenter";
                            try {
                                Log.i(str, "exec upload ...");
                                if (!arrayList.isEmpty()) {
                                    try {
                                        C9570IL.this.f21344bg.onMonitorUpload(arrayList);
                                        SQLiteDatabase m82341bg = C9578VB.m82341bg();
                                        if (m82341bg != null && m82341bg.isOpen()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("_id IN (");
                                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                                sb2.append("?");
                                                if (i4 < arrayList2.size() - 1) {
                                                    sb2.append(",");
                                                }
                                            }
                                            sb2.append(")");
                                            m82341bg.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                            if (C9570IL.this.f21340IL != null) {
                                                C9570IL.this.f21340IL.m82345bg(C9570IL.f21339zx);
                                            }
                                        }
                                        if (arrayList.size() >= i3 && C9570IL.this.ldr <= 1000) {
                                            C9570IL.this.m82370bg(false);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Log.e(str, th.getMessage());
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str = "BusMonitorCenter";
            }
        }
    };

    private C9570IL(InterfaceC9576bX interfaceC9576bX) {
        try {
            this.f21344bg = new BusMonitorDependWrapper(interfaceC9576bX);
            this.f21340IL = new C9577bg(interfaceC9576bX.getContext());
            eqN = interfaceC9576bX.getContext();
        } catch (Throwable th) {
            Log.e("BusMonitorCenter", th.getMessage());
        }
    }

    static /* synthetic */ int eqN(C9570IL c9570il) {
        int i = c9570il.ldr;
        c9570il.ldr = i + 1;
        return i;
    }

    /* renamed from: bX */
    private boolean m82379bX() {
        if (this.f21343bX == null) {
            InterfaceC9576bX interfaceC9576bX = this.f21344bg;
            if (interfaceC9576bX != null && interfaceC9576bX.getContext() != null && this.f21344bg.getHandler() != null) {
                return true;
            }
        } else {
            InterfaceC9576bX interfaceC9576bX2 = this.f21344bg;
            if (interfaceC9576bX2 != null && interfaceC9576bX2.getContext() != null && this.f21344bg.isMonitorOpen() && this.f21344bg.getHandler() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bg */
    public static C9570IL m82373bg(InterfaceC9576bX interfaceC9576bX) {
        return new C9570IL(interfaceC9576bX);
    }

    /* renamed from: bg */
    public static Context m82377bg() {
        Context context = eqN;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    /* renamed from: bg */
    public void m82372bg(final InterfaceC9583zx interfaceC9583zx) {
        if (interfaceC9583zx == null || !m82379bX()) {
            return;
        }
        this.f21344bg.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.1
            @Override // java.lang.Runnable
            public void run() {
                C9570IL c9570il = C9570IL.this;
                c9570il.f21343bX = Boolean.valueOf(c9570il.f21344bg.isMonitorOpen());
                if (!C9570IL.this.f21343bX.booleanValue()) {
                    return;
                }
                C9570IL.this.f21345iR.add(interfaceC9583zx);
                if (C9570IL.this.f21345iR.size() >= 10) {
                    C9570IL c9570il2 = C9570IL.this;
                    c9570il2.m82371bg(c9570il2.f21345iR);
                    C9570IL.this.f21345iR.clear();
                }
            }
        });
        this.f21344bg.getHandler().removeCallbacks(this.f21341Kg);
        this.f21344bg.getHandler().postDelayed(this.f21341Kg, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m82371bg(List<InterfaceC9583zx> list) {
        int i;
        C9575bg generatorModel;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase m82341bg = C9578VB.m82341bg();
                if (m82341bg != null) {
                    try {
                        m82341bg.beginTransaction();
                        char c = 0;
                        int i2 = 0;
                        while (i2 < list.size()) {
                            InterfaceC9583zx interfaceC9583zx = list.get(i2);
                            if (interfaceC9583zx == null || (generatorModel = interfaceC9583zx.generatorModel()) == null) {
                                i = i2;
                            } else {
                                String[] strArr = {"_id", "sdk_version", KeyConstants.RequestBody.KEY_SCENE, "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", MaticooAdsConstant.KEY_AD_MEDIATION, "is_init", "extra"};
                                String sb2 = new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND extra = ?").toString();
                                String[] strArr2 = new String[8];
                                strArr2[c] = generatorModel.m82367IL();
                                strArr2[1] = generatorModel.m82358bX();
                                strArr2[2] = generatorModel.m82350iR();
                                strArr2[3] = generatorModel.m82363Kg();
                                strArr2[4] = generatorModel.m82359WR();
                                strArr2[5] = generatorModel.m82360VB();
                                strArr2[6] = String.valueOf(generatorModel.m82362PX());
                                strArr2[7] = generatorModel.m82361Ta();
                                Cursor query = m82341bg.query("monitor_table", strArr, sb2, strArr2, null, null, null);
                                if (query != null) {
                                    if (query.moveToNext()) {
                                        if (query.getColumnIndex("_id") >= 0) {
                                            generatorModel.m82353bg(query.getLong(query.getColumnIndex("_id")));
                                        }
                                        if (query.getColumnIndex("start_count") >= 0) {
                                            generatorModel.m82354bg(query.getInt(query.getColumnIndex("start_count")) + generatorModel.eqN());
                                        }
                                        if (query.getColumnIndex("success_count") >= 0) {
                                            generatorModel.m82366IL(query.getInt(query.getColumnIndex("success_count")) + generatorModel.m82348zx());
                                        }
                                        if (query.getColumnIndex("fail_count") >= 0) {
                                            generatorModel.m82357bX(query.getInt(query.getColumnIndex("fail_count")) + generatorModel.ldr());
                                        }
                                        if (query.getColumnIndex("timestamp") >= 0) {
                                            i = i2;
                                            generatorModel.m82365IL(Math.min(query.getLong(query.getColumnIndex("timestamp")), generatorModel.m82351eo()));
                                            query.close();
                                        }
                                    }
                                    i = i2;
                                    query.close();
                                } else {
                                    i = i2;
                                }
                                ContentValues contentValues = new ContentValues();
                                if (generatorModel.m82355bg() > 0) {
                                    contentValues.put("_id", Long.valueOf(generatorModel.m82355bg()));
                                }
                                contentValues.put("sdk_version", generatorModel.m82367IL());
                                contentValues.put(KeyConstants.RequestBody.KEY_SCENE, generatorModel.m82358bX());
                                contentValues.put("start_count", Integer.valueOf(generatorModel.eqN()));
                                contentValues.put("success_count", Integer.valueOf(generatorModel.m82348zx()));
                                contentValues.put("fail_count", Integer.valueOf(generatorModel.ldr()));
                                contentValues.put("rit", generatorModel.m82350iR());
                                contentValues.put("tag", generatorModel.m82363Kg());
                                contentValues.put("label", generatorModel.m82359WR());
                                contentValues.put("timestamp", Long.valueOf(generatorModel.m82351eo()));
                                contentValues.put(MaticooAdsConstant.KEY_AD_MEDIATION, generatorModel.m82360VB());
                                contentValues.put("is_init", Integer.valueOf(generatorModel.m82362PX()));
                                contentValues.put("extra", generatorModel.m82361Ta());
                                m82341bg.insertWithOnConflict("monitor_table", null, contentValues, 5);
                            }
                            i2 = i + 1;
                            c = 0;
                        }
                        Log.i("BusMonitorCenter", "exec save size = " + list.size());
                        m82341bg.setTransactionSuccessful();
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = m82341bg;
                        try {
                            Log.e("BusMonitorCenter", th.getMessage());
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable th3) {
                                    Log.e("BusMonitorCenter", th3.getMessage());
                                }
                            }
                            throw th2;
                        }
                    }
                }
                if (m82341bg != null) {
                    m82341bg.endTransaction();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            Log.e("BusMonitorCenter", th5.getMessage());
        }
    }

    /* renamed from: bg */
    public void m82370bg(final boolean z) {
        InterfaceC9576bX interfaceC9576bX = this.f21344bg;
        if (interfaceC9576bX == null || interfaceC9576bX.getHandler() == null || this.f21344bg.getContext() == null || this.f21340IL == null || !this.f21344bg.isMonitorOpen()) {
            return;
        }
        this.f21344bg.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vb.IL.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C9570IL.eqN(C9570IL.this);
                    if (z) {
                        long m82346bg = C9570IL.this.f21340IL.m82346bg();
                        if (m82346bg == 0) {
                            C9570IL.this.f21340IL.m82345bg(System.currentTimeMillis());
                            return;
                        } else if (C9570IL.f21339zx - m82346bg < C9570IL.this.f21344bg.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (C9570IL.this.f21344bg.getHandler() != null) {
                        C9570IL.this.f21344bg.getHandler().post(C9570IL.this.f21342WR);
                    }
                } catch (Throwable th) {
                    Log.e("BusMonitorCenter", th.getMessage());
                }
            }
        }, Math.max(this.f21344bg.getOnceLogInterval(), 10000));
    }
}

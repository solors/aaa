package com.apm.insight.p122e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.NpthBus;
import com.apm.insight.p121d.DartCrash;
import com.apm.insight.p122e.p123a.DuplicateLogDAO;

/* renamed from: com.apm.insight.e.a */
/* loaded from: classes2.dex */
public class NpthDataManager {

    /* renamed from: a */
    private static volatile NpthDataManager f3730a;

    /* renamed from: b */
    private DuplicateLogDAO f3731b;

    /* renamed from: c */
    private SQLiteDatabase f3732c;

    private NpthDataManager() {
    }

    /* renamed from: a */
    public static NpthDataManager m101995a() {
        if (f3730a == null) {
            synchronized (NpthDataManager.class) {
                if (f3730a == null) {
                    f3730a = new NpthDataManager();
                }
            }
        }
        return f3730a;
    }

    /* renamed from: b */
    private void m101991b() {
        if (this.f3731b == null) {
            m101994a(NpthBus.m102011g());
        }
    }

    /* renamed from: a */
    public final synchronized void m101994a(Context context) {
        try {
            this.f3732c = new NpthDbHelper(context).getWritableDatabase();
            this.f3731b = new DuplicateLogDAO();
        }
    }

    /* renamed from: a */
    public final synchronized void m101993a(DartCrash dartCrash) {
        m101991b();
        DuplicateLogDAO duplicateLogDAO = this.f3731b;
        if (duplicateLogDAO != null) {
            duplicateLogDAO.mo101987a(this.f3732c, dartCrash);
        }
    }

    /* renamed from: a */
    public final synchronized boolean m101992a(String str) {
        m101991b();
        DuplicateLogDAO duplicateLogDAO = this.f3731b;
        if (duplicateLogDAO != null) {
            return duplicateLogDAO.m101986a(this.f3732c, str);
        }
        return false;
    }
}

package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.pgl.ssdk.i0 */
/* loaded from: classes7.dex */
public class C26639i0 {

    /* renamed from: a */
    private static C26639i0 f69907a;

    /* renamed from: b */
    private Context f69908b;

    /* renamed from: c */
    private List<Integer> f69909c = new ArrayList();

    private C26639i0(Context context) {
        this.f69908b = null;
        this.f69908b = context;
    }

    /* renamed from: a */
    public static C26639i0 m40855a(Context context) {
        if (f69907a == null) {
            synchronized (C26639i0.class) {
                if (f69907a == null) {
                    f69907a = new C26639i0(context);
                }
            }
        }
        return f69907a;
    }

    /* renamed from: b */
    public int m40854b() {
        Intent registerReceiver = this.f69908b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 0;
        }
        return registerReceiver.getIntExtra("plugged", 0);
    }

    /* renamed from: c */
    public int m40853c() {
        Intent registerReceiver = this.f69908b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 0;
        }
        return Math.round(((registerReceiver.getIntExtra("level", 0) / registerReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    /* renamed from: d */
    public synchronized String m40852d() {
        if (this.f69909c.size() <= 0) {
            return "-1";
        }
        List<Integer> list = this.f69909c;
        return String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    /* renamed from: e */
    public synchronized String m40851e() {
        return new JSONArray((Collection) this.f69909c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: f */
    public int m40850f() {
        int i;
        try {
            synchronized (this) {
                try {
                    i = m40854b();
                    try {
                        return (i * 10000) + m40853c();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (Exception unused) {
                            return (i * 10000) + 0;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            }
        } catch (Exception unused2) {
            i = 0;
        }
    }

    /* renamed from: a */
    public void m40856a() {
        int m40850f = m40850f();
        if (m40850f == -1) {
            return;
        }
        this.f69909c.add(Integer.valueOf(m40850f));
        try {
            int size = this.f69909c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f69909c.subList(size - 10, size));
                this.f69909c.clear();
                this.f69909c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}

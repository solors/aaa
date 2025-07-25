package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class HeartBeatInfoStorage {

    /* renamed from: a */
    private final SharedPreferences f43042a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f43042a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m66812a() {
        long j = this.f43042a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f43042a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f43042a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f43042a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m66809d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    private synchronized String m66808e(String str) {
        for (Map.Entry<String, ?> entry : this.f43042a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m66805h(String str) {
        String m66808e = m66808e(str);
        if (m66808e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f43042a.getStringSet(m66808e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f43042a.edit().remove(m66808e).commit();
        } else {
            this.f43042a.edit().putStringSet(m66808e, hashSet).commit();
        }
    }

    /* renamed from: m */
    private synchronized void m66800m(String str, String str2) {
        m66805h(str2);
        HashSet hashSet = new HashSet(this.f43042a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f43042a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m66811b() {
        SharedPreferences.Editor edit = this.f43042a.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : this.f43042a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                String m66809d = m66809d(System.currentTimeMillis());
                String key = entry.getKey();
                if (((Set) entry.getValue()).contains(m66809d)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(m66809d);
                    i++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i);
        }
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<HeartBeatResult> m66810c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f43042a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(m66809d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        m66801l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m66807f(long j, long j2) {
        return m66809d(j).equals(m66809d(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m66806g() {
        String m66809d = m66809d(System.currentTimeMillis());
        this.f43042a.edit().putString("last-used-date", m66809d).commit();
        m66805h(m66809d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m66804i(long j) {
        return m66803j("fire-global", j);
    }

    /* renamed from: j */
    synchronized boolean m66803j(String str, long j) {
        if (this.f43042a.contains(str)) {
            if (!m66807f(this.f43042a.getLong(str, -1L), j)) {
                this.f43042a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.f43042a.edit().putLong(str, j).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m66802k(long j, String str) {
        String m66809d = m66809d(j);
        if (this.f43042a.getString("last-used-date", "").equals(m66809d)) {
            String m66808e = m66808e(m66809d);
            if (m66808e == null) {
                return;
            }
            if (m66808e.equals(str)) {
                return;
            }
            m66800m(str, m66809d);
            return;
        }
        long j2 = this.f43042a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m66812a();
            j2 = this.f43042a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f43042a.getStringSet(str, new HashSet()));
        hashSet.add(m66809d);
        this.f43042a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m66809d).commit();
    }

    /* renamed from: l */
    synchronized void m66801l(long j) {
        this.f43042a.edit().putLong("fire-global", j).commit();
    }
}

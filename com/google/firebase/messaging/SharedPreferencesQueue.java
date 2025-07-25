package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class SharedPreferencesQueue {

    /* renamed from: a */
    private final SharedPreferences f43267a;

    /* renamed from: b */
    private final String f43268b;

    /* renamed from: c */
    private final String f43269c;

    /* renamed from: e */
    private final Executor f43271e;
    @GuardedBy("internalQueue")
    @VisibleForTesting

    /* renamed from: d */
    final ArrayDeque<String> f43270d = new ArrayDeque<>();
    @GuardedBy("internalQueue")

    /* renamed from: f */
    private boolean f43272f = false;

    private SharedPreferencesQueue(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f43267a = sharedPreferences;
        this.f43268b = str;
        this.f43269c = str2;
        this.f43271e = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66546a(SharedPreferencesQueue sharedPreferencesQueue) {
        sharedPreferencesQueue.m66541f();
    }

    @GuardedBy("internalQueue")
    /* renamed from: b */
    private String m66545b(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        m66544c(z);
        return str;
    }

    @GuardedBy("internalQueue")
    /* renamed from: c */
    private boolean m66544c(boolean z) {
        if (z && !this.f43272f) {
            m66540g();
        }
        return z;
    }

    @WorkerThread
    /* renamed from: d */
    public static SharedPreferencesQueue m66543d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        SharedPreferencesQueue sharedPreferencesQueue = new SharedPreferencesQueue(sharedPreferences, str, str2, executor);
        sharedPreferencesQueue.m66542e();
        return sharedPreferencesQueue;
    }

    @WorkerThread
    /* renamed from: e */
    private void m66542e() {
        synchronized (this.f43270d) {
            this.f43270d.clear();
            String string = this.f43267a.getString(this.f43268b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f43269c)) {
                String[] split = string.split(this.f43269c, -1);
                if (split.length == 0) {
                    Log.e(Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f43270d.add(str);
                    }
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: f */
    public void m66541f() {
        synchronized (this.f43270d) {
            this.f43267a.edit().putString(this.f43268b, serialize()).commit();
        }
    }

    /* renamed from: g */
    private void m66540g() {
        this.f43271e.execute(new Runnable() { // from class: com.google.firebase.messaging.c0
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferencesQueue.m66546a(SharedPreferencesQueue.this);
            }
        });
    }

    public boolean add(@NonNull String str) {
        boolean m66544c;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f43269c)) {
            synchronized (this.f43270d) {
                m66544c = m66544c(this.f43270d.add(str));
            }
            return m66544c;
        }
        return false;
    }

    @GuardedBy("internalQueue")
    public void beginTransaction() {
        this.f43272f = true;
    }

    public void clear() {
        synchronized (this.f43270d) {
            this.f43270d.clear();
            m66544c(true);
        }
    }

    @GuardedBy("internalQueue")
    public void commitTransaction() {
        this.f43272f = false;
        m66540g();
    }

    @Nullable
    public String peek() {
        String peek;
        synchronized (this.f43270d) {
            peek = this.f43270d.peek();
        }
        return peek;
    }

    public boolean remove(@Nullable Object obj) {
        boolean m66544c;
        synchronized (this.f43270d) {
            m66544c = m66544c(this.f43270d.remove(obj));
        }
        return m66544c;
    }

    @NonNull
    @GuardedBy("internalQueue")
    public String serialize() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f43270d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f43269c);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public String serializeSync() {
        String serialize;
        synchronized (this.f43270d) {
            serialize = serialize();
        }
        return serialize;
    }

    public int size() {
        int size;
        synchronized (this.f43270d) {
            size = this.f43270d.size();
        }
        return size;
    }

    @NonNull
    public List<String> toList() {
        ArrayList arrayList;
        synchronized (this.f43270d) {
            arrayList = new ArrayList(this.f43270d);
        }
        return arrayList;
    }

    public String remove() {
        String m66545b;
        synchronized (this.f43270d) {
            m66545b = m66545b(this.f43270d.remove());
        }
        return m66545b;
    }
}

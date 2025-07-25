package p693h3;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: h3.d */
/* loaded from: classes5.dex */
public class SharedPreferencesStore implements ISharedPreferencesStore {

    /* renamed from: a */
    private final SharedPreferences f91314a;

    public SharedPreferencesStore(Context context, String str, int i) {
        this.f91314a = context.getSharedPreferences(str, i);
    }

    @Override // p693h3.ISharedPreferencesStore
    /* renamed from: a */
    public boolean mo23732a(String str) {
        return this.f91314a.getBoolean(str, false);
    }

    @Override // p693h3.ISharedPreferencesStore
    /* renamed from: b */
    public long mo23731b(String str) {
        return this.f91314a.getLong(str, 0L);
    }

    @Override // p693h3.ISharedPreferencesStore
    /* renamed from: c */
    public String mo23730c(String str) {
        return this.f91314a.getString(str, "");
    }

    @Override // p693h3.ISharedPreferencesStore
    public void clear() {
        this.f91314a.edit().clear().commit();
    }

    @Override // p693h3.ISharedPreferencesStore
    /* renamed from: d */
    public int mo23729d(String str) {
        return this.f91314a.getInt(str, 0);
    }

    @Override // p693h3.ISharedPreferencesStore
    public void putBoolean(String str, boolean z) {
        SharedPreferences.Editor edit = this.f91314a.edit();
        edit.putBoolean(str, z);
        if (!edit.commit()) {
            edit.commit();
        }
    }

    @Override // p693h3.ISharedPreferencesStore
    public void putInt(String str, int i) {
        SharedPreferences.Editor edit = this.f91314a.edit();
        edit.putInt(str, i);
        if (!edit.commit()) {
            edit.commit();
        }
    }

    @Override // p693h3.ISharedPreferencesStore
    public void putLong(String str, long j) {
        SharedPreferences.Editor edit = this.f91314a.edit();
        edit.putLong(str, j);
        if (!edit.commit()) {
            edit.commit();
        }
    }

    @Override // p693h3.ISharedPreferencesStore
    public void putString(String str, String str2) {
        SharedPreferences.Editor edit = this.f91314a.edit();
        edit.putString(str, str2);
        if (!edit.commit()) {
            edit.commit();
        }
    }

    @Override // p693h3.ISharedPreferencesStore
    public void remove(String str) {
        SharedPreferences.Editor edit = this.f91314a.edit();
        edit.remove(str);
        if (!edit.commit()) {
            edit.commit();
        }
    }
}

package sg.bigo.ads.common.p914g.p916b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.C43827j;

/* renamed from: sg.bigo.ads.common.g.b.c */
/* loaded from: classes10.dex */
public abstract class AbstractC43676c {

    /* renamed from: a */
    public long f114327a;

    /* renamed from: b */
    public boolean f114328b;

    /* renamed from: c */
    public int f114329c;

    /* renamed from: d */
    public long f114330d;

    /* renamed from: e */
    public String f114331e;

    /* renamed from: f */
    public long f114332f;

    /* renamed from: g */
    public long f114333g;

    /* renamed from: h */
    public Map<String, String> f114334h;

    public AbstractC43676c(Cursor cursor) {
        this.f114327a = -1L;
        this.f114328b = false;
        this.f114329c = 0;
        this.f114330d = 0L;
        this.f114331e = "";
        this.f114327a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.f114334h = C43827j.m4880a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        mo3767a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        mo3761b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        mo3759c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        mo3757d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f114329c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.f114330d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f114331e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f114332f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f114333g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f114328b = true;
    }

    @NonNull
    /* renamed from: a */
    public final String m5234a() {
        Map<String, String> map = this.f114334h;
        if (map != null) {
            if ((map instanceof HashMap) && map != null) {
                map.remove(null);
                map.values().removeAll(Collections.singleton(null));
            }
            return new JSONObject(this.f114334h).toString();
        }
        return "";
    }

    /* renamed from: a */
    protected abstract void mo3767a(String str);

    @NonNull
    /* renamed from: b */
    public abstract String mo3762b();

    /* renamed from: b */
    protected abstract void mo3761b(String str);

    @NonNull
    /* renamed from: c */
    public abstract String mo3760c();

    /* renamed from: c */
    protected abstract void mo3759c(String str);

    @NonNull
    /* renamed from: d */
    public abstract String mo3758d();

    /* renamed from: d */
    protected abstract void mo3757d(String str);

    @NonNull
    /* renamed from: e */
    public abstract String mo3756e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != AbstractC43676c.class) {
            return false;
        }
        long j = this.f114327a;
        if (j < 0 || j != ((AbstractC43676c) obj).f114327a) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo3755f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f114327a;
    }

    public AbstractC43676c(@NonNull Map<String, String> map) {
        this.f114327a = -1L;
        this.f114328b = false;
        this.f114329c = 0;
        this.f114330d = 0L;
        this.f114331e = "";
        long currentTimeMillis = System.currentTimeMillis();
        this.f114334h = map;
        this.f114332f = currentTimeMillis;
        this.f114333g = currentTimeMillis;
    }
}

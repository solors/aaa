package sg.bigo.ads.common.p914g.p916b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.common.g.b.a */
/* loaded from: classes10.dex */
public class C43674a {

    /* renamed from: a */
    public long f114313a;

    /* renamed from: b */
    public String f114314b;

    /* renamed from: c */
    public String f114315c;

    /* renamed from: d */
    public int f114316d;

    /* renamed from: e */
    public String f114317e;

    /* renamed from: f */
    public long f114318f;

    /* renamed from: g */
    public long f114319g;

    public C43674a(Cursor cursor) {
        this.f114313a = -1L;
        this.f114313a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f114314b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f114315c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f114316d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f114317e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f114318f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f114319g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C43674a.class) {
            return false;
        }
        long j = this.f114313a;
        if (j < 0 || j != ((C43674a) obj).f114313a) {
            return false;
        }
        return true;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f114313a + ",eventInfo=" + this.f114315c;
    }

    public C43674a(String str, String str2) {
        this.f114313a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.f114314b = str;
        this.f114315c = str2;
        this.f114316d = 0;
        this.f114317e = "";
        this.f114318f = currentTimeMillis;
        this.f114319g = currentTimeMillis;
    }
}

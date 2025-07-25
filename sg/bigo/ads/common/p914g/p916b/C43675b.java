package sg.bigo.ads.common.p914g.p916b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: sg.bigo.ads.common.g.b.b */
/* loaded from: classes10.dex */
public class C43675b {

    /* renamed from: a */
    public long f114320a;

    /* renamed from: b */
    public String f114321b;

    /* renamed from: c */
    public String f114322c;

    /* renamed from: d */
    public long f114323d;

    /* renamed from: e */
    public String f114324e;

    /* renamed from: f */
    public long f114325f;

    /* renamed from: g */
    public long f114326g;

    public C43675b(Cursor cursor) {
        this.f114320a = -1L;
        this.f114320a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f114321b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f114322c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f114323d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f114324e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f114325f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f114326g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C43675b.class) {
            return false;
        }
        long j = this.f114320a;
        if (j < 0 || j != ((C43675b) obj).f114320a) {
            return false;
        }
        return true;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f114320a + ",mEventId = " + this.f114321b + ",mExpiredTs = " + this.f114323d + ",eventInfo = " + this.f114322c;
    }

    public C43675b(String str, String str2, long j) {
        this.f114320a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.f114321b = str;
        this.f114322c = str2;
        this.f114323d = j;
        this.f114324e = "";
        this.f114325f = currentTimeMillis;
        this.f114326g = currentTimeMillis;
    }
}

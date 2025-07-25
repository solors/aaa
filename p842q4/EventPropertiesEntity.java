package p842q4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.json.JSONException;
import org.json.JSONObject;
import p993u4.C44433l;

@Entity(tableName = "event_property")
/* renamed from: q4.b */
/* loaded from: classes6.dex */
public class EventPropertiesEntity {
    @PrimaryKey

    /* renamed from: a */
    long f103424a;
    @ColumnInfo

    /* renamed from: b */
    String f103425b;
    @ColumnInfo

    /* renamed from: c */
    long f103426c;

    public EventPropertiesEntity(long j, String str, long j2) {
        this.f103424a = j;
        this.f103425b = str;
        this.f103426c = j2;
    }

    /* renamed from: a */
    public long m12986a() {
        return this.f103424a;
    }

    /* renamed from: b */
    public String m12985b() {
        return this.f103425b;
    }

    /* renamed from: c */
    public long m12984c() {
        return this.f103426c;
    }

    /* renamed from: d */
    public JSONObject m12983d() {
        try {
            return new JSONObject(this.f103425b);
        } catch (JSONException e) {
            C44433l.m2992f(e);
            return new JSONObject();
        }
    }

    @NonNull
    public String toString() {
        return "commitId = " + this.f103424a + "\nkey = " + this.f103425b + "\ntimestamp = " + this.f103426c;
    }
}

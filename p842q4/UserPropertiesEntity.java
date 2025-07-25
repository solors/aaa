package p842q4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.json.JSONException;
import org.json.JSONObject;
import p993u4.C44433l;

@Entity(tableName = "user_property")
/* renamed from: q4.d */
/* loaded from: classes6.dex */
public class UserPropertiesEntity {
    @PrimaryKey

    /* renamed from: a */
    long f103430a;
    @ColumnInfo

    /* renamed from: b */
    String f103431b;
    @ColumnInfo

    /* renamed from: c */
    long f103432c;

    public UserPropertiesEntity(long j, String str, long j2) {
        this.f103430a = j;
        this.f103431b = str;
        this.f103432c = j2;
    }

    /* renamed from: a */
    public long m12979a() {
        return this.f103430a;
    }

    /* renamed from: b */
    public String m12978b() {
        return this.f103431b;
    }

    /* renamed from: c */
    public long m12977c() {
        return this.f103432c;
    }

    /* renamed from: d */
    public JSONObject m12976d() {
        try {
            return new JSONObject(this.f103431b);
        } catch (JSONException e) {
            C44433l.m2992f(e);
            return new JSONObject();
        }
    }

    @NonNull
    public String toString() {
        return "commitId = " + this.f103430a + "\nkey = " + this.f103431b + "\ntimestamp = " + this.f103432c;
    }
}

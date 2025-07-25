package p842q4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.p552ot.pubsub.p559g.C26542f;
import org.json.JSONException;
import org.json.JSONObject;
import p993u4.C44433l;

@Entity(tableName = "events")
/* renamed from: q4.a */
/* loaded from: classes6.dex */
public class EventEntity {
    @ColumnInfo

    /* renamed from: a */
    long f103420a;
    @NonNull
    @PrimaryKey

    /* renamed from: b */
    String f103421b;
    @ColumnInfo

    /* renamed from: c */
    String f103422c;
    @ColumnInfo

    /* renamed from: d */
    long f103423d;

    /* renamed from: i */
    public static JSONObject m12987i(EventEntity eventEntity) {
        if (eventEntity == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(eventEntity.f103422c);
            String optString = jSONObject.optString(C26542f.C26543a.f69514l, "unset");
            jSONObject.remove(C26542f.C26543a.f69514l);
            String optString2 = jSONObject.optString("network_status", "unset");
            jSONObject.remove("network_status");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("event_id", eventEntity.f103421b);
                jSONObject2.put("event_local_timestamp", eventEntity.f103423d + "000");
                jSONObject2.put(C26542f.C26543a.f69514l, optString);
                jSONObject2.put("network_status", optString2);
                jSONObject2.put("param", jSONObject);
                return jSONObject2;
            } catch (JSONException unused) {
                return null;
            }
        } catch (JSONException e) {
            C44433l.m2992f(e);
            return null;
        }
    }

    /* renamed from: a */
    public long m12995a() {
        return this.f103420a;
    }

    /* renamed from: b */
    public String m12994b() {
        return this.f103422c;
    }

    /* renamed from: c */
    public String m12993c() {
        return this.f103421b;
    }

    /* renamed from: d */
    public long m12992d() {
        return this.f103423d;
    }

    /* renamed from: e */
    public void m12991e(long j) {
        this.f103420a = j;
    }

    /* renamed from: f */
    public void m12990f(String str) {
        this.f103422c = str;
    }

    /* renamed from: g */
    public void m12989g(String str) {
        this.f103421b = str;
    }

    /* renamed from: h */
    public void m12988h(long j) {
        this.f103423d = j;
    }

    @NonNull
    public String toString() {
        return "commitId = " + this.f103420a + "\neventId = " + this.f103421b + "\ndata = " + this.f103422c;
    }
}

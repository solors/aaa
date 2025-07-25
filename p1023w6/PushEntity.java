package p1023w6;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.meevii.push.notification.IDisplayPushData;
import java.util.List;
import java.util.Map;
import p636d7.DateUtil;
import p844q6.DataManager;

@Entity(tableName = "push")
/* renamed from: w6.f */
/* loaded from: classes5.dex */
public class PushEntity implements IDisplayPushData {
    @PrimaryKey(autoGenerate = true)

    /* renamed from: b */
    private int f117013b;
    @ColumnInfo

    /* renamed from: c */
    private long f117014c;
    @ColumnInfo

    /* renamed from: d */
    private long f117015d;
    @ColumnInfo

    /* renamed from: f */
    private long f117016f;
    @ColumnInfo

    /* renamed from: g */
    private String f117017g;
    @ColumnInfo

    /* renamed from: h */
    private int f117018h;
    @ColumnInfo

    /* renamed from: i */
    private long f117019i;
    @ColumnInfo

    /* renamed from: j */
    private int f117020j;
    @TypeConverters({ListConverter.class})
    @ColumnInfo

    /* renamed from: k */
    private List<String> f117021k;
    @Nullable
    @TypeConverters({MapConverter.class})
    @ColumnInfo

    /* renamed from: l */
    private Map<String, String> f117022l;
    @ColumnInfo

    /* renamed from: m */
    private int f117023m;

    @Nullable
    /* renamed from: a */
    public List<String> m2326a() {
        return this.f117021k;
    }

    /* renamed from: b */
    public long m2325b() {
        return this.f117014c;
    }

    /* renamed from: c */
    public int m2324c() {
        return this.f117023m;
    }

    /* renamed from: d */
    public String m2323d() {
        return this.f117017g;
    }

    @Nullable
    /* renamed from: e */
    public Map<String, String> m2322e() {
        return this.f117022l;
    }

    /* renamed from: f */
    public int m2321f() {
        return this.f117013b;
    }

    /* renamed from: g */
    public long m2320g() {
        return this.f117015d;
    }

    /* renamed from: h */
    public long m2319h() {
        return this.f117016f;
    }

    /* renamed from: i */
    public int m2318i() {
        return this.f117018h;
    }

    /* renamed from: j */
    public long m2317j() {
        return this.f117019i;
    }

    /* renamed from: k */
    public int m2316k() {
        return this.f117020j;
    }

    /* renamed from: l */
    public boolean m2315l() {
        try {
            long m12929f = DataManager.m12928g().m12929f();
            if (m12929f == -1) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int m2324c = m2324c();
            if (m2324c != 1) {
                if (m2324c != 2 || DateUtil.m25711a(m12929f, currentTimeMillis) >= 24.0d) {
                    return false;
                }
                return true;
            }
            return DateUtil.m25710b(m12929f, currentTimeMillis);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public void m2314m(@Nullable List<String> list) {
        this.f117021k = list;
    }

    /* renamed from: n */
    public void m2313n(long j) {
        this.f117014c = j;
    }

    /* renamed from: o */
    public void m2312o(int i) {
        this.f117023m = i;
    }

    /* renamed from: p */
    public void m2311p(String str) {
        this.f117017g = str;
    }

    /* renamed from: q */
    public void m2310q(@Nullable Map<String, String> map) {
        this.f117022l = map;
    }

    /* renamed from: r */
    public void m2309r(int i) {
        this.f117013b = i;
    }

    /* renamed from: s */
    public void m2308s(long j) {
        this.f117015d = j;
    }

    /* renamed from: t */
    public void m2307t(long j) {
        this.f117016f = j;
    }

    public String toString() {
        return "PushEntity{ id=" + this.f117013b + ", createTime=" + this.f117014c + ", pushTime=" + this.f117015d + ", randomDelayInterval=" + this.f117016f + ", eventId='" + this.f117017g + ", repeatCount=" + this.f117018h + ", repeatTime=" + this.f117019i + ", contents= " + this.f117021k + ", status=" + this.f117020j + ", extension=" + this.f117022l + ", disturbType=" + this.f117023m + '}';
    }

    /* renamed from: u */
    public void m2306u(int i) {
        this.f117018h = i;
    }

    /* renamed from: v */
    public void m2305v(long j) {
        this.f117019i = j;
    }

    /* renamed from: w */
    public void m2304w(int i) {
        this.f117020j = i;
    }
}

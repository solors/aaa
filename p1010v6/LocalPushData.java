package p1010v6;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.notification.IDisplayPushData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p1023w6.PushEntity;
import p636d7.C32857k;

/* renamed from: v6.a */
/* loaded from: classes5.dex */
public class LocalPushData implements IDisplayPushData {

    /* renamed from: b */
    private final PushEntity f116874b;

    /* renamed from: c */
    private Map<String, NotificationContentEntity> f116875c;

    /* renamed from: d */
    private String f116876d;

    /* compiled from: LocalPushData.java */
    /* renamed from: v6.a$a */
    /* loaded from: classes5.dex */
    public static class C44511a {

        /* renamed from: a */
        private Map<String, NotificationContentEntity> f116877a;

        /* renamed from: b */
        private long f116878b;

        /* renamed from: c */
        private String f116879c = "";

        /* renamed from: d */
        private long f116880d = 0;

        /* renamed from: e */
        private boolean f116881e = false;

        /* renamed from: f */
        private long f116882f;

        /* renamed from: g */
        private Map<String, String> f116883g;

        /* renamed from: h */
        private int f116884h;

        /* renamed from: a */
        public LocalPushData m2668a() {
            int i;
            if (!TextUtils.isEmpty(this.f116879c)) {
                if (this.f116878b > 0) {
                    Map<String, NotificationContentEntity> map = this.f116877a;
                    if (map != null && !map.isEmpty()) {
                        if (this.f116881e && this.f116882f <= 0) {
                            throw new IllegalArgumentException("repeatInterval time = " + this.f116882f);
                        }
                        PushEntity pushEntity = new PushEntity();
                        pushEntity.m2305v(this.f116882f);
                        pushEntity.m2314m(new ArrayList(this.f116877a.keySet()));
                        if (this.f116881e) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        pushEntity.m2306u(i);
                        pushEntity.m2308s(this.f116878b);
                        pushEntity.m2307t(this.f116880d);
                        pushEntity.m2310q(this.f116883g);
                        pushEntity.m2311p(this.f116879c);
                        pushEntity.m2312o(this.f116884h);
                        return new LocalPushData(pushEntity, this.f116877a);
                    }
                    throw new IllegalArgumentException("contentDataMap is empty.");
                }
                throw new IllegalArgumentException("pushTime <= 0.");
            }
            throw new IllegalArgumentException("PushId is empty.");
        }

        /* renamed from: b */
        public C44511a m2667b(Map<String, NotificationContentEntity> map) {
            this.f116877a = map;
            return this;
        }

        /* renamed from: c */
        public C44511a m2666c(int i) {
            this.f116884h = i;
            return this;
        }

        /* renamed from: d */
        public C44511a m2665d(Map<String, String> map) {
            this.f116883g = map;
            return this;
        }

        /* renamed from: e */
        public C44511a m2664e(boolean z) {
            this.f116881e = z;
            return this;
        }

        /* renamed from: f */
        public C44511a m2663f(String str) {
            this.f116879c = str;
            return this;
        }

        /* renamed from: g */
        public C44511a m2662g(long j) {
            this.f116878b = j;
            return this;
        }

        /* renamed from: h */
        public C44511a m2661h(long j) {
            this.f116882f = j;
            return this;
        }
    }

    public LocalPushData(PushEntity pushEntity, Map<String, NotificationContentEntity> map) {
        this.f116874b = pushEntity;
        this.f116875c = map;
        pushEntity.m2313n(System.currentTimeMillis());
        pushEntity.m2304w(0);
    }

    /* renamed from: a */
    public void m2675a(Context context) {
        for (String str : this.f116875c.keySet()) {
            NotificationContentEntity notificationContentEntity = this.f116875c.get(str);
            if (notificationContentEntity != null) {
                if (notificationContentEntity.m47926q() != 0) {
                    notificationContentEntity.m47945M(C32857k.m25682a(context, notificationContentEntity.m47926q()));
                }
                if (notificationContentEntity.m47930m() != 0) {
                    notificationContentEntity.m47949I(C32857k.m25682a(context, notificationContentEntity.m47930m()));
                }
                if (notificationContentEntity.m47937f() != 0) {
                    notificationContentEntity.m47956B(C32857k.m25682a(context, notificationContentEntity.m47937f()));
                }
            }
        }
    }

    /* renamed from: b */
    public Map<String, NotificationContentEntity> m2674b() {
        return this.f116875c;
    }

    /* renamed from: c */
    public String m2673c() {
        return this.f116876d;
    }

    /* renamed from: d */
    public Map<String, String> m2672d() {
        return this.f116874b.m2322e();
    }

    /* renamed from: e */
    public PushEntity m2671e() {
        return this.f116874b;
    }

    /* renamed from: f */
    public String m2670f() {
        return this.f116874b.m2323d();
    }

    /* renamed from: g */
    public void m2669g(String str) {
        this.f116876d = str;
    }

    @NonNull
    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pushId = ");
        sb2.append(this.f116874b.m2323d());
        sb2.append('\n');
        sb2.append("contents = ");
        Map<String, NotificationContentEntity> map = this.f116875c;
        String str3 = "null";
        if (map == null) {
            str = "null";
        } else {
            str = Arrays.toString(map.values().toArray());
        }
        sb2.append(str);
        sb2.append('\n');
        sb2.append("extensionKeys = ");
        if (this.f116874b.m2322e() == null) {
            str2 = "null";
        } else {
            str2 = Arrays.toString(this.f116874b.m2322e().keySet().toArray());
        }
        sb2.append(str2);
        sb2.append('\n');
        sb2.append("extensionValues = ");
        if (this.f116874b.m2322e() != null) {
            str3 = Arrays.toString(this.f116874b.m2322e().values().toArray());
        }
        sb2.append(str3);
        sb2.append('\n');
        sb2.append("isInfiniteRepeat ");
        sb2.append(this.f116874b.m2318i());
        sb2.append('\n');
        sb2.append("pushTime ");
        sb2.append(this.f116874b.m2320g());
        sb2.append('\n');
        sb2.append("randomDelayInterval ");
        sb2.append(this.f116874b.m2319h());
        sb2.append('\n');
        sb2.append("repeatInterval ");
        sb2.append(this.f116874b.m2319h());
        sb2.append('\n');
        sb2.append("disturbType ");
        sb2.append(this.f116874b.m2324c());
        return sb2.toString();
    }
}

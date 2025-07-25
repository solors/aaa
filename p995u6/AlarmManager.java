package p995u6;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p1010v6.LocalPushData;
import p1023w6.PushDaoProxy;
import p1023w6.PushEntity;
import p636d7.PushLogUtil;

/* renamed from: u6.a */
/* loaded from: classes5.dex */
public class AlarmManager {

    /* renamed from: b */
    private static final AlarmManager f116616b = new AlarmManager();

    /* renamed from: a */
    private Application f116617a;

    /* renamed from: a */
    public static AlarmManager m2973a() {
        return f116616b;
    }

    /* renamed from: h */
    private boolean m2966h(PushEntity pushEntity) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        while (pushEntity.m2320g() < currentTimeMillis) {
            pushEntity.m2308s(pushEntity.m2320g() + pushEntity.m2317j());
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void m2972b(Context context) {
        this.f116617a = (Application) context.getApplicationContext();
    }

    /* renamed from: c */
    public void m2971c(PushEntity pushEntity) {
        int i;
        if (pushEntity.m2320g() <= 0) {
            PushLogUtil.m25698a("add alarm fail, push time is 0");
            return;
        }
        Intent m2960c = AlarmUtils.m2960c(this.f116617a);
        AlarmUtils.m2961b(this.f116617a, pushEntity.m2321f(), m2960c);
        long m2319h = pushEntity.m2319h();
        if (m2319h > 0) {
            i = new Random().nextInt((int) m2319h);
        } else {
            i = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("inner add alarm success:");
        sb2.append(pushEntity);
        sb2.append("  realTime:");
        long j = i;
        sb2.append(pushEntity.m2320g() + j);
        PushLogUtil.m25698a(sb2.toString());
        AlarmUtils.m2957f(this.f116617a, pushEntity.m2321f(), m2960c, pushEntity.m2320g() + j);
    }

    /* renamed from: d */
    public void m2970d(String str) {
        PushEntity m2347d = PushDaoProxy.m2347d(str);
        if (m2347d == null) {
            PushLogUtil.m25698a("remove alarm fail, alarm no exist, eventId : " + str);
            return;
        }
        AlarmUtils.m2962a(this.f116617a, m2347d.m2321f());
        PushDaoProxy.m2350a(m2347d);
        PushLogUtil.m25698a("remove alarm success, eventId :" + str);
        List<String> m2326a = m2347d.m2326a();
        if (m2326a != null && !m2326a.isEmpty()) {
            List<PushEntity> m2346e = PushDaoProxy.m2346e();
            if (m2346e != null && !m2346e.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (PushEntity pushEntity : m2346e) {
                    if (pushEntity.m2326a() != null) {
                        hashSet.addAll(pushEntity.m2326a());
                    }
                }
                for (String str2 : m2326a) {
                    if (!hashSet.contains(str2)) {
                        PushDaoProxy.m2349b(str2);
                    }
                }
                return;
            }
            for (String str3 : m2326a) {
                PushDaoProxy.m2349b(str3);
            }
        }
    }

    /* renamed from: e */
    public void m2969e() {
        List<PushEntity> m2346e = PushDaoProxy.m2346e();
        if (m2346e == null) {
            return;
        }
        for (PushEntity pushEntity : m2346e) {
            m2970d(pushEntity.m2323d());
        }
    }

    /* renamed from: f */
    public void m2968f(LocalPushData localPushData) {
        int i;
        PushLogUtil.m25698a("saveAlarm localPushData = " + localPushData);
        PushEntity m2347d = PushDaoProxy.m2347d(localPushData.m2670f());
        PushEntity m2671e = localPushData.m2671e();
        if (m2347d != null) {
            PushLogUtil.m25698a("update alarm.");
            m2671e.m2309r(m2347d.m2321f());
            PushDaoProxy.m2343h(m2671e);
        } else {
            PushLogUtil.m25698a("add alarm.");
            m2671e.m2309r((int) PushDaoProxy.m2343h(m2671e));
        }
        Map<String, NotificationContentEntity> m2674b = localPushData.m2674b();
        if (m2674b != null && !m2674b.isEmpty()) {
            localPushData.m2675a(this.f116617a);
            PushDaoProxy.m2341j(new ArrayList(m2674b.values()));
            Intent m2960c = AlarmUtils.m2960c(this.f116617a);
            AlarmUtils.m2961b(this.f116617a, m2671e.m2321f(), m2960c);
            long m2319h = m2671e.m2319h();
            if (m2319h > 0) {
                i = new Random().nextInt((int) m2319h);
            } else {
                i = 0;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("add alarm success:");
            sb2.append(m2671e);
            sb2.append("  realTime:");
            long j = i;
            sb2.append(m2671e.m2320g() + j);
            PushLogUtil.m25698a(sb2.toString());
            AlarmUtils.m2957f(this.f116617a, m2671e.m2321f(), m2960c, m2671e.m2320g() + j);
            return;
        }
        PushLogUtil.m25697b("contents is empty when save alarm.");
    }

    /* renamed from: g */
    public void m2967g() {
        List<PushEntity> m2346e = PushDaoProxy.m2346e();
        if (m2346e == null) {
            return;
        }
        PushLogUtil.m25698a("set all alarm");
        for (PushEntity pushEntity : m2346e) {
            m2971c(pushEntity);
        }
    }

    /* renamed from: i */
    public void m2965i() {
        PushLogUtil.m25698a("update repeat alarm when init");
        List<PushEntity> m2344g = PushDaoProxy.m2344g();
        ArrayList arrayList = new ArrayList();
        for (PushEntity pushEntity : m2344g) {
            if (m2966h(pushEntity)) {
                arrayList.add(pushEntity);
            }
        }
        if (arrayList.size() > 0) {
            PushDaoProxy.m2342i(arrayList);
        }
    }

    /* renamed from: j */
    public boolean m2964j(PushEntity pushEntity) {
        if (pushEntity.m2318i() == -1) {
            boolean m2966h = m2966h(pushEntity);
            if (m2966h) {
                PushDaoProxy.m2343h(pushEntity);
            }
            return m2966h;
        }
        return false;
    }
}

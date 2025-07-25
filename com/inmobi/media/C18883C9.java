package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C18883C9;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.NoWhenBranchMatchedException;
import p804nd.Result;

/* renamed from: com.inmobi.media.C9 */
/* loaded from: classes6.dex */
public final class C18883C9 {

    /* renamed from: a */
    public final Context f47135a;

    /* renamed from: b */
    public final long f47136b;

    /* renamed from: c */
    public final int f47137c;

    /* renamed from: d */
    public boolean f47138d;

    /* renamed from: e */
    public final C19122U5 f47139e;

    /* renamed from: f */
    public final C18884Ca f47140f;

    /* renamed from: g */
    public final List f47141g;

    /* renamed from: h */
    public final ConcurrentHashMap f47142h;

    /* renamed from: i */
    public final AtomicBoolean f47143i;

    /* renamed from: j */
    public String f47144j;

    /* renamed from: k */
    public final AtomicInteger f47145k;

    public C18883C9(Context context, double d, EnumC19096S5 logLevel, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f47135a = context;
        this.f47136b = j;
        this.f47137c = i;
        this.f47138d = z;
        this.f47139e = new C19122U5(logLevel);
        this.f47140f = new C18884Ca(d);
        this.f47141g = Collections.synchronizedList(new ArrayList());
        this.f47142h = new ConcurrentHashMap();
        this.f47143i = new AtomicBoolean(false);
        this.f47144j = "";
        this.f47145k = new AtomicInteger(0);
    }

    /* renamed from: a */
    public final void m61230a(final EnumC19096S5 logLevel, String tag, String message) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f47143i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = AbstractC19135V5.f47855a;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", AbstractC19135V5.f47855a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
        Runnable runnable = new Runnable() { // from class: o3.l
            {
                C18883C9.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18883C9.m61231a(C18883C9.this, logLevel, jSONObject);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC19243d6.f48160a.submit(runnable);
    }

    /* renamed from: b */
    public final void m61229b() {
        Objects.toString(this.f47143i);
        if ((this.f47138d || this.f47140f.m61225a()) && !this.f47143i.getAndSet(true)) {
            ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
            Runnable runnable = new Runnable() { // from class: o3.m
                {
                    C18883C9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18883C9.m61228b(C18883C9.this);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC19243d6.f48160a.submit(runnable);
        }
    }

    /* renamed from: c */
    public final String m61227c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f47142h) {
            for (Map.Entry entry : this.f47142h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            Unit unit = Unit.f99208a;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", m61226d());
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    /* renamed from: d */
    public final JSONArray m61226d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f47141g;
        Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            List<JSONObject> logData2 = this.f47141g;
            Intrinsics.checkNotNullExpressionValue(logData2, "logData");
            for (JSONObject jSONObject : logData2) {
                jSONArray.put(jSONObject);
            }
            Unit unit = Unit.f99208a;
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static final void m61228b(C18883C9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.toString(this$0.f47143i);
        ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
        if (Result.m14546e(AbstractC19229c6.m60396a(new C18869B9(this$0, true))) != null) {
            try {
                Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a = Result.f101870c;
                Result.m14549b(C38508r.m14540a(th));
            }
        }
    }

    /* renamed from: a */
    public static final void m61231a(C18883C9 this$0, EnumC19096S5 eventLogLevel, JSONObject data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventLogLevel, "$logLevel");
        Intrinsics.checkNotNullParameter(data, "$data");
        try {
            C19122U5 c19122u5 = this$0.f47139e;
            c19122u5.getClass();
            Intrinsics.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            int ordinal = c19122u5.f47830a.ordinal();
            boolean z = true;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (eventLogLevel == EnumC19096S5.f47691d) {
                        }
                        z = false;
                    } else if (eventLogLevel != EnumC19096S5.f47690c) {
                        if (eventLogLevel == EnumC19096S5.f47691d) {
                        }
                        z = false;
                    }
                } else if (eventLogLevel != EnumC19096S5.f47689b) {
                    if (eventLogLevel != EnumC19096S5.f47690c) {
                        if (eventLogLevel == EnumC19096S5.f47691d) {
                        }
                        z = false;
                    }
                }
            }
            if (z) {
                this$0.f47141g.add(data);
            }
        } catch (Exception e) {
            this$0.getClass();
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    /* renamed from: a */
    public final void m61233a() {
        Objects.toString(this.f47143i);
        if ((this.f47138d || this.f47140f.m61225a()) && !this.f47143i.get()) {
            ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
            Runnable runnable = new Runnable() { // from class: o3.n
                {
                    C18883C9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18883C9.m61232a(C18883C9.this);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC19243d6.f48160a.submit(runnable);
        }
    }

    /* renamed from: a */
    public static final void m61232a(C18883C9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f47145k.getAndIncrement();
        Objects.toString(this$0.f47143i);
        ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
        if (Result.m14546e(AbstractC19229c6.m60396a(new C18869B9(this$0, false))) != null) {
            try {
                Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a = Result.f101870c;
                Result.m14549b(C38508r.m14540a(th));
            }
        }
    }
}

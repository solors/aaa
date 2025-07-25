package com.p552ot.pubsub.p564j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p552ot.pubsub.p554b.C26518n;
import com.p552ot.pubsub.util.C26586j;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import java.util.Random;

/* renamed from: com.ot.pubsub.j.b */
/* loaded from: classes7.dex */
public class HandlerC26564b extends Handler {

    /* renamed from: a */
    public static final int f69665a = 10;

    /* renamed from: b */
    public static final int f69666b = 11;

    /* renamed from: c */
    private static final String f69667c = "UploadTimer";

    /* renamed from: d */
    private static int f69668d = 10;

    /* renamed from: e */
    private static int f69669e = 900;

    /* renamed from: f */
    private static int f69670f = 10000;

    public HandlerC26564b(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public void m41168a(boolean z) {
        if (z) {
            removeMessages(11);
        } else if (hasMessages(11)) {
            C26586j.m41080a(f69667c, "has delayed msg, return");
            return;
        }
        m41170a(11, z ? 0L : m41167b());
    }

    /* renamed from: b */
    public int m41167b() {
        return f69670f;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 10) {
            C26566d.m41154a().m41143d();
            C26566d.m41154a().m41153a(0);
            C26566d.m41154a().m41153a(1);
        } else if (i == 11) {
            C26566d.m41154a().m41143d();
            C26586j.m41080a(f69667c, "UploadTimer.handleMessage, msg.what=" + message.what);
        } else if (i == 0 || i == 1 || i == 2) {
            C26566d.m41154a().m41153a(i);
            C26586j.m41080a(f69667c, "UploadTimer.handleMessage, msg.what=" + message.what);
        }
    }

    /* renamed from: a */
    public void m41169a(int i, boolean z) {
        if (z) {
            removeMessages(i);
        } else if (hasMessages(i)) {
            C26586j.m41080a(f69667c, "has delayed msg:" + i);
            return;
        }
        long m41384a = z ? 0L : C26518n.m41384a(i);
        C26586j.m41080a(f69667c, "will check prio=" + i + ", delay=" + m41384a);
        m41170a(i, m41384a);
    }

    /* renamed from: a */
    public void m41172a() {
        if (hasMessages(10)) {
            C26586j.m41080a(f69667c, "has delayed msg, return");
        } else {
            m41170a(10, new Random().nextInt(f69668d) * 1000);
        }
    }

    /* renamed from: a */
    private void m41170a(int i, long j) {
        removeMessages(i);
        C26586j.m41080a(f69667c, "will post msg, prio=" + i + ", delay=" + j);
        sendEmptyMessageDelayed(i, j);
    }

    /* renamed from: a */
    public void m41171a(int i) {
        if (i >= f69669e) {
            f69670f = TimeUtils.FIFTEEN_MINUTES_IN_MS;
        } else if (i <= 1) {
            f69670f = 1000;
        } else {
            f69670f = i * 1000;
        }
    }
}

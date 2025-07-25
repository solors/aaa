package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class RequestDataHolder {

    /* renamed from: a */
    private NetworkTask.Method f95898a = NetworkTask.Method.GET;

    /* renamed from: b */
    private final HashMap f95899b = new HashMap();

    /* renamed from: c */
    private byte[] f95900c = null;

    /* renamed from: d */
    private Long f95901d;

    /* renamed from: e */
    private Integer f95902e;

    public void applySendTime(long j) {
        this.f95901d = Long.valueOf(j);
        this.f95902e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f95899b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f95898a;
    }

    @Nullable
    public byte[] getPostData() {
        return this.f95900c;
    }

    @Nullable
    public Long getSendTimestamp() {
        return this.f95901d;
    }

    @Nullable
    public Integer getSendTimezoneSec() {
        return this.f95902e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f95899b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(@Nullable byte[] bArr) {
        this.f95898a = NetworkTask.Method.POST;
        this.f95900c = bArr;
    }
}

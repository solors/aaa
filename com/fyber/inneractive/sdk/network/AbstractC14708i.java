package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.network.i */
/* loaded from: classes4.dex */
public abstract class AbstractC14708i {
    /* renamed from: a */
    public static FilterInputStream m77689a(InputStream inputStream, boolean z) {
        FilterInputStream bufferedInputStream;
        try {
            if (z) {
                IAlog.m76529a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                IAlog.m76529a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C14714l m77690a(FilterInputStream filterInputStream, int i, String str, Map map, String str2) {
        try {
            C14714l c14714l = new C14714l(filterInputStream, i, str, map, str2);
            if (c14714l.f27882a / 100 != 5) {
                return c14714l;
            }
            throw new C14694b(String.format("server returned error %d", Integer.valueOf(c14714l.f27882a)));
        } catch (C14694b e) {
            IAlog.m76530a("failed executing network request", e, new Object[0]);
            throw new C14694b(e);
        } catch (Exception e2) {
            IAlog.m76530a("failed reading network response", e2, new Object[0]);
            throw new C14725q0(e2);
        }
    }
}

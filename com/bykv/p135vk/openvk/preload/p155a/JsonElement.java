package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.bykv.vk.openvk.preload.a.h */
/* loaded from: classes3.dex */
public abstract class JsonElement {
    /* renamed from: a */
    public Number mo91488a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public String mo91486b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public double mo91485c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public long mo91484d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public int mo91483e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public boolean mo91482f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.m91512a(true);
            WebResourceUtils.m91436a(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

package com.chartboost.sdk.impl;

import java.io.File;

/* renamed from: com.chartboost.sdk.impl.h5 */
/* loaded from: classes3.dex */
public class C9886h5 {

    /* renamed from: a */
    public final File f22157a;

    /* renamed from: b */
    public final File f22158b;

    /* renamed from: c */
    public final File f22159c;

    /* renamed from: d */
    public final File f22160d;

    /* renamed from: e */
    public final File f22161e;

    /* renamed from: f */
    public final File f22162f;

    /* renamed from: g */
    public final File f22163g;

    /* renamed from: h */
    public final File f22164h;

    /* renamed from: i */
    public final File f22165i;

    public C9886h5(File file) {
        File file2 = new File(file, ".chartboost");
        this.f22157a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f22158b = m81571a(file2, "css");
        this.f22159c = m81571a(file2, "html");
        this.f22160d = m81571a(file2, "images");
        this.f22161e = m81571a(file2, "js");
        this.f22162f = m81571a(file2, "templates");
        this.f22163g = m81571a(file2, "videos");
        this.f22164h = m81571a(file2, "precache");
        this.f22165i = m81571a(file2, "precache_queue");
    }

    /* renamed from: a */
    public File m81572a() {
        return this.f22157a;
    }

    /* renamed from: a */
    public static File m81571a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}

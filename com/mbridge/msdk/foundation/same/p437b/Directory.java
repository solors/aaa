package com.mbridge.msdk.foundation.same.p437b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.a */
/* loaded from: classes6.dex */
public final class Directory {

    /* renamed from: a */
    private List<Directory> f56501a;

    /* renamed from: b */
    private String f56502b;

    /* renamed from: c */
    private Directory f56503c;

    /* renamed from: d */
    private MBridgeDir f56504d;

    /* renamed from: a */
    public final void m52285a(MBridgeDir mBridgeDir, String str) {
        Directory directory = new Directory();
        directory.f56504d = mBridgeDir;
        directory.f56502b = str;
        m52287a(directory);
    }

    /* renamed from: b */
    public final String m52282b() {
        return this.f56502b;
    }

    /* renamed from: c */
    public final Directory m52281c() {
        return this.f56503c;
    }

    /* renamed from: d */
    public final MBridgeDir m52280d() {
        return this.f56504d;
    }

    /* renamed from: a */
    private void m52287a(Directory directory) {
        if (this.f56501a == null) {
            this.f56501a = new ArrayList();
        }
        directory.f56503c = this;
        this.f56501a.add(directory);
    }

    /* renamed from: a */
    public final void m52283a(List<Directory> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Directory directory : list) {
            m52287a(directory);
        }
    }

    /* renamed from: a */
    public final List<Directory> m52288a() {
        return this.f56501a;
    }

    /* renamed from: a */
    public final void m52284a(String str) {
        this.f56502b = str;
    }

    /* renamed from: a */
    public final void m52286a(MBridgeDir mBridgeDir) {
        this.f56504d = mBridgeDir;
    }
}

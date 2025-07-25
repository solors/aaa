package com.mbridge.msdk.foundation.same.p437b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.b */
/* loaded from: classes6.dex */
public abstract class DirectoryContext {

    /* renamed from: a */
    protected Directory f56505a;

    public DirectoryContext(String str) {
        Directory directory = new Directory();
        directory.m52284a(str);
        directory.m52286a(MBridgeDir.AD_ROOT);
        List<Directory> mo52277a = mo52277a();
        if (mo52277a != null && mo52277a.size() > 0) {
            directory.m52283a(mo52277a);
        }
        this.f56505a = directory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final Directory m52279a(ArrayList<Directory> arrayList, MBridgeDir mBridgeDir, String str) {
        Directory directory = new Directory();
        directory.m52286a(mBridgeDir);
        directory.m52284a(str);
        arrayList.add(directory);
        return directory;
    }

    /* renamed from: a */
    protected abstract List<Directory> mo52277a();

    /* renamed from: b */
    public final Directory m52278b() {
        return this.f56505a;
    }
}

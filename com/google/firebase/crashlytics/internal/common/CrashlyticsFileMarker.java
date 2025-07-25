package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CrashlyticsFileMarker {

    /* renamed from: a */
    private final String f42376a;

    /* renamed from: b */
    private final FileStore f42377b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f42376a = str;
        this.f42377b = fileStore;
    }

    /* renamed from: a */
    private File m67119a() {
        return this.f42377b.getCommonFile(this.f42376a);
    }

    public boolean create() {
        try {
            return m67119a().createNewFile();
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.m67213e("Error creating marker: " + this.f42376a, e);
            return false;
        }
    }

    public boolean isPresent() {
        return m67119a().exists();
    }

    public boolean remove() {
        return m67119a().delete();
    }
}

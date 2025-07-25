package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes4.dex */
public abstract class LibraryVersion {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static LibraryVersion m66468a(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}

package com.google.firebase.platforminfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_LibraryVersion extends LibraryVersion {

    /* renamed from: a */
    private final String f43412a;

    /* renamed from: b */
    private final String f43413b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LibraryVersion(String str, String str2) {
        if (str != null) {
            this.f43412a = str;
            if (str2 != null) {
                this.f43413b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        if (this.f43412a.equals(libraryVersion.getLibraryName()) && this.f43413b.equals(libraryVersion.getVersion())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getLibraryName() {
        return this.f43412a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    public String getVersion() {
        return this.f43413b;
    }

    public int hashCode() {
        return ((this.f43412a.hashCode() ^ 1000003) * 1000003) ^ this.f43413b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f43412a + ", version=" + this.f43413b + "}";
    }
}

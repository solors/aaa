package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* renamed from: a */
    private final String f42695a;

    /* renamed from: b */
    private final byte[] f42696b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* renamed from: a */
        private String f42697a;

        /* renamed from: b */
        private byte[] f42698b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File build() {
            String str = "";
            if (this.f42697a == null) {
                str = " filename";
            }
            if (this.f42698b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(this.f42697a, this.f42698b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr != null) {
                this.f42698b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str != null) {
                this.f42697a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public boolean equals(Object obj) {
        byte[] contents;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f42695a.equals(file.getFilename())) {
            byte[] bArr = this.f42696b;
            if (file instanceof AutoValue_CrashlyticsReport_FilesPayload_File) {
                contents = ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f42696b;
            } else {
                contents = file.getContents();
            }
            if (Arrays.equals(bArr, contents)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public byte[] getContents() {
        return this.f42696b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public String getFilename() {
        return this.f42695a;
    }

    public int hashCode() {
        return ((this.f42695a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f42696b);
    }

    public String toString() {
        return "File{filename=" + this.f42695a + ", contents=" + Arrays.toString(this.f42696b) + "}";
    }

    private AutoValue_CrashlyticsReport_FilesPayload_File(String str, byte[] bArr) {
        this.f42695a = str;
        this.f42696b = bArr;
    }
}

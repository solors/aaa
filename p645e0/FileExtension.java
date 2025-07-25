package p645e0;

/* renamed from: e0.c */
/* loaded from: classes2.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: b */
    public final String f89701b;

    FileExtension(String str) {
        this.f89701b = str;
    }

    /* renamed from: b */
    public String m25546b() {
        return ".temp" + this.f89701b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f89701b;
    }
}

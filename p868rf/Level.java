package p868rf;

/* renamed from: rf.b */
/* loaded from: classes10.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    

    /* renamed from: b */
    private int f103960b;

    /* renamed from: c */
    private String f103961c;

    Level(int i, String str) {
        this.f103960b = i;
        this.f103961c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f103961c;
    }
}

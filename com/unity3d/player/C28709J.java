package com.unity3d.player;

/* renamed from: com.unity3d.player.J */
/* loaded from: classes7.dex */
class C28709J {

    /* renamed from: e */
    private static boolean f74543e = false;

    /* renamed from: a */
    private boolean f74544a = false;

    /* renamed from: b */
    private boolean f74545b = false;

    /* renamed from: c */
    private boolean f74546c = true;

    /* renamed from: d */
    private boolean f74547d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m37726e() {
        f74543e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m37724f() {
        f74543e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m37734a() {
        return this.f74547d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37731b(boolean z) {
        this.f74544a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m37729c(boolean z) {
        this.f74545b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m37727d(boolean z) {
        this.f74547d = z;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m37728d() {
        return f74543e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m37733a(boolean z) {
        return f74543e && !((!z && !this.f74544a) || this.f74546c || this.f74545b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m37732b() {
        return this.f74546c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m37730c() {
        return this.f74545b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37725e(boolean z) {
        this.f74546c = z;
    }
}

package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
final class PendingPostQueue {

    /* renamed from: a */
    private PendingPost f55941a;

    /* renamed from: b */
    private PendingPost f55942b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m52960a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.f55942b;
                if (pendingPost2 != null) {
                    pendingPost2.f55940c = pendingPost;
                    this.f55942b = pendingPost;
                } else if (this.f55941a == null) {
                    this.f55942b = pendingPost;
                    this.f55941a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized PendingPost m52962a() {
        PendingPost pendingPost;
        pendingPost = this.f55941a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f55940c;
            this.f55941a = pendingPost2;
            if (pendingPost2 == null) {
                this.f55942b = null;
            }
        }
        return pendingPost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized PendingPost m52961a(int i) throws InterruptedException {
        if (this.f55941a == null) {
            wait(i);
        }
        return m52962a();
    }
}

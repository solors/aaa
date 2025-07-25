package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a */
    private final PendingPostQueue f55908a = new PendingPostQueue();

    /* renamed from: b */
    private final EventBus f55909b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncPoster(EventBus eventBus) {
        this.f55909b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f55908a.m52960a(PendingPost.m52963a(subscription, obj));
        EventBus.f55913a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost m52962a = this.f55908a.m52962a();
        if (m52962a != null) {
            this.f55909b.m52974a(m52962a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}

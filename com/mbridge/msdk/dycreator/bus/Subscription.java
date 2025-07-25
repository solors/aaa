package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
final class Subscription {

    /* renamed from: a */
    final Object f55949a;

    /* renamed from: b */
    final SubscriberMethod f55950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f55949a = obj;
        this.f55950b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f55949a != subscription.f55949a || !this.f55950b.equals(subscription.f55950b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f55949a.hashCode() + this.f55950b.f55946d.hashCode();
    }
}
